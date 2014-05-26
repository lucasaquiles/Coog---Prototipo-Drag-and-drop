package br.com.lucasaquiles.widgets;

import android.R.color;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import br.com.lucasaquiles.view.ImageResource;

@SuppressLint("NewApi")
public class DraggableItem extends ImageView implements OnLongClickListener{

	private ImageResource imageResource;
	private static final String TAG = "draggable";
	private boolean droped;
	
	public DraggableItem(Context context, ImageResource imageResource) {
		
		super(context);
		
		if(imageResource != null){
			
			this.imageResource = imageResource;
			setImageResource(imageResource.getResource());
			setPadding(10, 10, 10, 10);
			setBackgroundColor(color.background_dark);
			setId(imageResource.getResource());
			setClickable(true);
//			setAdjustViewBounds(true);
		}
		
		setOnLongClickListener(this);
	}
	
	public ImageResource getImageResource() {

		return imageResource;
	}

	
	@Override
	public boolean onLongClick(View v) {
		
		ClipData.Item item = new ClipData.Item((CharSequence)v.getTag());
		String[] mimeTypes = { ClipDescription.MIMETYPE_TEXT_PLAIN };
		
		ClipData data = new ClipData(TAG, mimeTypes, item);
		
		v.setDrawingCacheEnabled(true);
		v.startDrag(data, new CustomDragShadownBuilder(v),v, 0);
		
		return true;
	}
	
	
	
	public boolean isDroped() {
		return droped;
	}
	
	public void setDroped(boolean droped) {
		this.droped = droped;
	}

	
}
