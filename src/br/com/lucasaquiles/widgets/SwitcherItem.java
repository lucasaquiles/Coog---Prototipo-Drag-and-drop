package br.com.lucasaquiles.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

/**
 * 
 * @author lucasaquiles
 *
 */
public class SwitcherItem extends ImageSwitcher implements OnClickListener{
	
	private static int statusIndex = 0;
	
	protected ImageResource[] resources = new ImageResource[]{
			new ImageResource(R.drawable.mouth_1, "sorrizão"), 
			new ImageResource(R.drawable.mouth_2, "sorrião 2"),
			new ImageResource(R.drawable.mouth_3, ""),
			new ImageResource(R.drawable.mouth_4, ""),
			new ImageResource(R.drawable.mouth_5, ""),
			new ImageResource(R.drawable.mouth_6, ""),
			new ImageResource(R.drawable.mouth_7, "")
	};
	
	public SwitcherItem(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.setOnClickListener(this);
		
		this.setFactory(new ImageSwitcher.ViewFactory() {
			
			@Override
			public View makeView() {
					ImageView myView = new ImageView(SwitcherItem.this.getContext().getApplicationContext());
					myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
					myView.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.FILL_PARENT,LayoutParams.FILL_PARENT));
					
					return myView;
			}
		});
		
		this.setImageResource(resources[statusIndex].getResource());
	}

	@Override
	public void onClick(View v) {
		
		getNext(0);
	}

	public void getNext(int indice) {
		Animation in = AnimationUtils.loadAnimation(this.getContext().getApplicationContext(), android.R.anim.slide_in_left);
		Animation out = AnimationUtils.loadAnimation(this.getContext().getApplicationContext(), android.R.anim.slide_out_right);
		
		this.setInAnimation(in);
		this.setOutAnimation(null);
		
		ImageResource imageResource = null;
		if(statusIndex == resources.length - 1){
			statusIndex = 0;
			
			imageResource = resources[statusIndex];
//			Toast.makeText(this.getContext().getApplicationContext(), imageResource.getImageDescription(), Toast.LENGTH_SHORT).show();
			this.setImageResource(imageResource.getResource());
		}else{
			
			statusIndex = statusIndex+1;
			imageResource = resources[statusIndex];
//			Toast.makeText(this.getContext().getApplicationContext(), imageResource.getImageDescription(), Toast.LENGTH_SHORT).show();
			this.setImageResource(imageResource.getResource());
		}
	}
	
	public void getPrev(int indice){
		
		Animation in = AnimationUtils.loadAnimation(this.getContext().getApplicationContext(), android.R.anim.slide_in_left);
		Animation out = AnimationUtils.loadAnimation(this.getContext().getApplicationContext(), android.R.anim.slide_out_right);
		
		this.setInAnimation(null);
		this.setOutAnimation(out);
		
		ImageResource imageResource = null;
		
		if(statusIndex == resources.length - 1){
			
			statusIndex = 0;
			
			imageResource = resources[statusIndex];
//			Toast.makeText(this.getContext().getApplicationContext(), imageResource.getImageDescription(), Toast.LENGTH_SHORT).show();
			this.setImageResource(imageResource.getResource());
		}else{
			
			statusIndex = statusIndex+1;
			
			imageResource = resources[resources.length-statusIndex];
//			Toast.makeText(this.getContext().getApplicationContext(), imageResource.getImageDescription(), Toast.LENGTH_SHORT).show();
			this.setImageResource(imageResource.getResource());
		}
		
		
	}

}
