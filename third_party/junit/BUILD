load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_import")

kt_jvm_import(
  name = "junit-jar",
  jars = ["junit-4.12.jar"],
  srcjar = "junit-4.12-sources.jar",
  visibility = ["//visibility:public"],
)

kt_jvm_import(
  name = "junit",
  jars = [
    ":junit-4.12.jar",
    "//third_party/hamcrest:hamcrest-core"
  ],
  visibility = ["//visibility:public"],
)
