import java.util.Scanner;
public class Tugas108 {
    public static void main(String[] args) {
       int jarak;
       Scanner input08 = new Scanner(System.in);
       System.out.print("Masukkan jarak: ");
       jarak = input08.nextInt();
       if (jarak <= 5) {
           System.out.println("Jarak kurang dari 5 km dan menggunakan Mlee Weapon");
       }
       else if (jarak>=5 && jarak >= 100) {
           System.out.println("Jarak lebih dari 5 km dan menggunakan Ranged Weapon");
       }
       else {
           System.out.println("Warning! Jarak yang dimasukkan antara 5 - 100 km");
       }
    }
}