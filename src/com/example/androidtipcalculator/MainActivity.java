package com.example.androidtipcalculator;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
	private Button tenpercButton;
	private Button fifpercButton;
	private Button twenpercButton;

	private String strBillAmount;
	private float fltTipAmount;
	private TextView tvTipAmount;

	
	//
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.setContentView(R.layout.activity_result);
					
		this.tenpercButton = (Button)this.findViewById(R.id.tenperc);
		this.fifpercButton = (Button)this.findViewById(R.id.fifperc);
		this.twenpercButton = (Button)this.findViewById(R.id.twenperc);
		
		this.tenpercButton.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View view) {	
				
				EditText etbillAmount = (EditText) findViewById(R.id.billText);

				float result = Float.parseFloat(etbillAmount.getText().toString()) * 10/100;
				
				EditText etResult = (EditText) findViewById(R.id.TipAmount);
				etResult.setText(Float.toString(result));

				
				// billCalculate();
				// Log.e ("lm1", mBillAmount(v));
			}
		});
	}
	
	//Read in bill before tip calculation
	public void billCalculate () {
		
		
		
		
	}
	
	

}
