public class Dasar14_method {
  
  /* Fungsi static Adalah Agar Method Yg Bernama hello() Bisa Dipanggil Langsung Dari 
  Method main Tanpa Membuat Objek.
  
     Fungsi void Adalah Agar Method Yg Bernama hello() Tidak Bisa Mengembalikan Nilai,  
  Jika Method Punya Tipe-Data Maka Nilainya Tidak Bisa Dikembalikan Ke Program Utama / Method main.
  
     Fungsi heello() Adalah Jika Parameter Tidak Di isi Maka Berfungsi Sebagai Pemanggilan 
  Fungsi Biasa Di Method main Yg Bisa Digunakan Berulang-ulang Tanpa Merubah Output. */
  
  static void hello() { 
    
    System.out.println("Hello Wong Ganteng");
    
  }

  public static void main(String[] args) {
  
  hello();
  hello(); 
  hello();
  
  }

}
