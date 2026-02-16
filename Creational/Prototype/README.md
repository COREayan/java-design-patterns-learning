# 🧬 Prototype Design Pattern in Java  

---

## 📚 What is the Prototype Pattern?  

The **Prototype Pattern** is a **creational design pattern** that allows you to create new objects by copying an existing object (prototype) instead of creating them from scratch.

Instead of constructing a new object with expensive initialization, you clone an existing instance. This improves performance and reduces complexity when object creation is costly.

The pattern promotes **object reuse**, **efficiency**, and **flexibility**.

---

## 🏗️ When to Use  

- When object creation is expensive (database calls, file loading, heavy computation).  
- When you want to avoid rebuilding objects repeatedly.  
- When objects have many configuration combinations.  
- When creating objects via constructors is complex.  
- When you want to reduce subclass explosion.  
- When you need runtime object duplication.  

---

## 🧠 Key Idea  

> Instead of creating a new object → clone an existing prototype.

Each object implements a `clone()` method that returns a copy of itself.

---

## 🧱 Structure  

- **Prototype Interface** → declares cloning method  
- **Concrete Prototype** → implements cloning logic  
- **Client** → copies prototype instead of creating new object  

---

## ✅ Advantages  

- Improves performance by avoiding repeated initialization  
- Reduces object creation cost  
- Simplifies complex object creation  
- Supports runtime object copying  
- Encourages reuse of existing objects  

---

## ❌ Disadvantages  

- Cloning complex objects can be tricky  
- Deep copy vs shallow copy issues  
- Requires careful implementation of clone logic  

---

## 🔍 Shallow Copy vs Deep Copy  

**Shallow Copy**
- Copies references  
- Shared internal objects  
- Faster and less memory usage  
- Changes in one object may affect the other  

**Deep Copy**
- Copies everything recursively  
- Fully independent clone  
- Higher memory usage  
- Safer for mutable objects  

Choose based on your use case.

---

## 📚 Articles  

- [Refactoring Guru : Prototype](https://refactoring.guru/design-patterns/prototype)  
- [Source Making : Prototype Design Pattern](https://sourcemaking.com/design_patterns/prototype)  
- [Wikipedia : Prototype pattern](https://en.wikipedia.org/wiki/Prototype_pattern)  
- [Baeldung : Prototype pattern in Java](https://www.baeldung.com/java-pattern-prototype)  
- [DigitalOcean : Prototype Design Pattern in Java](https://www.digitalocean.com/community/tutorials/prototype-design-pattern-in-java)  

---
