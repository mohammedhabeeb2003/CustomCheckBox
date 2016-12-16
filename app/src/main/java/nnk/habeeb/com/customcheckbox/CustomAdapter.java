package nnk.habeeb.com.customcheckbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Habeeb on 12/14/2016.
 */

public class CustomAdapter extends ArrayAdapter {

    ArrayList<Contacts> addContact;
    LayoutInflater li;
    Context context;
    int resource;
    ViewHolder holder;

    public CustomAdapter(Context context, int resource,ArrayList<Contacts> addContact) {
        super(context, resource,addContact);

        this.context = context;
        this.resource = resource;
        this.addContact = addContact;
        li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v  = convertView;
        holder = new ViewHolder();

        if(v==null){
            v = li.inflate(resource,null);

            holder.tv_name  = (TextView)v.findViewById(R.id.tv_list);
            holder.cb = (CheckBox)v.findViewById(R.id.cb);
            holder.cb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox checkBox = (CheckBox)v;
                    addContact.get(position).setCheck(checkBox.isChecked());
                }
            });

            holder.tv_name.setText(addContact.get(position).getName());
            holder.cb.setChecked(addContact.get(position).getCheck());


            v.setTag(holder);
        }
        else{
            holder = (ViewHolder)v.getTag();
        }

        return v;


    }

    static class ViewHolder{

        TextView tv_name;
        CheckBox cb;

    }

}
