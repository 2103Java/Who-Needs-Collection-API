# Who-Needs-Collection-API

## Overview

This basic Methods to implement the duties of the collection API.

## Objective

The App allows the user to create a List Queue and Set by manipulating Arrays to mimic their fuctionality.
Examples are provided in the main driver and the results are printed to the console.

## Examples

Create A Queue:<br/>
MyQueue<String> queue1 = new MyQueueAndListImpl<String>("bob", "john", "tony");

Queue Methods:<br/>
.add()<br/>
.remove()<br/>
.size()

Create A List:<br/>
MyList<String> list1 = new MyQueueAndListImpl<String>("bird", "cat", "dog");

List Methods:<br/>
.add(T t, int index)<br/>
.remove(int index)<br/>
.update(T t, int index)<br/>
.size()

Create A Set:<br/>
MySet<String> vegetables = new MySetImpl<String>("potato", "broc", "carrot");

Set Methods:<br/>
.add(T t)<br/>
.remove(T t)<br/>
.size()

## Created with

- [Java](https://docs.oracle.com/en/java/)

## Authors

**Team 3**
