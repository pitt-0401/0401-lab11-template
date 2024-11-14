# LAB11 - Code Template

Please see problem statement/slides and have a look at the TODOs.

This template is the LAB10 sample solution. You can also continue with your own LAB10 code.
Keep your own design choices, e.g. sizes as `int` (`addCoffee("cappuccino", 12)`), a `Beverage` superclass (`List<Beverage>`), or order IDs passed to the constructor.

## Task 1 - Group orders (polymorphism)
- An `Order` can hold several coffees (use a `List<Coffee>`)
- Add a constructor `Order(Customer customer)` and a method `addCoffee(Coffee coffee)`
- The `Barista` prepares every coffee of an order
- `printReceipt()` lists all coffees of an order

## Task 2 - Method overloading
- `addCoffee(String type, String size)`, e.g. `addCoffee("cappuccino", "medium")`
- `processOrder(Customer customer, Coffee coffee)` for a quick order with a single coffee

## Task 3 - Casting
- `applyIcedSpecial()` makes every Latte Macchiato in an order iced

## Optional: Extra credit
- Coffees have a price, orders have a total
- Customers pay their preferred way (cash, card, mobile) using a `Payment` interface
