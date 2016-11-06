package black_jack.model.rules;

public class RulesFactory {

  public IHitStrategy GetPlayerHitRule() {
    return new BasicHitStrategy();
  }
  
  public IHitStrategy GetDealerHitRule() {
    return new Soft17HitStrategy();
  }

  public INewGameStrategy GetNewGameRule() {
    return new MyNewGameStrategy();
  }
  
  public IWinStrategy GetWinGameRule() {
    return new EqualDealerWinnerStrategy();
  }
}