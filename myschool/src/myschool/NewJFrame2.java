package myschool;

import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame2.java
 *
 * Created on May 31, 2010, 8:44:39 PM
 */

/**
 *
 * @author Administrator
 */
public class NewJFrame2 extends javax.swing.JFrame {

    public String jtf1;
    public String jtf2;
    public String jtf3;
    public String jtf4;
    public String jtf5;
    public String jtf6;
    public String jtf7;
    public String jtf8;
    public String jtf9;
    public String jtf10;
    public Integer n = 0;

    public  int jtfint1   ;
    public  int   jtfint5;
    public  int   jtfint6;
    public Integer jtfint10;


    /** Creates new form NewJFrame2 */
    public NewJFrame2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button2 = new java.awt.Button();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("مشخصات معلمان");

        jLabel1.setText("کد پرسنلی");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("نام");

        jLabel3.setText("نام خانوادگی");

        jLabel4.setText("شماره شناسنامه");

        jLabel5.setText("سال تولد");

        jLabel6.setText("مدرک تحصیلی");

        jLabel7.setText("شهر");

        jLabel8.setText("تلفن");

        jButton1.setText("ثبت");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("تغییر");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        button2.setLabel("حذف");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jButton3.setText("پاک کردن");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Integer s = JOptionPane.showOptionDialog(null, "are you sure you want insert infromation?", null, WIDTH, WIDTH, null, null, null);

        if (s == 0) {

            jtf1 = jTextField1.getText();
            boolean one = jtf1.equalsIgnoreCase(null);
            one = (jtf1.equalsIgnoreCase("") || one);
            one = (jtf1.equalsIgnoreCase(" ") || one);


            jtf2 = jTextField2.getText();
            boolean two = jtf2.equalsIgnoreCase(null);
            two = (jtf2.equalsIgnoreCase("") || two);
            two = (jtf2.equalsIgnoreCase(" ") || two);



            jtf3 = jTextField3.getText();
            boolean three = jtf3.equalsIgnoreCase(null);
            three = (jtf3.equalsIgnoreCase("") || three);
            three = (jtf3.equalsIgnoreCase(" ") || three);

            jtf6 = jTextField6.getText();
            boolean four = jtf6.equalsIgnoreCase(null);
            four = (jtf6.equalsIgnoreCase("") || four);
            four = (jtf6.equalsIgnoreCase(" ") || four);


           



            boolean six = one || two || three || four ;
          

            if (six != false) {
                JOptionPane.showMessageDialog(null, "full * field", null, JOptionPane.INFORMATION_MESSAGE);
            }

            if (six == false) {

                try {

                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

                    Connection con = DriverManager.getConnection("jdbc:odbc:mystud");
                    System.out.println("You could connect to database successfully!");
                    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet upd = stmt.executeQuery("SELECT * FROM pinfo");

                    upd.moveToInsertRow();
                    upd.updateInt("pcode", Integer.parseInt(jTextField1.getText()));
                    upd.updateString("PNAME", jTextField2.getText());
                    upd.updateString("PLNAME", jTextField3.getText())   ;
                    upd.updateInt("PSHSH", Integer.parseInt(jTextField4.getText()));
                    upd.updateInt("PBIR", Integer.parseInt(jTextField5.getText()));
                    upd.updateString("PLEVEL", jTextField6.getText());
                    upd.updateString("PCITY", jTextField7.getText());
                    upd.updateInt("PPHONE", Integer.parseInt(jTextField8.getText()));

                    upd.insertRow();

                    JOptionPane.showMessageDialog(null, "transmittal successful", null, JOptionPane.INFORMATION_MESSAGE);




                    upd.close();
                    stmt.close();
                    con.close();



                } catch (ClassNotFoundException  cnfEx) {

                    System.out.println("Unable to load driver!")   ;

                    //  System.exit(1)
                }

                catch (SQLException  sqlEx) {

                    System.out.println("Cannot connect to database ");
                    JOptionPane.showMessageDialog(null, "Cannot connect to database", null, JOptionPane.INFORMATION_MESSAGE);
                    // System.exit(1)  ;


                }

                catch(NumberFormatException  nfe )   {
                    //  System.exit(1)  ;
                    JOptionPane.showMessageDialog(null, "check field type", null, JOptionPane.INFORMATION_MESSAGE);


                    // System.exit(1)  ;
                }

            }


        }// end if  s
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


try {
                    Integer s = JOptionPane.showOptionDialog(null, "are you sure you want  change it?", null, WIDTH, WIDTH, null, null, null);


                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

                    Connection con = DriverManager.getConnection("jdbc:odbc:mystud");
                    System.out.println("You could connect to database successfully!");
                    Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
               Boolean b = false ;
                    if(s== 0  )
                {
                 stmt.executeUpdate("UPDATE  pinfo   set pname=('" + jTextField2.getText() + "') where  pcode =(" + jTextField1.getText() + ")" );
                   //b = stmt.execute("update  studinfo  set sname= ('" + jTextField2.getText() + "')  where snum=(" + jTextField1.getText() + ")" )  ;
                    }
                 if( s == 0 )
                  {

                  JOptionPane.showMessageDialog(null, "transmittal successful", null, JOptionPane.INFORMATION_MESSAGE);
                  }
                    stmt.close();
                    con.close();



                } catch (ClassNotFoundException  cnfEx) {

                    System.out.println("Unable to load driver!");

                    //  System.exit(1)
                }

