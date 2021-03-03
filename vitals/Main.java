package vitals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Main {

  @Test
  public void testBatteryStatus()
  {
    assertTrue(LiionBatteryValidation.batteryIsOk(25, 70, 0.7f));
    assertFalse(LiionBatteryValidation.batteryIsOk(50, 85, 0.0f));
    assertFalse(LiionBatteryValidation.batteryIsOk(25, 15, 0.0f));
    assertFalse(LiionBatteryValidation.batteryIsOk(25, 70, 0.9f));
    assertFalse(LiionBatteryValidation.batteryIsOk(-10, 85, 0.0f));
    assertFalse(LiionBatteryValidation.batteryIsOk(25, 10, 0.0f));
    assertFalse(LiionBatteryValidation.batteryIsOk(25, 60, 1.0f));
  }

  public static void main(final String[] args)
  {
    //
  }
}
