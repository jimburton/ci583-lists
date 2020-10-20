# Implementing sets

Broadly speaking, a
[set](https://en.wikipedia.org/wiki/Set_(mathematics)) is just a collection
of objects which are distinct from each other. In mathematical
notation curly braces are used to denote sets, e.g. the set of the
whole numbers 1 to 3 is `{1, 2, 3}`. The order of the objects doesn't make
any difference: `{1, 2, 3}`, `{2, 1, 3}`, `{3, 2, 1}` are all the same
set. Sets don't contain duplicates, so `{1, 1, 2}` isn't a set. (In
mathematics a collection like this is usually called a *bag*.)

Basing your work on your code from last week, you will create an implementation
of sets that uses a linked list to store the data. When you have finished the exercise,
switch to the `sets` branch of this repository to see my version.

Your set class will need some of the same methods as `LinkedList` -- `isEmpty`,
`length`, `member`, and the two utility functions for printing lists, `printList`
and `toString`. However, there are several methods in `LinkedList` that don't make sense
for sets, such as `head` and `tail`. So your first job is make a common *superclass* for
`LinkedList` and the new set class.

1. Create a class called `LinkedCollection` in the `lists` package. Move the field declaration

    ```
    protected Node _head;
    ```
    from `LinkedList` into the `LinkedCollection` class. Next, move the methods `isEmpty`, `length`, `member`, `printList` and `toString` from `LinkedList` 
into `LinkedCollection`. 

    Use the `extends` keyword to make `LinkedList` 
a subclass of `LinkedCollection`. Run the `LinkedListTest` test suite to make sure 
that everything still works. 

2. Create a subclass of `LinkedCollection` called `Set` in the `lists` package (remember to 
use `extends`). Add the following `equals` method to the new class:

    ```
    public boolean equals(Object o) {
        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }
   
        /* Check if o is an instance of Set or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Set)) {
            return false;
        }
   
        // typecast o to Set so that we can compare it to this
        Set s2 = (Set) o;
   
        //check that the two sets are the same length
        if(this.length() != s2.length()) {
            return false;
        }
   
        //loop through the current set and check that every element is an element of the other set
        Node n = _head;
        while(n != null) {
            if(!s2.member(n.data)) {
                return false;
            }
            n = n.next;
        }
        return true;
    }
    ```
   
   Note that this `equals` method says two sets are equal if they contain the same elements
   (the order of the elements doesn't matter).

3. Implement the `insert` method in `Set`. This should insert a new element to the set
while ensuring that there are no duplicates. What is the complexity of `insert`?

4.  The *union* of two sets, *s1* and *s2*, is a set that has all the elements of *s1* and
all the elements of *s2* (and, obviously, no duplicates). If `s1={1,3,5}` and `s2={2,3,4,5}`
then `s1.union(s2)=={1,2,3,4,5}`. Implement a union method in 
`Set` with this signature:

    ```
    public Set union (Set s2) {
      //...
    }
    ```
    
    Note that this method shouldn't make any changes to the existing sets but should
    return a new one with all the right elements. One way to do it is to create a new
    set then use the `insert` method to insert everything from the set on which the method
    was called (`this`), then insert everything from the second set, `s2`.
    
5. The *intersection* of two sets, *s1* and *s2*, is a set that has all the elements that
are elements of both *s1* and *s2*. If `s1={1,3,5}` and `s2={2,3,4,5}` then 
`s1.intersection(s2)=={3,5}`. Implement an intersection method in `Set` with this 
signature:

    ```
    public Set intersection (Set s2) {
      //...
    }
    ```

    Hint: the `member` method will be useful here.

6. The *difference* of a set, *s1*, with respect to a second set, *s2*, is the set that 
has all the elements that are in *s1* but not in *s2*. If `s1={1,3,5}` and `s2={2,3,4,5}` 
then `s1.difference(s2)=={1}` and `s2.difference(s1)=={2,4}`. Implement a difference method in `Set` with this 
   signature:
   
    ```
    public Set difference (Set s2) {
      //...
    }
    ```

8. Make a new class `SetTest` in the `tests` package that contains unit tests for your
work. You can copy one of the existing test classes or work out how to use your IDE to
make a new JUnit test class. Read the existing test classes to note some of the methods 
that `JUnit` makes available to you for testing, like `assertEquals` (tests that two 
values are equal),
`assertNull` (tests that a value is `null`), `assertTrue` and `assertFalse`. Make sure to 
include the annotation `@Test` on the line above the definition of every method that you 
want to run as a test. 

    Think of the properties that you want to be true for `Set` and each of its methods. For
instance, you might test whether your `insert` method rejects duplicates like this:

    ```
    @Test
    public void testDupes () {
      Set s = new Set();
      s.insert (1);
      s.insert (1);
      assertEquals(s.length(), 1);
    }
   ```
   
   For the `insert` method you also need to check that elements are actually inserted 
   (insert some data then use `member` to test whether it is there). You should also 
   create at least one test for each of the methods `union`, 
   `intersection` and `difference`. 
