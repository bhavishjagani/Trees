public class Main {
    public static void main (String[] args) {
        Tree tree = new Tree();
        tree.insert(3);
        tree.insert(3);
        tree.insert(5);
        tree.insert(1);
        tree.insert(7);
        System.out.println(tree);
    }
}
