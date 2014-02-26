package com.example.that;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Forgot_Password_Activity extends Activity{

	Button send_Button ;
	
	protected void onCreate(Bundle onSavedInstance){
		super.onCreate(onSavedInstance);
		setContentView(R.layout.activity_forgot_password);
		
		send_Button = (Button)findViewById(R.id.send_forgot_password_Button);
		send_Button.setBackgroundColor(Color.rgb(240, 84, 35));
		send_Button.setTextColor(Color.rgb(255, 255, 255));
		send_Button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// TODO This will send the password to the email
				Toast toast = Toast.makeText(getApplicationContext(), "Password has been send", 10);
				toast.show();
				finish();
			}
		});
	}
}
