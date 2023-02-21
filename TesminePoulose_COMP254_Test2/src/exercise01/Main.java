package exercise01;

import exercise01.dataProvider.DataProvider;
import exercise01.tree.LinkedBinaryTree;
import exercise01.tree.TraversalExamples;

public class Main {
    public static void main(String []args){
        LinkedBinaryTree<String> tree = DataProvider.getLinkedBinaryTree();
        // Print Binary Tree
        TraversalExamples.parenthesize(tree, tree.root());
        System.out.println("");
        System.out.println("Total Pathlength of the tree: " + tree.pathLength());
    }
}
