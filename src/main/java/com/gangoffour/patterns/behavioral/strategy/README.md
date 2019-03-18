## Behavioural pattern
* Chain of Responsibility Pattern
* Iterator Pattern
* Observer Pattern
* State Pattern
* **Strategy Pattern**
* Template Pattern
* Visitor Pattern

### Use:
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable

### Merits:
* A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior without changing its architecture.
* By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
* The application can switch strategies at run-time.
* Strategy enables the clients to choose the required algorithm, without using a “switch” statement or a series of “if-else” statements.
* Data structures used for implementing the algorithm are completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.
* It lets you extract the varying behavior into a separate class hierarchy and combine the original classes into one, thereby reducing duplicate code.
  

### Demerits:
* If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
* Clients must be aware of the differences between strategies to be able to select a proper one.

## Example 
Let's not take a complicated scenario to understand strategy pattern.
I will take as case of sorting numbers using different strategy.
We have different sorting algorithms and a sorter class.
We can decide at runtime which sort to use and instead of having ifs and switch which produce a complicated code.

![Use case](https://user-images.githubusercontent.com/12068459/54514091-2c096c00-497f-11e9-8bcd-fa6ce7adf9c1.png)




