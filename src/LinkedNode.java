
public class LinkedNode {
	int x;
	LinkedNode next;

	public LinkedNode() {
		next = null;
	}

	public LinkedNode(int num) {
		next = null;
		x = num;
	}

	public LinkedNode getNext() {
		return next;
	}

	public void setNext(LinkedNode node) {
		next = node;
	}

	public int getElement() {
		return x;
	}

	public void setElement(int elem) {
		x = elem;
	}
}
