import java.util.Scanner; // Pustaka Bawaan Java Yang Memilki Class Scanner Untuk Input

public class TugasUAS {

  // Method untuk menghitung total harga
  
  static int HitungTotal(
  int harga, 
  int jumlah
  ) {
  
    return harga * jumlah;
    
  }

  public static void main(String[] args) {

  // ====== Input Pembeli ======
  
    Scanner input = new Scanner(System.in);

  // ===== Variable + TipeData =====
  
    String namabarang;
    int hargabarang;
    int jumlahbeli;
    int total;
    boolean valid = true;

  // ====== Mencetak Input User ======
  
      System.out.println("=============================");
      
    System.out.println("PROGRAM TOKO KELONTONG MADURA");
       System.out.println("=============================\n");

  // Input barang
  
    System.out.print("Masukkan nama barang  : ");
    namabarang = input.nextLine();

    System.out.print("Masukkan harga barang : ");
    hargabarang = input.nextInt();

    System.out.print("Masukkan jumlah beli  : ");
    jumlahbeli = input.nextInt();

// ====== Percabangan (if else) ======

    if (hargabarang <= 0 || jumlahbeli <= 0) {
        System.out.println("\nInput yang kamu masukkan tidak valid!");
        
    // Tanda tidak valid
        valid = false; 
            
    } else {
      
    // Tanda valid  
      valid = true;
            
      }

    if (valid) {
        
// ====== Method HitungTotal ======
     
      total = HitungTotal(hargabarang,jumlahbeli);
            System.out.println("------------------------------------");           
        System.out.println("Nama Barang   : " + namabarang);
        System.out.println("Harga Barang  : " + hargabarang);
        System.out.println("Jumlah Beli   : " + jumlahbeli);
        System.out.println("Total Bayar   : " + total);
          
      }

    // ====== Array ======
    
    System.out.println("\nDiskon 75% Untuk Produk Dibawah ini?🥳:");
        
    String[] promo = { "Sabun", "Shampoo", "Gula", "Minyak" };

    // ====== Perulangan (forloop) ======
   
    for (int i = 0; i < promo.length; i++) {
      System.out.println((i + 1) + ". " + promo[i]);
            
      }

    // Program selesai
    System.out.println("\nHappy Shopping?🤗"); 
    System.out.println("Terima kasih sudah berbelanja!🛒🛍️");
        
  }
  
}
