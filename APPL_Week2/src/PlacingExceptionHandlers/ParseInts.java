package PlacingExceptionHandlers;

// ****************************************************************
// ParseInts.java
// @author DZAKIRA
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts{
    public static void main(String[] args){
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        
        /*Modify 1 (false)*/
        /*try statement that encompasses the entire while loop.*/
//        try {
//            while (scanLine.hasNext()){
//                val = Integer.parseInt(scanLine.next());
//                sum += val;
//            }
//        } catch (NumberFormatException e1) {
//        }
        
        /*Modify 2 (true)*/
        /*the try and catch inside the loop*/
        while (scanLine.hasNext()){
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e1) {
            }
                
         }
        
        System.out.println("The sum of the integers on this line is " + sum);
    }
}

