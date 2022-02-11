# Sealed Class - Non-Sealed Example
This branch changes the [chain of responsibility DP example](https://github.com/gabrielcostasilva/dp-chain-responsibility.git) to show _sealed class_, a [new feature introduced in Java 17](https://openjdk.java.net/jeps/409).

A _sealed class_ enables creating closed inheritance. In summary, it means that the superclass has a limited set of known subclasses. Venkat Subramaniam gives a [good introduction on sealed classes](https://www.youtube.com/watch?v=Xkh5sa3vjTE) if you are interested in knowing more about it.

This project exemplifies the use of the `non-sealed` keyword whereas a [factory method branch](https://github.com/gabrielcostasilva/dp-factory-method/tree/sealed-class-example) shows the use of `sealed` and `final` combination.

## Project Overview
The only changes made in this code are those that introduced by the `sealed` and `permits` keywords. Whereas the former marks the class or interface as a _sealed class_, the latter declares the known subclasses. The code snippet below exemplifies their use.

```java
// (...)

public sealed interface ISampleTypeClassifierHandler 
    permits AbstractSampleTypeClassifierHandler {

   // (...)
}
```

In addition, the `non-sealed` keyword _closes_ the inheritance with the interface, but it keeps the abstract class open for extension.

```java
// (...)

public non-sealed abstract class AbstractSampleTypeClassifierHandler 
    implements ISampleTypeClassifierHandler {

   //  (...)
}
```

A class extending a _sealed class_ must be `final`, `sealed` or `non-sealed`.

## Project Setup
```
mvn clean test
```
