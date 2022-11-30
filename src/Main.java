import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer [] customers = new Customer[]{
                new Customer("Andrei","Petrov",Country.RUSSIA, LocalDate.of(1997,11,20), "andrei_123"),
                new Customer("John","Adam",Country.USA, LocalDate.of(1995,3,14), "john_145"),
                new Customer("Aktan","Asanov",Country.KYRGYZSTAN, LocalDate.of(1996,5,7), "artan.Kg_123"),
                new Customer("Mustafa","Ahmet",Country.TURKEY, LocalDate.of(1994,8,24), "tr.ahmet_43"),
                new Customer("Aleksei","Sergei",Country.RUSSIA,LocalDate.of(1998,10,16),"aleksei_34"),
        };
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                for (Customer customer : customers) {
                    switch (scanner1.nextInt()) {
                        case 1 -> customer.getOfAge(customers);
                        case 2 -> customer.similarCountries(scanner.nextLine(), customers);
                        case 3 -> customer.getAllCustomer(customers);
                        case 4 -> customer.sortCountries(customers);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("сен сан жазчуу жерге соз жазып койдун");
            } catch (Exception e) {
                System.err.println("сен соз жазчуу жерге сан жазып койдун");
            }
        }




    }
    static {
        System.out.println("""
                1 бассаныз жашын чыгаруучу метод иштейт
                2 бассаныз олкосу окшош медот иштейт
                3 бассаныз баардык кардар чыгуучу метод иштейт
                4 бассаныз олколорду сорт кылуучу метод иштейт 
               """);
    }
}