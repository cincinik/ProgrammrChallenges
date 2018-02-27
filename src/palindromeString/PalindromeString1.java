/* PalindromeString
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package palindromeString;

import java.util.Scanner;

/**Class PalindromeString1 - tests if an input word is palindrome or not
 * @author Lori
 * @version 1.0 February 2018
 */
public class PalindromeString1 {

    Scanner scanner = new Scanner(System.in);
    
    String s = scanner.next();
    char[]pali = s.toCharArray();
    char[]reverse = new char[s.length()];
    
    public void populateReverse(){
        for (int i=0; i<=reverse.length-1; i++ ){
            reverse[i]= pali[s.length()-1-i];
        }
    }
    
    public void check(){
        Boolean same = false;
        for (int i=0; i<=reverse.length-1; i++){
            if (pali[i]==reverse[i]) {same=true;}
            else {
                System.out.println("not a palindrome");
                break;
            }
        }
        if(same==true){
        System.out.println("palindrome");}
    }
    
    
    public static void main(String[] args) {
        System.out.println("Please insert string: ");
        PalindromeString1 checkString = new PalindromeString1();
        checkString.populateReverse();
        checkString.check();
        
    }
    
}
