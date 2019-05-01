package core.byInt;

public class Test {

	public static void main(String[] args) {

		Queue queue = new Queue();

		Object object1 = new Object();
		Object object2 = new Object();
		Object object3 = new Object();
		Object object4 = new Object();
		Object object5 = new Object();
		Object object6 = new Object();

		queue.push(object1, 10);
		queue.push(object2, 1);
		queue.push(object3, 2);
		queue.push(object4, 5);
		queue.push(object5, 8);
		queue.push(object6, 5);
		queue.push(object6, 5);
		queue.push(object6, 5);
		queue.push(object6, 5);
		queue.push(object6, 5);

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
		System.out.println(queue.pop());

		System.out.println(queue.getMap().get(10));
		System.out.println(queue.getMap().get(5));
	}
}
