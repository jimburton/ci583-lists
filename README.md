# CI583 Lab session: Linked lists and sorted lists

This lab session is about working with simple linked lists and sorted linked lists.
Get a copy of the code by downloading the zip file from github.com or using git to create a clone of the
repository. Open the project in your favourite IDE. If you aren't used to using an IDE, as opposed to a simpler
kind of editor, I can help with that in the labs.

Read the source code of the classes in the project. The project provides two classes which implement
 linked lists made up of `Node` objects, similar to the data structure discussed in the lecture. Each node contains an `int`, which is its data, and a link to the next 
 object, which may be another node or may be null. The `LinkedList` class is a simple singly linked list, whereas
 the nodes in a `SortedList` are in order.
 
 The project is meant to demonstrate the ideas behind this kind of data structure as simply as possible. Later
 in the module we will look at more elegant and extensible ways to implement the same thing.
 
 Start with implementing the methods in `LinkedList`. Each method that you
 have to implement currently contains a single line of code that throws an 
 error -- **remove this line when you start your work**. 
 
 The code comes with *unit tests* in the `tests` package, which you can run to check your work. The
 way that you run these depends on the IDE that you're using. The first thing you need to do
  is to add the JUnit library to the project. After that it is usually as
 simple as right-clicking on the test and selecting the option to run it -- ask
 for help with this in the labs or google the procedure for your IDE. (For example, in Intellij 
 you need to click on *File / Project Structure* then *Libraries*. Then click on the 
 `+` button and select *From Maven*. Type "junit" into the search box and select one of 
 the results. Now you have added the JUnit library to the project you can right-click 
 on a test class and select *Run*.)
 
 1. First, implement the `isEmpty` method. It returns `true` if `_head` is `null`,
 `false` otherwise.
  
 2. Implement the `head` 
 method. This method should return the data from the `_head` field. If that field
 is null (e.g. because the list has just been created) then there is no data to
 return, so you should throw a `NullPointerException`. That is done as follows:
 
 ```java
throw new NullPointerException("Empty collection");
```

3. Implement the `tail` method. This method returns everything *after* the head.
Again, if the head is null, there is no reasonable value to return, so throw a
`NullPointerException`. If the list contains just one element, then the tail is null,
and that is what you should return. Otherwise, there is a tail to return -- create
a new `LinkedList` and set its `_head` node to the `next` node of the current
list.

4. Next, implement the `length` method. You need to create an `int` counter 
and loop to the end of the list incrementing the pointer. To loop through
the list make a local variable that begins by pointing to `_head` then 
repeatedly set it to `next` within a `while` loop until you get to the end 
of the list:

    ```java
    Node last = _head;
    int c = 0;
    while (last != null) { //loop to the end of the list
        c++;
        last = last.next; //move onto the next node in the list
    }
    return c; 
    ``` 

    You can solve many of the following methods with a similar style of loop.

5. Next, implement the `cons` method. Make a local variable containing a reference to
   current head. Then make a new `Node` object, set it as `_head` and set the `next` 
   reference to point to the old head.

6. For the `member` method, loop through the list and return `true` if you find
a node with the data that you are looking for (i.e. the value supplied to the
method as a parameter). If you get all the way to the end and haven't found it,
return `false`.

7. The `indexOf` method is similar to `member`, except that you should return the
*index* of the item you're looking for. So, you need to maintain a counter and 
increment it within the loop.

8. The `delete` method is a little more complicated. The parameter to the method
is the index of the item you need to delete, so loop through the list until you 
get to the right position. When you get to the position you need to connect the
*previous* item to the *next* one, removing any reference to the deleted item.
So, before the loop begins, make two references to nodes:

    ```java
    Node n = _head;
    Node prev = null;
    ```  

    At the end of each loop you will need to set `prev` to `n`, and `n` to `n.next`.
    You will also need a counter to know when you have reached to point at which 
    you need to delete. When you reach that point, set the `next` field of `prev`
    to point to the `next` field of `n`.

9. Finally, implement the `insert` method of the `SortedList` class. `SortedList`
is a subclass of `LinkedList` -- the only difference is in the way new items are
inserted. Instead of just sticking them at the end of the list, you need to insert
them in order, so you should loop through the list until you encounter an item 
which is larger than the new item. 

My solution to these problems is in a branch of this repository called `solution`.
You can view it by switching branches on the github website or in your local
repository. 
