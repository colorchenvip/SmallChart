package smallchart.idtk.com.smallchartexample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import smallchart.idtk.com.smallchartexample.fragment.BarChartFragment;
import smallchart.idtk.com.smallchartexample.fragment.CombineChartFragment;
import smallchart.idtk.com.smallchartexample.fragment.CurveChartFragment;
import smallchart.idtk.com.smallchartexample.fragment.LineChartFragment;
import smallchart.idtk.com.smallchartexample.fragment.PieChartFragment;
import smallchart.idtk.com.smallchartexample.fragment.RadarChartFragment;

public class MainActivity extends AppCompatActivity {

    private FrameLayout chartFragments;
    private TabLayout topTabs;
    private Fragment barChartFragment,lineChartFragment,curveChartFragment,combineChartFragment,
            radarChartFragment,pieChartFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        chartFragments = (FrameLayout) findViewById(R.id.chart_fragments);
        topTabs = (TabLayout) findViewById(R.id.top_tabs);
        topTabs.setTabMode(TabLayout.MODE_SCROLLABLE);
        topTabs.setTabGravity(TabLayout.GRAVITY_FILL);

        topTabs.addTab(topTabs.newTab().setText("折线图"),0);
        topTabs.addTab(topTabs.newTab().setText("柱状图"),1);
        topTabs.addTab(topTabs.newTab().setText("折线图"),2);
        topTabs.addTab(topTabs.newTab().setText("混合图"),3);
        topTabs.addTab(topTabs.newTab().setText("环形图"),4);
        topTabs.addTab(topTabs.newTab().setText("雷达图"),5);

        topTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                hideFragment(fragmentTransaction);
                switch (tab.getPosition()){
                    case 0:
                        if (curveChartFragment == null){
                            curveChartFragment = new CurveChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments,curveChartFragment);
                        }else {
                            fragmentTransaction.show(curveChartFragment);
                        }
                        break;
                    case 1:
                        if (barChartFragment == null){
                            barChartFragment = new BarChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments, barChartFragment);
                        }else {
                            fragmentTransaction.show(barChartFragment);
                        }
                        break;
                    case 2:
                        if (lineChartFragment == null){
                            lineChartFragment = new LineChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments,lineChartFragment);
                        }else {
                            fragmentTransaction.show(lineChartFragment);
                        }
                        break;
                    case 3:
                        if (combineChartFragment == null){
                            combineChartFragment = new CombineChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments,combineChartFragment);
                        }else {
                            fragmentTransaction.show(combineChartFragment);
                        }
                        break;
                    case 4:
                        if (pieChartFragment == null){
                            pieChartFragment = new PieChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments,pieChartFragment);
                        }else {
                            fragmentTransaction.show(pieChartFragment);
                        }
                        break;
                    case 5:
                        if (radarChartFragment == null){
                            radarChartFragment = new RadarChartFragment();
                            fragmentTransaction.add(R.id.chart_fragments,radarChartFragment);
                        }else {
                            fragmentTransaction.show(radarChartFragment);
                        }
                        break;
                }
                fragmentTransaction.commit();//提交事务
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        topTabs.getTabAt(1).select();
        topTabs.getTabAt(0).select();
    }

    private void hideFragment(FragmentTransaction fragmentTransaction){

        if (barChartFragment != null){
            fragmentTransaction.hide(barChartFragment);
        }

        if (lineChartFragment != null){
            fragmentTransaction.hide(lineChartFragment);
        }

        if (curveChartFragment != null){
            fragmentTransaction.hide(curveChartFragment);
        }
        if (combineChartFragment != null){
            fragmentTransaction.hide(combineChartFragment);
        }

        if (radarChartFragment != null){
            fragmentTransaction.hide(radarChartFragment);
        }
        if (pieChartFragment != null){
            fragmentTransaction.hide(pieChartFragment);
        }
    }


}
