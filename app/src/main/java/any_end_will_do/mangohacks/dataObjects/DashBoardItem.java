package any_end_will_do.mangohacks.dataObjects;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by jeffr on 2/3/2018.
 */

public class DashBoardItem {
    private String dashBoardTitle;
    private int dashBoardImage;

    public DashBoardItem(String dashBoardTitle, int dashBoardImage){
        this.dashBoardImage = dashBoardImage;
        this.dashBoardTitle = dashBoardTitle;
    }

    public String getDashBoardTitle() {
        return dashBoardTitle;
    }

    public int getDashBoardImage() {
        return dashBoardImage;
    }
}
