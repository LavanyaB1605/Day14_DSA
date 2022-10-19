public class LlMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(70);
        list.insertFirst(56);
        list.insert(30,1);
        list.display();
        System.out.println("Deleting --> " +list.deleteFirst());
        list.display();

    }
}

