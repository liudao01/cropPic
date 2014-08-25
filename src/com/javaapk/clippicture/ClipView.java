package com.javaapk.clippicture;
//javaapk.com提供测试
import com.test.www.R;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 
 * @author huyx
 * @desc 阴影部分view
 */
public class ClipView extends View {
	public ClipView(Context context) {
		super(context);
	}

	public ClipView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ClipView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		int width = this.getWidth();
		int height = this.getHeight();

		Paint paint = new Paint();
		paint.setColor(0xaa000000);
		canvas.drawRect(0, 0, width, height / 4, paint);
		canvas.drawRect(0, height / 4, (width - height / 2) / 2,
				height * 3 / 4, paint);
		canvas.drawRect((width + height / 2) / 2, height / 4, width,
				height * 3 / 4, paint);
		canvas.drawRect(0, height * 3 / 4, width, height, paint);
		paint.setColor(getResources().getColor(R.color.white));
		canvas.drawRect((width - height / 2) / 2 - 1, height / 4 - 1,
				(width + height / 2) / 2 + 1, (height / 4), paint);
		canvas.drawRect((width - height / 2) / 2 - 1, height / 4,
				(width - height / 2) / 2, height * 3 / 4, paint);
		canvas.drawRect((width + height / 2) / 2, height / 4,
				(width + height / 2) / 2 + 1, height * 3 / 4, paint);
		canvas.drawRect((width - height / 2) / 2 - 1, height * 3 / 4,
				(width + height / 2) / 2 + 1, height * 3 / 4 + 1, paint);
	}

}
