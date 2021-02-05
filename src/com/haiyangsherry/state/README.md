State Pattern: easily extendable.
Let's say tomorrow we have to add a new tool, we just need to 
create a new class implements the Tool interface. And don't
need to change Canvas or Tool classes. E.g. we add a EraserTool

This also bring us to a very important principle in OOP:
"Open Closed Principle": our class should be open for extension;
but closed for modification. So we are not allowed to change
our classes, we can only extend it.We can add new functionality
without changing the existing code, and by adding new classes.