package belajar;

public class whileloop {

  public static void main(String[] args) {
  
    int num = 1;
  /* Loop ini Hanya Menampilkan 
  "Kamu Sangar"
  Setelah Line ke 10 Bukan Pas Line 10*/
    while (num <= 10) {
  
      if (num < 10) {
        System.out.println("Belum Sampai 10 = " + num);
      } else {
        System.out.println("Sudah Sampai 10");
        System.out.println("Kamu Sangar");
      }
      
    num += 1;
    
    }
    System.out.println("\n============\n");
   
    int nom = 10;
   
    while (nom > 0) {
      System.out.println(nom);
      nom--;
    }
    
    System.out.println("Selamat Tahun Baru 2026");
    
  }
  
}
