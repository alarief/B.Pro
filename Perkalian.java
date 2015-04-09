import  java.util.Scanner;
public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, j = 1, hasil;
        String enter;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                hasil = i * j;
                System.out.println(i + "x" + j + '=' + hasil);
                if (j == 10) {
                    System.out.println("Enter");
                    enter = input.nextLine();

                    if (enter.equals("")) {
                        continue;

                    }
                }
            }
        }
    }
}
