package org.launchcode.techjobs.oo; // Here, we are declaring the package for the class. Which allows us to organize all related classes

import java.util.Objects; //this line imports the java.util.Objects library. The library includes all(or most?) methods related to objects and classes. this is important for any java object oriented programming.

public class Employer {  // Declares the class and makes it public, meaning it can be accessed by other classes in the application.

    private int id;   //lines 7-9 all declare private variables for the class. This means that id, nextId, and value are only accessible within the class or object they are declared in. No other classes or objects can access its values. This is the importance of the word private.
    private static int nextId = 1;
    private String value;

    public Employer() {  //lines 11-14 declare the default constructor for the Employer class. Here it assigns the id variable a value and increments the nextId variable so that the next Employer object will have a unique id.
        id = nextId;
        nextId++;
    }

    public Employer(String value) { // lines 16-19 declare a constructor for the Employer class that takes the String value as a parameter. It then calls the default constructor and then assigns the value of the parameter to the value of the variable. Meaning that when a new Employer object is created, this constructor will take a String value as an argument and assign the value of that String variable to the value variable of the new Employer object (hence the this.value = value). It then calls the default constructor above and sets the ide variable to the next available id. "
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override       // Here, we override the toString method so that if the Employer object is printed, it will return the value variable instad of the name of the object. This value variable comes form the constructor above, which assigns the value of the parameter to the value of the variable.
    public String toString() {
        return value;
    }

    @Override              // Here, we override the equals method so that two objects are equal only if they have the same id. That is, this Override method checks if the two objects are the same object, then checks if they the object is an instance of the Employer class, then checks if the id variables are the same. An instance of another class means it is an object of a specific type. That is, if an object is an instance of the Employer class, it means that the object is an Employer object.
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override       //this overrides hashCode method, using the getId method to return a hashCode for the object. HashCode is a code used to help identify something. That is, it's a computers way of identifying a unique object, it's the computers way of differentiating objects.
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }       // declares a getter method for the id variable. It returns the value of the id variable.

    public String getValue() {
        return value;
    }  // declares a getter method for the value variable. It returns the value variable.

    public void setValue(String value) {
        this.value = value;
    }   // declares a setter method for the value variable. It takes a String as a parameter and assigns it to the value variable.

}
