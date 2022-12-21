package transport;

import static transport.ValidateUtils.*;

public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;
    private DriverC category;

    public Driver(String name, Boolean hasLicense, Integer experience) throws IllegalAccessException {
        this.name = validateString(name, "Иван");
        this.hasLicense = validateBoolean(hasLicense);
        this.experience = validateInteger(experience, 1);
        setCategory(category);


    }

    public String getName() {
        return name;
    }

    public Boolean getHasLicense() {
        return hasLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setCategory(DriverC category) throws IllegalAccessException {
        if (category == null) {
            throw new IllegalAccessException("Необходимо указать тип прав!");
        }
        this.category = category;
    }

    public abstract String start();

    public abstract String stop();

    public abstract String refuel();
}
