package latihan;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        // Tentukan nilai-nilai untuk variabel nilai1 hingga nilai6
        int[] arr = {5, 9, 3, 7, 2, 8}; // Contoh nilai yang bisa diganti sesuai kebutuhan

        System.out.println("Sebelum pengurutan: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Setelah pengurutan (terbesar ke terkecil): " + Arrays.toString(arr));
    }

    // Metode untuk melakukan Counting Sort
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Temukan elemen maksimum dalam array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Buat array counter untuk menghitung frekuensi setiap elemen
        int[] count = new int[max + 1];

        // Menghitung frekuensi setiap elemen
        for (int num : arr) {
            count[num]++;
        }

        // Tempatkan elemen-elemen kembali ke array hasil dari besar ke kecil
        int index = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}