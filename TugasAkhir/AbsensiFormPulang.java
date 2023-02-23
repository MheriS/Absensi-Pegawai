/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author herib
 */
public class AbsensiFormPulang extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    String a,b,c;

    /**
     * Creates new form AbFromPulang
     */
    public AbsensiFormPulang() {
        initComponents();
        jam();
        tanggal();
        abjampulang.setEditable(false);
        ActionListener acl=(ActionEvent ae) -> {
            a = gerak.getText();
            b = a.substring(0,1);
            c = a.substring(1, a.length());
            gerak.setText(c+b);
        };new javax.swing.Timer(300, acl).start();
        abot o = new abot();
        o.play();
    }
     public void tanggal(){
        java.util.Date Datenow = new java.util.Date();
        SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String tanggal = smpdtfmt.format(Datenow);
        jLabel_tanggal1.setText(tanggal);
    }

    public void jam(){
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nol_jam = "", nol_menit = "", nol_detik = "";
                java.util.Date datetime = new java.util.Date();
                int nilai_jam = datetime.getHours();
                int nilai_menit = datetime.getMinutes();
                int nilai_detik = datetime.getSeconds();
                if(nilai_jam <= 9) nol_jam = "0";
                if(nilai_menit <= 9) nol_menit ="0";
                if(nilai_detik <= 9) nol_detik ="0";
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                abjampulang.setText(jam + ":" + menit + ":" + detik + "");
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        gerak = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_tanggal1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_waktu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        abjampulang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        abNIP = new javax.swing.JTextField();
        jButton1Cari = new javax.swing.JButton();
        mncl = new javax.swing.JLabel();
        abnama = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        abjabatan = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Next = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 426));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(0, 0));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        gerak.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gerak.setText("                        Silahkan diisi, sampai jumpa besok!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gerak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 350, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\herib\\OneDrive\\Documents\\NetBeansProjects\\semester 2\\src\\TugasAkhir\\images\\batik1.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 0, 130, 430);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Tanggal       :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 90, 90, 17);
        getContentPane().add(jLabel_tanggal1);
        jLabel_tanggal1.setBounds(140, 90, 170, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Waktu        :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 120, 90, 17);
        getContentPane().add(jLabel_waktu);
        jLabel_waktu.setBounds(140, 120, 180, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Jam Pulang :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 150, 90, 17);

        abjampulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abjampulangActionPerformed(evt);
            }
        });
        getContentPane().add(abjampulang);
        abjampulang.setBounds(140, 150, 180, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan NIP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 190, 93, 17);

        abNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abNIPActionPerformed(evt);
            }
        });
        getContentPane().add(abNIP);
        abNIP.setBounds(140, 210, 93, 30);

        jButton1Cari.setBackground(new java.awt.Color(51, 153, 255));
        jButton1Cari.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1Cari.setText("Search");
        jButton1Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CariActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Cari);
        jButton1Cari.setBounds(250, 210, 80, 30);

        mncl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mncl.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mncl);
        mncl.setBounds(41, 250, 290, 30);
        getContentPane().add(abnama);
        abnama.setBounds(130, 280, 210, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Nama          :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 280, 90, 17);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Jabatan       :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 310, 90, 17);
        getContentPane().add(abjabatan);
        abjabatan.setBounds(130, 310, 210, 20);

        Submit.setBackground(new java.awt.Color(51, 153, 255));
        Submit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(140, 380, 90, 25);

        Next.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Next.setText("Next ->");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        getContentPane().add(Next);
        Next.setBounds(300, 60, 50, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("<- Kembali");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 60, 70, 17);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\herib\\OneDrive\\Documents\\NetBeansProjects\\semester 2\\src\\TugasAkhir\\images\\Absensi.png")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 46, 350, 380);

        setSize(new java.awt.Dimension(480, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abjampulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abjampulangActionPerformed

    }//GEN-LAST:event_abjampulangActionPerformed

    private void abNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abNIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abNIPActionPerformed

    private void jButton1CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CariActionPerformed
        AbsensiPulang a = new AbsensiPulang();
        String muncul = a.getP();
        if(abNIP.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Silahkan Cantumkan NIP Anda!");
        }else{

            String nip = abNIP.getText();
            try{
                String sql = "SELECT `Nama`, `Jabatan`, `InTime` FROM `attendance` where NIP = '"+nip+"';";
                java.sql.Connection conn = (Connection) AbsensiPegawai.getConnection();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery(sql);
                while (rs.next()){
                    abnama.setText(rs.getString("Nama"));
                    abjabatan.setText(rs.getString("Jabatan"));
                    jLabel_waktu.setText(rs.getString("InTime"));
                }
                mncl.setText(muncul);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1CariActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        AbsensiPulang a = new AbsensiPulang(jLabel_waktu.getText(), abjampulang.getText(), jLabel_tanggal1.getText(), abNIP.getText(), abnama.getText(), abjabatan.getText());
        String masuk = a.getIT();
        String pulang = a.getOT();
        String date = a.getDT();
        String nip1 = a.getNP();
        String nama =a.getNM();
        String jabatan = a.getJBTN();

        AbsensiPulang b = new AbsensiPulang();
        String muncul = b.getP();

        String nip = abNIP.getText();
        try{
            String sql = "SELECT `Nama`, `Jabatan`, `InTime` FROM `attendance` where NIP = '"+nip+"';";
            java.sql.Connection conn = (Connection) AbsensiPegawai.getConnection();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
            while (rs.next()){
                abnama.setText(rs.getString("Nama"));
                abjabatan.setText(rs.getString("Jabatan"));
                jLabel_waktu.setText(rs.getString("InTime"));
            }
            mncl.setText(muncul);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(abNIP.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Silahkan Cantumkan NIP Anda!");
        }else{
            try{
                String sql = " UPDATE `attendance` SET `NIP`= '"+nip1+"' , Nama = '"+nama+"' ,Jabatan = '"+jabatan+"' , InTime = '"+masuk+"' ,OutTime = '"+pulang+"' ,Date = '"+date+"' , NIP = '"+nip1+"'";
                java.sql.Connection conn = (Connection) AbsensiPegawai.getConnection();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil");
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
            abot o = new abot();
            o.close();
            AttendanceForm xx;
            xx = new AttendanceForm();
            xx.setVisible(true);
            this.dispose();
            AttendanceForm.AddRowJTable(new Object[]{nip1,nama,jabatan,masuk,pulang,date});
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        abot o = new abot();
        o.close();
        AttendanceForm xx;
        xx = new AttendanceForm();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NextMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        abot o = new abot();
        o.close();
        InOut ab;
        ab = new InOut();
        ab.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbsensiFormPulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbsensiFormPulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbsensiFormPulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbsensiFormPulang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbsensiFormPulang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Next;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField abNIP;
    private javax.swing.JLabel abjabatan;
    private javax.swing.JTextField abjampulang;
    private javax.swing.JLabel abnama;
    private javax.swing.JLabel gerak;
    private javax.swing.JButton jButton1Cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_tanggal1;
    private javax.swing.JLabel jLabel_waktu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mncl;
    // End of variables declaration//GEN-END:variables
}