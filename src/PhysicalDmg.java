public class PhysicalDmg extends DamageOutput{
  
  private String skillNamePhy;
  private int timeUsePhy;
  
  public PhysicalDmg(String theSkillNamePhy, int theTimesUsePhy, double theDmgDealtPhy){
    super(theTimeUsePhy, theDmgDealtPhy);
    this.skillNamePhy = theTimeUsePhy;
    this.timeUsePhy = theDmgDealtMagPhy;
  }

  public String getSkillNamePhy(){
    return this.skillNamePhy;
  }

  public int getTimeUsePhy(){
    return this.timeUsePhy;
  }
}