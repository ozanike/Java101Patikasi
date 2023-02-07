package ogrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","+905306072103","TRH");
        Teacher t2 = new Teacher("Graham Bell", "53090605321","FZK");
        Teacher t3 = new Teacher("Kül YUtmaz","111231654564","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji","103","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4.Sınıf",tarih,fizik,biyoloji);
        s1.addBulkExamNote(45,50,50,70,45,30);
        s1.isPass();
        s1.printNote();

        Student s2 = new Student("Güdük Necmi","1241","4.Sınıf",tarih,fizik,biyoloji);
        s2.addBulkExamNote(60,70,55,65,70,80);
        s2.isPass();
        s2.printNote();

        Student s3 = new Student("Tulum Hayri","1547","4.Sınıf",tarih,fizik,biyoloji);
        s3.addBulkExamNote(30,45,60,65,25,30);
        s3.isPass();
        s3.printNote();





    }





}
