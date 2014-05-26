package br.com.lucasaquiles.activity;

import br.com.lucasaquiles.widgets.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash_screen);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent i = new Intent(SplashScreen.this, Main.class);
				SplashScreen.this.startActivity(i);
				SplashScreen.this.finish();
			}
		}, 4000);
	}
}
