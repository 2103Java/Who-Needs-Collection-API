# Who-Needs-Collection-API

## Overview

This basic Methods to implement the duties of the collection API.

## Objective

The App allows the user to create a List Queue and Set by manipulating Arrays to mimic their fuctionality.
Examples are provided in the main driver and the results are printed to the console.

## Examples

Create A Queue:
MyQueue<String> queue1 = new MyQueueAndListImpl<String>("bob", "john", "tony");

Queue Methods:
.add()
.remove()
.size()

Create A List:
MyList<String> list1 = new MyQueueAndListImpl<String>("bird", "cat", "dog");

List Methods:
.add(T t, int index)
.remove(int index)
.update(T t, int index)
.size()

Create A Set:
MySet<String> vegetables = new MySetImpl<String>("potato", "broc", "carrot");

Set Methods:
.add(T t)
.remove(T t)
.size()

## Created with

- [Java](https://docs.oracle.com/en/java/)

## Authors

**Team 3**
