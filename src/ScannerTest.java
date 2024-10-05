import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Value");
        String text=scn.nextLine();
        System.out.println("Entered Value "+text);
    }
}
