import javax.swing.*;

/**
 * Created by fr3 on 14.12.2016.
 */

public class Main {
    public static void main(String[] args) {
        String zahl1 = JOptionPane.showInputDialog("Zahl 1:");
        String zahl2 = JOptionPane.showInputDialog("Zahl 2:");
        int ergebnislaenge = 0;
        /*
             456
            +456
            =912
         */

        //2 int arrays für die Zahlen erstellen
        int[] zahl1A = new int[zahl1.length()];
        int[] zahl2A = new int[zahl2.length()];

        //int arrays mit Zahlen füllen
        for (int i = 0; i < zahl1A.length; i++) {
            zahl1A[i] = Integer.parseInt(String.valueOf(zahl1.charAt(i)));
        }
        for (int i = 0; i < zahl2A.length; i++) {
            zahl2A[i] = Integer.parseInt(String.valueOf(zahl2.charAt(i)));
        }

        //ergebnis array erstellen
        if (zahl1A.length > zahl2A.length) {
            ergebnislaenge = zahl1A.length;
        } else {
            ergebnislaenge = zahl2A.length;
        }
        int[] ergebnis = new int[ergebnislaenge + 1];

        //berechnung
        int imSinn = 0;
        int zwischensumme = 0;
        int z1Laenge = zahl1A.length - 1;
        int z2Laenge = zahl2A.length - 1;


        while (ergebnislaenge >= 0) {
            int z1 = 0;
            int z2 = 0;

            if (z1Laenge >= 0) {
                z1 = zahl1A[z1Laenge];
            }
            if (z2Laenge >= 0) {
                z2 = zahl2A[z2Laenge];
            }

            zwischensumme = z1 + z2 + imSinn;
            imSinn = zwischensumme / 10;
            zwischensumme %= 10;

            ergebnis[ergebnislaenge] = zwischensumme;

            z1Laenge--;
            z2Laenge--;
            ergebnislaenge--;
        }


        //ausgabe
        for (int i = 0; i < ergebnis.length; i++) {
            System.out.print(ergebnis[i]);
        }

    }

}