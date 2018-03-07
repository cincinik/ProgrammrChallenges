/* package for sum of prime digits in a number
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package sumOfPrimeDigits;

import java.util.Scanner;


public class SumPrimeDigits {

    
    public static int calculate(){
    int sum = 0;
    System.out.println("Please insert integer: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    for (int i=0; i<input.length(); i++){
        if (Character.getNumericValue(input.charAt(i))==2 || Character.getNumericValue(input.charAt(i))==3 || Character.getNumericValue(input.charAt(i))==5 || Character.getNumericValue(input.charAt(i))==7 ){
        sum = sum+Character.getNumericValue(input.charAt(i));
        }
    }
    return sum;
    }
    
    public static void main(String[] args) {
        int a = calculate();
        System.out.println(a);
    }
    
}
