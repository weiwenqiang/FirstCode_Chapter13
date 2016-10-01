package com.example.chapter13.serializable;

import com.example.chapter13.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Person person = new Person();
		person.setName("Tom");
		person.setAge(20);
		Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
		intent.putExtra("person_data", person);
		startActivity(intent);
	}

}
