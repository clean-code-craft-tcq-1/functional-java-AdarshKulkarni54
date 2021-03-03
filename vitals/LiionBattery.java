package vitals;

import java.util.function.Predicate;

public class LiionBattery
{
  private float temperature;
  private float stateOfCharge;
  private float chargeRate;

  public LiionBattery(final float temperature, final float stateOfCharge, final float chargeRate)
  {
    this.temperature = temperature;
    this.stateOfCharge = stateOfCharge;
    this.chargeRate = chargeRate;
  }

  public Predicate<Float> isRangeGreaterThan(final float currentRange)
  {
    return range -> range > currentRange;
  }

  public Predicate<Float> isLessThan(final float currentRange)
  {
    return range -> range < currentRange;
  }
}