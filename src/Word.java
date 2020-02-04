import java.lang.reflect.Array;
import java.util.Arrays;

public class Word {
    // String para guardar la palabra.
    private final String wstring;
    // Lo declaramos en el string
    char[] ar;


    Word(String s) {
        // Paso a mayusculas
        this.wstring = s.toUpperCase();
        this.ar = new char[wstring.length()];
        for (int i = 0; i < this.ar.length; i++) {
            this.ar[i] = '-';
        }
    }

    public String toString() {
        return Arrays.toString(this.ar);
    }

    boolean isGuessed() {

        for (int i = 0; i < this.ar.length; i++) {
            if (this.ar[i] == '-') return false;
        }
        return true;
    }

    boolean doGuess(char c) {
        c = Character.toUpperCase(c);
        boolean found = false;
        for (int i = 0; i < this.wstring.length(); i++) {
            if (this.wstring.charAt(i) == c) {
                this.ar[i] = c;
                found = true;
            }
        }
        return found;
    }
}


