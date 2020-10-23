# Recursion

In this lab you will implement linked lists again. The first implementation you made was
an *iterative* one, i.e. one that used loops to move down the list. Finding the end of
the list meant detecting the situation where the pointer to the next item was `null`.
This version will use `recursion` and `inheritance`.

In the package `ci583.labs.lists.rec` are three classes. `LinkedList` is the superclass
of the objects that will make up your (recursive) linked lists. Those objects will be
instances of one of the subclasses of `LinkedList`, which are `ListItem` and `Nil`. An
instance of `ListItem` has a `head` and a `tail`. `Nil` is the item at the end of lists.
The list contains `int`s, so `head` is
an `int` and `tail` is a `LinkedList`. Therefore, `tail` might be a `ListItem` (if there
are further items in this list)

So, instead of writing loops that do something for every item in a list and have to
check whether the next item is `null`, you will write a version of each method that
does something for a `ListItem` then calls itself recursively on the `tail`, and a
version for `Nil` that ends the recursion.

1. Implement the `cons` method. This works in the same way whether it is called on `Nil`
or a `ListItem`, so the code should go in the superclass, `LinkedList`. Every list
with something in it must be an instance of `ListItem`, so this method should return 
one of these with the new element as `head` and `this` as the `tail`.  