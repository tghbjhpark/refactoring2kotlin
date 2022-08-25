package chapter7

class Priority(val value: String)

class Order(val priority: Priority)

fun highPriorityCount(orders: List<Order>) =
    orders
        .filter { "high" == it.priority.value || "rush" == it.priority.value }
        .size
