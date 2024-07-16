import java.util.ArrayList;
import java.util.List;
public class Postorder {
    private TreeNode root;
    private List<Integer> output;
    public Postorder(TreeNode root) {
        this.root = root;
        this.output = new ArrayList<>();
    }
    public List<Integer> traverse() {
        postOrder(root);
        return output;
    }
    private void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.getLeft());
        postOrder(node.getRight());
        output.add(node.getValue());
    }
}