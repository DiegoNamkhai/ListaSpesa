import java.util.Arrays;


public class List<change>{
	
	private Node <change> head;
	private Node <change> tail;
	private int element = 0;
	//private change [] v;
	
	public List() {}
	
	public void insertFromHead(change info) {
		Node<change> n = new Node<change>(info);
		if (head == null) {
			//System.out.println("zeroHead");
			head = n;
			tail = n;
			element ++;
		}
		else {
			//System.out.println("normalHead");
			n.setNext(head);//n link head
			head.setPrev(n);//head link n
			head = n;//new head n
			element ++;
		}
		
	}
	
	public void insertFromTail(change info) {
		Node<change> n = new Node<change>(info);
		if (tail == null) {
			tail = n;
			head = n;
			element ++;
		}
		else {
			tail.setNext(n);//tail link n
			n.setPrev(tail);//n link tail
			tail = n;//new tail n
			element ++;
		}
		
	}
	
	public void insertAtPosition(change info, int index) {
		if( index >= 0 && index<=element ) {
			if (index == element && element>0){
				System.out.println("fromTail");
				this.insertFromTail(info);//check insertFromTail()
				
			}
			else if (index == 0){
				this.insertFromHead(info);//check insertFromHead()
				
			}
			else {
				System.out.println("fromPosition");
				int i = 0;
				Node<change> app = head;
				for (i = 1; i<=index; i++) {
					app = app.getNext();
				}
				Node<change> n = new Node<change>(info);//create new node
				app.getPrev().setNext(n);//prev node link to n
				n.setPrev(app.getPrev());//n link to prev node
				n.setNext(app);//n link to next node
				app.setPrev(n);//next node link to n
				element ++;
			}
		}
		
		else {
			System.out.println("Index out of range");
		}
	}
	
	public Node<change> removeFromHead(){
		if(element > 0 ) {
			Node<change> app = head;//save current head
			head.getNext().setPrev(null);//delink headNext to head
			head = head.getNext();//change head
			element --;//refresh element
			return app;//return previous head
		}
		else {
			System.out.println("No element to remove");
			return null;
		}
	}
	
	public Node<change> removeFromTail(){
		if(element > 0 ) {
			Node<change> app = tail;//save current tail
			tail.getPrev().setNext(null);//delink tailPrev from tail
			tail = tail.getPrev();//change tail
			element --;//refresh element
			return app;//return previous tail
		}
		else {
			System.out.println("No element to remove");
			return null;
		}
	}
	
	public Node<change> removeAtPosition(int index){
		if(element > 0) {
			if (index>element || index<0){
				System.out.println("Index out of range");
				return null;
			}
			else if (index == element-1){
				return this.removeFromTail();//check removeFromTail()
				
			}
			else if (index == 0){
				return this.removeFromHead();//check removeFromHead()
				
			}
			else {
				Node<change> app = head;
				for (int i = 1; i<=index; i++) {
					app = app.getNext();
				}
				app.getPrev().setNext(app.getNext());//link prev to next
				app.getNext().setPrev(app.getPrev());//link prev to next
				element --;//refresh element
				return app;//return remove node
			}
			
			
		}
		else {
			System.out.println("No element to remove");
			return null;
		}
		
		
	}
	
	public boolean contain(change info){
		Node<change> app = head;
		for (int i=0; i<element; i++ ) {
			if(info.equals(app.getInfo())) {
				return true;
			}
			app = app.getNext();
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public <E> E indexOf(change info){
		Node<change> app = head;
		for (int i=0; i<element; i++ ) {
			if(info.equals(app.getInfo())) {
				Integer integer = i;
				return (E) integer;
			}
			app = app.getNext();
		}
		Boolean bool = false;
		return (E) bool;
	}
	
	public boolean remove (change obj) {
		if(this.indexOf(obj) == (Boolean)false) {
			return false;
		}
		else {
			this.removeAtPosition((this.indexOf(obj)));
			return true;
		}
		
	}
	
	public void print() {//only for primitive and semi-primitive
		if (element!=0) {
			Node<change> app = head;
			for (int i = 0; i<element; i++) {
				System.out.println("Node " + i + " " + app.getInfo());
				app = app.getNext();
			}
		}
		else {
			System.out.println("There is nothing to print here");
		}
	}
	
	public change[] allInfo(change [] v) {
		//System.out.println(element);
		if (element != 0) {    
			//Object appt [] = new Object[element];
			//@SuppressWarnings("unchecked")
			//change[] v = (change[]) Array.newInstance(Object.class, element);
			//Vector<change> n = new Vector<change>(element);
			// change[] v = (change[])new Object[element];
			//change [] v = (change[])appt;
			change d [] = null;Arrays.copyOf(v, element);
			//@SuppressWarnings("unchecked")
			//change d [] = (change[])appt;
			if (v.length<element) {
				d = Arrays.copyOf(v, element);
				
			}
			else {
				d = v.clone();
			}
			
			Node<change> app = head;
			for (int i = 0; i<element; i++) {
				//v[i]=app.getInfo();
				//n.add(0, app.getInfo());
				d[i] = app.getInfo();
				app = app.getNext();
				
			}
			//n.toArray(v);
			return d;
		}
		else {
			return null;
		}
		
	}
	
	
	public Node<change>[] allNode() {
		if (element != 0) {
			Object appt [] = new Object[element];
			@SuppressWarnings("unchecked")
			Node<change> [] v = (Node<change>[])appt;
			Node<change> app = head;
			for (int i = 0; i<element; i++) {
				v[i]=app;
				app = app.getNext();
			}
			return v;
		}
		else {
			return null;
		}
		
	}
	
	public int getElement() {
		return element;
	}


}
