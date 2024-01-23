/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemow24tue;

import java.util.Scanner;

/**
 *
 * @author Ronak
 */
public class ArrayDemoW24Tue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String myword = input.nextLine();
        
        char[] myLetters  =new char[myword.length()];
        
        for(int i =0;i<myword.length();i++){
            myLetters[i]=myword.charAt(i);
        }
       /* Ronak
        myLettrs[0]=r
        myLettrs[1]=o  
        myLettrs[2]=n
        myLettrs[3]=a
        myLettrs[4]=k
                myLetrrs.lengh=5*/
        System.out.println("Printingin reverse");
        
        for(int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }//end of for
    }//end of main
    
}//end of class
