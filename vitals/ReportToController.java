package vitals;

public class ReportToController implements IReporter
{
  @Override
  public void reportMessage(final String message)
  {
    System.out.println("From controller: " + message);
  }
}
