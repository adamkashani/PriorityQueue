package core.byEnum;

public class Queue {

	private Node highHead;
	private Node mediumHead;
	private Node lowHead;
	private Node highLast;
	private Node mediumLast;
	private Node lowLast;

	public void push(Object object, Priority priority) {

		switch (priority) {
		case HIGH:
			if (highHead == null) {
				highHead = new Node(object);
				return;
			} else if (highHead.getNext() == null) {
				highLast = new Node(object);
				highHead.setNext(highLast);
			} else {
				highLast.setNext(new Node(object));
				highLast = highLast.getNext();
			}
			return;
		case MEDIUM:
			if (mediumHead == null) {
				mediumHead = new Node(object);
			} else if (mediumHead.getNext() == null) {
				mediumLast = new Node(object);
				mediumHead.setNext(mediumLast);
			} else {
				mediumLast.setNext(new Node(object));
				mediumLast = mediumLast.getNext();
			}
			return;
		case LOW:
			if (lowHead == null) {
				lowHead = new Node(object);
			} else if (lowHead.getNext() == null) {
				lowLast = new Node(object);
				lowHead.setNext(lowLast);
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
		if (highHead != null) {
			temp = highHead;
			highHead = highHead.getNext();
		} else if (mediumHead != null) {
			temp = mediumHead;
			mediumHead = mediumHead.getNext();
		} else if (lowHead != null) {
			temp = lowHead;
			lowHead = lowHead.getNext();
		}

		if (temp != null) {
			return temp.getObject();
		}
		return null;
	}
}
