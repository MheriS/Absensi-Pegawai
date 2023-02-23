/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

public abstract class Creat{
    protected String Nama;
    protected String Jabatan;
    protected String NIP;
    private String Tanggal;
    private String Email;
    private String Password;
    private String Repass;
    private String NoTelp;
    private String Alamat;
    private String NamaSalah;
    private String JabatanSalah;
    private String EmailSalah;
    private String PasswordSalah;
    private String RepassSalah;
    private String NoTelpSalah;
    private String AlamatSalah;
    private String NIPSalah;
    
    //constructor tanpa parameter
    public Creat(){
        this.NamaSalah="Silahkan Isi Data Nama";
        this.JabatanSalah="Silahkan Isi Data Jabatan";
        this.EmailSalah="Silahkan Isi Data Email";
        this.PasswordSalah="Silahkan Isi Data Password";
        this.RepassSalah="Repass = Ketik Ulang Password";
        this.NoTelpSalah="Silahkan Isi Data No.Telepon";
        this.AlamatSalah="Silahkan Isi Data Alamat";
        this.NIPSalah="Silahkan Isi Data NIP";
    }
    Creat(String nm, String jbtn, String tgl, String np, String eml, String pswd, String rps, String tlp, String almt){
        this.Nama=nm;
        this.Jabatan=jbtn;
        this.Tanggal=tgl;
        this.NIP=np;
        this.Email=eml;
        this.Password=pswd;
        this.Repass=rps;
        this.NoTelp=tlp;
        this.Alamat=almt;
    }
    
    public String getNM(){
        return Nama;
    }
    public void setNM(String n){
        Nama = n;
    }
    
    public String getJBTN(){
        return Jabatan;
    }
    public void setJBTN(String j){
        Jabatan = j;
    }

    public String getTgl(){
        return Tanggal;
    }
    public void setTgl(String t){
        Tanggal = t;
    }
    public String getNP(){
        return NIP;
    }
    public void setNP(String i){
        NIP = i;
    }

    public String getEML(){
        return Email;
    }
    public void setEML(String e){
        Email = e;
    }

    public String getPASS(){
        return Password;
    }
    public void setPASS(String p){
        Password = p;
    }

    public String getREPASS(){
        return Repass;
    }
    public void setREPASS(String r){
        Repass = r;
    }
    
    public String getTLP(){
        return NoTelp;
    }
    public void setTLP(String l){
        NoTelp = l;
    }

    public String getALMT(){
        return Alamat;
    }
    public void setALMT(String m){
        Alamat = m;
    }

    public String getNMS(){
        return NamaSalah;
    }
    
    public String getJBTNS(){
        return JabatanSalah;
    }
    
    public String getNPS(){
        return NIPSalah;
    }

    public String getEMLS(){
        return EmailSalah;
    }

    public String getPASSS(){
        return PasswordSalah;
    }

    public String getREPASSS(){
        return RepassSalah;
    }
    
    public String getTLPS(){
        return NoTelpSalah;
    }

    public String getALMTS(){
        return AlamatSalah;
    }
}