package br.com.lucasaquiles.view;

import android.R.color;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import br.com.lucasaquiles.widgets.DraggableItem;


public class ImageScrollerView extends HorizontalScrollView{

	private LinearLayout layout;
	
	public ImageScrollerView(Context context, AttributeSet attrs) {
		
		super(context, attrs);
		
		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setBackgroundColor(color.holo_blue_bright);
		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		
		layout.setWeightSum(10f);
		layout.setLayoutParams(params);
		
		DraggableItem drag1 = new DraggableItem(context, ImageResource.SMILE_1);
		DraggableItem drag2 = new DraggableItem(context, ImageResource.SMILE_2);
		DraggableItem drag3 = new DraggableItem(context, ImageResource.SMILE_3);
		DraggableItem drag4 = new DraggableItem(context, ImageResource.SMILE_4);
		DraggableItem drag5 = new DraggableItem(context, ImageResource.SMILE_5);
		DraggableItem drag6 = new DraggableItem(context, ImageResource.SMILE_6);
		DraggableItem drag7 = new DraggableItem(context, ImageResource.SMILE_7);
		DraggableItem drag8 = new DraggableItem(context, ImageResource.SMILE_8);
		DraggableItem drag9 = new DraggableItem(context, ImageResource.SMILE_9);
		DraggableItem drag10 = new DraggableItem(context, ImageResource.SMILE_10);
		DraggableItem drag11 = new DraggableItem(context, ImageResource.SMILE_11);
		DraggableItem drag12 = new DraggableItem(context, ImageResource.SMILE_12);
		
		DraggableItem eye1 = new DraggableItem(context, ImageResource.EYE_1);
		DraggableItem eye2 = new DraggableItem(context, ImageResource.EYE_2);
		DraggableItem eye3 = new DraggableItem(context, ImageResource.EYE_3);
		DraggableItem eye4 = new DraggableItem(context, ImageResource.EYE_4);
		DraggableItem eye5 = new DraggableItem(context, ImageResource.EYE_5);
		DraggableItem eye6 = new DraggableItem(context, ImageResource.EYE_6);
		DraggableItem eye7 = new DraggableItem(context, ImageResource.EYE_7);
		DraggableItem eye8 = new DraggableItem(context, ImageResource.EYE_8);
		
		layout.addView(drag1);
		layout.addView(drag2);
		layout.addView(drag3);
		layout.addView(drag4);
		layout.addView(drag5);
		layout.addView(drag6);
		layout.addView(drag7);
		layout.addView(drag8);
		layout.addView(drag9);
		layout.addView(drag10);
		layout.addView(drag11);
		layout.addView(drag12);
		
		layout.addView(eye1);
		layout.addView(eye2);
		layout.addView(eye3);
		layout.addView(eye4);
		layout.addView(eye5);
		layout.addView(eye6);
		layout.addView(eye7);
		layout.addView(eye8);
		
		layout.addView(new DraggableItem(context, ImageResource.NOISE_1));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_2));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_3));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_4));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_5));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_6));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_7));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_8));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_9));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_10));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_11));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_12));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_13));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_14));
		layout.addView(new DraggableItem(context, ImageResource.NOISE_15));
		
		this.addView(layout);
	}
	
	public LinearLayout getLayout() {
	
		return layout;
	}
}
