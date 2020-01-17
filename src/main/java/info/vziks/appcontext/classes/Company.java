package info.vziks.appcontext.classes;

import org.springframework.stereotype.Component;

/**
 * Class Company
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
@Component
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Company setAddress(Address address) {
        this.address = address;
        return this;
    }
}

