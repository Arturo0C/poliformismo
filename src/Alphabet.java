import java.lang.reflect.Array;
import java.util.Arrays;

public class Alphabet {
    private boolean[] ar = new boolean['z' - 'a' + 1];

    public boolean isUsed(char c) {
        c = Character.toLowerCase(c);
        if (c < 'a' || c > 'z') return false;
        return this.ar[c -'a'];

    }

    public boolean doGuess(char c) {
        c = Character.toLowerCase(c);
        if (c < 'a' || c > 'z') return false;
        if (this.isUsed(c)) return true;
        this.ar[c -'a'] = true;
        return false;
    }
}


interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
        String res = "LLetres empreses: ";
        for (char c = 'a'; c <= 'z'; c++ ) {
            if (a.isUsed(c)) {
                res += c + " ";
            }
        }
        System.out.println(res);
    }
}