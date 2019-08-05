load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_test")

def kt_test(name, srcs=[], friends=[], deps=[], test_class="", visibility=None):
  """Convenience wrapper around the `kt_jvm_test` rule which implicitly adds
     JUnit and Kotlin test dependencies.
  Args:
    name (string): Target name.
    srcs (List[Label]): Source files to build.
    friends (List[Label]): A single Kotlin dep which allows the test code access to internal members.
    deps (List[Label]): Dependent kt_jvm_library targets needed to build srcs.
    visibility (List[Label]): Visibility targets.
  """
  kotlinTestDep = Label("@com_github_jetbrains_kotlin//:kotlin-test")
  junitDep = Label("//external:jar/io_bazel_rules_kotlin_junit/junit")

  kt_jvm_test(
    name=name,
    srcs=srcs,
    deps=[kotlinTestDep, junitDep] + deps,
    test_class=test_class
  )
