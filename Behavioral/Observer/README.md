# 👀 Observer Design Pattern in Java

---

## 📚 What is the Observer Pattern?

The **Observer Pattern** is a **behavioral design pattern** that defines a **one-to-many dependency** between objects.  
When one object (called the **subject**) changes state, all its dependent **observers** are automatically notified and updated without exposing the subject’s internal details.

---

## 🏗️ When to Use

- You need to notify multiple objects about a change in another object’s state.
- You want to keep components loosely coupled—subjects don’t need to know concrete observer implementations.
- You need a scalable, event-driven design (common in GUI, MVC, or reactive systems).
- You prefer dynamic management of observers (add or remove at runtime).
- You want to maintain modular code with separation of concerns.

---

## ✅ Example Use Cases

- **Weather Monitoring**: A weather station notifies display devices when conditions change.  
- **GUI Event Handling**: Buttons and UI components fire events to registered listeners.  
- **News Services**: A news publisher (subject) notifies channels or subscribers (observers) of new updates.  
- **Stock Ticker**: A stock market feed notifies investors (observers) about price changes.  
- **Model-View Interaction**: In MVC architecture, the **model** acts as the subject, and **views** act as observers.

---

## 🏗️ Pattern Components

| Component              | Role                                                                 |
|------------------------|----------------------------------------------------------------------|
| **Subject**            | Maintains a list of observers, allows register/unregister, notifies. |
| **Observer**           | Defines the `update()` method that receives state changes.           |
| **ConcreteSubject**    | Holds state, notifies observers on change.                           |
| **ConcreteObserver**   | Implements observer, reacts to subject updates.                      |

---

## 🔄 Push vs. Pull Variants

- **Push Model** → The subject sends updated data directly to observers as part of the notification.  
  - ✅ Reduces the need for observers to query the subject.  
  - ❌ Can overwhelm observers with unnecessary or excessive data.  

- **Pull Model** → The subject notifies observers of a change, and observers explicitly fetch the required data from the subject.  
  - ✅ More control for observers, they only fetch what they need.  
  - ❌ Observers must know how to query the subject, creating tighter coupling.  

➡️ **Java’s `PropertyChangeListener`** is a hybrid: it pushes event objects but allows observers to pull more data if required.

---

## ⚠️ Best Practices & Pitfalls

- ✅ Prefer `PropertyChangeListener` over deprecated `Observable/Observer`.  
- ✅ Use **weak references** for observers in long-lived systems to prevent memory leaks.  
- ✅ Keep notification logic simple and fast—avoid heavy operations inside `notifyObservers()`.  
- ✅ Document event lifecycles clearly in large systems.  
- ❌ Avoid **circular dependencies** where observers trigger changes in the subject, leading to infinite loops.  
- ❌ Don’t let observers modify the subject’s state directly during notification.  

---

## 📚 Articles

- [Refactoring Guru: Observer Pattern](https://refactoring.guru/design-patterns/observer)  
- [SourceMaking: Observer Pattern](https://sourcemaking.com/design_patterns/observer)  
- [Wikipedia: Observer Pattern](https://en.wikipedia.org/wiki/Observer_pattern)  
- [Baeldung: Observer Pattern in Java](https://www.baeldung.com/java-observer-pattern)  
- [DigitalOcean: Observer Pattern](https://www.journaldev.com/1739/observer-design-pattern-in-java)  
