import java.util.Scanner;

/**
 * Created by pnegre on 04/04/16.
 */
public class HangMan {
    private WordFactory wf;
    private GameController gc;


    HangMan(WordFactory wf) {
        this.wf = wf;
        Gallows g = new TextGallows();
        AlphabetDisplay ad = new TextAlphabetDisplay();
        WordDisplay wd = new TextWordDisplay();
        this.gc = new GameController(ad, wd ,g);
    }

    public void play() {
        gc.playGame(this.wf.makeWord());
    }

    public static void main(String[] args) {
        HangMan hangMan = new HangMan(new DefaultWordFactory());
        hangMan.play();
    }
}






