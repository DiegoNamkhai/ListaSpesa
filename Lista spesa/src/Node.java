
public class Node <change>{
	private change info;
	private Node<change> next;
	private Node<change> prev;
	
	public Node(change info) {
		this.setInfo(info);
	}

	public change getInfo() {
		return info;
	}

	public void setInfo(change info) {
		this.info = info;
	}

	public Node<change> getNext() {
		return next;
	}

	public void setNext(Node<change> next) {
		this.next = next;
	}

	public Node<change> getPrev() {
		return prev;
	}

	public void setPrev(Node<change> prev) {
		this.prev = prev;
	}

}
