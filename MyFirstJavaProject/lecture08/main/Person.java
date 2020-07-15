package main;

/**
 * The superclass Person has name and address.
 */

public class Person {
   // private instance variables
   private String name, address;
   
  // private Contact contactInfo; // Person HAS-A Contact
   
   /** Constructs a Person instance with the given name and address */
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   public Person(String name) {
	   this.name = name;
   }
   
   // Getters and Setters
   /** Returns the name */
   public String getName() {
      return name;
   }
   /** Returns the address */
   public String getAddress() {
      return address;
   }
   /** Sets the address */
   public void setAddress(String address) {
      this.address = address;
   }
   
   /** Sets the name */
   public void setName(String name) {
	   this.name = name;
   }
   
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return name + "(" + address + ")";
   }
}