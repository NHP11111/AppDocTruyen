package com.example.noidungtruyen;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.truyenhai.ListTruyen2Activity;
import com.example.truyenhai.ListtruyenActivity;
import com.example.truyenhai.R;
import com.example.truyenhai.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TruyencuoitinhyeuActivity extends Activity {
	private ListView songsListView;
	private ArrayAdapter<String> listAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_truyencuoitinhyeu);
		songsListView = (ListView) findViewById(R.id.listtinhyeu);
		final String[] songs = new String[] { "Sợ Vợ",  };
		final ArrayList<String> songtList = new ArrayList<String>();
		songtList.addAll(Arrays.asList(songs));
		listAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, songtList);
		songsListView.setAdapter(listAdapter);
		songsListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view,
					int position, long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TruyencuoitinhyeuActivity.this,
						ListTruyen2Activity.class);
				String a = songtList.get(position);
				intent.putExtra("B", a);
				startActivity(intent);
			}
		});
	}
}
