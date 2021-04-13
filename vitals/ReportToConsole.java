package vitals;

public class ReportToConsole implements IReporter
{
  @Override
  public void reportMessage(final String message)
  {
    System.out.println("From console: " + message);
  }
}
