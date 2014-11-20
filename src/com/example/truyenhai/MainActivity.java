package com.example.truyenhai;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
	static String strUsername = "";
	static String strPass = "";
	Button Log;
	public static final String pre_DataLogin = "pre_Login";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 TabHost tabHost = getTabHost();
		    TabHost.TabSpec spec;
		    Intent intent;

		    intent = new Intent().setClass(this, TrangChuActivity.class);
		    spec = tabHost.newTabSpec("First").setIndicator("Truyện Hài ")
		                  .setContent(intent);
		    tabHost.addTab(spec);

		    intent = new Intent().setClass(this, GioiThieuActivity.class);
		    spec = tabHost.newTabSpec("Second").setIndicator("Ảnh Hài")
		                  .setContent(intent);
		    tabHost.addTab(spec);

		    
		
		
		Show();
		if (!strUsername.equals("admin") && (!strPass.equals("admin"))) {
			Intent i = new Intent(MainActivity.this, LoginActivity.class);
			startActivity(i);
		}
		 
	        
	       
	}

	public void Show() {
		SharedPreferences c = getSharedPreferences(pre_DataLogin,
				Activity.MODE_APPEND);
		strUsername = c.getString("usename", "");
		strPass = c.getString("password", "");
	}
}
