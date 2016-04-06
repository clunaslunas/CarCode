
package arithmetic;
public class Arithmetic {

    public static void main(String[] args) {
        int strngSize;
        char letter; 
        String name;
        String capName;
        String upperCase ;
        upperCase = "night";
        String upCase = upperCase.toUpperCase();
        name = "Bob";
        capName = "CARLOS";
        String lowCaps;
        lowCaps = capName.toLowerCase();
        strngSize = name.length();
        letter = name.charAt(2);
        double x;
        double y; 
        x = 9;
        y = 10; 
        x += 7;
        System.out.println(upCase);
        System.out.println(lowCaps + " " + capName);
        System.out.println(letter);
        System.out.println(name);
        System.out.println("The number of letters in the name Bob is " + strngSize);
        System.out.println("current value of x is " + x);
        y -= x;
        System.out.println("So y minus new value x " + x + " equals " + y );
        x /= y;
        System.out.println(Math.round(x) + " rounded up");
    }
    
}
