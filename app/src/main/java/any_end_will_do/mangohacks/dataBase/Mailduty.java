package any_end_will_do.mangohacks.dataBase;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Andre on 2/4/2018.
 */

public class Mailduty {

    private DatabaseReference data;
    private String companyname;
    private String caption;
    private String Msg;

    Mailduty(String name, String caption, String Msg){
        this.companyname = name;
        this.caption = caption;
        this.Msg = Msg;
        data = FirebaseDatabase.getInstance().getReference(); //Dont pass any path if you want root of the tree
        insertFire();

    }

    public void insertFire(){
        data.child("Mail").child(caption).setValue(this);

    }

    public String getCompanyname() {
        return companyname;
    }

    public String getCaption() {
        return caption;
    }

    public String getMsg() {
        return Msg;
    }
}
