public class SingleLinkedList extends LinkedListMain {
    private NodeStructure head;

    public SingleLinkedList() {
        super();
        this.head = null;
    }

    public void insertFront(String data) {
        if (head == null) {
            head = new NodeStructure(data);
            return;
        }
        NodeStructure auxHeadNode = new NodeStructure(data);
        auxHeadNode.setNextNode(head);
        head = auxHeadNode;
    }

    public void insertEnd(String data) {
        head = insertEndRecursive(head, data);
    }

    private NodeStructure insertEndRecursive(NodeStructure node, String data) {
        if (node == null) {
            return new NodeStructure(data);
        }

        node.setNextNode(insertEndRecursive(node.getNextNode(), data));
        return node;
    }

    @Override
    public String toString() {
        return "LinkedListMain{" +
                "head=" + head +
                '}';
    }

    public NodeStructure searchNode(String data) {
        if (data == null) {
            System.out.println("No found data");
            return null;
        }
        return searchNodeRecursive(head, data);
    }

    private NodeStructure searchNodeRecursive(NodeStructure node, String data) {
        if (node == null) {
            return null;
        }
        if (node.isEqualData(data)) {
            System.out.println("Found it");
            return node;
        }
        return searchNodeRecursive(node.getNextNode(), data);
    }

    public void insertnextNodeGiven(NodeStructure nodePrevious, String data) {
        insertnextNodeGivenRecursive(nodePrevious, data, head);
    }

    private void insertnextNodeGivenRecursive(NodeStructure nodePrevious, String data, NodeStructure currentNode) {
        //control if node have not in the linked lits
        if (currentNode == null) {
            System.out.println("Above node does not exit");
            return;
        }

        if (currentNode.isEqualNode(nodePrevious)) {
            NodeStructure auxNode = new NodeStructure(data);
            auxNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(auxNode);
            return;
        }
        insertnextNodeGivenRecursive(nodePrevious, data, currentNode.getNextNode());
    }

    public void deletionFront() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        head = head.getNextNode();
    }

    /*
     Note: Using an auxiliary node helps us manipulate the current node
     while keeping a reference to the main node. This ensures we don't
     lose track of the head of the linked list and makes it easier to
     traverse and modify the linked list. Both the auxiliary node and
     the main node point to the same object in memory, so changes in one
     are reflected in the other.
     */
    public void deletionEnd() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        if (head.getNextNode() == null) {
            head = null;
        }
        NodeStructure auxNode = head;
        while (auxNode.getNextNode().getNextNode() != null) {
            auxNode = auxNode.getNextNode();
        }
        auxNode.setNextNode(null);
    }

    public void deletionNode(String data) {
        NodeStructure auxNode = head;
        if (auxNode == null) {
            System.out.println("Empty linkedList");
            return;
        }
        if (auxNode.isEqualData(data)) {
            deletionFront();
            return;
        }
        while (!auxNode.getNextNode().isEqualData(data) && auxNode.getNextNode() != null) {
            auxNode = auxNode.getNextNode();
        }
        if (auxNode.getNextNode() != null) {
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
            return;
        }
        System.out.println("Not found data");
    }
}
