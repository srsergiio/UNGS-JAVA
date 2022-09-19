package C14_Lista_Enlazadas;


public class IntList {
    int length;
    Node head;

    public IntList () {
	length = 0;
	head = null;
    }

    public static Node removeSecond (Node list) {
        Node first = list;
        Node second = list.next;

        // make the first node refer to the third
        first.next = second.next;

        // separate the second node from the rest of the list
        second.next = null;
        return second;
    }

    // print: print the list
    public void print () {
	Node node;

	System.out.print ("(");

	// start at the beginning of the list
	node = head;

	// traverse the list, printing each element
	while (node != null) {
	    System.out.print (node.cargo);
	    node = node.next;
	    if (node != null) {
		System.out.print (", ");
	    }
	}
	
	System.out.println (")");
    }

    public void printBackward () {
	System.out.print ("(");

	if (head != null) {
	    Node tail = head.next;
	    Node.printBackward (tail);
	    System.out.print (head);
	}
	System.out.println (")");
    }	

    public static void main (String[] args) {

	// note: the following is a really bad way to build a list.
	// warning signs of badness: allocating two different kinds
	// of objects, accessing the instance variables of another class,
	// using the constant 3 to set the length

	// create an empty list
	IntList list = new IntList ();

	// create three new nodes, unlinked
	Node node1 = new Node ();
	node1.cargo = 1;

	Node node2 = new Node ();
	node2.cargo = 2;

	Node node3 = new Node ();
	node3.cargo = 3;

	// next up the nodes
	node1.next = node2;
	node2.next = node3;
	node3.next = null;

	list.head = node1;
	list.length = 3;

	list.print ();
	list.printBackward ();
    }
}

class Node {
    int cargo;
    Node next;

    // default constructor
    public Node () {
	cargo = 0;
	next = null;
    }
    
    public static void list() {
    int length=0;
    Node Padre = null;

    }
    
    public static void Add(int cargo) {
    	Node node = new Node();
    	
    }
    // other constructor
    public Node (int cargo, Node next) {
	this.cargo = cargo;
	this.next = next;
    }

    public String toString () {
	return cargo + "";
    }

    public static void printBackward (Node list) {
        if (list == null) return;

        Node head = list;
        Node tail = list.next;

        printBackward (tail);
        System.out.print (head + ", ");
    }    
}

// This program is part of "How to think like a computer scientist,"
// by Allen B. Downey, which is available from thinkAPjava.com

// This program is licensed under the GNU Free Software License,
// the terms of which are available from www.gnu.org
