/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.text.*;;
import java.util.Date;

/**
 *
 * @author User
 */
public class BookingSession extends javax.swing.JFrame {

    /**
     * Creates new form BookingSession
     */
    
    
    NumberFormat A =NumberFormat.getNumberInstance();
     static int s=10000000;
     static int s1=20000000;
     static int s2=5000000;
     static int s3=60000000;
     static int s4=12000000;
     static int s5=40000000;
     static int s6=80000000;
 static int st,y;
       String x;  
    public BookingSession() {
     
        
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1HomeBook = new javax.swing.JLabel();
        jLabel2servbook = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        agenttxt = new javax.swing.JTextField();
        Addresstxt = new javax.swing.JTextField();
        Locationtxt = new javax.swing.JTextField();
        Emailtxt = new javax.swing.JTextField();
        Totaltxt = new javax.swing.JTextField();
        Advancetxt = new javax.swing.JTextField();
        EventCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Date_chooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        print_textarea = new javax.swing.JTextArea();
        reset_btn = new javax.swing.JButton();
        print_btn = new javax.swing.JButton();
        book_btn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booking Session");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1HomeBook.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1HomeBook.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1HomeBook.setText("Home");
        jLabel1HomeBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1HomeBookMouseClicked(evt);
            }
        });

        jLabel2servbook.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2servbook.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2servbook.setText("Service");
        jLabel2servbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2servbookMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Booking Session");

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("About us");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact us");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1HomeBook)
                .addGap(50, 50, 50)
                .addComponent(jLabel2servbook)
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addGap(64, 64, 64)
                .addComponent(jLabel5)
                .addGap(68, 68, 68)
                .addComponent(jLabel4)
                .addContainerGap(692, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1HomeBook)
                    .addComponent(jLabel2servbook)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 80));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Booking Session");

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agent Name :");

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address :");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Events :");

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Location:");

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email :");

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total price :");

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Advance amount :");

        agenttxt.setBackground(new java.awt.Color(108, 122, 137));
        agenttxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        agenttxt.setForeground(new java.awt.Color(255, 255, 255));

        Addresstxt.setBackground(new java.awt.Color(108, 122, 137));
        Addresstxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Addresstxt.setForeground(new java.awt.Color(255, 255, 255));

        Locationtxt.setBackground(new java.awt.Color(108, 122, 137));
        Locationtxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Locationtxt.setForeground(new java.awt.Color(255, 255, 255));

        Emailtxt.setBackground(new java.awt.Color(108, 122, 137));
        Emailtxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Emailtxt.setForeground(new java.awt.Color(255, 255, 255));

        Totaltxt.setBackground(new java.awt.Color(108, 122, 137));
        Totaltxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Totaltxt.setForeground(new java.awt.Color(255, 255, 255));
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });

        Advancetxt.setBackground(new java.awt.Color(108, 122, 137));
        Advancetxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        Advancetxt.setForeground(new java.awt.Color(255, 255, 255));

        EventCombo.setBackground(new java.awt.Color(108, 122, 137));
        EventCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public Hall Events", "Press Meetings", "Book Publish", "Election Campaign Events", "New Year Events", "Official Parties", "Culturals" }));
        EventCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventComboActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date :");

        Date_chooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_chooserMouseClicked(evt);
            }
        });

        print_textarea.setEditable(false);
        print_textarea.setBackground(new java.awt.Color(108, 122, 137));
        print_textarea.setColumns(20);
        print_textarea.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        print_textarea.setForeground(new java.awt.Color(0, 0, 0));
        print_textarea.setRows(5);
        jScrollPane1.setViewportView(print_textarea);

        reset_btn.setBackground(new java.awt.Color(192, 57, 43));
        reset_btn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        print_btn.setBackground(new java.awt.Color(0, 204, 0));
        print_btn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        print_btn.setText("Print");
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });

        book_btn.setBackground(new java.awt.Color(34, 167, 240));
        book_btn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        book_btn.setText("Book!");
        book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Balance :");

        balanceTxt.setEditable(false);
        balanceTxt.setBackground(new java.awt.Color(108, 122, 137));
        balanceTxt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        balanceTxt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(reset_btn)
                        .addGap(133, 133, 133)
                        .addComponent(book_btn)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Advancetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(Addresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(agenttxt)
                            .addComponent(Locationtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(Emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(Totaltxt, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(EventCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date_chooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(balanceTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print_btn)
                        .addGap(274, 274, 274))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(agenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(EventCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Locationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Advancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(Date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset_btn)
                            .addComponent(book_btn)
                            .addComponent(print_btn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1440, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1HomeBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1HomeBookMouseClicked
        Homepage_Event hm = new Homepage_Event();        // TODO add your handling code here:
        hm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1HomeBookMouseClicked

    private void jLabel2servbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2servbookMouseClicked
                ServiceEvent srv = new ServiceEvent();
                srv.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel2servbookMouseClicked

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
             try{
               print_textarea.setText(print_textarea.getText()+"\n try");
              print_textarea.print();
             
                  }catch(Exception e){
                     
                  }
    }//GEN-LAST:event_print_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
            agenttxt.setText("");
            Addresstxt.setText("");
            Locationtxt.setText("");
            Emailtxt.setText("");
            Totaltxt.setText("");
            Advancetxt.setText("");
            
            
    }//GEN-LAST:event_reset_btnActionPerformed

    private void EventComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventComboActionPerformed
             if(EventCombo.getSelectedItem().equals("Public Hall Events")){
                 Totaltxt.setText(A.format(s));
             }
             if(EventCombo.getSelectedItem().equals("Press Meetings")){
                 Totaltxt.setText(A.format(s1));
             }
             if(EventCombo.getSelectedItem().equals("Book Publish")){
                 Totaltxt.setText(A.format(s2));
             }
             if(EventCombo.getSelectedItem().equals("Election Campaign Events")){
                 Totaltxt.setText(A.format(s3));
             }
             if(EventCombo.getSelectedItem().equals("New Year Events")){
                 Totaltxt.setText(A.format(s4));
             }
             if(EventCombo.getSelectedItem().equals("Official Parties")){
                 Totaltxt.setText(A.format(s5));
             }
             if(EventCombo.getSelectedItem().equals("Culturals")){
                 Totaltxt.setText(A.format(s6));
             }
    }//GEN-LAST:event_EventComboActionPerformed

    private void book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_btnActionPerformed
               String item1 = agenttxt.getText();
              String item2 = Addresstxt.getText();
              String item4 = Locationtxt.getText();
              String item5 = Emailtxt.getText();
              String item6 = Totaltxt.getText();
              String item7 = Advancetxt.getText();
            y=Integer.parseInt(item7);
            
          if(EventCombo.getSelectedItem().equals("Public Hall Events")){
               int tt=y-s;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-",""));
          }else if(EventCombo.getSelectedItem().equals("Press Meetings")){
               int tt=y-s1;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }else if(EventCombo.getSelectedItem().equals("Book Publish")){
              int tt=y-s2;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }else if(EventCombo.getSelectedItem().equals("Election Campaign Events")){
              int tt=y-s3;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }else if(EventCombo.getSelectedItem().equals("New Year Events")){
              int tt=y-s4;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }else if(EventCombo.getSelectedItem().equals("Official Parties")){
              int tt=y-s5;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }else if(EventCombo.getSelectedItem().equals("Culturals")){
              int tt=y-s6;
       
               x=String.valueOf(tt);
             balanceTxt.setText(x.replace("-", ""));
          }
          
          
      
         
            
               
              
              
               
     
        
        
     print_textarea.append("Event Management System"+"\n"+"========================"+"\n"+" Agent Name : "+"\t" +item1 +"\n"
                                    +"Address : "+ "\t" +item2+"\n"+" Location : "+ "\t" +
                      item4 +"\n" +"Email Address : "+"\t" +item5 + "\n"+"Total price: "+"\t" +item6 +"\n"+
                      "Advance amount (#): "+item7 + "\nBalance :" +x.replace("-", "") + "\n"+ "Date : "+Date_chooser.getDate()+"\n" +"======================="+ "\nDeveloped by ZynTech"
                             );
    }//GEN-LAST:event_book_btnActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
                 contactUs ctr = new contactUs();
                 ctr.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       aboutUs abt = new aboutUs();
       abt.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void Date_chooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_chooserMouseClicked
            
          // TODO add your handling code here:
    }//GEN-LAST:event_Date_chooserMouseClicked

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
            java.util.logging.Logger.getLogger(BookingSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addresstxt;
    private javax.swing.JTextField Advancetxt;
    private com.toedter.calendar.JDateChooser Date_chooser;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JComboBox<String> EventCombo;
    private javax.swing.JTextField Locationtxt;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JTextField agenttxt;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JButton book_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel1HomeBook;
    private javax.swing.JLabel jLabel2servbook;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print_btn;
    private javax.swing.JTextArea print_textarea;
    private javax.swing.JButton reset_btn;
    // End of variables declaration//GEN-END:variables
}
