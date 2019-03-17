import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean log = true;
        BinaryTree b = new BinaryTree();
        do {
            System.out.println("=== MENU HEAP TREE ===");
            System.out.println("1. TAMBAH ANGKA");
            System.out.println("2. HAPUS ANGKA");
            System.out.println("3. LIHAT HEAP TREE");
            System.out.println("4. EXIT");
            System.out.print("Pilihan: ");
            int pilih = input.nextInt();

            if (pilih == 1){
                System.out.print("Masukkan Angka: ");
                int angka = input.nextInt();
                b.insert(angka);
                System.out.println();
            }else if (pilih == 2){
                System.out.print("Masukkan Angka yang ingin dihapus: ");
                int angka = input.nextInt();
                b.delete(angka);
                System.out.println();
            }else if (pilih == 3){
                b.display(b.root);
                System.out.println();
            }else if (pilih == 4){
                System.exit(0);
            }else {
                System.out.println("Pilihan tidak ada yang cocok");
            }
        }while (log);
    }

}
