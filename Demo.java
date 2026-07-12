class Arrays{
	
	Arrays(){}
	
	public static String toString(int ar[]){
		String array="[";
		for (int i = 0; i < ar.length; i++){
			array+=ar[i]+",";
		}
		array+="\b]";
		return array;
	}
}

class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class Stack{
	private Node top;
	public void push(int data){
		Node n1=new Node(data);
		n1.next=top;
		top=n1;
		
	}
	public void pop(){
		if(top!=null){
			top=top.next;
		}
	}
	public void printStack(){
		System.out.print("[");
		Node temp=top;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(top==null? "Empty]":"\b\b]");
	}
	public int size(){
		int count=0;
		Node temp=top;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	} 
	public boolean isEmpty(){
		return top==null;
	}
	public void clear(){
		top=null;
	}
	public int search(int data){
		int index=0;
		Node temp=top;
		while (	temp!=null){
			if (temp.data==data)
			{
				return index;
			}else{
				index++;
				temp=temp.next;
			}
		}
		return -1;
	}
	public int[] toArray(){
		int [] ar=new int[size()];
		Node temp=top;
		for (int i = 0; i < ar.length; i++){
			ar[i]=temp.data;
			temp=temp.next;
		}
		return ar;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack();
		s1.printStack();//[empty]
		System.out.println("Size of the stack : "+s1.size()); //0
		System.out.println("Stack is empty    : "+s1.isEmpty()+"\n");//true
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		s1.printStack(); //[500, 400, 300, 200, 100]
		System.out.println("Size of the stack : "+s1.size()); //5
		System.out.println("Stack is empty    : "+s1.isEmpty()+"\n");//false
		
		System.out.println("Index of 200 : "+s1.search(200)); //3
		
		System.out.println("Index of 600 : "+s1.search(600)); //-1

		
		int[] dataArray=s1.toArray();
		System.out.println(Arrays.toString(dataArray));//[500, 400, 300, 200, 100]

	}
}
