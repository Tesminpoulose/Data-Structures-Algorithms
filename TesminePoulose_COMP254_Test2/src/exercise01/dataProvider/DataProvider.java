package exercise01.dataProvider;

import exercise01.tree.LinkedBinaryTree;
import exercise01.tree.Position;

public class DataProvider {
    public static LinkedBinaryTree<String> getLinkedBinaryTree() {
        LinkedBinaryTree<String> lbt = new LinkedBinaryTree<>();

        Position<String> root = lbt.addRoot("T");

        Position<String> xLeft = lbt.addLeft(root, "E");
        Position<String> xRight = lbt.addRight(root, "S");
//        //
        Position<String> twoLeft = lbt.addLeft(xLeft, "M");
        Position<String> minusRight = lbt.addRight(xLeft, "I");
        //
        Position<String> threeLeft = lbt.addLeft(xRight, "N");
        Position<String> bRight = lbt.addRight(xRight, "E");
        //
        Position<String> aLeft = lbt.addLeft(minusRight, "P");
        Position<String> oneRight = lbt.addRight(minusRight, "O");

        return lbt;
    }
}
