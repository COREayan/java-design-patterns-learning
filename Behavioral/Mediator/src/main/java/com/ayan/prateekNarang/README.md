**Mediator Pattern**

**Motivation**
- We want to build a chat system with multiple participants where each user can send messages to all other users. If users send messages to each other directly, the complexity increases as more users are addded. Each user must know about every other user, creating a complex web of communication and dependencies. 

**Solution using Mediator Pattern**
**Scenario:** In a chat system, multiple participant communicate through a central **chat medator,** reducing the need for each participant to be aware of the others. 

**Example:**
- **Mediator:** Chat server.
- **Colleagues:** Chat participants send messages to the mediator, which distributes them to others. 

**Mediator Pattern**
1. **ChatMediator Interface:** Declares the <code>sendMessage</code> method, which all mediators must implement.
2. **Concrete Mediator:** The <code>ChatRoom</code> class implements the <code>ChatMediator</code> interface. It holds a list of users and handles message broadcasting.
3. **User Class:**
   - Each <code>User</code> object represents a participant in the chat. When a user sends a message, the <code>sendMessage</code> method in the <code>ChatRoom</code> mediator is called, which distributes the message to all users except the sender.
4. **Communication:**
   - Users interact only with the <code>ChatRoom</code>(mediator), which facilitates communication between them, removing direct dependencies between individual users. 
   

**Mediator Pattern Benefits**
- **Reduces Complexity:** The mediator centralizes communication, reducing direct dependencies between objects. 
- **Loose Coupling:** Colleagues only interact with the mediator, making them easier to manage, extend, and maintain.
- **Single Responsibility:** The mediator handles complex communication logic, allowing colleagues to focus on their own behavior. 
- **Centralized Control:** Changes to communication rules can be made in the mediator without affecting the colleagues. 

**Mediator Pattern in Real World**

- **Air Traffic Control:** Airplanes communicate through a central control tower(mediator) instead of coordinating directly with each other.
- **GUI Component Coordination:** In GUI applications, multiple UI components may need to interact. For example, when a dropdown changes, it may trigger updates to text fields, buttons, etc. A mediator can handle this interaction logic instead of having the componenets know about each other directly.
- **Workflow Systems:** In a business process management system, a mediator can coordinate various activities across multiple systems or departments. 