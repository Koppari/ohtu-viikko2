
package ohtu.verkkokauppa;

import java.util.ArrayList;

public class Kirjanpito implements KirjanpitoInterface {

    public static ArrayList<String> tapahtumat;

    public Kirjanpito() {
        tapahtumat = new ArrayList<String>();
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    public static ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}
