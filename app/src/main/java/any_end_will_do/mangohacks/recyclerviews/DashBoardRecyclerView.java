package any_end_will_do.mangohacks.recyclerviews;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import any_end_will_do.mangohacks.R;
import any_end_will_do.mangohacks.dataObjects.DashBoardItem;

/**
 * Created by jeffr on 2/3/2018.
 */

public class DashBoardRecyclerView extends RecyclerView.Adapter<DashBoardRecyclerView.DashBoardRecyclerViewHolder> {
    List<DashBoardItem> dashBoardItemList;

    public DashBoardRecyclerView(List<DashBoardItem> dashBoardItemList) {
        this.dashBoardItemList = dashBoardItemList;
    }


    @Override
    public DashBoardRecyclerView.DashBoardRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.dashboard_cardview;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new DashBoardRecyclerView.DashBoardRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DashBoardRecyclerView.DashBoardRecyclerViewHolder holder, int position) {
       holder.industryIcon.setImageDrawable(dashBoardItemList.get(position).getDashBoardImage());
       holder.industryTitle.setText(dashBoardItemList.get(position).getDashBoardTitle());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class DashBoardRecyclerViewHolder extends RecyclerView.ViewHolder {
        ;
        final TextView industryTitle;
        final ImageView industryIcon;

        public DashBoardRecyclerViewHolder(View view) {
            super(view);
            industryTitle = view.findViewById(R.id.industry_title);
            industryIcon = view.findViewById(R.id.industry_icon);
        }
    }
}
