public class Items{
  private String name;
  private String brand;
  private double price;
  private boolean warranty;

  public Items(String theName, String Brand, double thePrice, boolean Warranty){
    name = theName;
    brand = theBrand;
    price = thePrice;
    warranty = theWarranty;
  }

  public String getName(){
    return name;
  }
  public String getBrand(){
    return brand;
  }
  public int getPrice(){
    return price;
  }
  public int getWarranty(){
    return warranty;
  }
}