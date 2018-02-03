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
                String caption = BusinessPostManager.posts.get(position).getPostCaption();
                ImageView postImage = BusinessPostManager.posts.get(position).getPostImage();
                holder.i1.setImageDrawable(postImage.getDrawable());
                holder.t1.setText(caption);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class BusinessPostAdapterViewHolder extends RecyclerView.ViewHolder {
        public final Button likeButton;
        public final Button shareProfile;
        public final Button profileButton;
        public final Button commentButton;
        public final TextView t1;
        public final ImageView i1;



        public BusinessPostAdapterViewHolder(View view) {
            super(view);

            likeButton = (Button)view.findViewById(R.id.like_button);
            shareProfile = (Button)view.findViewById(R.id.share_post_button);
            profileButton = (Button)view.findViewById(R.id.view_profile_button);
            commentButton = (Button)view.findViewById(R.id.comment_button);
            t1 = view.findViewById(R.id.company_caption);
            i1 = view.findViewById(R.id.post_image);
            commentButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO Make intent to open the post in order to a
                }
            });

            likeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO increment like value in person's profile
                }
            });
            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO Make intent to show the profile who made the post
                }
            });
            shareProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO Make a pop-up that will share the post with people
                }
            });



        }

    }
}
