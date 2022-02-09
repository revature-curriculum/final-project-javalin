package objects;

public class Dish {

  String name;
  float price;
  int calories;
  String type;

  public Dish(String name, float price, int calories, String type){
    this.name = name;
    this.price = price;
    this.calories = calories;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public float getPrice() {
    return price;
  }

  public int getCalories() {
    return calories;
  }

  public String getType() {
    return type;
  }

}