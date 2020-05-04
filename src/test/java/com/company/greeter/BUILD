java_test(
    name= "greeter_test",
    srcs = glob(["*.java"]),
    deps = [
       "//src/main/java/com/company/greeter:greeter",
        # @ is for external dependencies
        "@maven//:junit_junit"
    ],
    test_class = "com.company.greeter.GreeterTest"
)