/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.fitcontrol;

/**
 *
 * @author kpadhikari
 */
public class TestMainApp {
    private int num1 = 10;
    private int num2 = 15;
    
    public TestMainApp () {
        tidbit();
    }
    
    public static void main(String args[]) {
        TestMainApp kp = new TestMainApp();        
        //TestMainApp kp2 = new TestMainApp();     //Both work   
    } 
    
    public void methodToBeInvokedByButtonClickInFitControlUI() {
        System.out.println("Hi there. I am speaking from a method of TestMainApp class.");
        double sum = this.num1 + num2; //this is not essential here, because there is no other shadowing num1
        double prod = num1 * this.num2;
        System.out.println("The sum of " + num1 + " & " + num2 + " is " + sum);
        System.out.println("The product of " + num1 + " & " + num2 + " is " + prod);
    }
    
    public void tidbit() {

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
            java.util.logging.Logger.getLogger(FitControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FitControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FitControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FitControlUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FitControlUI().setVisible(true);
            }
        });        
    }
}
