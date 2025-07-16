**Template Method Pattern**

**Motivation Problem**
- Consider a scenario where you have different data parsers (e.g., CSV, XML, and JSON). Each pareser follows the same steps: **open file, parse data, and close file.**
- Without the Template Method Pattern, you might end up duplicating the common steps in each parser class.


**Problems in our code**
- Code Duplication: The openFile() and closeFile() methods are duplicated in both parsers.
- Any changes to the common logic would require changes in every parser, violating the DRY(Don't Repeat Yourself) principle.

**Fix**
- We will have a Abstract class, template method, and common methods, open, close, parse(abstract).
- Specific child classes. 

****
****

- **Problem:** Different parts of an algorithms may need to vary in subclasses, but the overall structure should remain consistent.
- **Solution:** The Template Method Pattern defines the **skeleton** of an algorithm in a base class and lets subclasses override specific steps.
- **Structure:**
    - **Abstract Class:** Defines the algorithm skeleton.
    - **Concrete Subclasses:** Override specific steps of the algorithm.
    - 