##Behavioural pattern
* **Chain of Responsibility Pattern**
* Iterator Pattern
* Observer Pattern
* State Pattern
* Strategy Pattern
* Template Pattern
* Visitor Pattern

###Uses:
Each object has it's own responsibility and once it is complete,if needed it passes it to the next processing object.

* This design pattern can be used when we want to decouple a request between sender and receiver. Due to this it facilitates many functionalities.
* This pattern can also be used when multiple objects in the chain are designed to handle a request at run time. It improves efficiency.
* Chain of responsibility pattern is used when we do not want to explicitly specify handlers in our code.
* It is used when we want to ask for one of several objects in the chain without explicitly specifying the receiver.

###Demerits:
* One of the most important disadvantage of this pattern is the request received from the sender object must not be guaranteed.
* Another disadvantage is it degrades the system’s performance, and it is not easy to debug code and to call a cycle.
* Due to debugging, it may not be easy to observe the operating characteristics.

##Example 
Consider a bank where we need to dispense notes for a given amount.
We have notes of $100,$10 and $1. The bank needs to give minimal notes as possible starting from greatest denomination possible.

A 515$ needs to be dispensed as 5 denominations of $100,one denomination of $10 and five denominations of $1.

![Use case](https://user-images.githubusercontent.com/12068459/54489003-db860600-48cd-11e9-8168-2ef40977b9f4.png)





