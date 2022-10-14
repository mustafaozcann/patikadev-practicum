package models;

public class Employee{

    private String name; //çalışan ismi
    private float salary; //çalışan maaşı
    private byte workHours; //haftalık çalışma saati
    private int hireYear; //işe başlangıç tarihi

    //constructor
    public Employee(String name,float salary, byte workHours,int  hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    
    /*

    Maaşa uygulanan vergiyi hesaplayacaktır
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

    */
    public float tax(){


        return 0;
    }
    /*
     * bonus() :
     * Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     * 
     * 
     * 
     */
    public int bonus(){
        return 0;
    }


    /*
     * raiseSalary() : 
     * Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.

     * Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

     * 
     * 
     */

     public float raiseSalary(){

        return 0;
     }


     //Çalışana ait bilgileri ekrana bastıracaktır.
     /*
      * 
 Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.


      */
     @Override
     public String toString() {
        return "Adı : " + name +
        "Maaş : " + salary +
        "Haftalık Çalışma saati : " + workHours +
        "Başlangıç Yılı : " + hireYear +
        "Vergi : " +
        "Bonus : " +
        "Maaş Artışı : " +
        "Vergi ve bonuslarla birlikte maaş : " +
        "Toplam Maaş : ";
     }


}