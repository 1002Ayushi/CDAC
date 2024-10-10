class BTT{
Node root;//starting point

static class Node{
Node left;
int data;
Node right;

Node(int data){
this.left = null;
this.data = data;
this.right = null;
}
}
public BTT()
{
	this.root = null;
}
public BTT(int data){
	this.root = new Node(data);
}

Node insert(Node root, int key){
if(root == null){
	root = new Node(key);
	return root;
}
if(key <= root.data)
	root.left = insert(root.left,key);
else
	root.right = insert(root.right,key);
return root;
}

void printinsert(int key)
	{
		root =insert(root, key);
	}

void printInOrder(Node node){
	if(node == null)//base condition
		return;
	printInOrder(node.left);//left subtree
System.out.print(node.data+" ");//root
printInOrder(node.right);	//right subtree
}
void inorder(){
	printInOrder(root);//call function
}

Node delete(Node root , int key)
{
	if(root == null)
	{
		return root;
	}
	if(key< root.data){
		root.left = delete(root.left,key);
	}
	else if(key>root.data){
		root.right = delete(root.right,key);
	}
	//case 1 : leaf node deletion
	//case 2 : one child deletion
	else{
		if(root.left ==  null)
			return root.right;
		else if(root.right == null)
			return root.left;
	//case 3 : two children deletion	
	root.data = minvalue(root.right);
	root.right = delete(root.right,root.data);
	}
	return root;
	}
int minvalue(Node root)
	{
		int x = root.data;
		while(root.left != null)
		{
			x = root.left.data;
			root = root.left;
		}
		return x;
	}
	void printdelete(int key)
	{
		root = delete(root, key);
	}
	public static void main(String args[])
	{
		
		BTT t1 = new BTT();
		t1.printinsert(37);
		t1.printinsert(20);
		t1.printinsert(45);
		t1.printinsert(10);
		t1.printinsert(40);
		t1.printinsert(35);
		t1.printinsert(47);
		t1.printinsert(70);
		t1.printinsert(25);
		t1.printinsert(100);
		t1.printinsert(60);
		t1.printinsert(85);
		
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(10);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(70);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();
		
		t1.printdelete(45);
		System.out.println("InOrder:");
		t1.inorder();
		System.out.println();			
	}
}