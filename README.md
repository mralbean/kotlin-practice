# kotlin-practice

Hi. You've found Alvin's repo for praciting Kotlin. All files are currently built using two different build systems:

1) Buck - Facebook's build system (https://buck.build)
2) Bazel - Google's build system (https://bazel.build)

Both are fairly similar to use. For example, here are some examples of how to build and/or test some of the files using Buck and Bazel, respectively:

## Buck
```
# To build:
buck build //hellobuild:hellobuild
# To test:
buck test //hellobuild:hellobuild-test
```

## Bazel
```bazel
# To build:
bazel build //hellobuild:hellobuild
# To test:
bazel test //hellobuild:hellobuild-test
```
