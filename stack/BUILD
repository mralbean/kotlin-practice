package(default_visibility = ["//visibility:private"])

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("//bzl/kotlin:kotlin.bzl", "kt_test")

kt_jvm_library(
  name = "stack",
  srcs = [
    "Stack.kt",
  ],
)

kt_test(
  name = "stack-test",
  srcs = [
    "StackTest.kt"
  ],
  deps = [
    ":stack",
  ],
  test_class = "com.kotlinpractice.stack.StackTest"
)
