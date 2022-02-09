<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <form method="post" action="/postDish">
      <label>Dish Name:</label><br>
      <input type="text" id="name" name="name" placeholder="Delicious Food"><br>
      <label>Price:</label><br>
      <input type="number" step="0.01" id="price" name="price" placeholder="20.00"><br>
      <label>Calories:</label><br>
      <input type="number" id="calories" name="calories" placeholder="150"><br>
      <label>What Type of Dish is This?:</label><br>
      <select name="type" id="type">
        <option value="Food">Food</option>
        <option value="Drink">Drink</option>
      </select>
      <label>What Menu is this Dish For?:</label><br>
      <select name="menu" id="menu">
        <option value="breakfast">Breakfast</option>
        <option value="lunch">Lunch</option>
        <option value="dinner">Dinner</option>
      </select>
      <input type="submit" value="Submit">
    </form>

    <a href="/">Home</a> <br>

</body>
</html>