                catch (SQLException  sqlEx) {

                           System.out.println("Cannot connect to database,check studnumber type ");
                           JOptionPane.showMessageDialog(null, "Cannot connect to database,check studnumber type", null, JOptionPane.INFORMATION_MESSAGE);
                    // System.exit(1)  ;


                }

                catch(NumberFormatException  nfe )   {
                 //  System.exit(1)  ;
               JOptionPane.showMessageDialog(null, "check field type,or key not exist", null, JOptionPane.INFORMATION_MESSAGE);



               // System.exit(1)  ;
                }
}//GEN-LAST:event_jButton2ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed



        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Connection con = DriverManager.getConnection("jdbc:odbc:mystud");
            System.out.println("You could connect to database successfully!");
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet ser = stmt.executeQuery("select * FROM pinfo where pcode = (" + jTextField1.getText() + ")" );


            
            Integer s = JOptionPane.showOptionDialog(null , "are sure you want delete it", null, WIDTH, WIDTH, null, null, null);

          //  if(ser.next())

                int upd = stmt.executeUpdate("delete * FROM pinfo where pcode= (" + jTextField1.getText() + ")" );


                
                JOptionPane.showMessageDialog(null, "transmittal successful ", null, JOptionPane.INFORMATION_MESSAGE);
          // }
            stmt.close();
            con.close();



        } catch (ClassNotFoundException  cnfEx) {

            System.out.println("Unable to load driver!");

            //  System.exit(1)
        }

        catch (SQLException  sqlEx) {

            System.out.println("Cannot connect to database ");
            JOptionPane.showMessageDialog(null, "Cannot connect to database", null, JOptionPane.INFORMATION_MESSAGE);
            // System.exit(1)  ;


        }

        catch(NumberFormatException  nfe )   {
            //  System.exit(1)  ;
            JOptionPane.showMessageDialog(null, "check field type", null, JOptionPane.INFORMATION_MESSAGE);



            // System.exit(1)  ;
        }


        // TODO add your handling code here:
}//GEN-LAST:event_button2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTextField1.setText(null)   ;
        jTextField2.setText(null)   ;
        jTextField3.setText(null)   ;
        jTextField4.setText(null)   ;
        jTextField5.setText(null)   ;
        jTextField6.setText(null)   ;
        jTextField7.setText(null)   ;
        jTextField8.setText(null)   ;



        // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
