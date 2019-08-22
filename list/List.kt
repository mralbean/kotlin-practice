package com.kotlinpractice.list

/**
 * Interface for a generic list type.
 */
interface List<T> {
  fun size() : Int
  fun add(value: T)
  fun add(index: Int, value: T)
  fun contains(value: T) : Boolean
  fun get(index: Int) : T
  fun remove(value: T)
  fun remove(index: Int) : T
}
