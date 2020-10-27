/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author Ali
 */
public class BinarySearchTree {

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        B1 b1=new B1();
        
        b1.insert(50);
        b1.insert(30);
        b1.insert(25);
        b1.insert(75);
        b1.insert(82);
        b1.insert(28);
        b1.insert(77);
        System.out.println("Binary Search Tree 1");
        b1.inorder();
        System.out.println();
        
        B2 b2=new B2();
        
        
        b2.insert(50);
        b2.insert(40);
        b2.insert(25);
        b2.insert(75);
        b2.insert(80);
        b2.insert(21);
        b2.insert(37);
        b2.insert(30);
        
        System.out.println("Binary Search Tree 2");
        b2.inorder();
        System.out.println();
        b2.deleteKey(80);
        System.out.println("BST 2 after deleting 80");
        b2.inorder();
        
        
    }
    
    
}
