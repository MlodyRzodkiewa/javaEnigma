import java.util.Scanner;


public class baconian
{
    private static Scanner in;
    public static void main(String[] args) 
    {
        in = new Scanner(System.in);
        System.out.print("1. Encr\n2. Decr");  
        int choice = in.nextInt();
        in.nextLine();

        if(choice == 1)
        {
            System.out.println("Encryption");
            atbashEncryption();
        } else if(choice == 2)
        {
            System.out.println("Decryption");
            atbashDecryption();
        }
    }

    private static void baconianEncryption()
    {

    }

    private static void baconianDecryption()
    {

    }
}