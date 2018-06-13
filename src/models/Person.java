/*
Created for application development purposes.
 */
package models;

/**
 *
 * @author lakshay
 */
public class Person {
    private PersonalInformation details;

    public PersonalInformation getDetails() {
        return details;
    }

    public void setDetails(PersonalInformation details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return details.toString();
    }
    
}
