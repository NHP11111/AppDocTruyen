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

public class ListtruyenActivity extends Activity {
TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listtruyen);
		tv=(TextView)findViewById(R.id.textview1);
		Intent intent = getIntent();
		String n=intent.getStringExtra("A");
	
		InputStream in=null;
		if(n.equals("Chả Giấu Gì Bác")){
			 in= getResources().openRawResource(R.raw.aaa);
		}
		else if(n.equals("Phóng Sinh")){
			in= getResources().openRawResource(R.raw.truyen1);
		}
		else if(n.equals("Mày Để Cho Nó Một Chút")){
			in= getResources().openRawResource(R.raw.truyen2);
		}
		else if(n.equals("Đóng Oản")){
			in= getResources().openRawResource(R.raw.truyen3);
		}
		else if(n.equals("Nước Mắm Hâm")){
			in= getResources().openRawResource(R.raw.truyen4);
		}
		else if(n.equals("Hổ Phụ Sinh Hổ Tử")){
			in= getResources().openRawResource(R.raw.truyen5);
		}
		else if(n.equals("Tệ")){
			in= getResources().openRawResource(R.raw.truyen6);
		}
		else if(n.equals("Đắp Chăn")){
			in= getResources().openRawResource(R.raw.truyen7);
		}
		else if(n.equals("Hâm Cứt")){
			in= getResources().openRawResource(R.raw.truyen8);
		}
		else if(n.equals("Sĩ Diện")){
			in= getResources().openRawResource(R.raw.truyen9);
		}
		else if(n.equals("Tri Kỹ")){
			in= getResources().openRawResource(R.raw.truyen10);
		}
		else if(n.equals("Sợ Vợ")){
			in= getResources().openRawResource(R.raw.truyen11);
		}
		
		String data;
	  
	    InputStreamReader inreader=new InputStreamReader(in);
	    BufferedReader bufreader=new BufferedReader(inreader);
	    StringBuilder builder=new StringBuilder();
	    if(in!=null)
	    {
	    try
	   {
	    while((data=bufreader.readLine())!=null)
	    {
	    builder.append(data);
	    builder.append("\n");
	    }
	    in.close();
	    tv.setText(builder.toString());
	   }
	    catch(IOException ex){
	    Log.e("ERROR", ex.getMessage());
	    }
	   }
	}
}
