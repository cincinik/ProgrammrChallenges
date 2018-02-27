/* package for prime number validation
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package primeNumber;

import java.util.Scanner;

/**Class PrimeNumber - tests if an input number is prime o not
 * @author Lori
 * @version 1.0 February 2018
 */
public class PrimeNumber {
    
    public static Scanner scanner = new Scanner(System.in);
    public static int y;
    public static int i = 2;
    
    public static void main(String[] args) {
    System.out.println("Insert number: ");   
    y = scanner.nextInt();
    // while loop to divide the number to all its predecesors
    while(i<y){
        if (y%i==0){
            System.out.println("Not prime");
            break;
            }
        else i++;
    }
    // if i reaches same value as y, it means it didn't find any divisor
    if (i==y) System.out.println("Prime");
    
    }
    
}
