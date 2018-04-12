/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author rafaelpereira
 */
public class TwoCombos extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form TwoCombos
     */
   
    private Hashtable<String, String[]> subItems = new Hashtable<String, String[]>();
    
    public TwoCombos() {
        
        String[] items = { "Select Item", "Color", "Shape", "Fruit" };
        String[] subItems1 = { "Select Color", "Red", "Blue", "Green" };
        subItems.put(items[1], subItems1);
        String[] subItems2 = { "Select Shape", "Circle", "Square", "Triangle" };
        subItems.put(items[2], subItems2);
        String[] subItems3 = { "Select Fruit", "Apple", "Orange", "Banana" };
        subItems.put(items[3], subItems3);
        for(int i=0; i<items.length;i++){
            System.out.println("Test: "+items.length);
            jComboBoxEsq.addItem(String.valueOf(items[i]));
        }
        
        jComboBoxEsq.addActionListener(this);
        
        jComboBoxEsq.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
        add(jComboBoxEsq);
        
        initComponents();
        
        
        
        jComboBoxDir.setPrototypeDisplayValue("XXXXXXXXXX"); // JDK1.4
        add(jComboBoxDir);
        
         

        
        
    }
     public void actionPerformed(ActionEvent e)
    {
        String item = (String)jComboBoxEsq.getSelectedItem();
        Object o = subItems.get( item );

        if (o == null)
        {
            jComboBoxDir.setModel( new DefaultComboBoxModel() );
        }
        else
        {
            jComboBoxDir.setModel( new DefaultComboBoxModel( (String[])o ) );
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxEsq = new javax.swing.JComboBox<>();
        jComboBoxDir = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxDir.setEditable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jComboBoxEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jComboBoxDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TwoCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoCombos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoCombos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDir;
    private javax.swing.JComboBox<String> jComboBoxEsq;
    // End of variables declaration//GEN-END:variables
}
