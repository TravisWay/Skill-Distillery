package data;

public interface StateDAO {
  public State getStateByName(String name);
  public State getStateByAbbreviation(String abbreviation);
  public void addState(State state);
public void addFlashAttribute(String string, State state);
}
