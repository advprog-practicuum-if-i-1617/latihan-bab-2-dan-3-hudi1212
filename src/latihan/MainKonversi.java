/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Hudi
 */
public class MainKonversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Konversi a = new Konversi();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Pilih :\n1. angka > huruf\n2. huruf > angka");
            int f = input.nextInt();
            input.nextLine();
            switch (f) {
                case 1:
                    System.out.print("Ubah : ");
                    int ubah = input.nextInt();
                    System.out.println(a.getAngka(ubah));
                    break;
                case 2:
                    System.out.print("Ubah : ");
                    String ubahh = input.nextLine();
                    System.out.println(a.getAngka(ubahh));
                    break;
                default:
                    break;
            }
        } while (true);
    }

}
