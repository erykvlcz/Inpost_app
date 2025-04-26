package pl.kurs.models;

public class Paczkomat {
    private String name;
    private String address;

    private Paczkomat(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static Paczkomat createPaczkomat(String address){
        if(address == null){
            throw new NullPointerException("Nie mozę byc null");
        }

        String[] addressWords = address.split(" ");
        String name = "";

        for (String addressWord : addressWords) {
            name += addressWord.substring(0,1);
        }


        return new Paczkomat(name, address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Paczkomat{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

