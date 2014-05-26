package br.com.lucasaquiles.view;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.RelativeLayout;
import br.com.lucasaquiles.widgets.DraggableItem;


public class AreaView extends RelativeLayout{
	
	private List<DraggableItem> dropedItens = new ArrayList<DraggableItem>();

	public AreaView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
}
