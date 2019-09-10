package com.kotlinpractice.stack

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.assertFailsWith

/**
 * Unit tests for the Stack class.
 */
class StackTest {
  lateinit var stack: Stack<String>

  @Before fun beforeEachTest() {
    stack = Stack<String>()
  }

  @Test fun testIsEmptyOnEmptyStack() {
    assertTrue(stack.isEmpty())
  }

  @Test fun testIsEmptyOnNonEmptyStack() {
    stack.push("I'm not empty")
    assertFalse(stack.isEmpty())
  }

  @Test fun testIsEmptyOnEmptyAfterRemove() {
    stack.push("I will be removed")
    stack.pop()
    assertTrue(stack.isEmpty())
  }

  @Test fun testPeekOnEmptyStack() {
    assertFailsWith<Exception> {
      stack.peek()
    }
  }

  @Test fun testPeekOnSingleElementStack() {
    stack.push("Peek-a-boo")
    assertEquals("Peek-a-boo", stack.pop())
  }

  @Test fun testPeekPopOrdering() {
    for (i in 1..10) {
      stack.push("${i}")
    }
    for (i in 10 downTo 1) {
      assertEquals("${i}", stack.peek())
      assertEquals("${i}", stack.pop())
    }
  }

  @Test fun testPopOnEmptyStack() {
    assertFailsWith<Exception> {
      stack.pop()
    }
  }

  @Test fun testSizeOnEmptyStack() {
    assertEquals(0, stack.size())
  }

  @Test fun testSizeAfterPushes() {
    for (i in 1..10) {
      stack.push("${i}")
      assertEquals(i, stack.size())
    }
  }

  @Test fun testSizeAfterPops() {
    for (i in 1..10) {
      stack.push("${i}")
    }

    assertEquals(10, stack.size())
    for (i in 9 downTo 0) {
      stack.pop()
      assertEquals(i, stack.size())
    }
  }
}
