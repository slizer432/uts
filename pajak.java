import java.util.Scanner;
public class pajak {
    public static void main(String[] args) {
        double totalHarga = 0;
        double penghasilan = 0;
        double totalPajak = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah anda memiliki usaha atau tidak (Y/T): ");
        String usaha = sc.nextLine();

        if (usaha.equalsIgnoreCase("y")) {
            System.out.print("Berapakah penghasilan anda dalam 1 tahun? ");
            penghasilan = sc.nextDouble();

        }
        System.out.print("Berapa banyak harta yang anda miliki? ");
        int banyakHarta = sc.nextInt();
        for (int i = 0; i < banyakHarta; i++) {
            System.out.print("Masukkan nama harta yang anda miliki: ");
            sc.next();
            String namaHarta = sc.nextLine();
            System.out.print("Masukkan nilai jual harta tersebut: ");
            double hargaHarta = sc.nextDouble();
            totalHarga += hargaHarta;
        }
        double totalPendapatan = totalHarga + penghasilan;
        totalPajak = totalPendapatan * 0.15;
        System.out.print("Apakah anda sudah berkeluarga (Y/T)? ");
        char keluarga = sc.next().charAt(0);
        if (keluarga == 'y' || keluarga == 'Y') {
            System.out.print("Apa tingkat pendidikan keluarga pertama anda? ");
            sc.nextLine();
            String tingkatPendidikan1 = sc.nextLine();
            System.out.print("Apa tingkat pendidikan keluarga kedua anda? ");
            String tingkatPendidikan2 = sc.nextLine();
            if ((tingkatPendidikan1.equalsIgnoreCase("SMA") && tingkatPendidikan2.equalsIgnoreCase("kuliah") 
            || tingkatPendidikan1.equalsIgnoreCase("kuliah") && tingkatPendidikan2.equalsIgnoreCase("SMA")) && totalPendapatan >= 50000000 ) {
                totalPajak *= 0.90; 
                
            }
            else if ((tingkatPendidikan1.equalsIgnoreCase("SD") && tingkatPendidikan2.equalsIgnoreCase("SMP") 
            || tingkatPendidikan1.equalsIgnoreCase("SMP") && tingkatPendidikan2.equalsIgnoreCase("SD")) && totalPendapatan <= 50000000) 
                totalPajak *= 0.95;
        }
        System.out.println("Total pajak anda adalah " + (int)totalPajak);
    }
    }
    
