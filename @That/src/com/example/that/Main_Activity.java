package com.example.that;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Main_Activity extends TabActivity{

	private TabHost mTabHost ;
	Intent intent ;
	TabSpec spec1 ;
	TabSpec spec2 ;
	TabSpec spec3 ;

	@SuppressWarnings("deprecation")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mTabHost = getTabHost();

		//Featured Tab
		intent = new Intent(this, Featured_Activity.class);
		spec1 = mTabHost.newTabSpec("Featured").setIndicator("Featured").setContent(intent);
		mTabHost.addTab(spec1);

		//Event Tab
		intent = new Intent(this, Event_Activity.class);
		spec2= mTabHost.newTabSpec("My Event").setIndicator("My Event").setContent(intent);
		mTabHost.addTab(spec2);

		//Who's @That Tab
		intent = new Intent(this, Whos_At_That_Activity.class);
		spec3 = mTabHost.newTabSpec("Who's @That").setIndicator("Who's @That").setContent(intent);
		mTabHost.addTab(spec3);
		
		mTabHost.setCurrentTab(1);
		
	}

}
