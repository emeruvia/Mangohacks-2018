package any_end_will_do.mangohacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import any_end_will_do.mangohacks.dataObjects.BusinessPost;
import any_end_will_do.mangohacks.dataObjects.DashBoardItem;
import any_end_will_do.mangohacks.dataObjects.MailMessage;
import any_end_will_do.mangohacks.dataObjects.UserProfile;
import any_end_will_do.mangohacks.recyclerviews.BusinessPostRecyclerView;
import any_end_will_do.mangohacks.recyclerviews.DashBoardRecyclerView;
import any_end_will_do.mangohacks.recyclerviews.MailMessageRecyclerView;
import any_end_will_do.mangohacks.recyclerviews.ProfileRecyclerView;


public class MainPageActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private RecyclerView recyclerView;

    private Context thisContext;

    {
        thisContext = this;
    }

    private List<BusinessPost> businessPostList = new ArrayList<>();
    private List<DashBoardItem> dashBoardItemList = new ArrayList<>();
    private List<MailMessage> mailMessageList = new ArrayList<>();
    private List<UserProfile> userProfiles = new ArrayList<>();

    private BusinessPost businessPost;
    private DashBoardItem dashBoardItem;
    private MailMessage mailMessage;
    private UserProfile userProfile;


    private BusinessPostRecyclerView businessPostRecyclerView;
    private DashBoardRecyclerView dashBoardRecyclerView;
    private MailMessageRecyclerView mailMessageRecyclerView;
    private ProfileRecyclerView profileRecyclerView;

    private android.support.v7.widget.Toolbar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    businessPostRecyclerView = new BusinessPostRecyclerView(businessPostList);
                    recyclerView.setAdapter(businessPostRecyclerView);

                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:


                    mTextMessage.setText(R.string.title_dashboard);

                    dashBoardRecyclerView = new DashBoardRecyclerView(dashBoardItemList);
                    recyclerView.setAdapter(dashBoardRecyclerView);
                    return true;
                case R.id.navigation_mail:
                    mTextMessage.setText(R.string.title_mail);
                    for (int i = 0; i < 20; i++) {
                        mailMessage = new MailMessage("Caption: #" + i, "This is a test", "Company: #" + i);
                        mailMessageList.add(mailMessage);
                    }
                    mailMessageRecyclerView = new MailMessageRecyclerView(mailMessageList);
                    recyclerView.setAdapter(mailMessageRecyclerView);
                    return true;
                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.user_name);
                    userProfile = new UserProfile("Car", "car@gmail.com", "2234 45th st w Houston,TX", "123-345-2342");
                    userProfiles.add(userProfile);

                    profileRecyclerView = new ProfileRecyclerView(userProfiles);
                    recyclerView.setAdapter(profileRecyclerView);
                    return true;
            }
            return false;
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.toolbar_search:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.main_page);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.toolbar_title);
        setSupportActionBar(toolbar);

        /**
         * this is the testing data, the only part that we should change once we have the database connection**/

        dashBoardItemList.add(new DashBoardItem("Contacts", R.drawable.phone));
        dashBoardItemList.add(new DashBoardItem("Notes", R.drawable.notepad));
        dashBoardItemList.add(new DashBoardItem("Resources", R.drawable.book));
        dashBoardItemList.add(new DashBoardItem("Schedule", R.drawable.stopwatch));
        dashBoardItemList.add(new DashBoardItem("Search", R.drawable.search));
        dashBoardItemList.add(new DashBoardItem("Travel", R.drawable.aeroplane));
        dashBoardItemList.add(new DashBoardItem("Transportation", R.drawable.car));
        dashBoardItemList.add(new DashBoardItem("Technologies", R.drawable.monitor));

        businessPostList.add(new BusinessPost("Word Chart", "Marketing Co.", R.drawable.pic1));
        businessPostList.add(new BusinessPost("Stress", "Mangohacks", R.drawable.pic2));
        businessPostList.add(new BusinessPost("Meeting", "FIU", R.drawable.pic3));
        businessPostList.add(new BusinessPost("Lady holding computer", "IT Help Co.", R.drawable.pic4));
        businessPostList.add(new BusinessPost("Concentrated", "Hospital", R.drawable.pic5));
        businessPostList.add(new BusinessPost("Focus Chart", "Analytics Co.", R.drawable.pic6));
        businessPostList.add(new BusinessPost("Come and see us", "Marketing Co.", R.drawable.pic7));
        businessPostList.add(new BusinessPost("Need social media help", "Dave's PR", R.drawable.pic8));
        businessPostList.add(new BusinessPost("Need help growing", "Miami's Data Firm", R.drawable.pic9));
        businessPostList.add(new BusinessPost("For the culture", "David's PR", R.drawable.pic10));
        businessPostList.add(new BusinessPost("No longer available", "Zach's Moving Co.", R.drawable.pic11));
        businessPostList.add(new BusinessPost("Interns needed", "Apple", R.drawable.pic12));
        businessPostList.add(new BusinessPost("Push your company to the future", "Data Firm", R.drawable.pic13));


        /////////////////////////////////////////


        recyclerView = findViewById(R.id.idRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        businessPostRecyclerView = new BusinessPostRecyclerView(businessPostList);
        recyclerView.setAdapter(businessPostRecyclerView);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    public void callIntent(Intent i) {
        startActivity(i);
    }

}

