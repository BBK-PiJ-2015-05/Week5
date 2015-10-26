/**
* Programming in Java 2015-2016
* Sarah Connor
* Week 5 Day 9
* Exercise 1. Integer Binary Tree
*/

public class IntegerTreeNode{
	private int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	//constructor
	public IntegerTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int newNum){
		if(newNum > this.value){
			if(right == null){
				right = new IntegerTreeNode(newNum);
			}else{
				right.add(newNum);
			}
		}else{
			if(left == null){
				left = new IntegerTreeNode(newNum);
			}else{
				left.add(newNum);
			}
		}
	}
	
	public boolean contains(int num){
		if(num == this.value){
			return true;
		}else if(num > this.value){
			if(right == null){
				return false;
			}else{
				return right.contains(num);
			}
		}else{
			if(left == null){
				return false;
			}else{
				return left.contains(num);
			}
		}
	}
	
	public int getMax(){
		if(right == null){
			return this.value;
		}else{
			return right.getMax();
		}
	}
	
	public int getMin(){
		if(left == null){
			return this.value;
		}else{
			return left.getMin();
		}
	}


}