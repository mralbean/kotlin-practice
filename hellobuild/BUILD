package(default_visibility = ["//visibility:private"])

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library")
load("//bzl/kotlin:kotlin.bzl", "kt_test")

kt_jvm_library(
  name = "hellobuild",
  srcs = [
    "HelloBuild.kt"
  ],
)

kt_test(
  name = "hellobuild-test",
  srcs = [
    "HelloBuildTest.kt"
  ],
  deps = [
    ":hellobuild",
  ],
  test_class = "com.kotlinpractice.hellobuild.HelloBuildTest"
)
