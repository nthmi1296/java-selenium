package L01;

public class VariablePractice {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /**
         * Notice naming convention for variables
         *  -> start with a lowercase, the start of the next or some sequence words we use a CAPITAL letter
         */

        // numeric value, all signed

        byte aByte = 127;       // behaves like 8 bits
        short aShort = 037654;  // behaves like 16 bits
        int anInteger = 123456; // behaves like 32 bits
        long aLong = 0xCAFE;    // behaves like 64 bits  //hexadecimal [0-9]x[A-F]

        // floating point numbers
        float aFloat = 99.9F;  // F suffix  (notice: without F => default is double)
        double aDouble = 99.0E+99;

        // unsigned number, represents a character
        // coded using Unicode
        char aCharacter = 'A';      // behaves like 16 bits
        aCharacter = '\u0041';      // hexadecimal literal  (not available on keyboard)
        aCharacter = '\n';          // newline

        // logical value; true of false
        boolean aBoolean = true;    // behaves like 1 bit

        System.out.print("aByte: ");
        System.out.println(aByte);
        System.out.printf("aShort: %d%n",aShort);
        System.out.printf("anInteger: %d%n",anInteger);
        System.out.printf("aLong: %d%n",aLong);
        System.out.printf("aFloat: %f%n",aFloat);
        System.out.printf("aDouble: %f%n",aDouble);
        System.out.printf("aBoolean: %b%n",aBoolean);
        System.out.printf("aCharacter: %c%n",aCharacter);

        System.out.println("Bye world!");
    }
}
