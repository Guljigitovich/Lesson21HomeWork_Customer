import java.time.LocalDate;
import java.util.Arrays;

public class Customer implements Service {
    private String name;
    private String surname;
    private Country country;
    private LocalDate birthOfDay;
    private String emaill;

    public Customer() {
    }

    public Customer(String name, String surname, Country country, LocalDate birthOfDay, String emaill) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.birthOfDay = birthOfDay;
        this.emaill = emaill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country country() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(LocalDate birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wasBornCountry='" + country + '\'' +
                ", birthOfDay=" + birthOfDay +
                ", emaill='" + emaill + '\'' +
                '}';
    }

    @Override
    public void getOfAge(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.getName() + " " + LocalDate.now().minusYears(customer.getBirthOfDay().getYear()).minusMonths(customer.getBirthOfDay().getMonthValue()).minusDays(customer.getBirthOfDay().getDayOfMonth()) + " age");
        }
    }

    @Override
    public void similarCountries(String nameCountry, Customer[] customers) throws Exception {
        if (nameCountry.matches("[1-9]+")) {
            throw new Exception("сен соз жазчуу жерге сан жазып койдун!!!!");
        }
        for (Customer customer : customers) {
            if (customer.country.name().equals(nameCountry.toUpperCase())) {
                System.out.println(customer);
            }
        }
    }

    @Override
    public void sortCountries(Customer[] customers)  {
        String[] array = new String[customers.length];
        int index = 0;
        for (Customer customer : customers) {
            array[index] = customer.country().name();
            index++;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void getAllCustomer(Customer[] customers) {
        String[] array = new String[customers.length];
        int index = 0;
        for (Customer customer : customers) {
            array[index] = customer.toString();
            index++;
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}




