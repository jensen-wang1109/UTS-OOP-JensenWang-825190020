import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Driver drv = new Driver();
        Vehicle vhc = new Vehicle();
        int choice1;
        boolean choice;

        do {
            System.out.print("Nama Driver: ");
            drv.name = myObj.nextLine();
            System.out.print("Umur Driver: ");
            try {
                drv.age = myObj.nextInt();
            } catch (Exception e) {
                return;
            }
            myObj.nextLine();
            System.out.print("Jenis Kelamin(Male/Female): ");
            drv.gender = myObj.nextLine();
            System.out.print("Id Driver: ");
            drv.driverId = myObj.nextLine();
            System.out.print("Gaji Driver per-bulan: Rp. ");
            try {
                drv.salary = myObj.nextInt();
            } catch (Exception e) {
                return;
            }
            myObj.nextLine();
            System.out.println();

            System.out.print("Plat Kendaraan: ");
            vhc.plat = myObj.nextLine();
            System.out.print("Merek Kendaraan: ");
            vhc.merk = myObj.nextLine();
            System.out.print("Warna Kendaraan: ");
            vhc.color = myObj.nextLine();
            System.out.print("Jarak(km): ");
            vhc.distance = myObj.nextDouble();
            System.out.println();
            System.out.println("Pilihan: ");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.print(": ");
            try {
                vhc.pil = myObj.nextInt();
            } catch (Exception e) {
                return;
            }
            myObj.nextLine();
            System.out.println();
            vhc.tarif();
            System.out.println();

            System.out.println("Cek");
            System.out.println("Nama Driver: " + drv.name);
            System.out.println("Umur Driver: " + drv.age + " tahun");
            System.out.println("Jenis Kelamin: " + drv.gender);
            System.out.println("Id Driver: " + drv.driverId);
            System.out.println("Plat Kendaraan: " + vhc.plat);
            System.out.println("Merek Kendaraan: " + vhc.merk);
            System.out.println("Warna Kendaraan: " + vhc.color);
            System.out.println("Total yang harus dibayar: Rp. " + vhc.total);
            System.out.println();

            System.out.println("Apakah ingin melakukan pemesanan lagi ?");
            System.out.println("1. ya");
            System.out.println("2. tidak");
            System.out.print(": ");
            choice1 = myObj.nextInt();
            myObj.nextLine();
            if (choice1 == 1) {
                choice = true;
            }
            else {
                choice = false;
                System.out.println("Terima kasih telah melakukan pemesanan");
            }
            System.out.println();
        } while(choice != false);
    }
}