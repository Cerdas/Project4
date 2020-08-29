
public class Set {

	LinkedNode front;

	public Set() {
		front = null;
	}

	public void add(int x) {
		if (exists(x) == false) {
			LinkedNode temp = new LinkedNode(x);
			temp.setNext(front);
			front = temp;
		}
	}

	public void del(int x) {

		LinkedNode next = front;
		LinkedNode temp = null;

		while (next != null && next.getElement() != x) {
			temp = next;
			next = next.getNext();
		}

		if (next != null) {
			if (temp == null) {
				front = front.getNext();
			} else {
				temp.setNext(next.getNext());
			}
		}
	}

	public boolean exists(int x) {
		LinkedNode temp = front;
		while (temp != null) {
			if (temp.getElement() == x) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public String toString() {
		String s = "";
		LinkedNode temp = front;
		while (temp != null) {
			s += temp.getElement() + " ";
			temp = temp.getNext();
		}
		return s;
	}
}
