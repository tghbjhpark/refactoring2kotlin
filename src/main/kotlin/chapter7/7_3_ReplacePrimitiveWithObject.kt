package chapter7

class Priority(val value: String) {
    fun isHighPriority() =
        "high" == value || "rush" == value
}

class Order(val priority: Priority)

fun highPriorityCount(orders: List<Order>) =
    orders
        .filter { it.priority.isHighPriority() }
        .size
