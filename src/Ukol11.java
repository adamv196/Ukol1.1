import java.time.LocalDate;

public class Ukol11 {

    public static void main(String[] args) {

        String name,surname; // vsetky datove typy je mozne zapisat do jedneho riadku (zaberie menej miesta)
        LocalDate dateOfBirth;
        int numbersOfContracts;
        numbersOfContracts = 5;
        float carrotsWeightInTons;
        carrotsWeightInTons = 10.3F;
        String city;
        String spz;
        float wehicleConsumption;
        String ipAddress; // bolo by mozne pouzit aj Arrays

        float averageSale = carrotsWeightInTons / numbersOfContracts;

        System.out.println("Average quantity of carrots sold per contract: "+averageSale+" tons.");

    }
}
