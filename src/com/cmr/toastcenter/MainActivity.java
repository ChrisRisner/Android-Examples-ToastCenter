package com.cmr.toastcenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void tappedShowToast(View view) {
		Toast.makeText(this, "This is a toast that isn't centered in anyway at all", Toast.LENGTH_SHORT).show();
	}
	
	public void tappedShowToastWithCenterText(View view) {
		Toast toast = Toast.makeText(this, "This is a toast where the text is centered in the middle of the toast", Toast.LENGTH_SHORT);
		LinearLayout layout = (LinearLayout) toast.getView();
		if (layout.getChildCount() > 0) {
	        TextView tv = (TextView) layout.getChildAt(0);
	        tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
		}
        toast.show();
	}
	
	public void tappedShowCenteredToast(View view) {
		Toast toast = Toast.makeText(this, "This is a toast that is centered onscreen but the text isn't centered", Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
	
	public void tappedCenterBoth(View view) {
		Toast toast = Toast.makeText(this, "This is a toast that is centered onscreen and the text is centered in the toast", Toast.LENGTH_SHORT);
		LinearLayout layout = (LinearLayout) toast.getView();
		if (layout.getChildCount() > 0) {
			TextView tv = (TextView) layout.getChildAt(0);
			tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);        
		}
		toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
	}

}
