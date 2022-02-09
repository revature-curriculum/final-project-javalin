@import java.util.*
@import objects.Dish
@param ArrayList<Dish> dishes

<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    Drinks for Your Chosen Menu:

    @for(Dish dish : dishes)
        @if(dish.getType().equals("Drink"))
            <li>
                Dish name: ${dish.getName()} &emsp;
                Dish Price: ${dish.getPrice()} &emsp;
                Dish Calories: ${dish.getCalories()} &emsp;
            </li>
        @endif
    @endfor

  <a href="/">Home</a>

</body>
</html>