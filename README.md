# BDD with Cucumber

Java Behaviour Driven Development with Cucumber


# Prerequisites

1. [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 8+
2. [Maven](https://maven.apache.org) 3+


# How to run

Clone

```
git clone https://github.com/humbertodias/java-bdd-cucumber
```

Inside

```
cd java-bdd-cucumber
```

Run

```
mvn test
```


Output

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running cucumber.test.AccountTest

2 Scenarios (2 passed)
10 Steps (10 passed)
0m0.105s

Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.492 sec
Running cucumber.test.BankTest

2 Scenarios (2 passed)
6 Steps (6 passed)
0m0.062s

Tests run: 8, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.075 sec

Results :

Tests run: 20, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.122 s
[INFO] Finished at: 2017-06-01T12:43:02+02:00
[INFO] Final Memory: 15M/212M
[INFO] ------------------------------------------------------------------------
```


# References

    * [desenvolvimento-orientado-a-comportamento-bdd-com-cucumber](http://www.devmedia.com.br/desenvolvimento-orientado-a-comportamento-bdd-com-cucumber/33547)