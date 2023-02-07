package ogrenciNotSistemi;

public class Teacher {
    // Nitelikler...
    String name;
    String mpno;
    String branch;

    //Constructor Metodu...
    Teacher(String name,String mpno,String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;

    }

    void print(){
        System.out.println("Name\t:" + this.name);
        System.out.println("Mobile\t:" + this.mpno);
        System.out.println("Branch\t:" + this.branch);
    }

}
