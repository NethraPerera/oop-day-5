class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class Stack{
	private Node top;
	public void push(int data){
		if (top==null){
			top=new Node(data);
		}else{
			Node temp=new Node(data);
			temp.next=top;
			top=temp;
		}	
	}
	public void pop(){
		if (top!=null){
			top=top.next;
		}	
	}
	public void printStack(){
		System.out.print("[");
		Node temp=top;
		while(temp!=null){
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.print("\b]\n\n");
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		s1.printStack(); //[500, 400, 300, 200, 100]
		
		s1.pop();
		s1.printStack(); //[400, 300, 200, 100]
	}
}
