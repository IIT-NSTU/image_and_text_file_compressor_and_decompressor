import java.util.Scanner;
import java.io.IOException;

public class MainApp_1{

    void imageCompressDecompress(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Compress an image");
        System.out.println("2. Decompress an image");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter image file name to compress with extension: ");
            String filename = sc.next();
            compressImage(filename);
        } else if (choice == 2) {
            System.out.println("Enter lzw file name to decompress with extension: ");
            String filename = sc.next();
            System.out.println("Enter extension of output image required (Ex: for .bmp enter bmp)");
            String extension = sc.next();
            decompressImage(filename, extension);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void compressImage(String filename) {
        MyComp.filename = filename;
        try {
            MyComp.compress();
            System.out.println("Compression complete! Check the compressed file.");
        } catch (IOException ie) {
            System.out.println("Error compressing the image.");
        }
    }

    public static void decompressImage(String filename, String extension) {
        MyDecomp.filename = filename;
        MyDecomp.extension = extension;
        try {
            MyDecomp.decompress();
            System.out.println("Decompression complete! Check the decompressed image.");
        } catch (IOException ie) {
            System.out.println("Error decompressing the image.");
        }
    }
}
