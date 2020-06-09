package com.fyodorov.lesson32;
/**
 * Класс {@code BinaryTreeLeafCount} Программа для подсчета листовых узлов в двоичном дереве в Java.
 * @author Alexandr Fyodorov
 */
public class BinaryTreeLeafCount {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
        }
    }

// Получить количество листовых узлов в двоичном дереве
    public static int getLeafCountOfBinaryTree(TreeNode node) {
        if(node == null)
            return 0;
        if(node.left == null && node.right == null)
            return 1;
        else
            return getLeafCountOfBinaryTree(node.left) + getLeafCountOfBinaryTree(node.right);
    }

    public static void main(String[] args) {

// Создание бинарного дерева
        TreeNode rootNode = createBinaryTree();
        System.out.println("Количество листовых узлов в двоичном дереве: "+getLeafCountOfBinaryTree(rootNode));
    }

    public static TreeNode createBinaryTree(){

        TreeNode rootNode = new TreeNode(40);
        TreeNode node20 = new TreeNode(20);
        TreeNode node10 = new TreeNode(10);
        TreeNode node30 = new TreeNode(30);
        TreeNode node60 = new TreeNode(60);
        TreeNode node50 = new TreeNode(50);
        TreeNode node70 = new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left = node10;
        node20.right = node30;

        node60.left = node50;
        node60.right = node70;

        return rootNode;
    }
}
