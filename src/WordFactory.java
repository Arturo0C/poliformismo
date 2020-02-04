import java.util.Random;

public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    public Word makeWord() {
        return new Word("ORDINADOR");
    }
}


class DictWordFactory implements WordFactory {
    private static String[] dict = new String[] {
            "ORDINADOR",
            "TAULA",
            "RATA",
            "MALETA",
            "FIL",
            "RATOLI",
            "CASA",
            "ARBRE",
    };
    @Override

    //Creando una palabra randon con los nano segundos del sistema.
    public Word makeWord() {
        Random random = new Random();
        random.setSeed(System.nanoTime());
        // i es igual al numero random.
        int i = random.nextInt(DictWordFactory.dict.length);
        return new Word(DictWordFactory.dict[i]);
    }
}