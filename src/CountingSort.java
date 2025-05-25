import java.util.Arrays;

public class CountingSort {
    // main function
    public static void main(String[] args) {
        // variabel arr nilai 1 hingga nilai 6 
        int[] arr = { 5, 9, 3, 7, 2, 8 };

        System.out.println("nilai sebelum menggunakan counting sort : " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("nilai sesudah menggunakan counting sort : " + Arrays.toString(arr));
    }

    // metode untuk melakukan counting sort
    public static void countingSort(int[] arr) {
        // check jika panjang sama dengan 0 jadi return kosong atau exit program
        if (arr.length == 0)
            return;

        // temukan nilai max dalam array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // buat array counter untuk menghitung nilai setiap elemen
        int[] count = new int[max + 1];

        // menghitung nilai setiap elemen
        for (int num : arr) {
            count[num]++;
        }

        // tempatkan elemen kembali ke hasil array dari besar ke terkecil
        int index = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}
