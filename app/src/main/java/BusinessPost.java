import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by jeffr on 2/3/2018.
 */

public class BusinessPost {
    private String postCaption;
    private ImageView postImage;
    private Button likeButton;
    private Button commentButton;
    private Button shareButton;
    public BusinessPost(String postCaption, ImageView postImage){
        this.postCaption = postCaption;
        this.postImage = postImage;
    }
}
