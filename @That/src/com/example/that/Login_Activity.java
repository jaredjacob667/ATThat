package com.example.that;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Login_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_);
	
		TextView forgot_password_textview = (TextView)findViewById(R.id.forgot_password_textView) ;
		forgot_password_textview.setTextColor(Color.rgb(240, 84, 35));	
		
		TextView sign_up_textview = (TextView)findViewById(R.id.sign_up_textView) ;
		sign_up_textview.setTextColor(Color.rgb(240, 84, 35));	
		
		Button confirm_button = (Button)findViewById(R.id.confirm_button);
		confirm_button.setBackgroundColor(Color.rgb(240, 84, 35));
		confirm_button.setTextColor(Color.rgb(255, 255, 255));
		
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
