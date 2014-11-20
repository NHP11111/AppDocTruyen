package com.example.truyenhai;


import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText Username, Password;
	Button btnOk;
	public static final String pre_DataLogin = "pre_DataLogin";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		Username = (EditText) findViewById(R.id.edA);
		Password = (EditText) findViewById(R.id.edB);
		btnOk = (Button) findViewById(R.id.btnOK);
		btnOk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String a = Username.getText().toString();
				String b = Password.getText().toString();
				if (a.equals("admin") && b.equals("admin")) {
					Save();
					Toast.makeText(getApplicationContext(), "Login thanh cong",
							Toast.LENGTH_SHORT).show();
					finish();
				} else {
					Toast.makeText(getApplicationContext(),
							"Login ko thanh cong", Toast.LENGTH_SHORT).show();
				}
			}
		});

	}

	public void Save() {
		SharedPreferences mysha = getSharedPreferences(pre_DataLogin,
				Activity.MODE_PRIVATE);
		SharedPreferences.Editor myE = mysha.edit();
		myE.putString("Username", Username.getText().toString());
		myE.putString("Password", Password.getText().toString());
		myE.commit();
	}

	}

