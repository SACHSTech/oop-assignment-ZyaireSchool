public class TrueDmg extends DamageOutput{
  
  private String skillNameTru;
  private int timeUseTru;
  
  public TrueDmg(String theSkillNameTru, int theTimesUseTru, double theDmgDealtTru){
    super(theTimesUseTru, theDmgDealtTru);
    this.skillNameTru = theTimesUseTru;
    this.timeUseTru = theDmgDealtTru;
  }

  public String getSkillNameTru(){
    return this.skillNameTru;
  }

  public int getTimeUseTru(){
    return this.timeUseTru;
  }

  public String toString(){
    System.out.println("You used" + skillNameTru() + "for" + theTimesUseTru + "times.");
    return "";
  }
}