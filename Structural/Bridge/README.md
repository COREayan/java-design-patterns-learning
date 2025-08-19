# 🌉 Bridge Design Pattern in Java

---

## 📚 What is the Bridge Pattern?

The **Bridge Pattern** is a **structural design pattern** that decouples an abstraction from its implementation so that the two can vary independently.  
It uses **composition** over inheritance by creating two separate class hierarchies — one for **abstractions** and one for **implementations** — and then bridges them together.

---

## 🏗️ When to Use

- When you want to separate abstraction (high-level logic) from implementation (low-level details).
- When a class has several variants of both **abstractions** and **implementations**, leading to a combinatorial explosion if you use inheritance.
- When you want to change implementation details at runtime without affecting client code.
- To make your code more flexible, extensible, and easier to maintain.

---

## ✅ Example Use Cases

- **UI Toolkits**: Different rendering APIs (OpenGL, DirectX) with the same UI abstraction.
- **Persistence Layers**: Switching between databases (MySQL, MongoDB, PostgreSQL) without changing business logic.
- **Messaging Systems**: Different message delivery methods (Email, SMS, Push Notification) with the same abstraction.

---

## 📚 Articles

- [Refactoring Guru: Bridge Pattern](https://refactoring.guru/design-patterns/bridge)  
- [SourceMaking: Bridge Design Pattern](https://sourcemaking.com/design_patterns/bridge)  
- [Wikipedia: Bridge Pattern](https://en.wikipedia.org/wiki/Bridge_pattern)  
- [Baeldung: Bridge Design Pattern in Java](https://www.baeldung.com/java-bridge-pattern)  
- [JournalDev: Bridge Design Pattern](https://www.journaldev.com/1491/bridge-design-pattern-java)  

---
