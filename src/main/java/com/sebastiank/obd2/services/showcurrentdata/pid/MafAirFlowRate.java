package com.sebastiank.obd2.services.showcurrentdata.pid;

import com.sebastiank.obd2.services.ISingleValuePid;
import com.sebastiank.obd2.utils.Unit;

public class MafAirFlowRate implements ISingleValuePid {

  @Override
  public int getPid() {
    return 0x10;
  }

  @Override
  public String getDescription() {
    return "MAF air flow rate";
  }

  @Override
  public int getDataBytesReturned() {
    return 0;
  }

  @Override
  public double getMinValue() {
    return 0;
  }

  @Override
  public double getMaxValue() {
    return 0;
  }

  @Override
  public Unit getUnit() {
    return null;
  }

  @Override
  public Object getPhysicalValue(byte[] rawBytes) {
    return null;
  }
}