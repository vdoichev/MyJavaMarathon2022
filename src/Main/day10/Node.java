package Main.day10;

public class Node {
    private final int value;
    private final int level;
    private Node leftNode;
    private Node rightNode;

    public Node(int value, int level) {
        this.value = value;
        this.level = level;
    }

    @Override
    public String toString() {
        String levelStr = "";
        for (int i = 0; i < level; i++) {
            levelStr += "   ";
        }
        String leftNodeStr = (leftNode != null) ? levelStr + "leftNode=\n" + leftNode + "\n" : "";
        String rightNodeStr = (rightNode != null) ? levelStr + "rightNode=\n" + rightNode + "\n" : "";
        return levelStr + "Node { " +
                "value=" + value + ",\n" +
                leftNodeStr +
                rightNodeStr +
                levelStr + '}';
    }

    public static void addNode(int value, Node root, int level) {
        if (value < root.value) {
            if (root.leftNode == null) {
                root.leftNode = new Node(value, level);
            } else {
                addNode(value, root.leftNode, ++level);
            }
        } else {
            if (root.rightNode == null) {
                root.rightNode = new Node(value, level);
            } else {
                addNode(value, root.rightNode, ++level);
            }
        }
    }

    public static void getSortNode(Node root) {
        if (root.leftNode != null) {
            getSortNode(root.leftNode);
        }
        System.out.print(root.value + " ");
        if (root.rightNode != null) {
            getSortNode(root.rightNode);
        }
    }
}
