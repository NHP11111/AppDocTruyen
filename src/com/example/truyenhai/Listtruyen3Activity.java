package com.example.truyenhai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Listtruyen3Activity extends Activity {
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listtruyen3);
		tv = (TextView) findViewById(R.id.tv_tinhyeu);
		Intent intent = getIntent();
		String c = intent.getStringExtra("B");
		InputStream in = null;
		if (c.equals("Bao Quát Cả Sân")) {
			in = getResources().openRawResource(R.raw.thethao1);
		}else if(c.equals("Mắt Lé")){
			in = getResources().openRawResource(R.raw.thethao2);	
		}else if(c.equals("Còn Chưa Xuống Đến Nơi")){
			in = getResources().openRawResource(R.raw.thethao3);	
		}

		String data;

		InputStreamReader inreader = new InputStreamReader(in);
		BufferedReader bufreader = new BufferedReader(inreader);
		StringBuilder builder = new StringBuilder();
		if (in != null) {
			try {
				while ((data = bufreader.readLine()) != null) {
					builder.append(data);
					builder.append("\n");
				}
				in.close();
				tv.setText(builder.toString());
			} catch (IOException ex) {
				Log.e("ERROR", ex.getMessage());
			}
		}
	}
}
