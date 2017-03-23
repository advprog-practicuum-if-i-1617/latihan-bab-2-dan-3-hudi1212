package latihan;

import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class Konversi {

    String[] huruf = {" ", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public int getAngka(String a) {
        int bcc = 0;
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (a.equals(huruf[i])) {
                        bcc = angka[i];
                    } else if (a.equals(huruf[i] + " belas")) {
                        bcc = angka[i] + 10;
                    } else if (a.equals(huruf[i] + " puluh")) {
                        bcc = angka[i] * 10;
                    } else if (a.equals(huruf[i] + " puluh " + huruf[j])) {
                        bcc = angka[i] * 10 + angka[j];
                    } else if (a.equals("seratus")) {
                        bcc = 100;
                    } else if (a.equals("seratus " + huruf[j])) {
                        bcc = 100 + angka[j];
                    } else if (a.equals("seratus sebelas")) {
                        bcc = 111;
                    } else if (a.equals("seratus " + huruf[j] + " belas")) {
                        bcc = 110 + angka[j];
                    } else if (a.equals("seratus " + huruf[j] + " puluh")) {
                        bcc = 100 + angka[j] * 10;
                    } else if (a.equals("seratus " + huruf[j] + " puluh " + huruf[k])) {
                        bcc = 100 + angka[j] * 10 + angka[k];
                    } else if (a.equals(huruf[i] + " ratus")) {
                        bcc = angka[i] * 100;
                    } else if (a.equals(huruf[i] + " ratus sebelas")) {
                        bcc = angka[i] * 100 + 11;
                    } else if (a.equals(huruf[i] + " ratus " + huruf[j])) {
                        bcc = angka[i] * 100 + angka[j];
                    } else if (a.equals(huruf[i] + " ratus " + huruf[j] + " belas")) {
                        bcc = angka[i] * 100 + 10 + angka[j];
                    } else if (a.equals(huruf[i] + " ratus " + huruf[j] + " puluh")) {
                        bcc = angka[i] * 100 + 10 * angka[j];
                    } else if (a.equals(huruf[i] + " ratus " + huruf[j] + " puluh " + huruf[k])) {
                        bcc = angka[i] * 100 + 10 * angka[j] + angka[k];
                    } else if (a.equals("seribu")) {
                        bcc = 1000;
                    }
                }
            }
        }
        return bcc;

    }

    public String getAngka(int a) {
        String nilai = "";

        if (a < 12) {
            nilai = nilai + huruf[a];
        } else if (a < 20) {
            nilai = nilai + getAngka(a - 10) + " belas";
        } else if (a < 100) {
            nilai = nilai + getAngka(a / 10) + " puluh " + getAngka(a % 10);
        } else if (a < 200) {
            nilai = nilai + "seratus " + getAngka(a - 100);
        } else if (a < 1000) {
            nilai = nilai + getAngka(a / 100) + " ratus " + getAngka(a % 100);
        } else if (a == 1000) {
            nilai = nilai + "seribu";
        }

        return nilai;

    }
}
