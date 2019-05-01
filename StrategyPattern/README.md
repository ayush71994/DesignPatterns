```
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algo vary independently from the clients that use it.
```

Basic OO principles covered

- **Encapsulate what varies.**
In the example, we are encapsulating the flying and quacking 'algorithms'. These are used by the Ducks, they can be changed at runtime. Different ducks can have different flying and quacking behaviours and these can also be changed at runtime
- **Favor Composition over Inheritance.**
The Duck class have 'Has-A' relationship with the quacking and flying behaviour. Inheritance is more static relationship as compared to Composition.
- **Program to interfaces, not implementation.**
The Duck class do not have any insight about the implementation of the Flying and Quacking behaviour. They are only concerned that one enables 'fly' and the other 'quack'. It does not care what is the underlying mechanism