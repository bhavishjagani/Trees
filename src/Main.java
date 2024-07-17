public class Main {
    public static void main (String[] args) {
        Tree tree = new Tree();
        tree.insert(3);
        tree.insert(3);
        tree.insert(5);
        tree.insert(1);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);
        tree.insert(123);
        tree.insert(4);
        System.out.println(tree);

        System.out.println();
        System.out.println(tree.getMaxValue());
        System.out.println(tree.getMinValue());
        System.out.println();

        tree.traverseInOrder();
        System.out.println();
        tree.traversePreOrder();
        System.out.println();
        tree.traversePostOrder();
    }
}
