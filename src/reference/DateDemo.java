/*
Created for application development purposes.
 */
package reference;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lakshay
 */
public class DateDemo {

    public static void main(String[] args) {

        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
            Date d1 = formatter.parse("2011-03-25");
            Date d2 = new Date();  // Current date
            Date d3 = formatter.parse("2018-07-09");

            boolean a = d3.after(d1);
            System.out.println("Date d3 comes after " + "date d2: " + a);

            boolean b = d3.before(d2);
            System.out.println("Date d3 comes before " + "date d2: " + b);

            int c = d1.compareTo(d2);
            System.out.println(c);

            System.out.println("Miliseconds from Jan 1 " + "1970 to date d1 is " + d1.getTime());

            System.out.println("Before setting " + d2);
            d2.setTime(204587433443L);
            System.out.println("After setting " + d2);

        } catch (ParseException ex) {
            Logger.getLogger(DateDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
