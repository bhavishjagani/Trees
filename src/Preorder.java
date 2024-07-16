import java.util.ArrayList;
import java.util.List;
public class Preorder {
    private TreeNode root;
    private List<Integer> output;
    public Preorder(TreeNode root) {
        this.root = root;
        this.output = new ArrayList<>();
    }
    public String toString() {
        preOrder(root);
        return output.toString();
    }

    private void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        output.add(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
}
