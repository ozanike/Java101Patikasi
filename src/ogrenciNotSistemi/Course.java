package ogrenciNotSistemi;

public class Course {
    // Nitelikler
    // Teacher sınıfından teacher adında bir nitelik aldım...
    // Sınıflar birbirinin nitelikleri olabilirler.
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sNotu;
    double aAvarge;

    Course(String name,String code,String prefix){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sNotu = 0;
        double aAvarage = 0.0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve Ders İçeriği Uyuşmuyor !");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }

}
