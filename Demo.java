class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class Demo{
	public static void main(String args[]){
		Node n1=new Node(100);
		n1.next=new Node(200);
		n1.next.next=new Node(300);
		n1.next.next.next=n1;
	}
}
