/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

import java.util.Date;

/**
 *
 * @author herib
 */
public class DataCuti extends Cuti{
    private String peringatan;
    Date tanggal;
    DataCuti(){
        this.peringatan = "NIP HARUS DISERTAKAN!";
    }

    public DataCuti(String np, String nm, String dac, String duc, String k, Date tgl) {
        super(np, nm, dac, duc, k);
        this.tanggal=tgl;
    }
    @Override
    public String getNP(){
        return NIP;
    }
    @Override
    public void setNP(String np){
        NIP = np;
    }
    public Date getT(){
        return tanggal;
    }
    @Override
    public String getNM(){
        return Nama;
    }
    @Override
    public void setNM(String nm){
        Nama = nm;
    }
    @Override
    public String getDaC(){
        return DateCuti;
    }
    public void setDaC(String a){
        DateCuti = a;
    }
    @Override
    public String getDuC(){
        return DurationCuti;
    }
    public void setDuC(String u){
        DurationCuti = u;
    }
    @Override
    public String getK(){
        return Keterangan;
    }
    public void setK(String k){
        Keterangan = k;
    }
}