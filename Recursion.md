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
version for `Nil` that ends the recursion. This is another way of saying that
`ListItem` represents the *recursive case* and `Nil` represents the *base case*. 
After doing the work, compare the code to that of your iterative solution. 
Hopefully you will see that there is much less code and that the recursive solution
is more *declarative*, in that it focuses more on saying "what to do" than 
on "how to do it". 

There are JUnit tests in the class `ci583.labs.test.LinkedListRecTest` and my solutions
in the branch of this repository called `recursive-solution`. 

1. Implement the `cons` method. This works in the same way whether it is called on `Nil`
or a `ListItem`, so the code should go in the superclass, `LinkedList`. Every list
with something in it must be an instance of `ListItem`, so this method should return 
one of these with the new element as `head` and `this` as the `tail`.  

2. Implement the `head()` method, once in `ListItem` and once in `Nil`. For instances
of `ListItem` it should simply return `head`. It is an error to call `head` on 
instances of `Nil` (i.e. on the empty list) so the version in `Nil` should return a
java `RuntimeError`. The constructor of `RuntimeError` takes a `String` describing
what went wrong.

3. Implement the `tail()` method (twice) in a similar way.

4. Implement `isEmpty()`. Lists which are instances of `ListItem` are not empty, while
`Nil` represents the empty list, which is of course empty.

5. Implement `length()`. The length of the empty list is 0 (base case). The length 
of a list with something in it is 1 plus the length of the `tail` (recursive case).

6. Implement `member()`. Nothing is a member of the empty list. An item, `e`, is a
member of a list with something in it if it is equal to the `head` of the list or
`e` is a member of the `tail`.

7. Implement `indexOf()`. This method takes an `int` value to search for and returns
the position of that value in the list if it is found, or -1 if it is not in the 
list. This is a bit trickier than the previous methods. In the recursive case you
can't simply call `indexOf` recursively, because you need to keep track of the position
you're at in the list. So, you have a *helper method*, `indexOfInner`, which keeps
track of the position and is where the real work takes place. In the `ListItem`
class all `indexOf` needs to do is to call `indexOfInner` with a count of 0. As for 
`indexOfInner`, if the item you're looking for is equal to `head` then you have found 
its position and you should return `count`. Otherwise, it may be in the `tail`, so
call `indexOfInner` recursively with an updated count. In the `Nil` class both
methods should return -1 to indicate that the end of the list was reached without the 
element being found.

8. Implement `delete()`, and see if you can puzzle this one out without hints :-)