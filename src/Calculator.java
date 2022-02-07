
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keanan
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        firstNumber = new javax.swing.JTextField();
        secondNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plusButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        thisAnswerLabel = new javax.swing.JLabel();
        multiplicationButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();

        label1.setText("label1");

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jframe Calculator  Youtbe");

        firstNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNumberActionPerformed(evt);
            }
        });

        secondNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondNumberActionPerformed(evt);
            }
        });

        jLabel1.setText("First Number");

        jLabel2.setText(" Second Number");

        plusButton.setText("+");
        plusButton.setToolTipText("Addition");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.setToolTipText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        thisAnswerLabel.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N

        multiplicationButton.setText("*");
        multiplicationButton.setToolTipText("Multiply");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("/");
        divisionButton.setToolTipText("Division");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plusButton)
                                .addGap(46, 46, 46)
                                .addComponent(subtractButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(divisionButton)
                                .addGap(39, 39, 39)
                                .addComponent(multiplicationButton))))
                    .addComponent(thisAnswerLabel))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plusButton)
                    .addComponent(subtractButton)
                    .addComponent(multiplicationButton)
                    .addComponent(divisionButton))
                .addGap(48, 48, 48)
                .addComponent(thisAnswerLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondNumberActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        double num1, num2;
        try {
            num1= Double.parseDouble(
            this.firstNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;
        }
        try {

           num2 = Float.parseFloat(
                   this.secondNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;

        }

        double answer = num1 - num2;
        
        JOptionPane.showMessageDialog(rootPane, " Answer is :"+answer);
        

    }//GEN-LAST:event_subtractButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
       float num1, num2;
        try {
            num1= Float.parseFloat(
            this.firstNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;
        }
        try {

           num2 = Float.parseFloat(
                   this.secondNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;

        }

        float answer = num1 + num2;
      
        JOptionPane.showMessageDialog(rootPane, "Answer is :"+answer);
       

    }//GEN-LAST:event_plusButtonActionPerformed

    private void firstNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNumberActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        
        float num1, num2;
        try {
            num1= Float.parseFloat(
            this.firstNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;
        }
        try {

           num2 = Float.parseFloat(
                   this.secondNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;

        }

        float answer = num1 /num2;
        this.thisAnswerLabel.getText();
        JOptionPane.showMessageDialog(rootPane, " Answer is :"+answer);
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
       float num1, num2;
        try {
            num1= Float.parseFloat(
            this.firstNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;
        }
        try {

           num2 = Float.parseFloat(
                   this.secondNumber.getText());
        } catch (Exception e) {
            System.out.println("Bad number " + e);

            return;

        }

        float answer = num1 /num2;
        this.thisAnswerLabel.getText();
        JOptionPane.showMessageDialog(rootPane, " Answer is :"+answer);
        
    }//GEN-LAST:event_divisionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divisionButton;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JTextField secondNumber;
    private javax.swing.JButton subtractButton;
    private javax.swing.JLabel thisAnswerLabel;
    // End of variables declaration//GEN-END:variables
}
