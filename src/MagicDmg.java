public class MagicDmg extends DamageOutput{
  
  private String skillNameMag;
  private int timeUseMag;
  
  public MagicDmg(String theSkillNameMag, int theTimesUseMag, double theDmgDealtMag){
    super(theTimeUseMag, theDmgDealtMag);
    this.skillNameMag = theSkillNameMag;
    this.timeUseMag = theTimeUseMag;
  }

  public String getSkillNameMag(){
    return this.skillNameMag;
  }

  public int getTimeUseMag(){
    return this.timeUseMag;
  }

  public String toString(){
    System.out.println("You used" + skillNameMag() + "for" + theTimesUseMag + "times.");
    return "";
  }
 
}