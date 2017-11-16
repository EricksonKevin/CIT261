/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrlpttrn;

import java.util.Scanner;

/**
 *
 * @author cowcutta
 */
public class AppContrlPttrn {

    
    public static void main(String[] args) {
        // TODO code application logic here
        calcController deligate = new calcController();
        
        //list of variables 
        
        String subtract = "subtract";
        String add = "add";               
        String divide = "divide";
        String multiply = "multiply";
        Integer firstNumber = -1;
        Integer secondNumber = 1;
        
        String command;
        
        
        Scanner myScanner = new Scanner(System.in);              
        System.out.print("Enter an integer:");  
        
        
        firstNumber = Integer.parseInt(myScanner.nextLine());        
        System.out.print("Enter a math command: (+, *, -, /):"); 
        
        
        command = myScanner.nextLine();
        
        
        System.out.print("Enter another integer: ");        
        secondNumber = Integer.parseInt(myScanner.nextLine());
        
        // prints equation with answer calculated
        System.out.print(firstNumber + " " + command + " " + secondNumber + " = ");
        deligate.handleCommand(command, firstNumber, secondNumber);
    }
        
    }
    

