/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */

import java.util.Arrays;

public class Hello {
    public static void main(String[] args){
        int number = 10; //int and float - 4 bytes
        float percentage;
        char vowel = 'a';
        String firstName = "DT";
        
        
        System.out.println("Value of number : " + number);
        
        percentage = 78.6f;
        System.out.println("Value of percentage : " + percentage);
        System.out.println("Vowel : " + vowel);  
        System.out.println("First name : " + firstName);   
        percentage = 10;
        //number = 10.23;
        vowel = 65;
        number = 'A';
        
        System.out.println("Vowel : " + vowel);   
        System.out.println("Value of number : " + number + 1);   
        System.out.println(1 + 2 + "test");
        
        if (number > 10){
            System.out.println("more than 10");
        }
        else if (number == 10){
                    System.out.println("equal to 10");
                    
        }
        
        switch (number - 55) {
            case 10:
                System.out.println("Value = 10");
                break;
            case 20:
                System.out.println("Value = 20");
                break;
            case 30:
                System.out.println("Value = 30"); 
                break;
            default:
                System.out.println("No matching value");
                break;
        }
        
        vowel = 'u';
        switch(vowel){
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }
        
        String province = "Alberta";
        switch (province){
            case "Ontario":
                System.out.println("ON");
                break;
            case "Alberta":
                System.out.println("AB");
                break;
            case "Prince Edward":
                System.out.println("PE");
                break;
            default: 
                System.out.println("Unavailable");
                break;
        }
        
        int numbers[] = new int[5];
        int i;
        
        for(i=0;i<4;i++){
            numbers[i] = 10;
            System.out.println("numbers [" + i + "] = "+numbers[i]);
        }
        
        for(i=0;i<numbers.length;i++){
            numbers[i] = (int)(Math.random()*100);
            System.out.println("numbers [" + i + "] = "+numbers[i]);
        }
        
        double PI_VALUE = Math.PI;
        double power = Math.pow(2, 2);
        Math.sqrt(144);
        Math.abs(PI_VALUE);
        
        float grades[][]=new float [3][4];
        
        for(i=0;i<3;i++){
            for(int j=0;j<4;j++){
                grades[i][j] = 10.0f;
            }
        }
        
        int randomNo;
        int randomArray[] = new int[10];
        for (i=0;i<10;i++){
            randomNo = (int)(Math.random()*100);
            System.out.println("no " + (i+1) + " = " + randomNo);
        }
        
        for (i=0;i<randomArray.length;i++){
            randomNo = (int)(Math.random()*10);
            randomArray[i] = randomNo;
            System.out.println("randomArray" + "[" + i + "]" + " = " + randomArray[i]);
        }
        
        Arrays.sort(randomArray);
        
        
         for (i=0;i<randomArray.length;i++){
           
            System.out.println("randomArray" + "[" + i + "]" + " = " + randomArray[i]);
        }
         
         
         for(int x=1;x<=5;x++){
            for(int y=1;y<=5;y++){
                if(x==1 || x==5 || y==1 || y==5){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}

