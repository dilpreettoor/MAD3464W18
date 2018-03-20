
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 728636
 */
public class TestScanner {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("Enter value of number: ");
        int n1 = Integer.parseInt (input.nextLine());
        
        System.out.println("Enter value of percentage: ");
        float per = Float.parseFloat(input.nextLine());
        
        System.out.println("Enter name: ");
        String name = input.nextLine();
        

        
        System.out.println(" number : " + n1 + " per : "  + per + " name : " + name );
        
    }
}
