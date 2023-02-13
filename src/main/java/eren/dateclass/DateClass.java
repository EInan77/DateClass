/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.dateclass;

/**
 *
 * @author ereni
 */
public class DateClass {

   private int month;
   private int day;
   private int year;

    public DateClass(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   public void displaydate(){
      System.out.println(month+"/"+day+"/"+year);
       
   }
}
