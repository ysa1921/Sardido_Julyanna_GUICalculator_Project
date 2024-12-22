/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author JannDamo
 */
public class CalculatorGUI extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorGUI
     */
    double EntNumber1;
    double EntNumber2;
    double Result;
    String Op;
    
    
    public CalculatorGUI() {
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

        jtxtResult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnAC = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnTimes = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDecimal = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 370, 70));

        jbtnBS.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnBS.setText("←");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 70));

        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 70, 70));

        jbtnAC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnAC.setText("AC");
        jbtnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnACActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 70, 70));

        jbtnDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 70));

        jbtnDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 70));

        jbtnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 70, 70));

        jbtnDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 70));

        jbtnDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 70, 70));

        jbtnDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 70));

        jbtnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 70, 70));

        jbtnDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, 70));

        jbtnDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 70, 70));

        jbtnDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, 70));

        jbtnTimes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnTimes.setText("x");
        jbtnTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTimesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 70, 70));

        jbtnDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 70, 70));

        jbtnDecimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDecimal.setText(".");
        jbtnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 70, 70));

        jbtnDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 70, 70));

        jbtnDivide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDivide.setText("÷");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 70, 70));

        jbtnEquals.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 70, 70));

        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 70, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumber(String q)
    {
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    
    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
nums = nums * (-1);
jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
 EntNumber1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
EntNumber1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op = "-";        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTimesActionPerformed
 EntNumber1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op = "*";
    }//GEN-LAST:event_jbtnTimesActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
EntNumber1 = Double.parseDouble(jtxtResult.getText());
jtxtResult.setText("");
Op = "/";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumber("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
 EnterNumber("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnACActionPerformed
  jtxtResult.setText("");
  
  String Fn, Sn;
  
  Fn = String.valueOf(EntNumber1);
  Sn = String.valueOf(EntNumber2);
  
  Fn = "";
  Sn = "";
    }//GEN-LAST:event_jbtnACActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
 jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
 EnterNumber("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
 EnterNumber("4");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
  EnterNumber("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
 EnterNumber("6");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
 EnterNumber("1");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
 EnterNumber("2");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
 EnterNumber("3");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
 EnterNumber("0");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
   
        String bk = null;
        if (jtxtResult.getText().length() > 0) 
        {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() -1);
            bk = sb.toString();
            jtxtResult.setText(bk);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDecimalActionPerformed
    if (! jtxtResult.getText() .contains("."))
    {
       jtxtResult.setText(jtxtResult.getText() + jbtnDecimal.getText()); 
    }
    }//GEN-LAST:event_jbtnDecimalActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
  EntNumber2 = Double.parseDouble(jtxtResult.getText());
  if (Op == "+")
  {
      Result = EntNumber1 + EntNumber2;
      jtxtResult.setText(String.valueOf(Result));
  }
  else if (Op == "-")
  {
      Result = EntNumber1 - EntNumber2;
      jtxtResult.setText(String.valueOf(Result));
  }
   else if (Op == "*")
  {
      Result = EntNumber1 * EntNumber2;
      jtxtResult.setText(String.valueOf(Result));
  }
   else if (Op == "/")
  {
      Result = EntNumber1 / EntNumber2;
      jtxtResult.setText(String.valueOf(Result));
  }
    }//GEN-LAST:event_jbtnEqualsActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAC;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnDecimal;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnTimes;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables

    private void EnterNumbers(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}