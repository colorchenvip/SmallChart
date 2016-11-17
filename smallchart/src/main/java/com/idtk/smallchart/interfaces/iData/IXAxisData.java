package com.idtk.smallchart.interfaces.iData;

import java.util.ArrayList;

/**
 * Created by Idtk on 2016/6/6.
 * Blog : http://www.idtkm.com
 * GitHub : https://github.com/Idtk
 * 描述 : X轴数据类接口
 */
public interface IXAxisData extends IAxisData{

  public void setLabel(ArrayList<String> label);

  public ArrayList<String> getLabel();
}
