package com.mob.moblink.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.mob.moblink.Scene;
import com.mob.moblink.SceneRestorable;
import com.mob.moblink.demo.util.CommonUtils;

import java.util.Map;

public class ActivityD extends ShareableActivity {

	private TextView tvActTitle;
	private TextView tvActText;
	private Button btnCheckParams;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_a);

		tvActTitle = (TextView) findViewById(R.id.tv_act_title);
		tvActText = (TextView) findViewById(R.id.tv_act_text);
		btnCheckParams = (Button) findViewById(R.id.btn_check_params);

		tvActTitle.setText(R.string.activity_d);
		tvActText.setText(R.string.activity_text_d);

		btnCheckParams.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.btn_check_params: {
				showParamDialog();
			} break;
			default: {
				super.onClick(v);
			} break;
		}
	}
}
