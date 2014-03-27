public class MyLinkedList<T>{

    private Node<T> head;
    private int length;


    public MyLinkedList(){
    	head = null;
    	
    }

    public void add(T s, int position) throws Exception{
	if (position < 0 || position > this.length()){
	    throw new IndexOutOfBoundsException
		("Index " + position + " is out of Bounds");
	}
	Node<T> insert = new Node<T>(s);
	if (position == 0){
	    insert.setNext(head);
	    head = insert;
	}
	else if (position == this.length()){
	    Node<T> before = getNode(position -1 );
	    before.setNext(insert);
	}
	else{
	    Node<T> after = getNode(position);
	    Node<T> before = getNode(position -1 );
	    before.setNext(insert);
	    insert.setNext(after);
	}
		length++;
    }

    public Node<T> getNode(int position){
    	Node<T> trav = head;
		while (position != 0){
		    trav = trav.getNext();
		    position--;
		}
		return trav;
    }
    
    public T get(int position){
		
    	return getNode(position).getData();
    }

    public void set(int position, T newString){
    	this.getNode(position).setData(newString);
    	
    }

    public void remove(int position) throws Exception{
    	if (position < 0 || position > this.length()){
    	    throw new IndexOutOfBoundsException
    		("Index " + position + " is out of Bounds");
    	}
    	if (position == 0){
    		if (head == null){
    			throw new Exception("Removing from Empty List");
    		}
    		head = getNode(position+1);
    	}
    	else if (position == this.length()){
    		getNode(position-1).setNext(null);
    	}
    	else{
		    Node<T> after = getNode(position+1);
		    Node<T> before = getNode(position -1 );
		    before.setNext(after);
        }
    	
    	length--;
    }

    public int find(T s){
		Node<T> trav = head;
		int counter = 0;
		if (trav.getData() == s){
			return counter;
		}
		while (trav.getData() != s){
			counter++;
			trav = trav.getNext();
			if (trav.getData() == s){
				return counter;
			}
		}
		return -1;	
    }

    public int length(){
		/*int counter = 0;
		Node trav = head;
		while (trav != null){
		    counter++;
		    trav = trav.getNext();
		}
		return counter;
		*/
    	return length;
    }

    public String toString(){
    	Node<T> trav = head;
    	int size = this.length();
    	String ret = "[ ";
		while (size > 0){
			ret = ret + trav + " , ";
			
		    trav = trav.getNext();
		    size--;
		}
		ret = ret.substring(0,ret.length() - 3);
    	ret += " ]";
    	return ret;
    }
}


