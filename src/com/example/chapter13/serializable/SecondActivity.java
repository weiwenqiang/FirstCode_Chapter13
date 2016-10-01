package com.example.chapter13.serializable;

import com.example.chapter13.R;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Person person = (Person) getIntent().getSerializableExtra("person_data");//Serializable��ʽ
		PersonParcelable personParcelable = (PersonParcelable) getIntent().getParcelableExtra("person_data");//Parcelable��ʽ
	}
}
