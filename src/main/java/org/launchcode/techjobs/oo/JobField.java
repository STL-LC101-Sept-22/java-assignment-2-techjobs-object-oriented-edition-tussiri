package org.launchcode.techjobs.oo; // declaring the package
import java.util.Objects; //importing Objects library that contains all of the methods related to objects

public abstract class JobField {        // declaring an abstract class. the abstract class cannot be initiated, meaning it cannot have any objects created from it.
    private int id;     // we create a private integer called "id" (prvate meaning it cannot be accessed outside of this class.
    private static int nextId =1;   // we create a private integer called "nextId" set it's value to 1. Static integer meaning it can be shared between all of the objects of a class. So this allows us to pass and use the id throughout the class, and all the other classes that extend this abstract class.
    private String value; // creates a private String called value which will store data for the JobField class.

    public JobField(){  // We create a constructor for the JobField class. Constructors are methods that are used to create an object of a class. This constructor sets the id of the object to be the value of the nexId integer, and increments the nextId integerto the next number
        id = nextId;
        nextId++;
    }

    public JobField(String value){ // we create another constructor for the JobField class. this constructor sets the id of the object to be the value of the nextId integer and increments the nextId integer to the next number, and also sets the value of the object, in this case "this()" meaning the abstract JobField, or any other object that extends this class, to be the parameter that is passed in.
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in "value"
    @Override  // override the default toString() method, by returning the data stored in the 'value' field of the object.
    public String toString(){return value;}

    //TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //their id fields match.

    @Override //overrides the equals and hashCode methods. Rather than comparing two objects to see if they are equal, we are comparing two objects to see if their id's match, making them equal.
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass() !=o.getClass()) return false;
        org.launchcode.techjobs.oo.PositionType that = (org.launchcode.techjobs.oo.PositionType) o;
        return id == that.getId();
    }

    @Override //we create getters and setters, which are used to return the value of the corresponding field. And setters set the value of a field.
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
