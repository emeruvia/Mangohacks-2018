package any_end_will_do.mangohacks;

import java.util.ArrayList;

/**
 * Created by jeffr on 2/3/2018.
 */

public class BusinessPostManager {
   static ArrayList<BusinessPost> posts = new ArrayList<BusinessPost>();
    public void addPost(BusinessPost b){
        posts.add(b);
    }
}
