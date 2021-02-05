Memento pattern is used to restore state of an object to a previous state.
Memento pattern falls under behavioral pattern category.

Implementation
Memento pattern uses three actor classes. Memento(hereis:EditorState) contains state of an object to be restored.
Originator(Editor) creates and stores states in Memento objects and Caretaker(History) object is responsible 
to restore object state from Memento. We have created classes Memento, Originator and CareTaker.

