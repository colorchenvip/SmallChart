package smallchart.idtk.com.smallchartexample.fragment;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idtk.smallchart.chart.CombineChart;
import com.idtk.smallchart.data.BarData;
import com.idtk.smallchart.data.CurveData;
import com.idtk.smallchart.data.LineData;
import com.idtk.smallchart.interfaces.iData.IBarLineCurveData;

import java.util.ArrayList;

import smallchart.idtk.com.smallchartexample.R;

/**
 * Created by Idtk on 2016/6/26.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 :
 */
public class CombineChartFragment extends BaseFragment {

    private CurveData mCurveData = new CurveData();
    private ArrayList<PointF> mPointArrayList1 = new ArrayList<>();

    private LineData mLineData = new LineData();
    private ArrayList<PointF> mPointArrayList2 = new ArrayList<>();

    private BarData mBarData = new BarData();
    private ArrayList<PointF> mPointArrayList3 = new ArrayList<>();

    private ArrayList<IBarLineCurveData> mDataList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_combinechart,container,false);
        initData();
        CombineChart combineChart = (CombineChart)view.findViewById(R.id.combineChart);
        combineChart.isAnimated = false;
        combineChart.setDataList(mDataList);
        return view;
    }

    private void initData() {
        for (int i = 0; i < 8; i++) {
            mPointArrayList3.add(new PointF(points[i][0], points[i][1]));
            mPointArrayList2.add(new PointF(points[i][0], points[i][1]-5));
            mPointArrayList1.add(new PointF(points[i][0], points[i][1]+10));
        }
        mBarData.setValue(mPointArrayList3);
        mBarData.setColor(Color.CYAN);
        mBarData.setPaintWidth(pxTodp(5));
        mBarData.setTextSize(pxTodp(10));
        mDataList.add(mBarData);

        mLineData.setValue(mPointArrayList2);
        mLineData.setColor(Color.MAGENTA);
        mLineData.setPaintWidth(pxTodp(3));
        mLineData.setTextSize(pxTodp(10));
        mDataList.add(mLineData);

        mCurveData.setValue(mPointArrayList1);
        mCurveData.setColor(Color.YELLOW);
        mCurveData.setPaintWidth(pxTodp(3));
        mCurveData.setTextSize(pxTodp(10));
        mDataList.add(mCurveData);

    }
}
