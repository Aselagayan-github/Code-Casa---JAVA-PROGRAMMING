/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Members;

import Core.LMSAlert;
import Core.ObjectParser;
import Models.Member;
import Models.SetOfMembers;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sithira
 */
public class AddMemberGUI extends javax.swing.JFrame {

    private ObjectParser parser = ObjectParser.getInstance();
    
    /**
     * Creates new form AddMemberGUI
     */
    public AddMemberGUI() {
      
        initComponents();

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
        header_text = new javax.swing.JLabel();
        lbl_member_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        member_number = new javax.swing.JTextField();
        member_name = new javax.swing.JTextField();
        btn_add_member = new javax.swing.JButton();
        add_member_image = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header_text.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        header_text.setText("ADD MEMBERS FOR LMS");
        jPanel1.add(header_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 243, 20));

        lbl_member_name.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbl_member_name.setForeground(new java.awt.Color(0, 0, 255));
        lbl_member_name.setText("Member Name : ");
        jPanel1.add(lbl_member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Memeber number : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, 40));
        jPanel1.add(member_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 126, 190, 30));
        jPanel1.add(member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 189, 190, 30));

        btn_add_member.setText("Add Member");
        btn_add_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_memberActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        add_member_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/images/add-user.png"))); // NOI18N
        add_member_image.setText("jLabel2");
        jPanel1.add(add_member_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 64, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/no.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_memberActionPerformed
        
        if (member_name.getText().isEmpty() || member_number.getText().isEmpty())
        {
            LMSAlert.showDialog("Fields cannot be left empty");
        }
        else
        {
            
            Member member = new Member(Integer.parseInt(member_number.getText()), member_name.getText());
            
            SetOfMembers som = new SetOfMembers();
            
            try {
                
                som = (SetOfMembers) parser.readObject(som.TABLE_PATH);
                
                som.addMember(member);
                
                parser.writeObject(som.TABLE_PATH, som);
                
                LMSAlert.showDialog("New Member Added successfully");
                
                (new MembersGUI()).setVisible(true);                
                
            } catch (IOException ex) {
                Logger.getLogger(AddMemberGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddMemberGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_btn_add_memberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        dispose();
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
            java.util.logging.Logger.getLogger(AddMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_member_image;
    private javax.swing.JButton btn_add_member;
    private javax.swing.JLabel header_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_member_name;
    private javax.swing.JTextField member_name;
    private javax.swing.JTextField member_number;
    // End of variables declaration//GEN-END:variables
}
