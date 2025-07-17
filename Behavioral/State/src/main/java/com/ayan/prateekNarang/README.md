**State Pattern**
- You are tasked with building a <code>DirectionService</code> class for a navigation app. This class calculates the **estimated time of arrival (ETA)** and provides directions between two points. The ETA and direction differ based on the mode of transportation, which can be one of the  following: 
    - Walking
    - Cycling
    - Car
    - Train

**Problems with our Code**
- **Tight Coupling annd Complex Conditional Logic:**
  - The <code>DirectionService</code> likely uses **Conditional statements** (if-else or switch-case) based on transportation mode enums to determine how to calculate ETA and provide directions.
  - As the number of transportation modes increases, the conditional logic becomes **more complex and harder to maintain.**
- **Violation of the Open/Closed Principle:**
  - **Adding new transportation modes** (e.g., Airplane, Boat) requires modifying the exisiting <code>DirectionService</code> class, which goes against the **Open/Closed Principle** (classes should be open for extension but closed for modification).
- **Code Duplication and Reduced Maintainability:**
  - Similar code blocks for different transportation modes may lead to **code duplication**, making the system less maintainable and more error-prone.
- **Scalability Issues:**
  - As more features or transportation modes are addded, the class becomes **bulky**, impacting scalability and readability.

**State Pattern: Structure**
- **Context:** Holds a reference to the current state.
- **State:** Interface for state-specific behavior.
- **Concrete State:** Specific implementations of the <code>State</code> interface that represent a particular state of the context object. 

**State Pattern: Example**
- **UI Navigation**
  - **Scenario:** A mobile app UI where the navigation behaviour changes based on whether the user is logged in or not.
- **Example:**
  - States: **LoggedInState**, **LoggedOutState**
  - Context: The app's navigation system switches between these states. 

**State Pattern Use Cases**
1. **UI Componenets:** Buttons that change behavior based on state(enabled, disabled, pressed).
2. **Vending Machines:** States like waiting for money, dispensing product, or out of stock. 
3. **TCP Connections:** Changing behavior based on connection state(listening, connected, closed).