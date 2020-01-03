package pl.pawtel.expressions_statements_methods.mega_bytes_converter;

public class MegaBytesConverter {
    public static void main(String[] args) {
        // 1 MB = 1024 KB
        printMegaBytesAndKiloBytes(5000);
        // 5000 KB = 4 MB and 904 KB
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = 0;
            int remainingKilobytes = kiloBytes % 1024;
            megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
    }
}
