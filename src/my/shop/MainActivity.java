package my.shop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setWyszukajButton();
        setPrzegladajButton();
        setWyjdzButton();
    }


    private void setWyszukajButton() {
		// TODO Auto-generated method stub
    	// 1. Get a reference to the button.
    	Button messageButton = (Button) findViewById(R.id.szukajButton);
    	 // 2. Set the click listener to run my code.
    	View.OnClickListener myListener = new View.OnClickListener() {
    	@Override
    	public void onClick(View v) 
    		{ 
    		startActivity(new Intent(MainActivity.this, SzukajActivity.class));
    		}
    	};
    	messageButton.setOnClickListener(myListener);
	}

    private void setPrzegladajButton() {
 		// TODO Auto-generated method stub
     	// 1. Get a reference to the button.
     	Button messageButton = (Button) findViewById(R.id.przegladajButton);
     	 // 2. Set the click listener to run my code.
     	View.OnClickListener myListener = new View.OnClickListener() {
     	@Override
     	public void onClick(View v) 
     		{ 
     		startActivity(new Intent(MainActivity.this, PrzegladajActivity.class));
     		}
     	};
     	messageButton.setOnClickListener(myListener);
 	}
    
    private void setWyjdzButton() {
 		// TODO Auto-generated method stub
     	// 1. Get a reference to the button.
     	Button messageButton = (Button) findViewById(R.id.wyjdzButton);
     	 // 2. Set the click listener to run my code.
     	View.OnClickListener myListener = new View.OnClickListener() {
     	@Override
     	public void onClick(View v) 
     		{ 
     		android.os.Process.killProcess(android.os.Process.myPid());
     		}
     	};
     	messageButton.setOnClickListener(myListener);
 	}
    

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
