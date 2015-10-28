/**
* Programming in Java 2015-2016
* Sarah Connor
* Week 5 Day 9
* Exercise 1. Integer Binary Tree
*/

public class TestTree{
	public static void main(String[] args){
		IntegerTreeNode myTree = new IntegerTreeNode(5);
		myTree.add(1);
		myTree.add(8);
		System.out.println(myTree.toStringSimple());
		myTree.add(10);
		myTree.add(9);
		myTree.add(10);
		myTree.add(9);
		myTree.add(0);
		myTree.add(2);
		myTree.add(3);
		System.out.println(myTree);
		System.out.println("contains 10? " + myTree.contains(1));
		System.out.println("Max = " + myTree.getMax());
		System.out.println("Min = " + myTree.getMin());
		System.out.println("Depth = " + myTree.depth()); 
		myTree.remove(5);
		System.out.println("Remove 1");
		System.out.println(myTree);
		System.out.println("contains 1? " + myTree.contains(1));
	}
}