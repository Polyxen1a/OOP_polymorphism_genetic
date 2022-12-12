package transport;

import static transport.ValidateUtils.*;

public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;

    public Driver(String name, Boolean hasLicense, Integer experience) {
        this.name = validateString(name, "Иван");
        this.hasLicense = validateBoolean(hasLicense);
        this.experience = validateInteger(experience, 1);
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

    public abstract String start();

    public abstract String stop();

    public abstract String refuel();
}
