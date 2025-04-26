package pl.kurs.app;

import pl.kurs.models.Paczkomat;

public class Runner {
    public static void main(String[] args) {
        Paczkomat paczkomat1 = Paczkomat.createPaczkomat("Stadnisław Dolny 373");
        System.out.println(paczkomat1);
    }
}
