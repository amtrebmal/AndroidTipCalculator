package com.example.androidtipcalculator;

import com.example.androidtipcalculator.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	EditText BillValue;
	TextView TipValue;
	Button Calculate;
	float num1 , num2;
	
	
	Button tenpercButton;
	Button fifpercButton;
	Button twenpercButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
		tenpercButton = (Button)this.findViewById(R.id.tenperc);
		fifpercButton = (Button)this.findViewById(R.id.fifperc);
		twenpercButton = (Button)this.findViewById(R.id.twenperc);

        	BillValue = (EditText) findViewById(R.id.billText);
        
        	TipValue = (TextView) findViewById(R.id.TipAmount);
        	TipValue.setText("0.00");


        	//Adding listener to 1st button
        	tenpercButton.setOnClickListener(new OnClickListener() {

        		public void onClick(View v) {
        			//Getting tip and setup value and passing to show result
        			showResultTen(BillValue.getText());
        		}
        	});
        	
        	//Adding listener to 2nd button
        	fifpercButton.setOnClickListener(new OnClickListener() {

        		public void onClick(View v) {
        			//Getting tip and setup value and passing to show result
        			showResultFifteen(BillValue.getText());
        		}
        	});
        	
        	//Adding listener to 3rd button
        	twenpercButton.setOnClickListener(new OnClickListener() {

        		public void onClick(View v) {
        			//Getting tip and setup value and passing to show result
        			showResultTwenty(BillValue.getText());
        		}
        	});
    }
	
	 //Showing multiply results
	 protected void showResultTen(Editable first) 
	 {
		 float num1 = Float.parseFloat(first.toString());
		 float result = (float) (num1 * 0.10);
		 TipValue.setText(String.valueOf(result));
	 }
	 
	 //Showing multiply results
	 protected void showResultFifteen(Editable first) 
	 {
		 float num1 = Float.parseFloat(first.toString());
		 float result = (float) (num1 * 0.15);
		 TipValue.setText(String.valueOf(result));
	 }
	 
	 //Showing multiply results
	 protected void showResultTwenty(Editable first) 
	 {
		 float num1 = Float.parseFloat(first.toString());
		 float result = (float) (num1 * 0.20);
		 TipValue.setText(String.valueOf(result));
	 }
	
	

}
