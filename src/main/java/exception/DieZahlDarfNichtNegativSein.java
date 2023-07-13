package exception;

public class DieZahlDarfNichtNegativSein extends RuntimeException {
    public DieZahlDarfNichtNegativSein(String s) {
        super(s);
    }
}
