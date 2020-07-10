package main;

import java.util.HashMap;

/**
 * The Student class, subclass of Person.
 */
public class Student extends Person {
   // private instance variables
	private String facultyNumber;
	// key/value pairs between course name and grade
	private HashMap<String, Double> courses; 
	
	private HashMap<String, Boolean> coursePass;


	
   /** Constructs a Student instance with the given name and address and faculty number */
   public Student(String name, String address, String facNumber) {
      super(name, address);
      this.facultyNumber = facNumber;
      courses = new HashMap<String, Double>();
   }
   
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Student: " + super.toString();
   }
   
   /** Adds a course and its grade */
   public void addCourse(String course, Double grade) {
      this.courses.put(course, grade + 1);
      
   }

   
   /** Prints all courses taken and their grade */
   public void printGrades() {
      for(String course : courses.keySet()) {
    	  System.out.printf("Student with facN: %s has taken course %s with grade of %.2f\n\n",
    			  this.facultyNumber, course, courses.get(course));
      }
   }

}