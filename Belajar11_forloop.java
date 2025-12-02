package belajar;

public class forloop {

  public static void main(String[] args) {
  
    int num = 5;
    /*Perkalian 5 dari 1-10
    Menggunakan for loop*/
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " x " + i + " = " + (num * i) + "\n");
      
    }    
    
    System.out.println("===========\n");
    
     /*Jika i = 0 maka akan menampilkan hanya bilangan genap yg dimulai dari angka 0-20 
       Jika i = 1 maka akan menampilkan hanya bilangan ganjil yg dimulai dari angka 1-20*/
       
    for (int i = 1; i <= 20; i += 2) {
      System.out.println(i);
      
      /* Cara membacanya :
      cetaklah perulangan selama nilai i masih di bawah 20, yg di mulai dari angka 1 dan setiap perulangan nilai i tambahkan 2*/
      
    }
     
  }
  
}
