
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk mengeja nama
 */
public class EjaanNama {

    public static void main(String[] args) {
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        Scanner scanner = new Scanner(System.in);
        String namaLengkap = scanner.next();
        System.out.println("Ejaan untuk \"" + namaLengkap + "\" adalah : ");
        for (int i = 0; i < namaLengkap.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + namaLengkap.charAt(i));
        }
    }

}
