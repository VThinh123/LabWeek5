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
public class Teacher extends Person{
    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0.0;
    }
    
    public void inputAll(){
        Scanner sc = new Scanner(System.in);
        //nhap lieu cho 3 thuoc tinh cua rieng teacher 
        super.inputAll();
        while(true){
            System.out.println("Enter year in profession: ");
            this.yearInProfession = sc.nextInt();
            sc.nextLine();
            int age = java.time.Year.now().getValue() - getYearOfBirth();
            if(yearInProfession >=0 && yearInProfession < age) break;
            System.out.println("invalid year");
        }
        
        while(true){
            System.out.println("Enter contract type: ");
            this.contractType = sc.nextLine();
            sc.nextLine();
            if(contractType.equals("long")|| contractType.equals("Short")) break;
            System.out.println("error...");
        }
        
        while(true){
            System.out.println("Enter salary coefficient: ");
            this.salaryCoefficient = sc.nextDouble();
            if(salaryCoefficient >= 0) break;
            System.out.println(" error....");
         }
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "yearInProfession=" + yearInProfession + ", contractType=" + contractType + ", salaryCoefficient=" + salaryCoefficient + '}';
    }
    
    
}
