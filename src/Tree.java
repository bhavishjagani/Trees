import java.util.ArrayList;
import java.util.List;
public class Tree {
    private TreeNode root;
    private List<Integer> output;
    public Tree() {
        output = new ArrayList<>();
        this.root = null;
    }
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
        output.add(value);
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
    public TreeNode search(int value) {
        TreeNode current = root;
        while (current != null) {
            if (value == current.getValue()) {
                return current;
            } else if (value < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }
    public void delete(int value) {
        root = _delete(root, value);
        output.remove(Integer.valueOf(value));
    }
    private TreeNode _delete(TreeNode node, int value) {
        if (node == null) {
            return null;
        }

        if (value < node.getValue()) {
            node.setLeft(_delete(node.getLeft(), value));
        }
        else if (value > node.getValue()) {
            node.setRight(_delete(node.getRight(), value));
        }
        else {
            // Node with only one child or no child
            if (node.getLeft() == null) {
                return node.getRight();
            }
            else if (node.getRight() == null) {
                return node.getLeft();
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.setValue(node.getRight().min());

            // Delete the smallest node in the right subtree
            node.setRight(_delete(node.getRight(), node.getValue()));
        }
        return node;
    }
}