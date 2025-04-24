Motivation 
In certain situtations, such as managing a database connection, logging, or configuration settings, you want to ensure that only one instance of a clas is created throughout the application's lifecycle. If multiple instances were created, it could lead to issues like: 
- **Inconsistent state**: If multiple instances represent the same concept, they may hold different data.
- **Resource conflicts**: If multiple instances of a resource-heavy class are created, it can lead to performance degradation.