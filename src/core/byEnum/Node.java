package core.byEnum;

public class Node {
	
	private Node next;
	private Object object;
	
	public Node() {
		super();
	}

	public Node(Object object) {
		super();
		this.object = object;
	}

	public Node(Node next, Object object) {
		super();
		this.next = next;
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}


	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
