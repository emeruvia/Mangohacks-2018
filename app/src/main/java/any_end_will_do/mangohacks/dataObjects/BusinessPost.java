package any_end_will_do.mangohacks.dataObjects;

import android.media.Image;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by jeffr on 2/3/2018.
 */

public class BusinessPost {

    private String postCaption;
    private String postUser;
    private int postImageResource;
    private UserProfile author;
    //Class constructor
    public BusinessPost(String postCaption, String postUser, int postImageResource){
        this.postCaption = postCaption;
        this.postUser = postUser;
        this.postImageResource = postImageResource;
    }

    //getters
    public String getPostCaption() {
        return postCaption;
    }

    public String getPostUser() {
        return postUser;
    }

    public int getPostImageResource() {
        return postImageResource;
    }

    public UserProfile getAuthor() {
        return author;
    }
}
