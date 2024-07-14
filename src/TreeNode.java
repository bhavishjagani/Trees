public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private int value;
    public TreeNode(int value) {
        this.value = value;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void insert(int value) {
        if (this.value == value) {
            return;
        }
        if (value < this.value) {
            if (left != null) {
                left.insert(value);
            }
            else {
                left = new TreeNode(value);
            }
        }
        else {
            if (right != null) {
                right.insert(value);
            }
            else {
                right = new TreeNode(value);
            }
        }
    }
}

//Write a method to display/print tree, implement post order, pre order, in order traversal