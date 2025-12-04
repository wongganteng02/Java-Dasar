import java.util.Scanner; // Pustaka Bawaan Java Yang Memilki Class Scanner Untuk Input

public class Belajar09_percabangan { // Nama Class Harus Sesuai Dengan Nama File

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in); // Membuat Objek Class Scanner Untuk Membaca Data Dari Input User
  
    System.out.print("Apakah kamu mau menonton video viral itu(y/n)? "); // Teks Yang Ditampilkan Sebelum Input
    String yesnot = input.nextLine(); // Input User Setelah Teks Yg Ditampilkan
  
    if (yesnot.equalsIgnoreCase("y")) { // Logikanya Jika yesnot == "y"
  
      System.out.print("Berapa Umur Kamu? "); // Maka Akan Menampilkan Teks Input Lagi
        int umur = input.nextInt(); // Input Umur Dengan Bilangan Genap (int)
    
        if (umur > 18) { // Dan Jika Input Umur Lebih Besar Dari 18
        System.out.println("Silahkan Menikmati Videonya:)"); // Maka Akan Menampilkan Teks inu
        } else { // Dan Jika Sebaliknya / Lebih Kecil Dari 18
        System.out.println("Maaf kamu belum cukup umur;("); // Maka Akan Menampilkan  Teks inj
        }
        
    } else { // Logikanya Jika yesnot == "n" / Selain "y"
        System.out.println("Yah udah kalo nggak mau:v"); // Maka Akan Menampilkan Teks ini
    }
    
    input.close(); // Keluar Dari Fungsi Input
    
  }
  
}
