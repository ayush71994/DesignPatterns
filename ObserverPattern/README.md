```
The Observer pattern defines a one-to-many relationship between objects, such that one object changes state, all its dependants are notified and/or updated automatically
```

Basic OO principles covered

- **Encapsulate what varies.**
The thing that varies in Observer Pattern is the state of the Subject and the number and types of Observers. With this, you can vary the objects that are dependant on the state of Subject, without making change in the Subject.
- **Program to interfaces, not implementation.**
Both the subject and observer use interfaces, the subject keeps track of objects implementing the observer interface and the observer just registers and gets notified by the subject whose state it cares about
- **Strive for loosely coupled design between objects that interact.**
The subject does not know anything about the observer except the fact that it implements Observer interface and The observer only cares about registering and getting notified by the Subject. This is seen in the example