package vitals;

public class Main {

  public static void main(final String[] args)
  {
    assert LiionBatteryValidation.batteryIsOk(25, 70, 0.7f) == true;
    assert LiionBatteryValidation.batteryIsOk(50, 85, 0.0f) == false;
    assert LiionBatteryValidation.batteryIsOk(25, 15, 0.0f) == false;
    assert LiionBatteryValidation.batteryIsOk(25, 70, 0.9f) == false;
    assert LiionBatteryValidation.batteryIsOk(-10, 85, 0.0f) == false;
    assert LiionBatteryValidation.batteryIsOk(25, 10, 0.0f) == false;
    assert LiionBatteryValidation.batteryIsOk(25, 60, 1.0f) == false;
  }
}
