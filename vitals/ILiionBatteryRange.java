package vitals;

import java.util.function.Function;

public interface ILiionBatteryRange extends Function<Float, Boolean>
{
  @Override
  default Boolean apply(final Float currentRange)
  {
    if (currentRange > getUpperLimit() || currentRange < getLowerLimit())
    {
      displayMessage();
      return false;
    }
    return true;
  }

  void displayMessage();

  float getUpperLimit();

  float getLowerLimit();
}
