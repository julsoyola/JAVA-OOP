/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scraggle;

import dictionary.Dictionary;

/**
 *
 * @author Juli
 */
public class Scraggle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and instantiate a local variable of data type
        Dictionary dictionary = new Dictionary();
        
        //Output to the console the result of searching for the following word in the trie:
        System.out.println("Word Search...");
        System.out.println(dictionary.search("mask"));
        System.out.println(dictionary.search("silhouette"));
        System.out.println(dictionary.search("horse"));
        
        //Output to the console the result of searching for the following prefix in the trie:
        System.out.println("prefix search...");
        System.out.println(dictionary.prefix("silhou"));
        System.out.println(dictionary.prefix("bir"));
    }
    
}
