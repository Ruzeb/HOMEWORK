public class MyStack<E> {
	

	private Node<E> top;
	
	public MyStack(){
		top = null;
	}
	
	public boolean isEmpty(){
		if (top == null){
			return true;
		}
		else
			return false;
	}
	
	public Node<E> peek(){
		return top;
	}
	
	public void push(E item){
		Node<E> temp = new Node<E>(item);
		temp.setNext(top);
		top = temp;		
	}
	
	public Node<E> pop()throws Exception{
		if (isEmpty()){
			throw new Exception("Stack is Empty");
		}
		else{
			Node<E> temp = top;
			top = top.getNext();
			return temp;
		}
	}
	
	public int search(Object o){
		int counter = 1;
		Node<E> trav = top;
		if (trav == o){
			return counter;
		}
		while (trav != o){
			counter++;
			trav = trav.getNext();
			if (trav == o){
				return counter;
			}
		}
		return -1;
	}

}
