package com.kotlinpractice.list

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.assertFailsWith

/**
 * Unit tests for LinkedList.
 */
class LinkedListTest {
  lateinit var list: List<String>

  @Before fun beforeEachTest() {
    list = LinkedList<String>()
  }

  @Test fun testEmptySize() {
    assertEquals(0, list.size())
  }

  @Test fun testSizeIncreasesAfterAdd() {
    for (i in 1..10) {
      list.add("Hello ${i}")
      assertEquals(i, list.size())
    }
  }

  @Test fun testSizeDecreasesAfterRemove() {
    for (i in 1..10) {
      list.add("Hello ${i}")
    }
    for (i in 10 downTo 1) {
      list.remove("Hello ${i}")
      assertEquals(i - 1, list.size())
    }
  }

  @Test fun testContainsOnEmptyList() {
    assertFalse(list.contains("bogus value"))
    assertFalse(list.contains("this shouldn't exist"))
  }

  @Test fun testContainsOnNonEmptyList() {
    for (i in 1..10) {
      list.add("Hello ${i}")
    }
    for (i in 1..10) {
      assertTrue(list.contains("Hello ${i}"))
    }
  }

  @Test fun testGetOutOfBoundsException() {
    assertFailsWith<IndexOutOfBoundsException> {
      list.get(0)
    }
  }

  @Test fun testGetValueAtIndex() {
    for (i in 0..10) {
      list.add("Hello ${i}")
    }
    for (i in 0..10) {
      assertEquals("Hello ${i}", list.get(i))
    }
  }

  @Test fun testAddValuesAtFrontOfList() {
    // Add in reverse order, but always adding to the front.
    for (i in 10 downTo 0) {
      list.add(0, "Hello ${i}")
    }
    for (i in 0..10) {
      assertEquals("Hello ${i}", list.get(i))
    }
  }

  @Test fun testAddAtIndex() {
    list.add("Hello 0")
    list.add("Hello 1")
    list.add("Hello 2")
    list.add(1, "Hello 0.5")

    assertEquals("Hello 0", list.get(0))
    assertEquals("Hello 0.5", list.get(1))
    assertEquals("Hello 1", list.get(2))
    assertEquals("Hello 2", list.get(3))
  }

  @Test fun testRemoveAtIndex() {
    for (i in 0..10) {
      list.add("Hello ${i}")
    }
    for (i in 10 downTo 0) {
      assertEquals("Hello ${i}", list.remove(i))
    }
  }

  @Test fun testRemoveByValue() {
    for (i in 0..10) {
      list.add("Hello ${i}")
      assertTrue(list.contains("Hello ${i}"))
    }
    for (i in 0..10) {
      list.remove("Hello ${i}")
      assertFalse(list.contains("Hello ${i}"))
    }
  }
}
