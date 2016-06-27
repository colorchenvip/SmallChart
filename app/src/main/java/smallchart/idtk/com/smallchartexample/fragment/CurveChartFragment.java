package smallchart.idtk.com.smallchartexample.fragment;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idtk.smallchart.chart.CurveChart;
import com.idtk.smallchart.data.CurveData;
import com.idtk.smallchart.data.PointShape;
import com.idtk.smallchart.interfaces.iData.ICurveData;

import java.util.ArrayList;

import smallchart.idtk.com.smallchartexample.R;

/**
 * Created by Idtk on 2016/6/26.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 : 曲线图
 */
public class CurveChartFragment extends BaseFragment {

    private ArrayList<ICurveData> mDataList = new ArrayList<>();
    private CurveData mCurveData = new CurveData();
    private ArrayList<PointF> mPointArrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_curvechart,container,false);
        CurveChart curveChart = (CurveChart) view.findViewById(R.id.curveChart);
        initData();
//        curveChart.setData(mCurveData);
        curveChart.setDataList(mDataList);
        return view;
    }

    private void initData() {
        for (int i = 0; i < 8; i++) {
            mPointArrayList.add(new PointF(points[i][0], points[i][1]));
        }
        mCurveData.setValue(mPointArrayList);
        mCurveData.setColor(Color.RED);

        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.fade_red);
        mCurveData.setDrawable(drawable);

        mCurveData.setPointShape(PointShape.SOLIDROUND);
        mCurveData.setPaintWidth(pxTodp(3));
        mCurveData.setTextSize(pxTodp(10));
        mDataList.add(mCurveData);
    }
}
