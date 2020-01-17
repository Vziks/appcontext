package info.vziks.appcontext.classes;

/**
 * Class Address
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Address {

    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address setNumber(int number) {
        this.number = number;
        return this;
    }
}
