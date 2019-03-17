##Behavioural pattern
* Chain of Responsibility Pattern
* **Iterator Pattern**
* Observer Pattern
* State Pattern
* Strategy Pattern
* Template Pattern
* Visitor Pattern

###Uses:
The Iterator provides ways to access elements of an aggregate object sequentially without exposing the underlying structure of the object.
The client code isn’t coupled to concrete classes because it works with collections and iterators only through interfaces.
* To access an aggregate object’s contents without exposing its internal representation.
* To support multiple traversals of aggregate objects.
* You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
* To provide a uniform interface for traversing different aggregate structures (that is, to support polymorphic iteration).

###Demerits:
* You cannot backtrack once traversed
* Applying the pattern can be an overkill if your app only works with simple collections.

##Example 
Consider a user changing channels.

We do not want remote to know the implementation details of moving over to next channels. 


![Use case](https://user-images.githubusercontent.com/12068459/54490396-8650f100-48db-11e9-86c3-440596abd582.png)





