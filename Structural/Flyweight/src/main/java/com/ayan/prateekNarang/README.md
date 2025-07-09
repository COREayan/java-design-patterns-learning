**Flyweight Pattern Motivation**
- In game development, especially in scenarios like shooting games where numerous identical bullets are fired, memory and performance can quickly become an issue if each bullet object stores redundant data. Using the **Flyweight Pattern**, we can reduce memory overhead by sharing intrinsic properties of bullets(like appearance) while maintaining unique extrinsic properties(like position and velocity).

**Flyweight Pattern**
- **Problem: ** Creating many identical or similar objects in memory-heavy applications can lead to excessive memory consumption. 
- **Solution: ** By sharing the common state among multiple objects (the **flyweights**), the pattern reduces the memory footprint.

**Example Problem:**
- Consider a graphics system rendering a large number of trees in a forest, where each tree shares the same image but may vary by position or size. 

**Flyweight Pattern Solution** 
- In this refactor, the Bullet class contains only extrinsic data like position and velocity. The intrinsic data like color is stored in a BulletType class, which is shared across all Bullet objects. This allows us to manage a large number of bullets efficiently.

