/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

/**
 *
 * @author herib
 */
public class Attendance extends AbsensiPulang{

    public Attendance(String it, String ot, String dt, String np, String nm, String jbtn) {
        super(it, ot, dt, np, nm, jbtn);
    }
    @Override
    public String getNM(){
        return Nama;
    }
    @Override
    public void setNM(String n){
        Nama = n;
    }
    @Override
    public String getJBTN(){
        return Jabatan;
    }
    @Override
    public void setJBTN(String j){
        Jabatan = j;
    }
    @Override
    public String getIT(){
        return InTime;
    }
    public void setIT(String it){
        InTime = it;
    }
    @Override
    public String getOT(){
        return OutTime;
    }
    public void setOT(String ot){
        OutTime = ot;
    }
    @Override
    public String getDT(){
        return Date;
    }
    public void setDT(String d){
        Date = d;
    }
    @Override
    public String getNP(){
        return NIP;
    }
    @Override
    public void setNP(String i){
        NIP = i;
    }
}
