package chapter7

class Order(val priority: String)

fun highPriorityCount(orders: List<Order>) =
    orders
        .filter { "high" == it.priority || "rush" == it.priority }
        .size
