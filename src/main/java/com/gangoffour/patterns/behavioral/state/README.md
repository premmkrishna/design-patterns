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
* A developer needs to write a large amount of code for the state schema. Depending on the number of different defined state transition methods and possible object states, you can write numerous methods. Thus, for N states with M transition methods, the total number of methods required will be (N+1)*M.
  
* An insurance policy with 5 different states and 5 methods for each (ignoring ListValidOperations method) requires 25 methods in total. The policy context type must also define the 5 state transition methods, increasing total methods required to 30.
## Example 
Consider the typical example of regulators at home.
At any point of time it can be having only one state and we have simple thrust to increase or decrease speed.
Thus by doing so the behaviour of fan changes and enforces we cannot skip speed levels which needs to be gradual.

![Use case](https://user-images.githubusercontent.com/12068459/54508818-3ae72300-496d-11e9-9991-18d69a98e971.png)




