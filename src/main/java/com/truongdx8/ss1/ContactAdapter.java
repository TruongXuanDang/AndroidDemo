package com.truongdx8.ss1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private Activity activity;
    private List<Contact> contactList;

    public ContactAdapter(Activity activity, List<Contact> contactList) {
        this.activity = activity;
        this.contactList = contactList;
    }

    //1.Nhan data
    //2.Nhan layout
    //3.Ket hop data va layout

    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = activity.getLayoutInflater().inflate(R.layout.item_contact,parent,false);

        ImageView ivAvatar = convertView.findViewById(R.id.ivAvatar);
        TextView tvName = convertView.findViewById(R.id.tvUser);

        Contact item = contactList.get(position);
        ivAvatar.setImageResource(item.getAvater());
        tvName.setText(item.getName());

        return convertView;
    }
}
