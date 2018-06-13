/*
Created for application development purposes.
 */
package models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lakshay
 */
public class PersonalInformation {

    private Name name;
    private Address address;

    private Date dateOfBirth;

    public PersonalInformation(String first, String last, String addressLine1) {
        this(first, null, last, addressLine1);

    }

    public PersonalInformation(String first, String middle, String last, String addressLine1) {
        this.name = new Name(first, middle, last);
        this.address = new Address(addressLine1);
    }

    class Name {

        private String first;
        private String middle;
        private String last;

        public Name(String first, String middle, String last) {
            this.first = first;
            this.middle = middle;
            this.last = last;
        }

        public Name(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMiddle() {
            return middle;
        }

        public void setMiddle(String middle) {
            this.middle = middle;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        @Override
        public String toString() {
            StringBuilder response = new StringBuilder(this.first);

            if (this.middle != null) {
                response.append(" ").append(this.middle);
            }

            response.append(" ").append(last);

            response.append(" is ").append(getAge()).append(" years old.");

            return response.toString();
        }

    }

    class Address {

        private String line1, line2, line3;
        private String city, state, country;

        public Address(String line1) {
            this.line1 = line1;
        }

        public String getLine1() {
            return line1;
        }

        public void setLine1(String line1) {
            this.line1 = line1;
        }

        public String getLine2() {
            return line2;
        }

        public void setLine2(String line2) {
            this.line2 = line2;
        }

        public String getLine3() {
            return line3;
        }

        public void setLine3(String line3) {
            this.line3 = line3;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            StringBuilder response = new StringBuilder(this.getLine1());

            if (this.line2 != null) {
                response.append("\n").append(this.line2);
            }

            if (this.line3 != null) {
                response.append("\n").append(this.line3);
            }

            if (this.city != null) {
                response.append("\n").append("City: ").append(this.city);
            }

            if (this.state != null) {
                response.append("\n").append("State: ").append(this.state);
            }

            if (this.country != null) {
                response.append("\n").append("Country: ").append(this.country);
            }

            return response.toString();
        }

    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.dateOfBirth = formatter.parse(dateOfBirth);
        } catch (ParseException ex) {
            this.dateOfBirth = new Date();
        }
    }

    public int getAge() {

        if (this.dateOfBirth == null) {
            return 0;
        }

        Calendar today = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();

        int age = 0;

        birthDate.setTime(this.dateOfBirth);
        if (birthDate.after(today)) {
            throw new IllegalArgumentException("Can't be born in the future");
        }

        age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        return age;
    }

    public String completeInformation() {
        return name.toString() + " \nlives in " + address.toString();
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
