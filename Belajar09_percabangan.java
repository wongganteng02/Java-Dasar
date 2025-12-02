package belajar;
import java.util.Scanner;

public class percabangan {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
  
    System.out.print("Apakah kamu mau menonton video viral itu(y/n)? ");
    String yesnot = input.nextLine();
  
    if (yesnot.equalsIgnoreCase("y")) {
  
      System.out.print("Berapa Umur Kamu? ");
        int umur = input.nextInt();
    
        if (umur > 18) {
        System.out.println("Silahkan Menikmati Videonya:)");
        } else {
        System.out.println("Maaf kamu belum cukup umur;(");
        }
        
    } else {
        System.out.println("Yah udah kalo nggak mau:v");
    }
    
    input.close();
    
  }
  
}
