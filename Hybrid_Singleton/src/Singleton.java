/* Name: Elysé Ntigirishari
 * Student ID: 040924425
 * Course & Section: CST8132_300
 * Assignment: Hybrid 9
 * Date: April 14, 2019
 */

/** This class implements the Singleton design pattern
 *  @author Elysé Ntigirishari
 */
public class Singleton{
/** The reference to the unique instance of the class */
  private static Singleton theSingleton;

/** Private constructor - instances of this class
 *  can not be created directly by calling the constructor.
 */
  private Singleton(){
    System.out.println("Singleton constructor called ...\n");
  }

/** Overrides Object's toString() */
@Override
  public String toString(){
    return this.getClass().getName();
  }

/** Accessor class method responsible for creating
 * and maintaining an unique instance
 */
  public static Singleton getSingleton(){
    theSingleton = new Singleton();
    return theSingleton;
  }
} //end class


/* Answers to Hybrid 9 Questions

 Q1. Do design patterns in object-oriented design help avoiding the “reinvention of the wheel” in programming?
 Yes. They help solve common problems by their suitability. They help keep best programming practices.


 //Designs patterns are suitable, so they can be used to solve common programming problems and keep good programming practices.

 Q2. Can the Singleton design pattern ensure that a class has only one single, unique instance?
 Yes because it helps a class with only one single and unique instance by making its constructor private or
 protected thus restricting access to it, and it returns a reference to the unique instance.

//Yes. It gives a class only one single and unique instance and restricts access to it
 * by making its constructor private or protected. It also returns a reference to the unique instance.


 */














