public interface Service {
    void getOfAge(Customer [] customers);
    void similarCountries(String nameCountry,Customer [] customers) throws Exception;
    void sortCountries(Customer [] customers);
    void getAllCustomer(Customer [] customers);

}
