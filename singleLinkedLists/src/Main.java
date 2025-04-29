public class Main {
    public static void main(String[] args) {
        LinkedList waitlist = new LinkedList();

        // Adding regular customers
        waitlist.addCustomer("Alice", "Party of 2");
        waitlist.addCustomer("Bob", "Party of 3");

        // Adding VIP customers
        waitlist.addVIPCustomer("VIP Charlie", "Party of 1");
        waitlist.addVIPCustomer("VIP Dave", "Party of 4");

        // Adding another regular customer
        waitlist.addCustomer("Eve", "Party of 2");

        // Displaying the final waitlist
        waitlist.printList();
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to add a regular customer to the end of the list
    void addCustomer(String name, String details) {
        Node newNode = new Node(name, details);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to add a VIP customer at the beginning of the list
    void addVIPCustomer(String name, String details) {
        //Step 1: Create the new node the head
        Node newNode = new Node(name, details);
        //Step 2: Point it to the current head of the list.
        newNode.next = head;
        // Step 3: Update the Head to the New Node
        head = newNode;
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.name + " (" + current.details + ")");
            current = current.next;
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> null");
    }
}


