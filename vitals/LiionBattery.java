package vitals;

import java.util.function.Predicate;

public class LiionBattery
{
  private float temperature;
  private float stateOfCharge;
  private float chargeRate;

  public LiionBattery(final float temperature, final float stateOfCharge, final float chargeRate)
  {
    super();
    this.temperature = temperature;
    this.stateOfCharge = stateOfCharge;
    this.chargeRate = chargeRate;
  }

  /**
   * @return the temperature
   */
  public float getTemperature()
  {
    return this.temperature;
  }

  /**
   * @return the stateOfCharge
   */
  public float getStateOfCharge()
  {
    return this.stateOfCharge;
  }

  /**
   * @return the chargeRate
   */
  public float getChargeRate()
  {
    return this.chargeRate;
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
