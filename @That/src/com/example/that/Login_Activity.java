package com.example.that;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_);
		
		final EditText email = (EditText)findViewById(R.id.email_address_editText);
		final EditText password = (EditText)findViewById(R.id.password_editText);
		
		TextView forgot_password_textview = (TextView)findViewById(R.id.forgot_password_textView) ;
		forgot_password_textview.setTextColor(Color.rgb(240, 84, 35));	
		
		TextView sign_up_textview = (TextView)findViewById(R.id.sign_up_textView) ;
		sign_up_textview.setTextColor(Color.rgb(240, 84, 35));	
		
		Button login_button = (Button)findViewById(R.id.login_button);
		login_button.setBackgroundColor(Color.rgb(240, 84, 35));
		login_button.setTextColor(Color.rgb(255, 255, 255));
		
		login_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*
				if( email.getText().toString().equalsIgnoreCase("John") && password.getText().toString().equalsIgnoreCase("Password") ) {
					startActivity(new Intent(Login_Activity.this, Event_Activity.class));
				} else {
					Toast toast = Toast.makeText(getApplicationContext(), "Email or Password is wrong", 10);
					toast.show();
				} */
				
				startActivity(new Intent(Login_Activity.this, Main_Activity.class));
				
			}
			
			
		});	
		
		sign_up_textview.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view){
				startActivity(new Intent(Login_Activity.this, Sign_Up_First_Activity.class));
			}
		});
		
		forgot_password_textview.setOnClickListener(new OnClickListener(){
			
			public void onClick(View view){
				startActivity(new Intent(Login_Activity.this, Forgot_Password_Activity.class));
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_, menu);
		return true;
	}

}
