package com.idtk.smallchart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

import com.idtk.smallchart.interfaces.iData.IXAxisData;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by Idtk on 2016/6/6.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 ; X轴渲染类
 */
public class XAxisRender extends AxisRender {

    private Paint mPaint = new Paint();
    private IXAxisData xAxisData;
    private NumberFormat numberFormat;
    private PointF mPoint = new PointF();

    public XAxisRender(IXAxisData xAxisData) {
        super();
        this.xAxisData = xAxisData;
        mPaint.setColor(xAxisData.getColor());
        mPaint.setTextSize(xAxisData.getTextSize());
        mPaint.setStrokeWidth(xAxisData.getPaintWidth());
        /**
         * 设置小数点位数
         */
        numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(xAxisData.getDecimalPlaces());
    }

    @Override
    public void drawGraph(Canvas canvas) {
        canvas.drawLine(0,0,xAxisData.getAxisLength(),0,mPaint);

        ArrayList<String> label = xAxisData.getLabel();
        for (int i=0;(xAxisData.getInterval()*i+xAxisData.getMinimum())<=xAxisData.getMaximum();i++){
            canvas.drawLine((float) (xAxisData.getInterval()*i*xAxisData.getAxisScale()),0,
                    (float) (xAxisData.getInterval()*i*xAxisData.getAxisScale()),
                    -xAxisData.getAxisLength()/100,mPaint);
            canvas.save();
            canvas.scale(1,-1);
            /**
             * 坐标数值
             */
            float TextPathX = (float) (xAxisData.getInterval()*i*xAxisData.getAxisScale());
            float TextPathY = (mPaint.descent()+mPaint.ascent())-xAxisData.getAxisLength()/100;
            mPoint.x = TextPathX;
            mPoint.y = -TextPathY;
            String labelString = numberFormat.format(xAxisData.getInterval()*i+xAxisData.getMinimum());
            if (label != null) labelString = label.get(i);
            textCenter(new String[]{labelString}, mPaint,canvas, mPoint, Paint.Align.CENTER);
            canvas.restore();
        }
        /**
         * 箭头
         */
        canvas.drawLine(xAxisData.getAxisLength(),0,xAxisData.getAxisLength()*0.99f,xAxisData.getAxisLength()*0.01f,mPaint);
        canvas.drawLine(xAxisData.getAxisLength(),0,xAxisData.getAxisLength()*0.99f,-xAxisData.getAxisLength()*0.01f,mPaint);
        canvas.save();
        canvas.scale(1,-1);
        canvas.drawText(xAxisData.getUnit(),xAxisData.getAxisLength(),(mPaint.descent()+mPaint.ascent())-xAxisData.getAxisLength()/100,mPaint);
        canvas.restore();
    }

}
