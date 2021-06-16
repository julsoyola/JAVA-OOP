/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author Juli
 */
public class Dictionary {
  
    //Declare a private static final String to store the file name “words.txt” (i.e. WORDS_FILE)
    private static final String WORDS_FILE = "words.txt";
    //declare a member variable of class Trie (i.e. trie)
    private final Trie trie;
    
    public Dictionary()
    {
        
        Scanner inputFile = null;
        String word;
        
        //try/catch block 
        //since the code is likely to fail we want to put the code in here, just so the file doesnt fail us    
     try
     {
         //Instantiate member variable trie
        this.trie = new Trie();
        
        //Declare a variable of class URL (i.e. url) set equal to 
        URL url = getClass().getResource(WORDS_FILE);
        //Must use this or mac will fail, using URI makes it compatible for mac
        File file = new File(url.toURI());
        
        // Instantiate local variable inputFile passing as an argument to the constructor variable file
        inputFile = new Scanner(file);
        
        if(inputFile == null)
            throw new IOException("Invalid URL specified");
        
        while(inputFile.hasNext())
        {
           word = inputFile.next();
           word = word.trim().toLowerCase();
           //insert the word into the trie, trie.insert(word)
           trie.insert(word);
        }
         System.out.println("Loaded all words into trie");
     }
    //SO the try, tries to do the code and if it fails the catch seg will catch it
    //avoids seg faults
    //Write the catch block to catch exceptions
    //right click-fix imports
    // | ia called a pipe or an OR 
     catch(IOException | URISyntaxException e)
     {
       //Output to the console there was an error reading the file or loading the word(s) into the trie
         System.out.println("Error while loading words into the trie");
         
         throw new RuntimeException(e);
     }
   }
   //Write method search 
    public int search(String word)
    {
       return this.trie.search(word); 
    }
   //Write method prefix
    public boolean prefix(String word)
    {
       return this.trie.prefix(word);
    }
}
