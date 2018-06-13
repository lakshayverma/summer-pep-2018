/*
 */
package reference;

import helpers.PrintHelper;
import models.Person;
import models.PersonalInformation;

/**
 *
 * @author lakshay
 */
public class Reference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        PrintHelper helper = PrintHelper.getInstance();

        PersonalInformation details1 = new PersonalInformation("Lakshay", "Verma", "Jalandhar");
        details1.setDateOfBirth("1947-8-15");

        PersonalInformation details2 = new PersonalInformation("Robert", "Downey", "Junior", "Ney York");
        details2.setDateOfBirth("1950-01-26");

        person1.setDetails(details1);
        person2.setDetails(details2);

        System.out.println(person1);
        helper.printDecoration();
        System.out.println(person2);
        helper.printDecoration();
    }

}
