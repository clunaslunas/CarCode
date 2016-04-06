/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instructor;
import java.util.*; 
/**
 *
 * @author Carlos Luna
 */
public class CourseDemo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first, last, office;
        System.out.println("Instructor first name? ");
        first = s.next();
        System.out.println("Instructor last name? ");
        last = s.next();
        System.out.println("Instructor office: ");
        office = s.next();
        Instructor myInstructor = new Instructor(first, last, office);
        TextBook textBook = new TextBook("Intro to java","Gaddis ",
                "Addison-Wesley");
        Course myCourse = new Course("Intro to java", myInstructor, textBook);
        System.out.println(myCourse);
    }
}
