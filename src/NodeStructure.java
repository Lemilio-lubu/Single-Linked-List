public class NodeStructure {
    private String data;
    private NodeStructure nextNode;

    public NodeStructure(){
        this.data = null;
        this.nextNode = null;
    }
    public NodeStructure(String data){
        this.data = data;
        this.nextNode = null;
    }

    public void setNextNode(NodeStructure head) {
        this.nextNode = head;
    }

    @Override
    public String toString() {
        return "\nNodeStructure {" +
                "data='" + data + '\'' +
                ", \nnextNode=" + nextNode +
                '}';
    }

    public NodeStructure getNextNode() {
        return nextNode;
    }


    public boolean isEqualData(String data) {
        return this.data == data;
    }

    public boolean isEqualNode(NodeStructure nodePrevious) {
        return nodePrevious == nextNode;
    }
}
