public class DamageOutput{
  private int dmgOut;
  private int dmgFinal;
  private int use;

  public DamageOutPut(int theDmgOut, int theUse){
    this.dmgOut = theDmgOut;
    this.use = theUse;
    this.dmgFinal = this.dmgOut * this.use;
  }

  public int getDmgOut(){
    return this.dmgOut;
  }

  public int getUse(){
    return this.use;
  }

  public int getDmgFinal(){
    return this.dmgFinal;
  }
}