package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Location() {
//        id = nextId;
//        nextId++;
//    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field. (DONE.)
//public Location(String value) {
//        this();                         //this calls the first constructor, and initializes the "id" field.
//        this.value = value;
//
//}
//
    public Location(String value) {    // because we are exending the abstract jobfield class, we no longer need individual getters, setters, constructors, ets. all of those are passed down from the JobField class to this class. Here, the only thing we need to do is create a constructor that calls the superclass constructor, which sets the "value" field of the Location object to the parameter that is passed in. This same logic gets repeated in the other classes that extend the JobField class. We do this to simplify the code, and prevent repetition. There is no need to create constructors and getters and setters that all do the same thing, when they can be passed down to the class from a superclass.
        super(value);
    }
}

//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//}
