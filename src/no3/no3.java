package no3;

import java.util.ArrayList;
import java.util.List;

public class no3 {
    public static void getNo3() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(001,"Irfan Fauzi", "TIF RM 22A", 25));
        mahasiswaList.add(new Mahasiswa(002,"Fauzi Irfan", "TIF RM 22B", 26));
        mahasiswaList.add(new Mahasiswa(003,"Fauzeerfan", "TIF RM 22C", 27));
        mahasiswaList.add(new Mahasiswa(004,"Uzi", "TIF RM 22D", 28));
        mahasiswaList.add(new Mahasiswa(005,"Bro Irfan", "TI RM 22E", 29));

        // get Size Array Sebelum di remove / add;
        System.out.println("===  get Size Array Sebelum di remove / add; ===");
        System.out.println(mahasiswaList.size());
        System.out.println("\n");

        // loop using forEach
        System.out.println("=== (Print all) di Looping menggunakan forEach ===");
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // loop using for
        System.out.println("=== (Print all) di Looping menggunakan for ===");
        for(int i = 0; i < mahasiswaList.size(); i++){
            System.out.println(mahasiswaList.get(i));
        }
        System.out.println("\n");

        // remove data ke 3
        System.out.println("=== Print After Remove Data Ke 2 ===");
        mahasiswaList.remove(1);
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // add data baru
        mahasiswaList.add(new Mahasiswa(006,"Sherlock Holmes", "TIF RM 22Z", 31));
        mahasiswaList.add(new Mahasiswa(007,"James Bond", "TIF RM 22Y", 30));
        System.out.println("=== Print After Remove and Add 2 Data ===");
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // get Size Array Setelah di remove / add;
        System.out.println("===  get Size Array Setelah di remove / add; ===");
        System.out.println(mahasiswaList.size());

        return;
    }
}