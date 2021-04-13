package vitals;

public class TemperatureRange implements ILiionBatteryRange
{
  private float temperatureUpperLimit = 45;
  private float temperatureLowerLimit = 0;
  IReporter report;

  @Override
  public float getUpperLimit()
  {
    return this.temperatureUpperLimit;
  }

  @Override
  public float getLowerLimit()
  {
    return this.temperatureLowerLimit;
  }

  @Override
  public void displayMessage()
  {
    this.report = new ReportToConsole();
    this.report.reportMessage("Temperature is out of range!");
  }
}
