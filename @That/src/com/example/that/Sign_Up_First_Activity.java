package com.example.that;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Sign_Up_First_Activity extends Activity{

	Button process_Button ;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up_first);
		
		process_Button = (Button)findViewById(R.id.process_Button);
		process_Button.setBackgroundColor(Color.rgb(240, 84, 35));
		process_Button.setTextColor(Color.rgb(255, 255, 255));

		process_Button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view){
				startActivity(new Intent(Sign_Up_First_Activity.this, Sign_Up_Activity.class));
			}
			
		});
	}
	
	
}
