package com.idtk.smallchart.data;

import com.idtk.smallchart.interfaces.iData.IXAxisData;

import java.util.ArrayList;

/**
 * Created by Idtk on 2016/6/6.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 : X轴数据类
 */
public class XAxisData extends AxisData implements IXAxisData {
  private ArrayList<String> label;

  public void setLabel(ArrayList<String> label) {
    this.label = label;
  }

  public ArrayList<String> getLabel() {
    return label;
  }
}
