package com.devandroid.listview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.devandroid.listview.R;
import com.devandroid.listview.adapter.PhoneModelAdapter;
import com.devandroid.listview.pojo.PhoneModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		listView = (ListView) findViewById(R.id.listView);

//		List<String> items = initData();
//		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

		PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());
		listView.setAdapter(adapter);
	}

	private List<PhoneModel> initData(){
		List<PhoneModel> list = new ArrayList<PhoneModel>();

		list.add(new PhoneModel (1, "Samsung", 1000));
		list.add(new PhoneModel (2, "LG", 1500));
		list.add(new PhoneModel (3, "HTC", 2000));
		list.add(new PhoneModel (4, "IPhone", 10000));

		return list;
	}
}
