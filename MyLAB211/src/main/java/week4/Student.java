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
public class Student extends Person{
    private int yearOfAdmission;
    private double englishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.englishScore = 0;
    }
 
    public void inputAll(){
        Scanner sc = new Scanner(System.in);
        super.inputAll();
        while(true){
            System.out.println("Enter year of adminssion: ");
            this.yearOfAdmission = sc.nextInt();
            if(yearOfAdmission < java.time.Year.now().getValue()) break;
            System.out.println("invalid year");
        }
        
        while(true){
            System.out.println("Enter English Score: ");
            this.englishScore = sc.nextDouble();
            if(englishScore >= 0 && englishScore <= 100) break;
            System.out.println("Invalid Score..");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "yearOfAdmission=" + yearOfAdmission + ", englishScore=" + englishScore + '}';
    }

}
