package graphtins;

public class Vertex {

    Node nodeA;
    Node nodeB;

    Vertex(Node nodeA, Node nodeB){
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    @Override
    public String toString() {
        return nodeA.usuario + " <-- " + " --> " + nodeB.usuario;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public void setNodeA(Node nodeA) {
        this.nodeA = nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public void setNodeB(Node nodeB) {
        this.nodeB = nodeB;
    }
}
