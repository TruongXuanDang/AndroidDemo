package com.truongdx8.ss1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapterRecycle extends RecyclerView.Adapter {
    private Activity activity;
    private List<Contact> listContact;

    public ContactAdapterRecycle(Activity activity, List<Contact> listContact)
    {

        this.activity = activity;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = activity.getLayoutInflater().inflate(R.layout.item_contact,parent,false);
        ContactHolder holder =  new ContactHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ContactHolder contactHolder = (ContactHolder) holder;
        Contact data =  listContact.get(position);


        contactHolder.ivAvatar.setImageResource(data.getAvater());
        contactHolder.txName.setText(data.getName());
    }

    @Override
    public int getItemCount() {
        return listContact.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder{
        ImageView ivAvatar;
        TextView txName;

        public ContactHolder(@NonNull View itemView) {
            super(itemView);
            ivAvatar = itemView.findViewById(R.id.ivAvatar);
            txName = itemView.findViewById(R.id.tvUser);
        }
    }
}
