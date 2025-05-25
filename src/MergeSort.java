import java.util.Arrays;

public class MergeSort {
    // main function
    public static void main(String[] args) {
        // nilai variabel awal dari nilai 1 hinggal nilai 6

        int[] arr = { 5, 9, 3, 7, 2, 8 };
        System.out.println("nilai sebelum di urutkan menggunakan merge sort : " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("nilai sesudah di urutkan menggunakan merge sort : " + Arrays.toString(arr));

    }

    // metode utama melakukan merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // titik tengah array
            int mid = left + (right - left) / 2;

            // pisahkan menjadi dua bagian dan diurutkan masing²
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // gabungkan array dari kedua yang sudah diurutkan
            merge(arr, left, mid, right);
        }

    }

    // metode untuk menggabungkan dua bagian yang sudah diurutkan
    public static void merge(int[] arr, int left, int mid, int right) {
        // hitung panjangnya dari sub array kanan dan kiri
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // buat array sementara untuk menyimpan sub array dari kiri dan kanan
        int[] L = new int[n1];
        int[] R = new int[n2];

        // salin elemen array sementara
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // index awal sub kiri kanan dan nilai aslinya
        int i = 0, j = 0, k = left;

        // gabungkan kedua sub array dari terbesar ke terkecil
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // jika masih ada elemen di sub array kiri
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // jika masih ada elemen di sub array kanan
        while (i < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
