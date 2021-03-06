package main;

//LIBRARY UNTUK MENANGKAP INPUT USER
import java.util.Scanner;
//LIBRARY UNTUK WAKTU (LOCAL TIME) DAN TIME FORMATER
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class app {
    public static void main(String[] args) {
        //KONFIGURASI LIBRARY
        Scanner input = new Scanner (System.in);
        LocalDateTime now = LocalDateTime.now();  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  



        String name ;
        int choose ;
        String address;
        int money;
        int cost;

        String services [] = {
            "Ampera-Perumnas",
            "Ampera-Bom Baru",
            "Ampera-KM",
            "Ampera-Bukit Besar",
            "Ampera-Jakabaring",
        };

        String [] amperaPerumnas = {
            "tersedia",
            "tersedia",
            "kosong",
            "tersedia"
        };
        
        

        System.out.print("Halo, Selamat datang di Loket Transportasi Daerah Kota Palembang \n ");

        //CETAK BARIS PEMISAH 
        for (int x =0; x < 100; x++) {
            System.out.print("=");
        }
        
        System.out.print("\nBerikut adalah layanan yang sedang beroperasi ! \n \n ");
        
        // CETAK SEMUA JURUSAN YANG ADA DI PALEMBANG
        for (int i = 0; i < services.length; i++) {
            System.out.println(" Jurusan : " + services[i]);
        };
        
        System.out.println("\nUntuk menggunakan transportasi ini harap perhatikan WAKTU DAN JAM yang tertera dan Input data data berikut!! ");
        System.out.println("         \n                                              " + formatDateTime + "\n"); 


        // AMBIL INPUT DARI USER
        System.out.print("Silahkan Masukan Nama : ");
        name = input.next();
        System.out.print("Silahkan Masukan Jurusan anda berdasarkan layanan diatas dengan memilih (1-5) : ");
        choose = input.nextInt();
        System.out.print("Silahkan Masukan Deposit : ");
        money = input.nextInt();

        //CEK KONDISI INPUT JURUSAN DENGAN JURUSAN YANG ADA
        switch (choose) {
            case 1:
                address = "Ampera-Perumnas";
                break;
            case 2:
                address = "Ampera-Bom Baru";
                break;
            case 3:
                address = "Ampera-KM";
                break;
            case 4:
                address = "Ampera-Bukit Besar";
                break;
            case 5:
                address = "Ampera-Jakabaring";
                break;
        
            default:
                break;
        }

        //KONFIRMASI INPUT YANG TELAH DI DAPAT
        System.out.print("Terima Kasih " + name + "anda memilih jurusan : " + address + "dan Deposit anda sebesar Rp."+ money);

        


        //TUTUP METHOD SCANNER
        input.close();
    }
}
