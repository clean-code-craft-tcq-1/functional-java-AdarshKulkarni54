package vitals;

public class ChargeRateRange implements ILiionBatteryRange
{
  private float chargeRateUpperLimit = 0.8f;
  IReporter report;

  @Override
  public float getUpperLimit()
  {
    return this.chargeRateUpperLimit;
  }

  @Override
  public float getLowerLimit()
  {
    return 0;
  }

  @Override
  public Boolean apply(final Float currentRange)
  {
    if (currentRange > getUpperLimit())
    {
      displayMessage();
      return false;
    }
    return true;
  }

  @Override
  public void displayMessage()
  {
    this.report = new ReportToController();
    this.report.reportMessage("Charge rate is out of range!");
  }
}
