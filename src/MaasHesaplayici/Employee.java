package MaasHesaplayici;

public class Employee {
    // Nitelikler

    String name;
    double salary;
    int workHourse;
    int hireYear;

    Employee(String name,int salary,int workHourse,int hireYear){

        this.name = name;
        this.salary = salary;
        this.workHourse = workHourse;
        this.hireYear = hireYear;

    }

    double tax(){
        if (this.salary < 1000){
            return 0;
        }
        else{
            return (this.salary * 0.03);
        }
    }

    int bonus(){
        if(workHourse > 40){
            return ((workHourse - 40) * 30);
        }else{
            return 0;
        }
    }
    double raiseSalary(){
        if((2021 - this.hireYear) < 10){
            return (this.salary * 0.05);
        }else if(9 < (2021 - this.hireYear) && (2021 - this.hireYear < 20)){
            return (this.salary * 0.10);
        }else{
            return (this.salary * 0.15);
        }

    }

    public String toString(){
        System.out.println("=======================");
        System.out.println("Adı\t:" + this.name);
        System.out.println("Maaşı\t:" + this.salary);
        System.out.println("Çalışma Saati\t:" + this.workHourse);
        System.out.println("Başlangıç Yılı\t:" + this.hireYear);
        System.out.println("Vergi\t:" + tax() );
        System.out.println("Bonus\t:" + bonus());
        System.out.println("Maaş Artışı\t:" + raiseSalary());
        System.out.println("Vergi ve Bonuslarlar ile birlikte maaş\t:" + ((this.salary)-tax()+bonus()));
        System.out.println("Toplam Maaş\t:" + (this.salary + raiseSalary()));

        return null;
    }


}
