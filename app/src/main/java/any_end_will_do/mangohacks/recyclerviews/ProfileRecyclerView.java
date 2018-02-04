package any_end_will_do.mangohacks.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import any_end_will_do.mangohacks.R;
import any_end_will_do.mangohacks.dataObjects.DashBoardItem;
import any_end_will_do.mangohacks.dataObjects.UserProfile;

/**
 * Created by jeffr on 2/3/2018.
 */

public class ProfileRecyclerView extends RecyclerView.Adapter<ProfileRecyclerView.ProfileRecyclerViewHolder> {
    List<UserProfile> userProfile;

    public ProfileRecyclerView(List<UserProfile> userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public ProfileRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.profile_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new ProfileRecyclerView.ProfileRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProfileRecyclerViewHolder holder, int position) {
            holder.emailAddress.setText(userProfile.get(position).getEmailAddress());
            holder.companyName.setText(userProfile.get(position).getCompanyName());
            holder.phoneNumber.setText(userProfile.get(position).getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    class ProfileRecyclerViewHolder extends RecyclerView.ViewHolder{
        final TextView companyName;
        final TextView emailAddress;
        final TextView phoneNumber;

        public ProfileRecyclerViewHolder(View view) {
            super(view);
            companyName = view.findViewById(R.id.user_company);
            emailAddress = view.findViewById(R.id.email_profile);
            phoneNumber = view.findViewById(R.id.phone_textview);
        }
    }

}
