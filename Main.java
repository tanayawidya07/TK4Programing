import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static char choice;
    private static Scanner input = new Scanner(System.in);
    private static int[] randomAngka = new int[5];

    public static void main(String[] args) {
        while (true) {
            menuUatama();
        }
    }

    public static void menuUatama() {
        System.out.println("\nSelamat Datang Di Program Simulasi");
        System.out.println("Menu :");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");
        Scanner scanMenu = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Anda : ");
        choice = input.next().charAt(0);

        switch (choice) {
            case '1':
                randomBilangan();
                break;
            case '2':
                bubbleSortAsc(randomAngka, 5);
                break;
            case '3':
                selectionSortAsc(randomAngka, 5);
                break;
            case '4':
                bubbleSortDesc(randomAngka, 5);
                break;
            case '5':
                selectionSortDesc(randomAngka, 5);
                break;
            case '6':
                System.exit(0);
                break;
            default:
                System.out.print("Pilih Menu antara 1 - 6");
                break;

        }
    }

    private static void randomBilangan() {
        Random bilanganRandom = new Random();
        System.out.print("Batas Bawah : ");
        int batasBawah = input.nextInt();
        System.out.print("Batas Atas : ");
        int batasAtas = input.nextInt();

        if (batasBawah >= batasAtas) {
            System.out.println("Batas atas harus lebih dari batas bawah, silahkan masukkan ulang!");
        } else {
            int range = batasAtas - batasBawah + 5;
            for (int i = 0; i < 5; i++) {
                randomAngka[i] = bilanganRandom.nextInt(range) + batasBawah;
                System.out.print(randomAngka[i] + " ");
            }
        }
    }

    private static void bubbleSortAsc(int[] data, int jmlhData) {
        //menampilkan data sebelum disorting
        System.out.print("Data sebelum di sorting : ");
        for (int i = 0; i < jmlhData; i++)
        {
            System.out.print(data[i] + " ");
        }

        //proses bublesorting
        System.out.println("\nProses Buble Sort Ascending");
        for (int i = 0; i < jmlhData; i++){
            System.out.println("\nPass" + (i + 1) + " :");
            for (int j = 0; j < jmlhData; j++){
                System.out.print(data[j] + " ");
            }
            System.out.println();
            for (int j = 0; j < jmlhData - 1; j++){
                if (data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if (j < jmlhData - (i + 1)){
                    for (int k = 0; k < jmlhData; k++){
                        System.out.print(data[k] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("\n Result of Pass " + (i + 1) + " :");
            for (int j = 0; j < jmlhData; j++){
                System.out.print(data[j] + " ");
            }
        }
    }
    private static void  selectionSortAsc(int[] data, int jmlhData){
        //menampilkan data sebelum disorting
        System.out.print("Data sebelum di sorting : ");
        for (int i = 0; i < jmlhData; i++)
        {
            System.out.print(data[i] + " ");
        }
        // proses selection sort
        System.out.println(" \nProses Selection Sort Ascending") ;
        for (int i = 0; i < jmlhData - 1; i++) {
                System.out.print("\nPass " + (i + 1) + ": ");
        for (int j = 0; j < jmlhData; j++){
            System.out.print (data[j] + " ");
        }
        boolean tukar = false;
        int index = 0;
        int min = data[i];
        for (int j = 0; j < jmlhData; j++){
            if (min > data[j]){
                tukar = true;
                index = j;
                min = data[j];
            }
        }
        if (tukar == true){
            int temp = data[i];
            data[i] = data[index];
            data[index] =  temp;
        }
        System.out.println("\nResult of Pass" + (i + 1)+ " :");
        for (int j=0; j < jmlhData; j++){
            System.out.print(data[j] + " ");
        }
        }
    }
    private static void  bubbleSortDesc(int[] data, int jmlhData){
        //menampilkan data sebelum disorting
        System.out.print("Data sebelum di sorting : ");
        for (int i = 0; i < jmlhData; i++)
        {
            System.out.print(data[i] + " ");
        }
        // proses bubble sort
        System.out.println(" \nProses Buble Sort Descending") ;
        for (int i = 0; i < jmlhData; i++) {
            System.out.print("\nPass " + (i + 1) + ": ");
            for (int j = 0; j < 10; j++) {
                System.out.print(data[j] + " ");
            }

            System.out.println();
            for (int j = 0; j < jmlhData; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if (j < jmlhData - (i + 1)) {
                    for (int k = 0; k < jmlhData; k++) {
                        System.out.print(data[k] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("\nResult of Pass" + (i + 1) + ": ");
            for (int j = 0; j < jmlhData; j++) {
                System.out.print(data[j] + " ");
            }
        }
    }
    private static void  selectionSortDesc(int[] data, int jmlhData) {
        //menampilkan data sebelum disorting
        System.out.print("Data sebelum di sorting : ");
        for (int i = 0; i < jmlhData; i++) {
            System.out.print(data[i] + " ");
        }
        // proses selection sort
        System.out.println(" \nProses Selection Sort Ascending");
        for (int i = 0; i < jmlhData - 1; i++) {
            System.out.print("\nPass " + (i + 1) + ": ");
            for (int j = 0; j < jmlhData; j++) {
                System.out.print(data[j] + " ");
            }
            boolean tukar = false;
            int index = 0;
            int min = data[i];
            for (int j = i + 1; j < jmlhData; j++) {
                if (min > data[j]) {
                    tukar = true;
                    index = j;
                    min = data[j];
                }
            }
            if (tukar == true) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            System.out.println("\nResult of Pass" + (i + 1) + " :");
            for (int j = 0; j < jmlhData; j++) {
                System.out.print(data[j] + " ");
            }
        }

    }
}