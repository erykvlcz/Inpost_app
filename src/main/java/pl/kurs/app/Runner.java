package pl.kurs.app;

import pl.kurs.models.Paczkomat;
import pl.kurs.models.Parcel;
import pl.kurs.models.Size;

public class Runner {
    public static void main(String[] args) {
        Paczkomat paczkomat1 = Paczkomat.createPaczkomat("Stadnisław Dolny 373");
        Paczkomat paczkomat2 = Paczkomat.createPaczkomat("Przytkowice 41C");
        System.out.println(paczkomat1);
        Parcel parcel1 = Parcel.createParcel(Size.SMALL, paczkomat1, paczkomat2);
        System.out.println(parcel1);
    }
}
