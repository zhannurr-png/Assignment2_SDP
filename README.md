# Assignment 2.Factory Method and Abstract Factory

## Description

This project is a Java logistics application that demonstrates two design patterns:

- Factory Method
- Abstract Factory

And the application supports two delivery methods:

- Road delivery
- Sea delivery

Also, it supports two UI families:

- Windows
- macOS

The two patterns work together in one application.

---

## Technologies

- Java 17
- IntelliJ IDEA
- GitHub

---

## Factory Method

The Factory Method pattern is used to create transport objects.

### Product

Transport is the common interface for all transport types.

### Concrete Products

- Truck
- Ship

Both classes implement the Transport interface.

### Creator

Logistics is the abstract creator. It contains the factory method.