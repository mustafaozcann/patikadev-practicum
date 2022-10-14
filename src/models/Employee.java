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

    /*
     * 
     * Maaşa uygulanan vergiyi hesaplayacaktır
     * Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
     * Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi
     * uygulanacaktır.
     * 
     */
    public float tax() {
        if (salary <= 1000) {
            return 0;
        }

        return salary * 3 / 100;

    }

    /*
     * bonus() :
     * Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her
     * saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     * 
     * 
     * 
     */
    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    /*
     * raiseSalary() :
     * 
     * 
     * Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki
     * yılı 2021 olarak alın.
     * Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam
     * yapılacaktır.
     * Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam
     * yapılacaktır.
     * Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
     * 
     * 
     * NOT
     * 
     * VERGİ VE BONUSLAR DİKKATE ALINACAK
     * 
     */

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

    // Çalışana ait bilgileri ekrana bastıracaktır.
    /*
     * 
     * Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi
     * ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı
     * bekliyoruz.
     * 
     * 
     */
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