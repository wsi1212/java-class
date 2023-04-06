package kr.hs.dgsw.java.Scanner;
import java.util.Scanner;
public class ScannerStudy {
    Scanner scanner = new Scanner(System.in);
    private void prepareScanner(){
        String str = null;
        do {
            str = this.scanner.nextLine();
            System.out.println(str);
        }while (!"그만".equals(str));
    }

    private void closeScanner(){
        this.scanner.close();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerStudy scannerStudy = new ScannerStudy();
        scannerStudy.prepareScanner();
        scanner.close();
    }
}
