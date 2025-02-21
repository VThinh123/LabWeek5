/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO LEGION
 */
public class test {
    public static void main(String[] args) {
        CourseManagerment courseManagerment = new CourseManagerment();
        OnlineCourse onlineCoure1 = new OnlineCourse();
        OnlineCourse onlineCoure2 = new OnlineCourse();
        onlineCoure1.InputAll("PRF302", "java web", 3, "Windown", "Ve cong Vo", "note");
        onlineCoure2.InputAll("LAB211", "java web", 3, "Windown", "Hoang TV", "note");
        courseManagerment.addOnlineCourse(onlineCoure1);
        courseManagerment.addOnlineCourse(onlineCoure2);
        
        courseManagerment.showOnlineCourse();
        
//        courseManagerment.deleteOnlineCourse("01");
    }
}
