import java.io*;
public class BilanganPrima{
    public static void main(String[] args)throws IOException
	{
        BufferedReader in = new BufferedReadder(InputStreamReader(System.in));
        int awal, akhir, bil; 
        System.out.println("Bilangan Prima");
        System.out.print("Batas Awal\t: "); awal=in.nextInt();
        System.out.print("Batas Akhir\t: "); akhir=in.nextInt();
        System.out.printf("Bilangan prima dari %d sampai %d adalah \n", awal, akhir);
        int ang=awal;
        while (ang <= akhir) {
            int tmp = 0;
            for (int bagi = 2; bagi < ang; bagi++) {
                if (ang%bagi==0) {
                    tmp=1;
                }
            }
            if (tmp != 1) {
                System.out.println(ang);
                }
            ang++;
        }
    }
}
