package com.example.noidungtruyen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TruyencuoidangianActivity extends Activity {
	private ListView songsListView;
	private ArrayAdapter<String> listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_truyencuoidangian);
		songsListView = (ListView) findViewById(R.id.listview4);

		// Create and populate a List of songs names.
		final String[] songs = new String[] { "Chả Giấu Gì Bác", "Phóng Sinh",
				"Mày Để Cho Nó Một Chút", "Đóng Oản", "Nước Mắm Hâm",
				"Hổ Phụ Sinh Hổ Tử", "Tệ", "Đắp Chăn", "Hâm Cứt", "Sĩ Diện",
				"Tri Kỹ", "Sợ Vợ" };
		final ArrayList<String> songtList = new ArrayList<String>();
		songtList.addAll(Arrays.asList(songs));

		// Create ArrayAdapter using the songs list.
		// Each row in the ListView will be a TextView. The TextView is defined
		// in another file (res/layout/simplerow.xml).
		listAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, songtList);
		// Set the ArrayAdapter as the ListView's adapter.
		songsListView.setAdapter(listAdapter);
		songsListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View view,
					int position, long arg3) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TruyencuoidangianActivity.this,
						ListtruyenActivity.class);
				String a = songtList.get(position);
				intent.putExtra("A", a);
				startActivity(intent);

				//
				// if (position == 0) {
				//
				// startActivity(startReadingTheLyrics);
				// } else if (position == 1) {
				// Intent startReadingTheLyrics = new
				// Intent(TruyencuoidangianActivity.this,
				// Listtruyen2Activity.class);
				// startActivity(startReadingTheLyrics);
				// }

			}
		});
	}
}
