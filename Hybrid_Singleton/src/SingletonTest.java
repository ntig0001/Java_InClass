/* Name: Elysé Ntigirishari
 * Student ID: 040924425
 * Course & Section: CST8132_300
 * Assignment: Hybrid 9
 * Date: April 14, 2019
 */


/** This is a test unit class for the Singleton implementation
  * @author Elysé Ntigirishari
  */
public class SingletonTest{
  public static void main (String [] args){
   Singleton s1, s2, s3;
   s1 = Singleton.getSingleton();
   System.out.println("s1 is a reference to "+ s1);
   s2 = Singleton.getSingleton();
   System.out.println("s2 is a reference to "+ s2);
   s3 = Singleton.getSingleton();
   System.out.println("s3 is a reference to "+ s3);
   /* use operator == to compare objects.For non-Singleton classe the result will be false.
      comparing references produces true only and only the objects ocupy the same memory space
   */
   if(s1 == s2 && s1 == s3)
     System.out.println("\nThe references s1, s1 and s3 refer to one unique object of type "+ s1);
  }
}