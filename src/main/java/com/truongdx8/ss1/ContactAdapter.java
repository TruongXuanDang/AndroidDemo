package com.truongdx8.ss1;

import android.app.Activity;
import android.util.Log;
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

        if(convertView == null)
        {
            Log.d("ContactAdapter","getView: "+convertView);
            convertView = activity.getLayoutInflater().inflate(R.layout.item_contact,parent,false);


            ViewHolder holder = new ViewHolder();
            holder.ivAvatar = convertView.findViewById(R.id.ivAvatar);
            holder.tvName = convertView.findViewById(R.id.tvUser);

            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();

        Contact item = contactList.get(position);
        holder.ivAvatar.setImageResource(item.getAvater());
        holder.tvName.setText(item.getName());

        return convertView;
    }

    static class ViewHolder{
        ImageView ivAvatar;
        TextView tvName;

    }
}
