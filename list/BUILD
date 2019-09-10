package(default_visibility = ["//visibility:private"])

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("//bzl/kotlin:kotlin.bzl", "kt_test")

kt_jvm_library(
  name = "list",
  srcs = [
    "List.kt",
    "LinkedList.kt",
  ],
)

kt_test(
  name = "linkedlist-test",
  srcs = [
    "LinkedListTest.kt"
  ],
  deps = [
    ":list",
  ],
  test_class = "com.kotlinpractice.list.LinkedListTest"
)
