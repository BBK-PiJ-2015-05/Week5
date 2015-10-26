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
		myTree.add(10);
		myTree.add(2);
		myTree.add(9);
		myTree.add(3);
		System.out.println(myTree.contains(0));
		System.out.println(myTree.getMax());
		System.out.println(myTree.getMin());
	}
}