/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arthu
 */
public class question {
   private String intitule;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String proposition4;
    private int index;

    public question(String intitule, String p1, String p2, String p3, String p4, int index) {
        this.intitule = intitule;
        this.proposition1 = p1;
        this.proposition2 = p2;
        this.proposition3 = p3;
        this.proposition4 = p4;
        this.index = index;
        
    }
public String getintitule(){
    return intitule ; 
}
 public String get1() {
        return proposition1;
    }

    public String get2() {
        return proposition2;
    }

    public String get3() {
        return proposition3;
    }

    public String get4() {
        return proposition4;
    }

    public int getreponse() {
        return index;
    }
}






