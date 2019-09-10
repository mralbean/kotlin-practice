package com.kotlinpractice.list

/**
 * A doubley-linked list implementation of List.
 */
class LinkedList<T> : List <T> {
  private data class Node<T>(val value: T, var next: Node<T>?, var prev: Node<T>?)

  private var head : Node<T>? = null
  private var tail : Node<T>? = null
  private var size : Int = 0

  override fun size() : Int {
    return size
  }

  override fun add(value: T) {
    add(size, value)
  }

  override fun add(index: Int, value: T) {
    if (index > size || index < 0) {
      throw Exception("Index ${index} out of bounds.")
    }
    val node = Node(value, null, null)
    if (index == size) {
      // Adding to the end of the list.
      if (head == null) {
        head = node
      }
      node.prev = tail
      tail?.let {
        it.next = node
      }
      tail = node
    } else {
      // Insert the new node before the node previously at this index.
      val prevNode = getNodeByIndex(index)
      node.next = prevNode
      node.prev = prevNode.prev
      prevNode.prev?.let {
        it.next = node
      } ?: run {
        // The node previously at this index had no prev, therefore it was the head.
        head = node
      }
      prevNode.prev = node
    }
    ++size
  }

  override fun contains(value: T) : Boolean {
    return getNodeByValue(value) != null
  }

  private fun getNodeByValue(value: T) : Node<T>? {
    var node = head
    while (node != null) {
      if (node.value == value) {
        return node
      }
      node = node.next
    }
    return null
  }

  override fun get(index: Int) : T {
    if (index >= size || index < 0) {
      throw IndexOutOfBoundsException("Index ${index} out of bounds.")
    }
    return getNodeByIndex(index).value
  }

  private fun getNodeByIndex(index: Int) : Node<T> {
    var i = 0
    var node = head
    while (node != null) {
      if (i == index) {
        return node
      }
      node = node.next
      ++i
    }
    throw IndexOutOfBoundsException("Index ${index} out of bounds.")
  }

  override fun remove(value: T) {
    val node = getNodeByValue(value)
    node?.let {
      removeNode(it)
      --size
    }
  }

  override fun remove(index: Int) : T {
    if (index >= size || index < 0) {
      throw IndexOutOfBoundsException("Index ${index} out of bounds.")
    }
    val node = getNodeByIndex(index)
    removeNode(node)
    --size
    return node.value
  }

  private fun removeNode(node: Node<T>) {
    node.prev?.let {
      it.next = node.next
    }
    node.next?.let {
      it.prev = node.prev
    }
    if (node === head) {
      head = node.next
    }
    if (node === tail) {
      tail = node.prev
    }
  }
}
