package any_end_will_do.mangohacks.recyclerviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import any_end_will_do.mangohacks.R;
import any_end_will_do.mangohacks.dataObjects.BusinessPost;
import any_end_will_do.mangohacks.dataObjects.MailMessage;

/**
 * Created by jeffr on 2/3/2018.
 */

public class MailMessageRecyclerView extends RecyclerView.Adapter<MailMessageRecyclerView.MailMessageRecyclerViewHolder> {

    List<MailMessage> mailMessageList;

    public MailMessageRecyclerView(List<MailMessage> mailMessageList) {
        this.mailMessageList = mailMessageList;
    }

    @Override
    public MailMessageRecyclerView.MailMessageRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.mail_cardview;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new MailMessageRecyclerView.MailMessageRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MailMessageRecyclerView.MailMessageRecyclerViewHolder holder, int position) {

        holder.captionTextView.setText(mailMessageList.get(position).getCaption());
        holder.nessageTextView.setText(mailMessageList.get(position).getabbreviatedEmail());
        holder.userTextView.setText(mailMessageList.get(position).getCompany_name());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class MailMessageRecyclerViewHolder extends RecyclerView.ViewHolder {
        ;
        final TextView captionTextView;
        final TextView userTextView;
        final TextView nessageTextView;

        public MailMessageRecyclerViewHolder(View view) {
            super(view);
            captionTextView = view.findViewById(R.id.mail_caption);
            userTextView = view.findViewById(R.id.mail_company_name);
            nessageTextView = view.findViewById(R.id.abbreviated_message);
        }
    }

        }
