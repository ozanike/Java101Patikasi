package ogrenciNotSistemi;

public class Student {
    //Nitelikleri
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    //Constructor metodu;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1,int sNotu1, int note2,int sNotu2, int note3,int sNotu3) {
        if ((note1 >= 0 && note1 <= 100) && (sNotu1 >= 0 && sNotu1 <=100)) {
            this.c1.note = note1;
            this.c1.sNotu = sNotu1;

        }
        if ((note2 >= 0 && note2 <= 100) && (sNotu2 >= 0 && sNotu2 <=100)) {
            this.c2.note = note2;
            this.c2.sNotu = sNotu2;
        }
        if ((note3 >= 0 && note3 <= 100) && (sNotu3 >= 0 && sNotu3 <=100)) {
            this.c3.note = note3;
            this.c3.sNotu = sNotu3;
        }
    }

    void isPass() {
        System.out.println("=================");
        this.c1.aAvarge = (c1.note * 0.80) + (c1.sNotu * 0.20);
        this.c2.aAvarge = (c2.note * 0.80) + (c2.sNotu * 0.20);
        this.c3.aAvarge = (c3.note * 0.80) + (c3.sNotu * 0.20);

        this.avarage = (c1.aAvarge + c2.aAvarge + c3.aAvarge) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Hababam Sınıfı Uyanıyor :)");
            this.isPass = true;
        } else {
            System.out.println("Hababam Snıfı Sınıfta Kaldı :(");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu\t:" + this.c1.note);
        System.out.println(this.c1.name + " Sözlü Notu\t:" + this.c1.sNotu);
        System.out.println(this.c2.name + " Notu\t:" + this.c2.note);
        System.out.println(this.c2.name + " Sözlü Notu\t:" + this.c2.sNotu);
        System.out.println(this.c3.name + " Notu\t:" + this.c3.note);
        System.out.println(this.c3.name + " Sözlü Notu\t:" + this.c3.sNotu);
        System.out.println("Ortalamanız\t:" + this.avarage);

    }

}
