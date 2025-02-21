/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author LENOVO LEGION
 */
public class OfflineCourse extends Course{
    private String begin;
    private String end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = "";
        this.end = "";
        this.campus = campus;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    public void InputAll(String cd, String cn, int cr, String be, String en, String cam){
        super.InputAll(cd, cn, cr);
        begin = be;
        end = en;
        campus = cam;
    }

    @Override
    public String toString() {
        return super.toString() +  "OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }
    
}
