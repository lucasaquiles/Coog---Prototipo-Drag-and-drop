package br.com.lucasaquiles.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Toast;

public class CustomButton extends Button{
	int menuRes;
	int menuRef;

	public CustomButton(Context context, AttributeSet attrs) {
		
		super(context, attrs);
	}

	
	@Override
	public boolean performClick() {
		Toast.makeText(super.getContext(), "EETCHA!!", Toast.LENGTH_SHORT).show();
		return super.performClick();
	}
}
