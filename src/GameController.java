import java.util.Scanner;

public class GameController {
    private AlphabetDisplay ad;
    private WordDisplay wordDisplay;
    private Gallows gallows;
    private Alphabet alphabet;


    GameController(AlphabetDisplay ad, WordDisplay wordDisplay, Gallows gallows) {
        this.ad = ad;
        this.wordDisplay = wordDisplay;
        this.gallows = gallows;
        this.alphabet = new Alphabet();
    }

    void playGame(Word w) {
        while (!w.isGuessed() && !this.gallows.isHung()) {
            this.gallows.display();
            this.wordDisplay.display(w);
            this.ad.display(this.alphabet);

            char c = this.getInput();
            if (!this.alphabet.doGuess(c) && !w.doGuess(c)) {
                this.gallows.addPart();
            }

        }
        if (w.isGuessed()) {
            System.out.println("Has guanyatt!!!");
        } else {
            this.gallows.display();
            System.out.println("GAME OVER!!");
        }
    }

    private char getInput() {
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        return ss.charAt(0);
    }
}
