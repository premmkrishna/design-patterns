## Behavioural pattern
* Chain of Responsibility Pattern
* Iterator Pattern
* Observer Pattern
* **State Pattern**
* Strategy Pattern
* Template Pattern
* Visitor Pattern

### Use:
The state pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

### Merits:
* With State pattern, the benefits of implementing polymorphic behavior are evident, and it is also easier to add states to support additional behavior.
* The State design pattern also improves Cohesion since state-specific behaviors are aggregated into the ConcreteState classes, which are placed in one location in the code.
* State pattern helps in avoiding if-else or switch-case conditionals.

### Demerits:
* You cannot backtrack once traversed
* Applying the pattern can be an overkill if your app only works with simple collections.

## Example 
Consider the typical example of regulators at home.
At any point of time it can be having only one state and we have simple thrust to increase or decrease speed.
Thus by doing so the behaviour of fan changes and enforces we cannot skip speed levels which needs to be gradual.

![Use case](https://user-images.githubusercontent.com/12068459/54508818-3ae72300-496d-11e9-9991-18d69a98e971.png)




