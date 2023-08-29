import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainApp m1 = new MainApp();
        MainApp_1 m2 = new MainApp_1();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.File Compression and Decompress\n2.Image Compression and Decompress");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice == 1) {
            m1.fileCompressDecompress();
        }
        else if (choice == 2) {
            m2.imageCompressDecompress();
        }
        else {
            System.out.println("Invlid Option.2");
        }


    }
}
