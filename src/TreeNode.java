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
    public int max() {
        if (right == null) {
            return value;
        }
        return right.max();
    }
    public int min() {
        if (left == null) {
            return value;
        }
        return left.min();
    }
    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(value + ", ");
        if (right != null) {
            right.traverseInOrder();
        }
    }
    public void traversePreOrder() {
        System.out.print(value + ", ");
        if (left != null) {
            left.traversePreOrder();
        }
        if (right != null) {
            right.traversePreOrder();
        }
    }
    public void traversePostOrder() {
        if (left != null) {
            left.traversePostOrder();
        }
        if (right != null) {
            right.traversePostOrder();
        }
        System.out.print(value + ", ");
    }

}

//Write a method to search, then delete