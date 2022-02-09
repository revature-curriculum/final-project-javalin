import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Dish;
import objects.Restaurant;

public class Main {

  static Restaurant restaurant;
  static int currMenu;

    public static void main(String[] args) {

      restaurant = new Restaurant("Moose Diner", "12 Waverly Place, 10003, Manhattan, NY");

      
      restaurant.addBreakfastMenuDish(new Dish("Coffee", 5.0f, 50, "Drink"));
      restaurant.addLunchMenuDish(new Dish("Tea", 5.0f, 50, "Drink"));
      restaurant.addDinnerMenuDish(new Dish("Bubble Tea", 5.0f, 50, "Drink"));
      restaurant.addBreakfastMenuDish(new Dish("Biscuit", 5.0f, 50, "Food"));
      restaurant.addLunchMenuDish(new Dish("Salad", 5.0f, 50, "Food"));
      restaurant.addDinnerMenuDish(new Dish("Steak", 5.0f, 50, "Food"));

      Javalin app = Javalin.create().start(4100);
        
      app.get("/", ctx -> ctx.render("index.jte"));

      app.get("/breakfastMenu", breakfastHandler);

      app.get("/lunchMenu", lunchHandler);

      app.get("/dinnerMenu", dinnerHandler);

      app.get("/breakfastDrinks", breakfastDrinksHandler);

      app.get("/breakfastFood", breakfastFoodHandler);

      app.get("/lunchDrinks", lunchDrinksHandler);

      app.get("/lunchFood", lunchFoodHandler);

      app.get("/dinnerDrinks", dinnerDrinksHandler);

      app.get("/dinnerFood", dinnerFoodHandler);

      app.get("/addDish", addDishHandler);

      app.post("/postDish", postDishHandler);

      app.get("/drinks", drinkHandler);

      app.get("/food", foodHandler);

    }

    static Handler breakfastHandler = ctx -> {
      currMenu = 1;
      ctx.render("menu.jte", Collections.singletonMap("dishes", restaurant.getBreakfastMenu()));
    };

    static Handler lunchHandler = ctx -> {
      currMenu = 2;
      ctx.render("menu.jte", Collections.singletonMap("dishes", restaurant.getLunchMenu()));
    };

    static Handler dinnerHandler = ctx -> {
      currMenu = 3;
      ctx.render("menu.jte", Collections.singletonMap("dishes", restaurant.getDinnerMenu()));
    };

    static Handler breakfastDrinksHandler = ctx -> {
      ctx.render("drinksMenu.jte", Collections.singletonMap("dishes", restaurant.getBreakfastMenu()));
    };

    static Handler breakfastFoodHandler = ctx -> {
      ctx.render("foodMenu.jte", Collections.singletonMap("dishes", restaurant.getBreakfastMenu()));
    };

    static Handler lunchDrinksHandler = ctx -> {
      ctx.render("drinksMenu.jte", Collections.singletonMap("dishes", restaurant.getLunchMenu()));
    };

    static Handler lunchFoodHandler = ctx -> {
      ctx.render("foodMenu.jte", Collections.singletonMap("dishes", restaurant.getLunchMenu()));
    };

    static Handler dinnerDrinksHandler = ctx -> {
      ctx.render("drinksMenu.jte", Collections.singletonMap("dishes", restaurant.getDinnerMenu()));
    };

    static Handler dinnerFoodHandler = ctx -> {
      ctx.render("foodMenu.jte", Collections.singletonMap("dishes", restaurant.getDinnerMenu()));
    };

    static Handler addDishHandler = ctx -> {
      ctx.render("addDish.jte");
    };

    static Handler postDishHandler = ctx -> {

      String menu = ctx.formParam("menu");
      String name = ctx.formParam("name");
      Float price = Float.parseFloat(ctx.formParam("price"));
      int calories = Integer.parseInt(ctx.formParam("calories"));
      String type = ctx.formParam("type");

      switch(menu){
        case "breakfast":
          restaurant.addBreakfastMenuDish(new Dish(name, price, calories, type));
          break;
        case "lunch":
          restaurant.addLunchMenuDish(new Dish(name, price, calories, type));
          break;
        case "dinner":
          restaurant.addDinnerMenuDish(new Dish(name, price, calories, type));
          break;
      }

      ctx.render("success.jte");
    };

    static Handler drinkHandler = ctx -> {
      switch(currMenu){
        case 1:
          ctx.redirect("/breakfastDrinks");
          break;
        case 2:
          ctx.redirect("/lunchDrinks");
          break;
        case 3:
          ctx.redirect("/dinnerDrinks");
          break;
      }
    };

    static Handler foodHandler = ctx -> {
      
      switch(currMenu){
        case 1:
          ctx.redirect("/breakfastFood");
          break;
        case 2:
          ctx.redirect("/lunchFood");
          break;
        case 3:
          ctx.redirect("/dinnerFood");
          break;
      }

    };
  
}
