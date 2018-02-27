/* nameSearch
 * Version 1.0
 * © 2018 Lori, Inc. All rights reserved.
 */
package nameSearch;

import java.util.Scanner;

/**Class NameSearch1 - tests if an input word is in a given array
 * @author Lori
 * @version 1.0 February 2018
 */
public class NameSearch1 {

 	public static String names[]={"harry","michael","will","tom","jackie"};    
        public static String surnames[]={"potter","jackson","smith","cruise","chan"};    
        
        public static void main(String a[]) throws Exception {
        
            Scanner sc=new Scanner(System.in);
            String name;   
            Boolean found=false;
      
            System.out.println("Enter the name:");
            name=sc.next();
         
            for (int i=0;i<=4;i++){
                if (names[i].equals(name)){
                    found = true;
                    System.out.println("Full name of the celebraty is:");
                    System.out.println(names[i] + " " + surnames[i]);}
                else found=false;
            }
          
        }
}
