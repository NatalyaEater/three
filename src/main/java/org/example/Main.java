package org.example;
/*Необходимо превратить собранное
на семинаре дерево поиска в полноценное левостороннее красно-черное дерево.
И реализовать в нем метод добавления новых элементов с балансировкой.*/
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(10);
        tree.add(8);
        tree.add(11);
        tree.add(22);
        tree.add(100);
        tree.add(55);
        tree.add(44);
        tree.add(2);
        tree.add(79);
        PrintTree.print(tree.getRoot(), " ");
    }
}