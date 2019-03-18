## Behavioural pattern
* Chain of Responsibility Pattern
* Iterator Pattern
* Observer Pattern
* State Pattern
* Strategy Pattern
* **Template Pattern**
* Visitor Pattern

### Use:
Template pattern is to define an algorithm as skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm is preserved by the parent class.

### Merits:
* Code reuse happens with the Template Method pattern as it uses inheritance and not composition. Only a few methods need to be overridden.
* Flexibility lets subclasses decide how to implement steps in an algorithm.
* Lets you turn a monolithic algorithm into a series of individual steps which can be easily extended by subclasses while keeping intact the structure defined in a superclass.
  
  

### Demerits:
* Debugging and understanding the sequence of flow in the Template Method pattern can be confusing at times. 
* You may end up implementing a method that shouldn't be implemented or not implementing an abstract method at all.
* You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass. 

## Example 
A simple use case would be to manufacture cars.
We know that all cars have basic features like wheel,body and many more.But they differ in their brands and quality.
So we have a template that we can use for any car.Consider it as blueprint.
All we need to do now is build it using the blueprint

![Use case](https://user-images.githubusercontent.com/12068459/54523116-c6c07580-4994-11e9-8808-2c7f2cb6d3f4.png)




