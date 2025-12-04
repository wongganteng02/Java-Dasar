public class Belajar12_breakcontinue {

  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
    /*Fungsi break adalah memberhentikan
    Loop Secara paksa
    (biasanya dgn conditional if) 
    meskipun loop masih tetap lanjut*/
      if (i == 5) {
        i++;
        break;
      }
      
      System.out.println(i);
      System.out.println("Hello World");
      
    }
    
    System.out.println("\n============\n"); // Pwembatas Beda Program
    
    int num = 1;
    
    while (num <= 10) {
   
      if (num == 5) {
        num++;
        continue; //Skip 1 perulangan sesuai conditional
        
      }
      System.out.println(num);
      num++;
    }
    
  }

}
