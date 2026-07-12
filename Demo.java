class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class Demo{
	public static void printData(Node node){
		System.out.print("[");
		while(node!=null){
			System.out.print(node.data+", ");
			node=node.next;
		}
		System.out.println("\b\b]");
	}
	public static void main(String args[]){
		Node top=null;
		
		Node n1=new Node(100);
		n1.next=top;
		top=n1;
		printData(top); //[100]
		
		n1=new Node(200);
		n1.next=top;
		top=n1;
		printData(top); //[200,100]
		
		n1=new Node(300);
		n1.next=top;
		top=n1;
		printData(top); //[300,200,100]
		
		n1=new Node(400);
		n1.next=top;
		top=n1;
		printData(top); //[400,300,200,100]

		n1=new Node(500);
		n1.next=top;
		top=n1;
		printData(top); //[500,400,300,200,100]
		
		//Insert codes here to remove the first(top) element 
		if (top!=null){
			top=top.next;
		}
		
		printData(top); //[400,300,200,100]
	}
}
