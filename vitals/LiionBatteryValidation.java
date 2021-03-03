package vitals;

public class LiionBatteryValidation
{
  static boolean batteryIsOk(final float temperature, final float soc, final float chargeRate)
  {
    LiionBattery liionBattery = new LiionBattery(temperature, soc, chargeRate);
    if (liionBattery.isRangeGreaterThan(45).or(liionBattery.isLessThan(0)).test(temperature))
    {
      displayMessage("Temperature is out of range!");
      return false;
    }
    else if (liionBattery.isRangeGreaterThan(80).or(liionBattery.isLessThan(20)).test(soc))
    {
      displayMessage("State of Charge is out of range!");
      return false;
    }
    else if (liionBattery.isRangeGreaterThan(0.8f).test(chargeRate))
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