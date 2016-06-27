# SmallChart

## Introduction
&nbsp;&nbsp;&nbsp;&nbsp;SmallChart是一个开源的Android图表库，拥有5种不同的图表类型来展示数据。可以通过输入的数据以及可设置的颜色、画笔大小等属性方便的创建图表。<br>

## Version
SdkVersion >= 19

## Chart types
* Curve Chart(fill)

<img src="https://github.com/Idtk/SmallChart/blob/master/image/curve.png" alt="curve" title="curve"/><br>

* bar Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/bar.png" alt="bar" title="bar"/><br>

* Line Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/line.png" alt="line" title="line"/><br>

* Combine Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/combine.png" alt="combine" title="combine"/><br>

* PieChart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/pie.png" alt="pie" title="pie"/><br>

* RadarChart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/radar.png" alt="radar" title="radar"/><br>

## Features

* 折线图、曲线图(可填充)、柱状图、扇形图、雷达图，共5种图表类型。
* 组合图表类型，可任意组合折线图、曲线图、柱状图。
* 折线图、曲线图(可填充)、柱状图、扇形图都拥有绘制动画。
* 扇形图提供了触控交互效果。

## Usage
以组合图表为例
### XML
```XML
<com.idtk.smallchart.chart.CombineChart
    android:id="@+id/combineChart"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```
### Java
```Java
CombineChart combineChart = (CombineChart)view.findViewById(R.id.combineChart);
combineChart.isAnimated = false;
combineChart.setDataList(mDataList);
```
### Data
```Java
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
```

## License
```
Copyright (C) 2016 Idtk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```