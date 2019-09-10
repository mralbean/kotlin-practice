package com.kotlinpractice.stack

/**
 * A stack implemenattion using a Kotlin list as the backing structure.
 */
class Stack<T> {

  private val list : MutableList<T> = mutableListOf<T>()

  fun size() : Int {
    return list.size
  }

  fun peek() : T {
    if (list.isEmpty()) {
      throw Exception("Cannot peek empty stack")
    }
    return list.get(0)
  }

  fun push(value: T) {
    list.add(0, value)
  }

  fun pop() : T {
    if (list.isEmpty()) {
      throw Exception("Cannot pop from empty stack")
    }
    return list.removeAt(0)
  }

  fun isEmpty() : Boolean {
    return list.isEmpty()
  }
}
