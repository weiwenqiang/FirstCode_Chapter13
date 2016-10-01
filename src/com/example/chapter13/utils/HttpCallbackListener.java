package com.example.chapter13.utils;

public interface HttpCallbackListener {
	void onFinish(String response);
	
	void onError(Exception e);
}
