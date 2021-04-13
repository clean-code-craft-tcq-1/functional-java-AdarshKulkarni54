package vitals;

public class LiionBatteryValidation
{
  private LiionBatteryValidation()
  {
    //
  }

  static boolean batteryIsOk(final float temperature, final float soc, final float chargeRate)
  {
    Boolean isTemperatureOutOfRange = new TemperatureRange().apply(temperature);
    Boolean isSOCOutOfRange = new SOCRange().apply(soc);
    Boolean isChargeRateOutOfRange = new ChargeRateRange().apply(chargeRate);
    return isTemperatureOutOfRange && isSOCOutOfRange && isChargeRateOutOfRange;
  }
}