# Week 3 - Mandatory Hands-on Exercises


## Hands-on 4: Difference between JPA, Hibernate, and Spring Data JPA

Folders:
- `hibernate-dump` – Hibernate-based implementation
- `springdatajpaexample` – Spring Data JPA implementation

Both of these are part of the **same Hands-on Exercise 4**, which asks us to understand and compare Hibernate and Spring Data JPA in practice.

---

###  Theory: Difference between JPA, Hibernate, and Spring Data JPA

#### ➤ Java Persistence API (JPA)
- JSR 338 Specification for persisting, reading, and managing data from Java objects
- Only defines the *standard*, no concrete implementation
- Hibernate is one implementation of JPA

#### ➤ Hibernate
- ORM Tool that implements the JPA specification
- Provides APIs like `Session`, `Transaction`, etc.
- Needs manual configuration and code for session management, transactions, etc.

#### ➤ Spring Data JPA
- Provides another layer of abstraction over JPA (and Hibernate)
- Reduces boilerplate code using interfaces like `JpaRepository`
- Manages sessions and transactions internally
- More declarative, less code, and integrates well with Spring Boot

---

###  Purpose of These Two Folders

- `hibernate-dump` contains full Hibernate code using `SessionFactory`, manual transactions, and saving employee records.
- `springdatajpaexample` shows how the same functionality can be implemented with much less code using Spring Data JPA and `JpaRepository`.

This hands-on helps us **visually compare the difference in effort, boilerplate code, and abstraction** between the two approaches.


