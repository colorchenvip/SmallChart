package smallchart.idtk.com.smallchartexample.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idtk.smallchart.chart.RadarChart;
import com.idtk.smallchart.data.RadarData;
import com.idtk.smallchart.interfaces.iData.IRadarData;

import java.util.ArrayList;

import smallchart.idtk.com.smallchartexample.R;

/**
 * Created by Idtk on 2016/6/26.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 :
 */
public class RadarChartFragment extends BaseFragment {
    private RadarData mRadarData = new RadarData();
    private RadarData mRadarData2 = new RadarData();
    private ArrayList<IRadarData> radarDataList = new ArrayList<>();
    private ArrayList<Float> radarValue = new ArrayList<>();
    private ArrayList<Float> radarValue2 = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_radarchart,container,false);
        initData();
        RadarChart radarChart = (RadarChart) view.findViewById(R.id.radarChart);
        radarChart.setDataList(radarDataList);
        radarChart.setTypes(new String[]{"Party A", "Party B", "Party C", "Party D", "Party E", "Party F", "Party G", "Party H"});
        return view;
    }
    private void initData() {
        for (int i = 0; i < 8; i++) {
            radarValue.add(points[i][1]);
            radarValue2.add(points2[i][1]);
        }
        mRadarData.setValue(radarValue);
        mRadarData.setColor(Color.MAGENTA);
        mRadarData.setPaintWidth(pxTodp(3));
        mRadarData2.setValue(radarValue2);
        mRadarData2.setColor(Color.CYAN);
        mRadarData2.setPaintWidth(pxTodp(3));
        radarDataList.add(mRadarData);
        radarDataList.add(mRadarData2);
    }
}
