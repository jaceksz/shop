package my.shop;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PrzegladajActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_przegladaj);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.przegladaj, menu);
		return true;
	}

}
