package com.example.cityinfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater inflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context mcontext, List<Model> modelList) {
        mContext = mcontext;
        this.modelList = modelList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }
    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;

    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.layout_recycle, null);

            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        holder.mTitleTv.setText(modelList.get(position).getTitle());
        holder.mDescTv.setText(modelList.get(position).getDesc());
        holder.mIconIv.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code later
                if (modelList.get(position).getTitle().equals("Mess1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess1");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }

                if (modelList.get(position).getTitle().equals("Mess2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess2");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "16.814802, 81.525729");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess3");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "16.815110, 81.531387");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess4");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "16.815649, 81.519117");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess5");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "17.276815, 82.545933");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess6");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "17.208997, 81.786856");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess7");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "17.963688, 79.606587");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess8");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess9");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Mess10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Mess10");
                    intent.putExtra("resid",R.drawable.messlogo);
                    intent.putExtra("contentTv", "Mess name");
                    intent.putExtra("contentTv2", "Just like grandma used to make!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore1");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "17.522870, 78.595139");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore2");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore3");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore4");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore5");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore6");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore7");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore8");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore9");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("GroceryStore10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "GroceryStore10");
                    intent.putExtra("resid",R.drawable.grocerylogo);
                    intent.putExtra("contentTv", "Store name");
                    intent.putExtra("contentTv2", "Feed your family the best!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com1");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com2");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com3");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com4");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com5");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com6");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com7");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com8");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com9");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("com10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "com10");
                    intent.putExtra("resid",R.drawable.computer);
                    intent.putExtra("contentTv", "Online Shop");
                    intent.putExtra("contentTv2", "All online work is done here!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital1");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital2");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital3");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital4");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital5");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital6");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital7");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital8");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");

                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital9");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hospital10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hospital10");
                    intent.putExtra("resid",R.drawable.hospital2);
                    intent.putExtra("contentTv", "Hospital");
                    intent.putExtra("contentTv2", "Because your life matters!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop1");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop2");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop3");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop4");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop5");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop6");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop7");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop8");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop9");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Shop10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Shop10");
                    intent.putExtra("resid",R.drawable.shoplogo);
                    intent.putExtra("contentTv", "Shop name");
                    intent.putExtra("contentTv2", "Discover the difference");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel1")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel1");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel2")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel2");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel3")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel3");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel4")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel4");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel5")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel5");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel6")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel6");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel7")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel7");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel8")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel8");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel9")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel9");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }
                if (modelList.get(position).getTitle().equals("Hostel10")){
                    Intent intent = new Intent(mContext, NewMessActivity.class);
                    intent.putExtra("actionBarTitle", "Hostel10");
                    intent.putExtra("resid",R.drawable.hostellogo);
                    intent.putExtra("contentTv", "Hostel name");
                    intent.putExtra("contentTv2", "Stay in a new kind of place!");
                    intent.putExtra("contentTv4", "Contact:");
                    intent.putExtra("contentTv5", "9111716603");
                    intent.putExtra("contentTv6", "amanyadav63721@gmail.com");
                    intent.putExtra("contentTv7", "Address: 355,WardNO-08,shivpur Hoshangabad Madhya Pradesh 461223 ");
                    intent.putExtra("contentTv10", "LOCATION");
                    intent.putExtra("contentTv8", "19.862566, 75.519377");
                    intent.putExtra("contentTv9", "");
                    intent.putExtra("contentTv3", "MAP");
                    mContext.startActivity(intent);
                }




            }
        });
        return view;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0){
            modelList.addAll(arrayList);
        }
        else {
            for (Model model: arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                    .contains(charText)){
                    modelList.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}
