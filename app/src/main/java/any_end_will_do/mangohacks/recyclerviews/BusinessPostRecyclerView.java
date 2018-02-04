package any_end_will_do.mangohacks.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import any_end_will_do.mangohacks.dataObjects.BusinessPost;
import any_end_will_do.mangohacks.R;

public class BusinessPostRecyclerView extends RecyclerView.Adapter<BusinessPostRecyclerView.BusinessPostAdapterViewHolder> {

    private List<BusinessPost> businessPostList;

    public BusinessPostRecyclerView(List<BusinessPost> businessPostList) {
        this.businessPostList = businessPostList;
    }

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
    public void onBindViewHolder(BusinessPostRecyclerView.BusinessPostAdapterViewHolder holder, int i) {
        //get the holder to their respective id
        holder.captionTextView.setText(businessPostList.get(i).getPostCaption());
        holder.userTextView.setText(businessPostList.get(i).getPostUser());
//        holder.imageView.setImageResource(businessPostList.get(i).getPostImage());

    }

    @Override
    public int getItemCount() {
        return businessPostList.size();
    }

    public class BusinessPostAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageButton likeButton;
        ImageButton shareProfile;
        ImageButton profileButton;
        ImageButton commentButton;
        TextView captionTextView;
        TextView userTextView;
        ImageView imageView;


        public BusinessPostAdapterViewHolder(View view) {
            super(view);

            likeButton = (ImageButton) view.findViewById(R.id.like_button);
            shareProfile = (ImageButton) view.findViewById(R.id.share_post_button);
            profileButton = (ImageButton) view.findViewById(R.id.view_profile_button);
            commentButton = (ImageButton) view.findViewById(R.id.comment_button);
            captionTextView = view.findViewById(R.id.company_caption);
            userTextView = view.findViewById(R.id.company_caption);
            imageView = view.findViewById(R.id.post_image);

            //Onclick listener buttons
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
