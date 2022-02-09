package objects;
import java.util.*;

public class Restaurant {

  String name;
  ArrayList<Dish> breakfastMenu;
  ArrayList<Dish> lunchMenu;
  ArrayList<Dish> dinnerMenu;
  String location;

  public Restaurant(String name, String location) {
    this.name = name;
    this.location = location;
    breakfastMenu = new ArrayList<>();
    lunchMenu = new ArrayList<>();
    dinnerMenu = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Dish> getBreakfastMenu() {
    return breakfastMenu;
  }

  public void addBreakfastMenuDish(Dish dish) {
    breakfastMenu.add(dish);
  }

  public ArrayList<Dish> getLunchMenu() {
    return lunchMenu;
  }

  public void addLunchMenuDish(Dish dish) {
    lunchMenu.add(dish);
  }

  public ArrayList<Dish> getDinnerMenu() {
    return dinnerMenu;
  }

  public void addDinnerMenuDish(Dish dish) {
    dinnerMenu.add(dish);
  }

  public String getLocation() {
    return location;
  }
    
}
