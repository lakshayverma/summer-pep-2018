/*
Created for application development purposes.
 */
package helpers;

/**
 *
 * @author lakshay
 */
public class PrintHelper {
    private static PrintHelper instance;
    
    private PrintHelper() {
        // Singleton
    }
    
    public static PrintHelper getInstance() {
        if (PrintHelper.instance == null) {
            PrintHelper.instance = new PrintHelper();
        }
        
        return PrintHelper.instance;
    }
    
    
    public void printDecoration(PrintableChars print, int repeat) {
        int counter = 0;
        while(counter < repeat) {
            System.out.print(print);
            
            counter++;
        }
        System.out.println("");
    }
    
    public void printDecoration() {
        this.printDecoration(PrintableChars.DASH, 30);
    }
}
