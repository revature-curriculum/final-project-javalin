package objects;

import java.util.*;

public class Dish {

  String name;
  ArrayList<String> ingredients;
  String description;
  float price;
  int calories;
  String type;

  public Dish(String name, ArrayList<String> ingredients, String description, float price, int calories, String type){
    this.name = name;
    this.ingredients = ingredients;
    this.description = description;
    this.price = price;
    this.calories = calories;
    this.type = type;
  }

}