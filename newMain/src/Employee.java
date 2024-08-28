public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double vergi;
    double bonus;
    double raise;
    double taxbon;
    double taxbonsal;

    Employee( String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void printEmp(){

        tax(this.salary);
        bonus(this.workHours);
        raiseSalary(this.hireYear);

        this.taxbon=(this.salary)-(this.vergi)+(this.bonus);
        this.taxbonsal=this.taxbon+this.raise;

        System.out.println("\t");
        System.out.println("-----İŞÇİ BİLGİLERİ-----");
        System.out.println("Adı:" + this.name);
        System.out.println("Maaşı:" + this.salary);
        System.out.println("Çalışma Saati:" + this.workHours);
        System.out.println("Başlangıç Yılı:" + this.hireYear);
        System.out.println("Vergi:" + this.vergi);
        System.out.println("Bonus:" + this.bonus);
        System.out.println("Maaş Artışı:" + this.raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş:" + this.taxbon );
        System.out.println("Toplam Maaş:" + this.taxbonsal);

    }


    double tax(int salary){
        if (salary>=1000){
            this.vergi= (salary*(0.03));
        }
        else{
            this.vergi=0;
        }

        return this.vergi;
    }


    double bonus(int workHours){
        if(workHours>=40){
            this.bonus=(30*(workHours-40));
        }

        return this.bonus;
    }


    double raiseSalary(int hireYear){
        if((2021 - hireYear) < 10) {
            this.raise= (this.salary*0.05);
        }

        else if((2021 - hireYear) > 9 && (2021 - hireYear) < 20){
            this.raise= (this.salary*0.1);
        }

        else if((2021 - hireYear) > 19) {
            this.raise= (this.salary*0.15);
        }

        return this.raise;
    }


}
