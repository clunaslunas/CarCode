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
public class Course {
    private String courseName; 
    private Instructor instructor; 
    private TextBook textBook; 
    
    public Course(String name, Instructor instr, TextBook text){
        this.courseName = name; 
        instructor = new Instructor(instr);
        textBook = new TextBook(text);        
    }
    public String getName(){
        return courseName; 
    }
    public Instructor getInstructor(){
        return new Instructor(instructor);
    }
    public TextBook getText(){
        return new TextBook(textBook);
    }
    @Override
    public String toString(){
        String cour = "The course name: " + courseName + "\n Instructor: " + 
                        instructor + "\n required text: " + textBook; 
        return cour;
    }
    
    
}



