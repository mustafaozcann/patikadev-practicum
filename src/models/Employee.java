package models;

public class Employee {

    private String name; 
    private float salary; 
    private int workHours; 
    private int hireYear; 

    
    public Employee(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public float tax() {
        if (salary <= 1000) {
            return 0;
        }

        return salary * 3 / 100;

    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }


    public float raiseSalary() {

        int totalYear = 2021 - hireYear;
        float taxAndBonus = bonus() - tax();
        float salaryWithBonusesAndTaxes = salary + taxAndBonus;

        if (totalYear < 10) {
            return salaryWithBonusesAndTaxes * 5 / 100;
        }
        else if(totalYear > 9 && totalYear < 20){
            return salaryWithBonusesAndTaxes * 10 / 100;
        }
        else if(totalYear > 19){
            return salaryWithBonusesAndTaxes * 15 / 100;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Adı : " + name + "\n" +
                "Maaş : " + salary + "₺\n" +
                "Haftalık Çalışma saati : " + workHours +"\n" +
                "Başlangıç Yılı : " + hireYear +"\n" +
                "Vergi : " + tax() +"₺\n" +
                "Bonus : " + bonus() +"₺\n" +
                "Maaş Artışı : " + raiseSalary() +"₺\n" +
                "Vergi ve bonuslarla birlikte maaş : " + (salary + bonus() - tax()) +"₺\n" +
                "Toplam Maaş : " + (salary + bonus()) + "₺";
    }

}