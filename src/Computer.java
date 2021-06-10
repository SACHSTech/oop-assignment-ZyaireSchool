public class Computer extends Items {
  private String color;
  private String size;

  public Clothing(double price, String brand, String name, boolean warranty, String theColor, String theSize){
    super(price, brand, name, warranty);
    color = theColor;
    size = theSize;
  } 
  public String color(){
    return color;
  }
  public String size(){
    return size;
  }
}