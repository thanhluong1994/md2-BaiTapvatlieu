import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static LocalDate LocalDate;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate=LocalDate.of(2022,2,26);
        Material[] materials = new Material[10];
//        5 doi tuong bot
        materials[0] = new CrispyFlour("Cr1", "Bot mi",LocalDate, 5000, 20);
        materials[1] = new CrispyFlour("Cr2", "Bot gao", LocalDate, 8000, 30);
        materials[2] = new CrispyFlour("Cr3", "Bot san", LocalDate, 9000, 50);
        materials[3] = new CrispyFlour("Cr4", "Bot chien", LocalDate, 10000, 20);
        materials[4] = new CrispyFlour("Cr5", "Bot dau", LocalDate, 6000, 60);
//        5 doi tuong thit
        materials[5] = new Meat("M1", "Thit ga",LocalDate, 30000, 1);
        materials[6] = new Meat("M2", "Thit lon", LocalDate, 40000, 1);
        materials[7] = new Meat("M3", "Thit bo", LocalDate, 50000, 1);
        materials[8] = new Meat("M4", "Thit vit", LocalDate, 60000, 1);
        materials[9] = new Meat("M5", "Thit de", LocalDate, 70000, 1);
    }

}
