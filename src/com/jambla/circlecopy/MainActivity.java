package com.jambla.circlecopy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.jambla.circlecopy.CircleMenu.OnCircleItemSelectedListener;

public class MainActivity extends Activity {
	private CircleMenu circleMenu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findView();
		initContent();
		addListener();
	}
	
	/*
	 * 查找布局组件
	 */
	private void findView() {
		circleMenu = (CircleMenu) findViewById(R.id.circle_menu);
	}

	/*
	 * 初始化布局内容
	 */
	private void initContent() {
	}

	/*
	 * 为布局组件添加监听器
	 */
	private void addListener() {
		circleMenu.setOnCircleItemSelectedListener(new OnCircleItemSelectedListener() {
			@Override
			public void onItemClickedListener(int index) {
				if(index==-2){
					circleMenu.closeOrOpen();
				}
				
			}
		});
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Log.d("jambla", "kasdfjhasdhflasdhflkjahdsfa");
		return true;
	}
}
