package core.byEnum;

public class Queue {

	private Node high;
	private Node medium;
	private Node low;
	private Node highLast;
	private Node mediumLast;
	private Node lowLast;

	public void push(Object object, Priority priority) {

		switch (priority) {
		case HIGH:
			System.out.println("from HIGH");
			if (high == null) {
				high = new Node(object);
				return;
			} else if (high.getNext() == null) {
				highLast = new Node(object);
				high.setNext(highLast);
			} else {
				highLast.setNext(new Node(object));
				highLast = highLast.getNext();
			}
			return;
		case MEDIUM:
			System.out.println("from MEDIUM");
			if (medium == null) {
				medium = new Node(object);
			} else if (medium.getNext() == null) {
				mediumLast = new Node(object);
				medium.setNext(mediumLast);
			} else {
				mediumLast.setNext(new Node(object));
				mediumLast = mediumLast.getNext();
			}
			return;
		case LOW:
			System.out.println("from LOW");
			if (low == null) {
				low = new Node(object);
			} else if (low.getNext() == null) {
				lowLast = new Node(object);
				low.setNext(lowLast);
			} else {
				lowLast.setNext(new Node(object));
				lowLast = lowLast.getNext();
			}
			return;
		default:
			break;
		}
	}

	public Object pop() {
		Node temp = null;
		if (high != null) {
			temp = high;
			high = high.getNext();
		} else if (medium != null) {
			temp = medium;
			medium = medium.getNext();
		} else if (low != null) {
			temp = low;
			low = low.getNext();
		}

		if (temp != null) {
			return temp.getObject();
		}
		return null;
	}
}
