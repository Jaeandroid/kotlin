package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    val t: Int = 0

    fun test() {
        testRenamed("debugger", { debugger@ while (false) {} })
    }
}

fun box(): String {
    TestClass().test()

    return "OK"
}