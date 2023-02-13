/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eren.dateclass;

/**
 *
 * @author ereni
 */
public class DateClassTest {
    public static void main(String[] args){
        DateClass Dates= new DateClass(9, 8, 2005);
       System.out.println("Date:");
       Dates.displaydate();
      System.out.println("Month:" + Dates.getMonth());
      System.out.println("Day:" + Dates.getDay());
      System.out.println("Year:" + Dates.getYear());
}
}