package belajar;

public class array {

  public static void main(String[] args) {
    
    String[] nama = {"Deri", "Kusuma", "Wardani"};
    
    for (int i = 0; i < nama.length; i++) {
      
      System.out.println(nama[i] + "\n");
      
    }
    
    System.out.println("Data dari index ke 2 = " + nama[2]);
    System.out.println("Panjang Data String = " + nama.length);
    System.out.println("\n=====================");
  System.out.println("Mencari Umur Terkecil");
  System.out.println("=====================\n");
  
    
    int[] umur = {20, 25, 45, 51, 17, 60, 14};
    int length = umur.length;
    int lowumur = umur[0];
    
    for (int i : umur) {
    // Looping semua umur
    
      System.out.println("Apakah " + lowumur + " Lebih lebih besar Dari " + i + "?");
    
      if (lowumur > i) {
      // Kecuali Hasil Looping Akan Berbeda Jika Umur dgn index 0 Lebih Besar Dari Setiap Loop yg berjalan
        
        System.out.println("Iyh Benar"); // Mencetak Loop Yg Kondisinya Terpenuhi
        System.out.println("Jadi Nilainya Update Paling kecil = " + i + "\n"); // Mencetak Hasil Update
        
        lowumur = i; // Mengupdate value variable "lowumur" jika kondisi terpenuhi
        
      } else {
        
        System.out.println("Tidak\n");
        
      }
      
    }
    
    System.out.println("================\n");
    // ARRAY MULTI DIMENSI
    // ARRAY DI DALAM ARRAY
    int[][] num = {
      {28, 39, 12, 10},
      {61, 51, 46}
    };
    
    for (int i = 0; i < num.length; i++) {
    
      System.out.println("Array Index ke-" + i + ":"); // Mencetak Keterangan Index Array Setiap Looping Selesai
      
      for (int j = 0; j < num[i].length; j++) {
        
        System.out.println(num[i][j]);
        // Menampilkan Data Array Dalam Bentuk Loop
       
      }
      
      System.out.println();
      // (optional) Memberi Jeda 1 Baris Setiap Setelah Selesai Menampilkan Data Array
      
    }
    
    System.out.println("Data index array ke 1 Dgn index elemen ke 2 = " + num[0][2]); // Mencari Data Array
    
    System.out.println("Panjang Data Array Yg Index ke 0 = " + num[0].length);
    // Mencetak Panjang Elemen Array Index ke-0
    
    System.out.println("Panjang Data Array Yg Index ke 1 = " + num[1].length);
    // Mencetak Panjang Elemen Array Index ke-1
    
  }

}