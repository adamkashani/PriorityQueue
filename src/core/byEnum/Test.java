package core.byEnum;

public class Test {
	public static void main(String[] args) {

		Queue queue = new Queue();
		Object object = new Object();
//		queue.push(new Object(), Priority.LOW);
//		queue.push(new Object(), Priority.LOW);
//		queue.push(new Object(), Priority.LOW);
//		queue.push(new Object(), Priority.LOW);
//		queue.push(new Object(), Priority.LOW);
//		queue.push(new Object(), Priority.LOW);
		queue.push(new Object(), Priority.HIGH);
		queue.push(new Object(), Priority.HIGH);
		queue.push(new Object(), Priority.HIGH);
		queue.push(new Object(), Priority.MEDIUM);
		queue.push(new Object(), Priority.MEDIUM);
		queue.push(new Object(), Priority.MEDIUM);
		queue.push(new Object(), Priority.HIGH);
		queue.push(new Object(), Priority.HIGH);

//		System.out.println(object);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());

	}
}
