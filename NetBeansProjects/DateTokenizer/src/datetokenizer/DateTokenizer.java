/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetokenizer;
import java.util.StringTokenizer;
/**
 *
 * @author Carlos Luna
 */
public class DateTokenizer {

    /**
     * @param args the command line arguments
     */
    /**
     * DateCopmonenet class extracts the month day and year from a 
     * string containing a date~~~~
     */
    private String month;
    private String day;
    private String year;
    /**
     * Constructor accepts a string containing a date in the form Month/Day/year
     * @param dateStr
     */
    public DateTokenizer (String dateStr){
        StringTokenizer strTok = new StringTokenizer(dateStr, "/");
        month = strTok.nextToken();
        day = strTok.nextToken();
        year = strTok.nextToken();
    }
    public String getMonth(){
        return month;
    }
    public String getDay(){
        return day;
    }
    public String getYear(){
        return year; 
    }
    
}

