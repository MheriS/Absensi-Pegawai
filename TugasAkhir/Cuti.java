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
public class Cuti extends Creat{
    String DateCuti;
    String DurationCuti;
    String Keterangan;
    private String peringatan;
    
    Cuti(){
        this.peringatan = "NIP HARUS DISERTAKAN!";
    }
    Cuti(String np, String nm, String dac, String duc, String k){
        this.NIP = np;
        this.Nama = nm;
        this.DateCuti = dac;
        this.DurationCuti = duc;
        this.Keterangan = k;
    }
    public String getP(){
        return peringatan;
    }
    @Override
    public String getNP(){
        return NIP;
    }
    @Override
    public void setNP(String np){
        NIP = np;
    }
    @Override
    public String getNM(){
        return Nama;
    }
    @Override
    public void setNM(String nm){
        Nama = nm;
    }
    public String getDaC(){
        return DateCuti;
    }
    public String getDuC(){
        return DurationCuti;
    }
    public String getK(){
        return Keterangan;
    }
}
