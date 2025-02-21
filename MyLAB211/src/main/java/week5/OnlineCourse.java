/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO LEGION
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void InputAll( String cd, String cn, int cr, String pf, String is, String nt){
        super.InputAll(cd, cn, cr);
        platform = pf;
        instructors = is;
        note=nt;
    }

    @Override
    public String toString() {
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }
    
}
