public class Cooker extends Items {
  private String texture;
  private String category;

  public Cooker(double price, String brand, String name, boolean warranty, String theTexture, String theCategory){
    super(price, brand, name, warranty);
    texture = theTexture;
    category = theCategory;
  } 
  public String texture(){
    return texture;
  }
  public String category(){
    return category;
  }
}