package info.vziks.appcontext.classes;

/**
 * Class PropertyContext
 * Project appcontext
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class PropertyContext {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public PropertyContext setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public PropertyContext setNumber(int number) {
        this.number = number;
        return this;
    }
}
