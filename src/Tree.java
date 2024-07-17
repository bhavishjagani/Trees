import java.util.ArrayList;
import java.util.List;
public class Tree {
    private TreeNode root;
    private List<Integer> output;
    public Tree() {
        output = new ArrayList<>();
    }
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
            output.add(value);
        }
    }
    public TreeNode getRoot() {
        return root;
    }
    public String toString() {
        return output.toString();
    }
    public int getMaxValue() {
        if (root == null) {
            return -1;
        }
        return root.max();
    }
    public int getMinValue() {
        if (root == null) {
            return -1;
        }
        return root.min();
    }
    public void traverseInOrder() {
        if (root == null) {
            return;
        }
        root.traverseInOrder();
    }
    public void traversePreOrder() {
        if (root == null) {
            return;
        }
        root.traversePreOrder();
    }
    public void traversePostOrder() {
        if (root == null) {
            return;
        }
        root.traversePostOrder();
    }
}