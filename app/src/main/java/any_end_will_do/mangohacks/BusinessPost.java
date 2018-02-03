package any_end_will_do.mangohacks;

import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by jeffr on 2/3/2018.
 */

public class BusinessPost {
    private String postCaption;
    private ImageView postImage;
    public BusinessPost(String postCaption, ImageView postImage, Button likeButton, Button commentButton, Button shareButton, Button profileButton){
        this.postCaption = postCaption;
        this.postImage = postImage;
    }

    public String getPostCaption() {
        return postCaption;
    }


    public ImageView getPostImage() {

        return postImage;
    }

}
