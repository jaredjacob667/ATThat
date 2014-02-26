package com.example.that;

import java.text.DateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

public class Sign_Up_Activity extends Activity {

	private AlertDialog.Builder dialog_Builder ;
	CharSequence genderChoice ;
	Calendar calendar = Calendar.getInstance() ;
	Button gender_Button ;
	Button birthday_Button ;
	Button sign_up_Button ;
	DateFormat formate = DateFormat.getDateInstance();
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);

		gender_Button = (Button)findViewById(R.id.gender_Button);
		gender_Button.setBackgroundColor(Color.rgb(240, 84, 35));
		gender_Button.setTextColor(Color.WHITE);
		gender_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				gender(gender_Button);

			}
		});
		
		birthday_Button = (Button)findViewById(R.id.birthday_Button);
		birthday_Button.setBackgroundColor(Color.rgb(240, 84, 35));
		birthday_Button.setTextColor(Color.WHITE);
		birthday_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setDate();
			}

		});
		
		sign_up_Button = (Button)findViewById(R.id.sign_up_Button);
		sign_up_Button.setBackgroundColor(Color.rgb(240, 84, 35));
		sign_up_Button.setTextColor(Color.WHITE);

	}



	public void setDate() {
		new DatePickerDialog(Sign_Up_Activity.this, date, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
		
	}

	DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			// TODO Auto-generated method stub
			calendar.set(year, monthOfYear, dayOfMonth);
			updateDate();
			
		}
	};

	public void updateDate() {
		
		birthday_Button.setText(formate.format(calendar.getTime()));
				
	}

	private void gender(final Button gender){

		dialog_Builder = new AlertDialog.Builder(this);
		final CharSequence[] gender_List = {"Male", "Female"};

		dialog_Builder.setTitle("Choose Gender");
		dialog_Builder.setSingleChoiceItems(gender_List, -1, new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				genderChoice = gender_List[which] ;
				gender.setText(genderChoice);
				dialog.dismiss();	
			}

		});
		AlertDialog dialogGender = dialog_Builder.create();
		dialogGender.show();

	}
}
