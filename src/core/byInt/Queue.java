package core.byInt;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class Queue {

	private java.util.Queue<Integer> priorityQueue = new PriorityQueue<>(new MyComparator());
	private Map<Integer, LinkedList<Object>> map = new HashMap<>();

	public void push(Object object, int priority) {
		Integer integer = new Integer(priority);
		if (!priorityQueue.contains(integer)) {
			priorityQueue.add(integer);
		}
		if (map.get(integer) == null) {
			LinkedList<Object> newList = new LinkedList<>();
			newList.add(object);
			map.put(integer, newList);
			return;
		}
		LinkedList<Object> priorityList = map.get(integer);
		priorityList.add(object);

	}

	public Object pop() {
		Object object = null;
		while (object == null) {
			Integer maxPriority = priorityQueue.peek();
			LinkedList<Object> maxPriorityList = map.get(maxPriority);
			if (maxPriorityList == null) {
				return object;
			} else if (maxPriorityList.isEmpty()) {
				priorityQueue.remove();
				map.remove(maxPriority);
			} else {
				return maxPriorityList.removeFirst();
			}
		}
		return object;
	}

	public java.util.Queue<Integer> getPriorityQueue() {
		return priorityQueue;
	}

	public Map<Integer, LinkedList<Object>> getMap() {
		return map;
	}

}
