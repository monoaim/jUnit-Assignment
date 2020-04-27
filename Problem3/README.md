## Problem 3

Consider the class **Problem3**. Create a **jUnit** test class which contains a method called **`testBinToDecEx()`**, which tests that the method **`binToDec`** properly throws an exception in the class **`IllegalArgumentException`** using the test cases below.

| Test case no. | Input `numBin` (omit `“ ”`) | Output (exception or not) |
|:-------------:|:-----------------------:|:-------------------------:|
|       1       |           “12”          |         Exception         |
|       2       |      “Hello_World”      |         Exception         |
|       3       |         “1011.1”        |         Exception         |
|       4       |          “-101”         |         Exception         |
|       5       |        “1 1 0 1”        |         Exception         |
|       6       |            “”           |         Exception         |
|       7       |          “1001”         |        No exception       |
|       8       |           “0”           |        No exception       |
