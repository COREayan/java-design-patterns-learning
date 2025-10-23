# 🎯 Strategy Design Pattern in Java

---

## 🧠 What is the Strategy Pattern?

The **Strategy Pattern** is a **behavioral design pattern** that lets you define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable at runtime.  
It allows the algorithm to vary independently from the clients that use it.

This pattern promotes **flexibility**, **clean code separation**, and follows the **Open/Closed Principle** — making your code open for extension but closed for modification.

---

## 🏗️ When to Use

Use the Strategy Pattern when:

- You have **multiple variations of an algorithm** and want to switch between them dynamically.
- You want to **avoid complex conditional statements** like multiple `if-else` or `switch` cases.
- You want to **encapsulate behavior** in separate classes to promote code reusability.
- You want your application to be **easily scalable** with new strategies.

---

## ✅ Example Use Cases

- **Payment Processing** – switching between payment methods like Credit Card, UPI, PayPal.
- **Sorting Algorithms** – switching between Bubble Sort, Merge Sort, Quick Sort at runtime.
- **Compression Utility** – supporting multiple file compression formats like ZIP, RAR, 7z.
- **Navigation Systems** – selecting route strategies: fastest, shortest, or least traffic.
- **Authentication** – OTP-based login, OAuth2 login, or password-based login.

---

## ✅ Advantages

✔ Eliminates complex conditional statements  
✔ Encourages reusable and clean code  
✔ Algorithms become easily interchangeable  
✔ Follows SOLID principles (especially OCP & SRP)

---

## ⚠️ Disadvantages

❗ Increases number of classes  
❗ Client must understand different strategy implementations  
❗ Slight overhead due to delegation

---

## 📚 Articles

- [Refactoring Guru: Strategy Pattern](https://refactoring.guru/design-patterns/strategy)  
- [SourceMaking: Strategy Design Pattern](https://sourcemaking.com/design_patterns/strategy)  
- [Wikipedia: Strategy Pattern](https://en.wikipedia.org/wiki/Strategy_pattern)  
- [Baeldung: Strategy Pattern in Java](https://www.baeldung.com/java-strategy-pattern)  
- [JournalDev: Strategy Design Pattern in Java](https://www.journaldev.com/1754/strategy-design-pattern-in-java)  
- [DigitalOcean: Strategy Design Pattern Example](https://www.digitalocean.com/community/tutorials/strategy-design-pattern-java-example)  
