package br.com.lucasaquiles.widgets;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.opengl.Visibility;
import android.util.Log;
import android.view.View;
import android.webkit.WebView.FindListener;
import android.widget.Toast;

@SuppressLint("NewApi")
public class CustomDragShadownBuilder extends View.DragShadowBuilder{
	
	public CustomDragShadownBuilder(View view) {
		
		super(view);
	}
	
	@Override
	public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint) {
		int width = getView().getWidth();
		int height = getView().getHeight();
		
//		int[] locations = new int[2];
//		getView().getLocationOnScreen(locations);
//		
		shadowSize.set(width*2, height*2);
		
		//shadowTouchPoint.set(shadowSize.x, shadowSize.y);
		
		shadowTouchPoint.set(width + width / 2 - 52, height / 2 + 52);
		
	}
	
	@Override
	public void onDrawShadow(Canvas canvas) {
		
		Log.i("arrastando", "dragggggggiiinnnnnnggg");

		int width = getView().getWidth();
		int height = getView().getHeight();
		
		final float sepAngle = (float)Math.PI / 16;
		final float circleRadius = 2f;
		
		float centerX = width + width / 2 - 52;
		float centerY = height / 2 + 52;
		
		int baseColor = Color.BLUE;
		
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setColor(baseColor);
		
		canvas.drawCircle(centerX, centerY, circleRadius + 1, paint);
		
		for (int radOffset = 70; centerX + radOffset < canvas.getWidth(); radOffset += 20) {
			for (float angle = 0; angle < Math.PI * 2; angle += sepAngle) {
				
				float pointX = centerX + (float)Math.cos(angle) * radOffset;
				float pointY = centerY + (float)Math.sin(angle) * radOffset;
				
				canvas.drawCircle(pointX, pointY, circleRadius, paint);
			}
		}
		
		canvas.drawBitmap(getView().getDrawingCache(), 0, 0, null);
	}
}
