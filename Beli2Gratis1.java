import java.io.*;

public class Beli2Gratis1 {
  public static void main(String[] arif)throws IOException 
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  
  //Tampilan Masukan
  int barang;
  System.out.print("Masukan Jumlah Barang :");
  barang = Integer.parseInt(in.readLine());
  int diskon=barang/2;
  int total = barang+diskon;
  //Hasil Perhitungan
  System.out.println("Jumlah Bonus :" +diskon);
  System.out.println("Total item yang dibawa pulang :" +total);
  System.out.println("Total Harga :" +barang*25000);
 }
}
  
