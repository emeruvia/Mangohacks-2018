package any_end_will_do.mangohacks;

import java.util.ArrayList;
import java.util.List;

import any_end_will_do.mangohacks.recyclerviews.PostRecyclerView;

/**
 * Created by jeffr on 2/3/2018.
 */

public class BusinessPostManager {

    private List<BusinessPost> businessPostList;

    public BusinessPostManager() {

        //declare array
        businessPostList = new ArrayList<>();

        PostRecyclerView recyclerView = new PostRecyclerView(businessPostList);

    }

}
