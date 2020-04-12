package com.example.cityinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Hospitals extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        getSupportActionBar().setTitle("Hospitals");

        title = new String[]{"Hospital1","Hospital2","Hospital3","Hospital4","Hospital5","Hospital6","Hospital7","Hospital8","Hospital9","Hospital10"};
        description = new String[]{"Details","Details","Details","Details","Details","Details","Details","Details","Details","Details"};
        icon = new int[]{R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital,R.drawable.hospital};

        listView = findViewById(R.id.listview);

        for(int i = 0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this,arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

