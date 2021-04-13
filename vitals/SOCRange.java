package vitals;

public class SOCRange implements ILiionBatteryRange
{
  private float socUpperLimit = 80;
  private float socLowerLimit = 20;
  IReporter report;

  @Override
  public float getUpperLimit()
  {
    return this.socUpperLimit;
  }

  @Override
  public float getLowerLimit()
  {
    return this.socLowerLimit;
  }

  @Override
  public void displayMessage()
  {
    this.report = new ReportToController();
    this.report.reportMessage("State of charge is out of range!");
  }

}
