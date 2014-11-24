package com.example.truyenhai;

import com.example.noidungtruyen.ConTraiActivity;
import com.example.noidungtruyen.CongaiActivity;

import com.example.noidungtruyen.TruyenbuaActivity;
import com.example.noidungtruyen.TruyencuoidangianActivity;
import com.example.noidungtruyen.TruyencuoihocsinhActivity;
import com.example.noidungtruyen.TruyencuoithethaoActivity;
import com.example.noidungtruyen.TruyencuoitinhyeuActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TrangChuActivity extends Activity {
	Button TC_dangian, TC_thethao, TC_tinhyeu, TC_hocsinh,TC_bua,TC_tho,TC_congai,TC_contrai;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trang_chu);
		TC_dangian = (Button) findViewById(R.id.button1);
		TC_bua = (Button) findViewById(R.id.button2);
		TC_tinhyeu = (Button) findViewById(R.id.button3);
		TC_hocsinh = (Button) findViewById(R.id.button4);
		TC_congai = (Button) findViewById(R.id.button5);
		TC_contrai = (Button) findViewById(R.id.button6);
		TC_thethao = (Button) findViewById(R.id.button7);
		TC_tho = (Button) findViewById(R.id.button8);
	
		
		
		
		TC_tho.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,Listtruyen5Activity.class);
				startActivity(intent);
			
			}
		});
		TC_thethao.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,TruyencuoithethaoActivity.class);
				startActivity(intent);
			
			}
		});
		TC_contrai.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,ConTraiActivity.class);
				startActivity(intent);
			
			}
		});
		TC_congai.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,CongaiActivity.class);
				startActivity(intent);
			
			}
		});
		TC_dangian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,TruyencuoidangianActivity.class);
				startActivity(intent);
			
			}
		});
		TC_bua.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,TruyenbuaActivity.class);
				startActivity(intent);
			
			}
		});
		TC_tinhyeu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,TruyencuoitinhyeuActivity.class);
				startActivity(intent);
			
			}
		});
		TC_hocsinh.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TrangChuActivity.this,TruyencuoihocsinhActivity.class);
				startActivity(intent);
				
			}
		});

	}
}
