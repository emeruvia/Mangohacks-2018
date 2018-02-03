package any_end_will_do.mangohacks;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BusinessPostAdapter extends RecyclerView.Adapter<BusinessPostAdapter.BusinessPostAdapterViewHolder>  {

    @Override
    public BusinessPostAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.home_cardview;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new BusinessPostAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BusinessPostAdapter.BusinessPostAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class BusinessPostAdapterViewHolder extends RecyclerView.ViewHolder {
        public final Button b1;
        public final Button b2;
        public final Button b3;
        public final Button b4;
        public final TextView t1;
        public final ImageView i1;



        public BusinessPostAdapterViewHolder(View view) {
            super(view);

            b1 = (Button)view.findViewById(R.id.like_button);
            b2 = (Button)view.findViewById(R.id.share_post_button);
            b3 = (Button)view.findViewById(R.id.view_profile_button);
            b4 = (Button)view.findViewById(R.id.comment_button);
            t1 = view.findViewById(R.id.company_caption);
            i1 = view.findViewById(R.id.post_image);



        }

    }
}
