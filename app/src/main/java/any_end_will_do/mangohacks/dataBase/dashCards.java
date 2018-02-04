package any_end_will_do.mangohacks.dataBase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Andre on 2/4/2018.
 */

public class dashCards {

    private int image;
    private String title;
    private FirebaseAuth fireAuth;
    private DatabaseReference data;


    public dashCards(String title, int image){
        this.image = image;
        this.title = title;
        fireAuth = FirebaseAuth.getInstance();
        data = FirebaseDatabase.getInstance().getReference(); //Dont pass any path if you want root of the tree
        insertFire();
    }

    public void insertFire(){
            data.child("dashcard").child(title).setValue(this);

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
