/*
Created for application development purposes.
 */
package helpers;

/**
 *
 * @author lakshay
 */
public enum PrintableChars {
    EQUALS('='), DASH('-'), STAR('*');
    
    private final char value;

    private PrintableChars(char value) {
        this.value = value;
    }
    
    
    @Override
    public String toString() {
        return Character.toString(this.value);
    }
}
