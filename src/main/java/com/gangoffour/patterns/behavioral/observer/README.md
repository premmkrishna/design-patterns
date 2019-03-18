## Behavioural pattern
* Chain of Responsibility Pattern
* Iterator Pattern
* **Observer Pattern**
* State Pattern
* Strategy Pattern
* Template Pattern
* Visitor Pattern

### Use:
Observer pattern lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
The subject lets observers subscribe to it and maintains a the list of observers to notify about the event.


## Merits
* Ability to add observers and subjects on the fly.
* Minimum dependency between observer and subject
* Subject doesn't need to know how many observers it has. It simply broadcasts a change in state.

### Demerits:
* If not used carefully the observer pattern can add unecessary complexity.
* Because observers don't know about each other, a simple update to an observer might cause a long chain of other updates

## Example 
Coming to a small scenario.
Our university had made a mistake in grading and like to inform all students that thier marks are increased by 5.
Now the students here are our observers who want to get updates while subject is the 'grading system' which keeps track of all students.
The grade system triggers a mark update event and marks of all students subscribed to this is updated. 

![Use case](https://user-images.githubusercontent.com/12068459/54509193-bac1bd00-496e-11e9-959b-4e987ea3c655.png)





