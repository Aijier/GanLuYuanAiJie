package com.example.jisuan;

import com.example.test.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class JiSuanActivity extends Activity implements OnClickListener {
	private EditText editText;
	private String tempResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jisuan);
		editText = (EditText) findViewById(R.id.editText);
		Button one = (Button) findViewById(R.id.one);
		Button two = (Button) findViewById(R.id.two);
		Button three = (Button) findViewById(R.id.three);
		Button four = (Button) findViewById(R.id.four);
		Button five = (Button) findViewById(R.id.five);
		Button six = (Button) findViewById(R.id.six);
		Button seven = (Button) findViewById(R.id.seven);
		Button eight = (Button) findViewById(R.id.eight);
		Button nine = (Button) findViewById(R.id.nine);
		Button zero = (Button) findViewById(R.id.zero);
		Button dot = (Button) findViewById(R.id.dot);
		Button deng = (Button) findViewById(R.id.deng);
		Button add = (Button) findViewById(R.id.add);
		Button reduce = (Button) findViewById(R.id.reduce);
		Button chu = (Button) findViewById(R.id.chu);
		Button cheng = (Button) findViewById(R.id.cheng);
		Button clean = (Button) findViewById(R.id.clean);
		Button delete = (Button) findViewById(R.id.delete);
		Button history = (Button) findViewById(R.id.history);
		
		OnClickListener numberOnClickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				String string = editText.getText().toString();
				if (string.contains("=")) {
					editText.setText("");
				}
				Button button = (Button) v;
				String num = button.getText().toString();
				Log.d("Suan", num);
				editText.append(num);
			}
		};
		one.setOnClickListener(numberOnClickListener);
		two.setOnClickListener(numberOnClickListener);
		three.setOnClickListener(numberOnClickListener);
		four.setOnClickListener(numberOnClickListener);
		five.setOnClickListener(numberOnClickListener);
		six.setOnClickListener(numberOnClickListener);
		seven.setOnClickListener(numberOnClickListener);
		eight.setOnClickListener(numberOnClickListener);
		nine.setOnClickListener(numberOnClickListener);
		zero.setOnClickListener(numberOnClickListener);

		add.setOnClickListener(this);
		cheng.setOnClickListener(this);
		chu.setOnClickListener(this);
		reduce.setOnClickListener(this);
		dot.setOnClickListener(this);
		deng.setOnClickListener(this);
		clean.setOnClickListener(this);
		delete.setOnClickListener(this);
		history.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.add:
			Button add = (Button) v;
			if (TextUtils.isEmpty(tempResult)) {

			} else {
				editText.setText(tempResult);
			}
			String editContent = editText.getText().toString();
			char charAt = editContent.charAt(editContent.length() - 1);
			if ('+' == charAt) {

			} else {
				editText.append(add.getText().toString());
			}
			break;
		case R.id.reduce:
			Button reduce = (Button) v;
			if (TextUtils.isEmpty(tempResult)) {
			} else {
				editText.setText(tempResult);

			}
			String editContent2 = editText.getText().toString();
			char charAt2 = editContent2.charAt(editContent2.length() - 1);
			if ('-' == charAt2) {

			} else {
				editText.append(reduce.getText().toString());
			}
			break;
		case R.id.cheng:
			Button cheng=(Button)v;
			if(TextUtils.isEmpty(tempResult)){
				
			}else{
				editText.setText(tempResult);
			}
			String editContent3=editText.getText().toString();
			char charAt3=editContent3.charAt(editContent3.length()-1);
			if('*'==charAt3){
				
			}else{
				editText.append(cheng.getText().toString());
			}
			break;
		case R.id.chu:
			Button chu=(Button)v;
			if(TextUtils.isEmpty(tempResult)){
			}else{
				editText.setText(tempResult);
			}
			String editContent4=editText.getText().toString();
			char charAt4=editContent4.charAt(editContent4.length()-1);
			if('/'==charAt4){
			}else{
				editText.append(chu.getText().toString());
			}
			break;
		case R.id.deng:
			String equalEditContent = editText.getText().toString();
			String result = optEqual(equalEditContent);
			editText.append("=");
			editText.append(result);
			tempResult = result;
			break;
		case R.id.delete:
			tempResult = "";
			String deleteEditContent = editText.getText().toString();
			if (deleteEditContent.length() >= 1) {
				editText.setText(deleteEditContent.substring(0,
						deleteEditContent.length() - 1));
			}
			break;
		case R.id.clean:
			tempResult = "";
			editText.setText("");
			break;
		default:
			break;
		case R.id.history:
			Button history = (Button) v;
			if (TextUtils.isEmpty(tempResult)) {

			} else {
				editText.setText(tempResult);
			}

		}
	}

	private String optEqual(String equalEditContent) {
		Log.d("Suan", equalEditContent);
		double result = 0l;
		if (equalEditContent.contains("+")) {
			String[] split = equalEditContent.split("\\+");
			String num1 = split[0];
			String num2 = split[1];
			double dou1 = Double.parseDouble(num1);
			double dou2 = Double.parseDouble(num2);
			result = dou1 + dou2;
			
		}
		if (equalEditContent.contains("-")) {
			String[] split = equalEditContent.split("\\-");
			String num1 = split[0];
			String num2 = split[1];
			double dou1 = Double.parseDouble(num1);
			double dou2 = Double.parseDouble(num2);
			result = dou1 - dou2;
			
		}
		if(equalEditContent.contains("*")){
			String [] split=equalEditContent.split("\\*");
			String num1=split[0];
			String num2=split[1];
			double dou1=Double.parseDouble(num1);
			double dou2=Double.parseDouble(num2);
			result=dou1*dou2;
		}
		if(equalEditContent.contains("/")){
			String [] split=equalEditContent.split("\\/");
			String num1=split[0];
			String num2=split[1];
			double dou1=Double.parseDouble(num1);
			double dou2=Double.parseDouble(num2);
			result=dou1/dou2;
		}
		
		return result+"";
   
	}

}
