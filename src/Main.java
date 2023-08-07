public class Main {
    public static void main(String[] args) {
        SingleLinkedList siglyLinkedList = new SingleLinkedList();
        
        //insert in Singly Linked List
        siglyLinkedList.insertFront("Juan");
        siglyLinkedList.insertFront("Angela");
        siglyLinkedList.insertFront("Paul");
        siglyLinkedList.insertFront("Sebas");

        //System.out.println(siglyLinkedList);
        siglyLinkedList.insertnextNodeGiven(siglyLinkedList.searchNode("Juan"), "Paul");
        siglyLinkedList.insertEnd("Miguel");
        siglyLinkedList.insertEnd("Pedro");
        siglyLinkedList.insertEnd("Emilio");
        System.out.println(siglyLinkedList);

        //search in Singly Linked List
        NodeStructure nodeSearch = siglyLinkedList.searchNode("Miguel");
        //System.out.println(nodeSearch);

        //deletion in Singly Linked List
        siglyLinkedList.deletionFront();
        System.out.println(siglyLinkedList);
        siglyLinkedList.deletionEnd();
        System.out.println(siglyLinkedList);
        siglyLinkedList.deletionNode("Juan");
        System.out.println(siglyLinkedList);

    }
}