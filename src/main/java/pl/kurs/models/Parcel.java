package pl.kurs.models;

import java.util.Random;

public class Parcel {
    private String code;
    private Size size;
    private Paczkomat shippingPaczkomat;
    private Paczkomat deliveryPaczkomat;

    private Parcel(String code, Size size, Paczkomat shippingPaczkomat, Paczkomat deliveryPaczkomat) {
        this.code = code;
        this.size = size;
        this.shippingPaczkomat = shippingPaczkomat;
        this.deliveryPaczkomat = deliveryPaczkomat;
    }

    public static Parcel createParcel(Size size, Paczkomat shippingPaczkomat, Paczkomat deliveryPaczkomat) {
        String code = generatePackageCode() + shippingPaczkomat.getName() + deliveryPaczkomat.getAddress();

        return new Parcel(code, size, shippingPaczkomat, deliveryPaczkomat);
    }

    public static String generatePackageCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000); // losuje liczbę od 100000 do 999999
        return String.valueOf(code);
    }
}
