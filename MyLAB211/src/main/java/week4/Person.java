/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Person {
    private String ID;
    private String fullName;
    private String phoneNumber;
    private int yearOfBirth;
    private String major;

    public Person() {
        this.ID = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yearOfBirth = 0;
        this.major = "";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    
    public void inputAll(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter ID: ");
            this.ID = sc.nextLine();
            if(ID.matches("\\d{6}")) break;
            System.out.println("invalid numbers");
        }
        
        while(true){
            System.out.println("Enter full name");
            this.fullName = sc.nextLine();
            if(fullName.matches("[a-zA-Z ]+")) break;
            System.out.println("invalid name");
        }
        
        while(true){
            System.out.println("Enter phone number");
            this.phoneNumber = sc.nextLine();
            if(phoneNumber.matches("\\d{12}")) break;
            System.out.println("invalid numbers");
        }
        while(true){
            System.out.println("Enter year of birth: ");
            this.yearOfBirth = sc.nextInt();
            if(yearOfBirth < java.time.Year.now().getValue()) break;
            System.out.println("invalid year");
        }
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yearOfBirth=" + yearOfBirth + ", major=" + major + '}';
    }
    
    
}
