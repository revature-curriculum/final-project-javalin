@import java.util.*
@import objects.Dish
@param ArrayList<Dish> dishes


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>


    @for(Dish dish : dishes)
        <li>
        Dish name: ${dish.getName()} &emsp;
        Dish Price: ${dish.getPrice()} &emsp;
        Dish Type: ${dish.getType()} &emsp;
        Dish Calories: ${dish.getCalories()} &emsp;
        </li>
    @endfor

  <a href="/drinks">See Only Drinks for this menu</a> <br>
  <a href="/food">See Only Food for this menu</a> <br>
  <a href="/">Back</a>

</body>
</html>