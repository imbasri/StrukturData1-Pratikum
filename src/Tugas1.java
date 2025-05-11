import java.util.LinkedList;

public class Tugas1 {
    public static void main(String[] args) {
        // Nomor 1
        int jumlahBaris = 10;
        System.out.println("nomor 1 = " + jumlahBaris);

        // nomor 2
        String kalimatBaru = "Deklarasi tipe data String?";
        System.out.println("nomor 2 = " + kalimatBaru);

        // nomor 3
        int[] empatAngka = new int[4];
        empatAngka[0] = 7;
        empatAngka[1] = 10;
        empatAngka[2] = 20;
        empatAngka[3] = 23;

        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println("angka dari array " + i + " = " + empatAngka[i]);
        }

        // nomor 4
        String[][] alfabet = {
                {
                        "p", "s", "n"
                },
                {
                        "w", "l", "b"
                },
                {
                        "f", "r", "e"
                }
        };

        System.out.println("nomor 4 = ");
        for (String[] rowStrings : alfabet) {
            for (String valueString : rowStrings) {
                System.out.print(valueString + " ");
            }
            System.out.println();
        }
        // nomor 5
        LinkedList<Integer> listAngka = new LinkedList<Integer>();
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.print("nomor 5 = " + listAngka);
    }
}
