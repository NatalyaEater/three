package org.example;

public class PrintTree {

    public static void print(Tree.Node node, String str) {
        if (node != null) {
            System.out.println(str + node.value + " " + node.color);
            print(node.leftChild, str+  " ");
            print(node.rightChild,str+  " ");
        }
    }
}
