/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instructor;

/**
 *
 * @author Carlos Luna
 */

public class TextBook {
    private String title; 
    private String author; 
    private String publisher; 
    
    public TextBook(String textTitle, String auth, String pub){
        this.title = textTitle; 
        this.author = auth; 
        this.publisher = pub; 
        
    }
    public TextBook (TextBook obj){
        title = obj.title; 
        author = obj.author; 
        publisher = obj.publisher;
    }
    public void set(String textTitle, String auth, String pub){
        title = textTitle; 
        author = auth; 
        publisher = pub; 
    }
    @Override
    public String toString(){
        String book = "Title : " + title + "\n Author: " + author 
                + " \n publisher: " + publisher; 
        return book; 
    }
}
