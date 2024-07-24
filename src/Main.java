public class Main {
    public static void main (String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(7);
        tree.insert(9);
        tree.insert(11);
        tree.insert(13);
        tree.insert(15);
        System.out.println(tree);

        tree.delete(7);
        System.out.println(tree);

//        System.out.println();
//        System.out.println(tree.getMaxValue());
//        System.out.println(tree.getMinValue());
//        System.out.println();
//
//        tree.traverseInOrder();
//        System.out.println();
//        tree.traversePreOrder();
//        System.out.println();
//        tree.traversePostOrder();
    }
}