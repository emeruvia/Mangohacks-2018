package any_end_will_do.mangohacks;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
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
                    for (int i = 0; i < 20; i++) {
                        dashBoardItem = new DashBoardItem( "Induustry: #" + i,R.drawable.ic_launcher_background);
                        dashBoardItemList.add(dashBoardItem);
                    }
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
                        userProfile = new UserProfile("Car","car@gmail.com","2234 45th st w Houston,TX","123-345-2342");
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
        setContentView(R.layout.main_page);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.toolbar_title);
        setSupportActionBar(toolbar);

        /**
         * this is the testing data, the only part that we should change once we have the database connection**/
        for (int i = 0; i < 20; i++) {

            businessPost = new BusinessPost("Caption # " + i, "User #: " + i, R.drawable.ic_email_black_24dp);
            mailMessage = new MailMessage("Caption: #" + i, "This is a test", "Company: #" + i);


            businessPostList.add(businessPost);
            mailMessageList.add(mailMessage);

            Log.i("test", mailMessageList.get(i).getCaption());

        }

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


}
