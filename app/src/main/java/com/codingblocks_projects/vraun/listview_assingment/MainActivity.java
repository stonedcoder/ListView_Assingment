package com.codingblocks_projects.vraun.listview_assingment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    ListView listView;
    Button buttonADD;

    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.edit_text);
        buttonADD = (Button)findViewById(R.id.btn_addItems);
        listView = (ListView)findViewById(R.id.list_view);

        final ArrayList<String> arrayList = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,arrayList );
        listView.setAdapter(adapter);

        buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = editText.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });

    }
}
