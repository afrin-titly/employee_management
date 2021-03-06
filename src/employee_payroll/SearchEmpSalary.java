/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_payroll;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author afrin
 */
public class SearchEmpSalary extends javax.swing.JFrame {
Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form SearchEmpSalary
     */
    public SearchEmpSalary() {
        initComponents();
        
        conn=Database.db();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_title = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        txt_dept = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_desig = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_hired = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setText("Designation");

        jLabel8.setText("Status");

        jLabel9.setText("Date hired");

        jLabel10.setText("Job Title");

        jLabel11.setText("Basic salary");

        jLabel1.setText("Employee Id");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Employee Id");

        jLabel3.setText("First name");

        jLabel4.setText("Surname");

        jLabel5.setText("Date of birth");

        jLabel6.setText("Department");

        jButton1.setText("Get slip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_id)
                                    .addComponent(txt_firstname)
                                    .addComponent(txt_surname)
                                    .addComponent(txt_dob)
                                    .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_desig)
                            .addComponent(txt_status)
                            .addComponent(txt_hired)
                            .addComponent(txt_title)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_desig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_hired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{
            String sql="select * from addemp where id=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();

            if(rs.next()){
                String add1=rs.getString("id");
                txt_id.setText(add1);

                String add2=rs.getString("firstname");
                txt_firstname.setText(add2);

                String add3=rs.getString("surname");
                txt_surname.setText(add3);

                String add4=rs.getString("dateofbirth");
                txt_dob.setText(add4);

                String add5=rs.getString("basicsalary");
                txt_salary.setText(add5);

                String add6=rs.getString("department");
                txt_dept.setText(add6);

                String add7=rs.getString("designation");
                txt_desig.setText(add7);

                String add8=rs.getString("status");
                txt_status.setText(add8);

                String add9=rs.getString("datehired");
                txt_hired.setText(add9);

                String add10=rs.getString("jobtitle");
                txt_title.setText(add10);

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased
float x;
        String value,reason,overtime,bonus,medical,other;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
        String val=txt_firstname.getText();
        String val0=txt_surname.getText();
        String val1=txt_id.getText();
        String val2=txt_desig.getText();
        String val3=txt_dept.getText();
        
        
        
        JFileChooser dialog=new JFileChooser();
        dialog.setSelectedFile(new File(val+" "+val0+"-Salary Slip"+".pdf"));
        int dialogResult=dialog.showSaveDialog(null);
        if(dialogResult==JFileChooser.APPROVE_OPTION){
            String filepath=dialog.getSelectedFile().getPath();
            
            try{
                String sql = "select * from deduction where emp_id='"+val1+"'";
                pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                
                while(rs.next()){
                    value=rs.getString(5);
                    reason=rs.getString(6);
                    
                }
                rs.close();
                pst.close();
                
                String sq = "select * from allowance where emp_id='"+val1+"'";
                pst=conn.prepareStatement(sq);
                rs=pst.executeQuery();
                int calcTotal=Integer.parseInt(txt_salary.getText());
                
                while(rs.next()){
                    overtime=rs.getString(2);
                    bonus=rs.getString(4);
                    medical=rs.getString(3);
                    other=rs.getString(5);
                    x=Float.valueOf(rs.getString(9));
                }
                int v=Integer.parseInt(value);
                float total=calcTotal+x-v;
                
                Document myDocument=new Document();
                PdfWriter mywriter=PdfWriter.getInstance(myDocument, new FileOutputStream(filepath));
                myDocument.open();
                
                myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Employee Details",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
                myDocument.add(new Paragraph("Name of Employee: "+val+" "+val0,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Designation: "+val2,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Department: "+val3,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
                myDocument.add(new Paragraph("Basic salary: "+calcTotal,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                
                myDocument.add(new Paragraph("Overtime: "+overtime,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Bonus: "+bonus,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Medical: "+medical,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Other: "+other,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Deduction",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
                myDocument.add(new Paragraph("Deduction Details: "+reason,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Total Deduction: "+value,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                 
                myDocument.add(new Paragraph("------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("Total Payment",FontFactory.getFont(FontFactory.TIMES_BOLD,15,Font.BOLD)));
                myDocument.add(new Paragraph("Total Earnings: "+x,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                myDocument.add(new Paragraph("Net pay: "+total,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
                
                myDocument.newPage();
                myDocument.close(); 
                JOptionPane.showMessageDialog(null, "Report was successfully generated!");
                
                
                
             
                
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
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
            java.util.logging.Logger.getLogger(SearchEmpSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmpSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmpSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_dept;
    private javax.swing.JTextField txt_desig;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hired;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
