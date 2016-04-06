/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numtok;
import java.util.StringTokenizer;
/**
 *
 * @author Carlos Luna
 */
public class NumTok {
    private String num1, num2, num3; 
    public NumTok(String nums){
        StringTokenizer strTok = new StringTokenizer(nums, " -  .");
        num1 = strTok.nextToken();
        num2 = strTok.nextToken();
        num3 = strTok.nextToken();
    }
    public double getNum1(){
        double number1; 
        number1 = Double.parseDouble(num1);
        return number1; 
    }
    public double getNum2(){
        double number2;
        number2 = Double.parseDouble(num2);
        return number2;
    }
    public double getNum3(){
        double number3;
        number3 = Double.parseDouble(num3);
        return number3; 
    }
    public double getAvg(){
        double average;
        average = (getNum1() + getNum2() + getNum3())/3;
        return average;
    }
}
