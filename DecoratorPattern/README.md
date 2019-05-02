```
The Decorator pattern is used to attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.
It involves a set of decorator classes that are used to wrap concrete components.
```

Basic OO principles covered

- **Classes should be open for extension but closed for modification.**
We use decorator classes to add additional functionalities to a class/object. The class itself is not modified. As given in the example, The decorator class and its children are the same type as the component class (Beverage). We add additional cost to a beverage by adding the related condiment decorator, no change in the Beverage class.