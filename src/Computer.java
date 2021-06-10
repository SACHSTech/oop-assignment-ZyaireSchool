public class Computer extends Items {
  private String type;
  private String OS;

  public Computer(double price, String brand, String name, boolean warranty, String theOS, String theType){
    super(price, brand, name, warranty);
    OS = theOS;
    type = theType;
  } 
  public String OS(){
    return os;
  }
  public String type(){
    return type;
  }
}