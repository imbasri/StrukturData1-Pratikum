package latihan;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Tentukan nilai-nilai untuk variabel nilai1 hingga nilai6
        int[] arr = {5, 9, 3, 7, 2, 8}; // Contoh nilai yang bisa diganti sesuai kebutuhan

        System.out.println("Sebelum pengurutan: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Setelah pengurutan (terbesar ke terkecil): " + Arrays.toString(arr));
    }
     
    // Metode utama untuk melakukan Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Temukan titik tengah
            int mid = left + (right - left) / 2;

            // Pisahkan menjadi dua bagian dan urutkan masing-masing
            mergeSort(arr, left, mid);       // Bagian kiri
            mergeSort(arr, mid + 1, right);  // Bagian kanan

            // Gabungkan kedua bagian yang sudah terurut
            merge(arr, left, mid, right);
        }
    }

    // Metode untuk menggabungkan dua bagian yang sudah terurut
    public static void merge(int[] arr, int left, int mid, int right) {
        // Hitung panjang subarray kiri dan kanan
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Buat array sementara untuk menyimpan subarray kiri dan kanan
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Salin elemen-elemen ke array sementara
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Indeks awal untuk subarray kiri, kanan, dan array asli
        int i = 0, j = 0, k = left;

        // Gabungkan kembali kedua subarray dalam urutan terbalik (terbesar ke terkecil)
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) { // Perhatikan tanda >= untuk urutan terbesar ke terkecil
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Jika masih ada elemen di subarray kiri
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Jika masih ada elemen di subarray kanan
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}