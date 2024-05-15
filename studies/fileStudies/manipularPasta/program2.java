package fileStudies.manipularPasta;

import java.io.File;
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("getAbsolutePath: " + path.getAbsolutePath());
        System.out.println("toString: " + path.toString());

        sc.close();
    }
}
