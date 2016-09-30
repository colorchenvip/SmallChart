# SmallChart
<br>
[![](https://jitpack.io/v/Idtk/SmallChart.svg)](https://jitpack.io/#Idtk/SmallChart)
<br>
## Introduction
&nbsp;&nbsp;&nbsp;&nbsp;SmallChart是一个开源的Android图表库，折线图、曲线图(可填充)、柱状图、扇形图、雷达图，共5种图表类型。特色的组合图表可以任意组合折线图、曲线图、柱状图。可以通过输入的数据以及可设置的颜色、画笔大小等属性方便的创建图表。<br>

## Version
SdkVersion >= 19

## Chart types
* Curve Chart(fill)

<img src="https://github.com/Idtk/SmallChart/blob/master/image/curve.png" alt="curve" title="curve" width="300"/><br>

* bar Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/bar.png" alt="bar" title="bar" width="300"/><br>

* Line Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/line.png" alt="line" title="line" width="300"/><br>

* Combine Chart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/combine.png" alt="combine" title="combine" width="300"/><br>

* PieChart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/pie.png" alt="pie" title="pie" width="300"/><br>

* RadarChart

<img src="https://github.com/Idtk/SmallChart/blob/master/image/radar.png" alt="radar" title="radar" width="300"/><br>

## Features

* 折线图、曲线图(可填充)、柱状图、扇形图、雷达图，共5种图表类型。
* 组合图表类型，可任意组合折线图、曲线图、柱状图。
* 折线图、曲线图(可填充)、柱状图、扇形图都拥有绘制动画。
* 扇形图提供了触控交互效果。

## Usage

### Gradle
* Step 1. Add the JitPack repository to your build file
```
    allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
* Step 2. Add SmallChart

```
    dependencies {
	        compile 'com.github.Idtk:SmallChart:v0.1.1'
	}
```

### Maven
* Step 1. Add the JitPack repository to your build file
```
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

* Step 2. Add SmallChart
```
    <dependency>
	    <groupId>com.github.Idtk</groupId>
	    <artifactId>SmallChart</artifactId>
	    <version>v0.1.1</version>
	</dependency>
```

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

private CurveData mCurveData = new CurveData();
private ArrayList<PointF> mPointArrayList1 = new ArrayList<>();

private LineData mLineData = new LineData();
private ArrayList<PointF> mPointArrayList2 = new ArrayList<>();

private BarData mBarData = new BarData();
private ArrayList<PointF> mPointArrayList3 = new ArrayList<>();

private ArrayList<IBarLineCurveData> mDataList = new ArrayList<>();
```

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

其他图表示例请查看[Example](https://github.com/Idtk/SmallChart/tree/master/app)

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
******

## About Me

&nbsp;&nbsp;**博客: www.idtkm.com**<br>
&nbsp;&nbsp;**GitHub: https://github.com/Idtk**<br>
&nbsp;&nbsp;**微博: http://weibo.com/Idtk**<br>
&nbsp;&nbsp;**邮箱: IdtkMa@gmail.com**<br>
&nbsp;&nbsp;**稀土掘金: http://gold.xitu.io/user/56ff44087db2a20059ff7913**<br>
&nbsp;&nbsp;**开发者头条: https://toutiao.io/subjects/89638**<br>

