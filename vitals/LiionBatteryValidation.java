package vitals;

/**
 * Validation class to validate Li-ion battery
 *
 * @author RDV1KOR
 *
 */
public class LiionBatteryValidation
{
  private LiionBatteryValidation()
  {
    // hiding implicit constructor
  }

  static boolean batteryIsOk(final float temperature, final float soc, final float chargeRate)
  {
    LiionBattery liionBattery = new LiionBattery(temperature, soc, chargeRate);
    if (liionBattery.isRangeGreaterThan(45).or(liionBattery.isLessThan(0)).test(liionBattery.getTemperature()))
    {
      displayMessage("Temperature is out of range!");
      return false;
    }
    else if (liionBattery.isRangeGreaterThan(80).or(liionBattery.isLessThan(20)).test(liionBattery.getStateOfCharge()))
    {
      displayMessage("State of Charge is out of range!");
      return false;
    }
    else if (liionBattery.isRangeGreaterThan(0.8f).test(liionBattery.getChargeRate()))
    {
      displayMessage("Charge Rate is out of range!");
      return false;
    }
    return true;
  }

  private static void displayMessage(final String outOfRangeMessage)
  {
    System.out.println(outOfRangeMessage);
  }
}
