package br.com.lucasaquiles.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnDragListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import br.com.lucasaquiles.view.AreaView;
import br.com.lucasaquiles.view.ImageResource;
import br.com.lucasaquiles.view.ImageScrollerView;
import br.com.lucasaquiles.widgets.DraggableItem;
import br.com.lucasaquiles.widgets.R;

@SuppressLint("NewApi")
public class Main extends Activity implements OnDragListener{
	
	private ImageScrollerView imageScrollerView;
	private AreaView areaView;
	private AreaView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		imageScrollerView = (ImageScrollerView) findViewById(R.id.horizontalScrollView1);
		areaView = (AreaView) findViewById(R.id.areaView);
		imageView = (AreaView) findViewById(R.id.pic);
		
		imageScrollerView.setOnDragListener(this);
		areaView.setOnDragListener(this);
	}
	
	@Override
	public boolean onDrag(View v, DragEvent event) {
		
		switch (event.getAction()) {
		case DragEvent.ACTION_DRAG_STARTED:
			
			Log.i("drag action", "ACTION_DRAG_STARTED");
			break;
		case DragEvent.ACTION_DRAG_ENTERED:
			
			Log.i("drag action", "ACTION_DRAG_ENTERED");
			break;
		case DragEvent.ACTION_DRAG_EXITED:
			
			Log.i("drag action", "ACTION_DRAG_EXITED");
			break;
		case DragEvent.ACTION_DROP:
			
			View view = (View) event.getLocalState();
			ViewGroup vGroup = (ViewGroup) view.getParent();
			vGroup.removeView(view);
			
			if(v.getId() == areaView.getId()){
				
				int width = view.getWidth()/2;
				int height = view.getHeight()/2;
				
				RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(view.getWidth(), view.getHeight());
				
				float xPosition = event.getX();
				float yPosition = event.getY();

				if(xPosition > areaView.getWidth()){
					
					Toast.makeText(this, "visshh",  Toast.LENGTH_SHORT).show();
				}
				
				int x = Math.round(xPosition-width);
				int y = Math.round(yPosition-height);
				
				params.leftMargin = x;
				params.topMargin = y;
				
				((DraggableItem) view).setDroped(true);
				
				view.setLayoutParams(params);
				areaView.addView(view);
				
				Log.i("drag", "width: "+width+" - "+"height: "+height);
				Log.i("drag", "x: "+x+" - "+"y: "+y);
				
				Toast.makeText(getApplicationContext(), "Opaaa!!! você adicionou um "+((DraggableItem) view).getImageResource().getPart().getPartName(), Toast.LENGTH_SHORT).show();
			}
			
			if(v.getId() == imageScrollerView.getId()){

				ImageResource imageResource = ((DraggableItem) view).getImageResource();
				((DraggableItem) view).setImageResource(imageResource.getResource());
				
				if(((DraggableItem) view).isDroped()){
					
					((DraggableItem) view).setDroped(false);
					Toast.makeText(getApplicationContext(), "Opaaa!!!", Toast.LENGTH_SHORT).show();
				}
				
				imageScrollerView.getLayout().addView(view);
			}
			
			view.setVisibility(View.VISIBLE);
			
		default:
			break;			
	}
		return true;
	}
	
}
