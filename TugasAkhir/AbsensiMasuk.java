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
public class AbsensiMasuk extends Creat{
    String InTime;
    String OutTime;
    String Date;
    private String peringatan;
    
    public AbsensiMasuk(){
        this.peringatan = "PASTIKAN DATA DIBAWAH INI SUDAH BENAR!";
    }
    AbsensiMasuk(String it,String ot, String dt, String np, String nm, String jbtn){
        this.InTime = it;
        this.OutTime = ot;
        this.Date = dt;
        this.NIP = np;
        this.Nama = nm;
        this.Jabatan = jbtn;
    }
    public String getP(){
        return peringatan;
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
    public String getIT(){
        return InTime;
    }
    public String getOT(){
        return OutTime;
    }
    public String getDT(){
        return Date;
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
