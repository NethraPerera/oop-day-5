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
		n1.next.next.next=new Node(400);
		n1.next.next.next.next=new Node(500);
		
		//prints data- [100, 200, 300, 400, 500] using a while loop
		System.out.print("[");
		while (n1!= null){
			System.out.print(n1.data+",");
			n1=n1.next;
		}
		System.out.print("\b]");
		/*
		System.out.print("[");
		Node temp=n1;
		while (temp!= null){
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.print("\b]");
		*/
	}
}
