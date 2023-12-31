/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Books.BooksGUI;
import GUI.Members.MembersGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author sithira
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();     
         times();
        dt();
    }
    
    Timer t;
    SimpleDateFormat st;
    public void times(){
    
        t = new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            
              Date dt =new Date();
              st=new SimpleDateFormat("hh:mm:ss a");
              String tt =st.format(dt);
              TIME.setText(tt);
                
            }
        });
        
        t.start();
        
    }
    
    public void dt(){
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String dd =sdf.format(d);
        DATE.setText(dd);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_all_books = new javax.swing.JButton();
        btn_all_members = new javax.swing.JButton();
        system_name = new javax.swing.JLabel();
        lbl_moto = new javax.swing.JLabel();
        lms_icon = new javax.swing.JLabel();
        DATE = new javax.swing.JLabel();
        TIME = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(670, 430));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_all_books.setBackground(new java.awt.Color(204, 204, 204));
        btn_all_books.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_all_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/book.png"))); // NOI18N
        btn_all_books.setText("BOOKS MANAGE");
        btn_all_books.setBorder(null);
        btn_all_books.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_all_books.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_all_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_all_booksActionPerformed(evt);
            }
        });
        jPanel1.add(btn_all_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 220, 70));

        btn_all_members.setBackground(new java.awt.Color(204, 204, 204));
        btn_all_members.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_all_members.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/people.png"))); // NOI18N
        btn_all_members.setText("MEMBERS MANAGE");
        btn_all_members.setBorder(null);
        btn_all_members.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_all_members.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_all_members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_all_membersActionPerformed(evt);
            }
        });
        jPanel1.add(btn_all_members, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 220, 70));

        system_name.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 48)); // NOI18N
        system_name.setForeground(new java.awt.Color(255, 255, 0));
        system_name.setText(" LIBRARY MANAGEMENT");
        jPanel1.add(system_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 47));

        lbl_moto.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lbl_moto.setText("FUNTIONS");
        jPanel1.add(lbl_moto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        lms_icon.setForeground(new java.awt.Color(255, 0, 0));
        lms_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/online-library (1).png"))); // NOI18N
        jPanel1.add(lms_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        DATE.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DATE.setForeground(new java.awt.Color(255, 255, 0));
        DATE.setText("DATE");
        DATE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 180, 20));

        TIME.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TIME.setForeground(new java.awt.Color(255, 255, 0));
        TIME.setText("TIME");
        TIME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(TIME, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 180, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/no.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/205496474-abstract-empty-college.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_all_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_all_booksActionPerformed
        
        (new BooksGUI()).setVisible(true);
        
    }//GEN-LAST:event_btn_all_booksActionPerformed

    private void btn_all_membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_all_membersActionPerformed
        
        (new MembersGUI()).setVisible(true);
        
    }//GEN-LAST:event_btn_all_membersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MembersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                              
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DATE;
    private javax.swing.JLabel TIME;
    private javax.swing.JButton btn_all_books;
    private javax.swing.JButton btn_all_members;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_moto;
    private javax.swing.JLabel lms_icon;
    private javax.swing.JLabel system_name;
    // End of variables declaration//GEN-END:variables

    private void setvisible(String afalse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
