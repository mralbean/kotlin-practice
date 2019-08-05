package com.kotlinpractice.hellobuild

import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Unit tests for HelloBuild.
 */
class HelloBuildTest {
  companion object {
    @BeforeClass
    @JvmStatic
    fun beforeAllTestCases() {
      println("Begin Tests")
    }

    @AfterClass
    @JvmStatic
    fun afterAllTestCases() {
      println("Tests Complete")
    }
  }


  @Test
  fun simpleTestCase() {
    val build = HelloBuild("Alvin Portillo")
    assertEquals("Alvin Portillo", build.name)
  }
}
