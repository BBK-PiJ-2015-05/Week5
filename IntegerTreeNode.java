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
	
	public IntegerTreeNode getMaxNode(){
		if(right == null){
			return this;
		}else{
			return right.getMaxNode();
		}
	}
	
	public IntegerTreeNode getMinNode(){
		if(left == null){
			return this;
		}else{
			return left.getMinNode();
		}
	}
	
	public String toString(){
		String treeString = "[" + value;
		
		if(left != null){
			treeString = treeString + " L" + left.toString() +"]";
		}else if(left == null){
			treeString = treeString + " L[]";
		}
		if (right != null){
			treeString = treeString + " R" + right.toString() + "]";
		}else if(right == null){
			treeString = treeString + " R[]]";
		}
		return treeString;
	}
	
	public String toStringSimple(){
		String treeString = "[" + value;
		
		if(left != null){
			treeString = treeString + " " + left.toStringSimple() +"]";
		}if(left == null){
			treeString = treeString + "";
		}if (right != null){
			treeString = treeString + " " + right.toStringSimple() + "]";
		}
		return treeString;
	}
	
	public int depth(){
		int count = 0;
		int leftDepth = 0;
		int rightDepth = 0;
		
		if(left != null){
			leftDepth = 1 + left.depth();
		}else if(left == null){
		}
		if (right != null){
			rightDepth = 1 + right.depth();
		}else if(right == null){
		}
		if(leftDepth > rightDepth){
			count = leftDepth;
		}else{
			count = rightDepth;
		}
		return count;
	}
	
	/*
	*if the next node is equal to a
	*		if leaf
	*			make null
	*		else if node has one child
	*			make this point to child
	*		else //has two children
	*			look for the minumum value on the node's right side
	*			make node equal to min value
	*			delete min value
	*	if parent is a
	*		find min of right node
	*		replace parent value with min
	*		delete min
	*/
	public void remove(int a){
		//if on the left side of the tree
		if(this.value > a){
			if(this.left != null){
				if(this.left.value == a){
					//if leaf node
					if(this.left.left == null && this.left.right == null){
						this.left = null;
					}//if has one child
					else if (this.left.left == null || this.left.right == null){
						if(this.left.left != null){
							this.left = this.left.left;
						}else{
							this.right = this.left.right;
						}
					}//if has two children
					else{
						IntegerTreeNode maxNode = this.left.right.getMaxNode();
						IntegerTreeNode tempNode = this.left.right;
						int temp = this.left.right.getMax();
						this.left.value = this.left.right.value;
						this.left.right.value = temp;
						while(tempNode.right != null){
							if(tempNode.right == maxNode){
								tempNode.right = null;
							}else{
								tempNode = tempNode.right;
							}
						}
					}
				}else{
					this.left.remove(a);
				}
			}
		//if on the right side of the tree
		}else if(this.value < a){
			if(this.right != null){
				if(this.right.value == a){
					//if leaf node
					if(this.right.left == null && this.right.right == null){
						this.right = null;
					}//if has one child
					else if (this.right.left == null || this.right.right == null){
						if(this.right.left != null){
							this.right = this.right.left;
						}else{
							this.right = this.right.right;
						}
					}else{
						//if has two children
						IntegerTreeNode minNode = right.left.getMinNode();
						IntegerTreeNode tempNode = this.right.left;
						int temp = this.right.left.getMin();
						this.right.value = this.right.left.value;
						this.right.left.value = temp;
						while(tempNode.left != null){
							if(tempNode.left == minNode){
								tempNode.left = null;
							}else{
								tempNode = tempNode.left;
							}
						}
					}
				}else{
					this.right.remove(a);
				}
			}
		}else if(this.value == a){
			//if parent node replace with min of right side
			if(this.right != null){
				IntegerTreeNode minNode = right.getMinNode();
				int temp = this.right.getMin();
				this.value = this.right.value;
				this.right.value = temp;
				IntegerTreeNode tempNode = this.right;
				while(tempNode.left != null){
					if(tempNode.left == minNode){
						tempNode.left = null;
					}else{
						tempNode = tempNode.left;
					}
				}				
			}//if no right side replace with max from left
			else if(this.left != null){
				IntegerTreeNode maxNode = this.left.getMaxNode();
				IntegerTreeNode tempNode = this.left;
				int temp = this.left.getMax();
				this.value = this.left.value;
				this.left.right.value = temp;
				while(tempNode.right != null){
					if(tempNode.right == maxNode){
						tempNode.right = null;
					}else{
						tempNode = tempNode.right;
					}
				}
			}//if no children can't delete
		}	
	}	
}