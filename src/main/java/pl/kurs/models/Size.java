package pl.kurs.models;

public enum Size {
    SMALL("mała"),
    MEDIUM("średnia"),
    LARGE("duża");

    private String description;

    Size(String description) {
        this.description = description;
    }


}
