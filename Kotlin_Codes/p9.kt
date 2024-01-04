//fun main(){

    // DIFFERENT FUNCTIONS UNDER LIST

    //use of .reversed() and .sorted() function on a list of strings
//    val colors = listOf("orange", "green", "yellow")
//    println("Reversed List: ${colors.reversed()}")
//    println("Original List: $colors")
//    println("Sorted List: ${colors.sorted()}")

    // use of .sorted function on a list of numbers
//    val num = listOf(1, 265, 3, 44, 6, 22, 67)
//    println("Original List: $num")
//    println("Sorted List: ${num.sorted()}")

    // DIFFERENT FUNCTIONS UNDER MUTABLE LISTS

//    val entrees = mutableListOf<String>()
//    println("Entrees: $entrees")

    // adding elements individually using .add()
//    println("Add noodles: ${entrees.add("noodles")}")
//    println("Entrees: $entrees")
//    println("Add chicken: ${entrees.add("chicken")}")
//    println("Entrees: $entrees")

    // adding list of items using .addAll
//    val add_ons = listOf("bbq_paneer", "cheese", "olives")
//    println("Add List: ${entrees.addAll(add_ons)}")
//    println("Entrees: $entrees")

    // removing an element using .remove()
//    println("Removing chicken: ${entrees.remove("chicken")}")
//    println("Entrees: $entrees")
//    println("Removing burger: ${entrees.remove("burger")}")
//    println("Entrees: $entrees")

    // removing an element from a specific index using .removeAt()
//    println("Removing element form first index: ${entrees.removeAt(0)}")
//    println("Entrees: $entrees")

    // clear out the list
//    entrees.clear()
//    println("Entrees: $entrees")

    // checking whether the List is emplty or not
//    println("Empty? : ${entrees.isEmpty()}")

    // USING LOOPS ON LISTS AND MUTABLE-LISTS

    // => WHILE LOOPS

//    val guests = listOf(4,2,1,5)
//    var total_guests = 0
//    var index = 0
//
//    while (index < guests.size){
//        total_guests += guests[index]
//        index += 1
//    }
//    println("Total Guests: $total_guests")

    // => FOR LOOP

//    val names = listOf("Abhilash", "Sritam", "Bishal", "Ancil", "Rajiv")
//
//    for (n in names){
//        println("$n - number of characters = ${n.length}")
//    }



//}

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    // Add an item to an order
    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    // Add multiple items individually
    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    // Add a list of items at one time
    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    // Use builder pattern
    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    // Create and add order directly
    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}