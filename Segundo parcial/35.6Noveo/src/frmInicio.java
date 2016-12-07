
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MALBIZURR
 */
public class frmInicio extends javax.swing.JFrame {

    public static double precios[];
    public static int cantidades[][], sucursal[][];
    public static final int DIM = 12;
    public static final int SUCURSALES = 50;
    public frmInicio() {
        initComponents();
        limpiaMatriz();
        leeTodo();
//        imprime();
    }
    public void limpiaMatriz()
    {
        int i, j;
        cantidades = new int[SUCURSALES + 1][DIM +1];
        for(i = 0; i < SUCURSALES; i++)
            for(j = 0; j < DIM ; j++)
                cantidades[i][j] = 0;
        
    }
    public void leeTodo()
    {
        Scanner lee;
        File datos;
        int i, suc, tipo, cant;
        datos = new File("ventas.txt");
        precios = new double[DIM];
        
        try
        {
            lee = new Scanner(datos);
        }
        catch(Exception e)
        {
            lee = null;
        }
        if(lee != null)
        {
//            System.out.println("aquí");
            for(i = 0; i < DIM; i++)
                precios[i] = lee.nextDouble();
            
            while(lee.hasNextInt())
            {
                
                    suc = lee.nextInt();
                    tipo = lee.nextInt();
                    cantidades[suc - 1][tipo -1] = cantidades[suc - 1][tipo - 1] + lee.nextInt();
                
            }
            lee.close();
        }
        
    }
    public void imprime()
    {
        int i,j;
        for(i = 0; i < DIM; i++)
        {
//         System.out.println(" " + precios[i]);
              for(j = 0; j < 50; j++)
                System.out.println(sucursal[j][i]);
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbTipoLente = new javax.swing.JComboBox();
        lblCosto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOptica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnEstadisticas = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbTipoLente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblCosto.setText("Costo: $");

        jLabel2.setText("Óptica: ");

        jLabel3.setText("Cantidad a comprar: ");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        lblTotal.setText("Total a pagar: $ ");

        btnEstadisticas.setText("Estadísticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel");

        jLabel6.setText("Tipo de lentes:");

        jLabel7.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CASIMIRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnComprar))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOptica, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnEstadisticas)
                                .addGap(54, 54, 54)
                                .addComponent(btnTerminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(cmbTipoLente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoCliente)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(77, 77, 77)
                        .addComponent(btnComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(txtOptica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipoLente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addGap(8, 8, 8)
                .addComponent(btnNuevoCliente)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadisticas)
                    .addComponent(btnTerminar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        int optica, tipo, cantidad;
        double total;
        optica = Integer.parseInt(this.txtOptica.getText());
        tipo = Integer.parseInt((String) this.cmbTipoLente.getSelectedItem());
        cantidad = Integer.parseInt(this.txtCantidad.getText());
        this.lblCosto.setText("Costo: $ " + precios[tipo - 1]);
        total = precios[tipo - 1] * cantidad;
        this.lblTotal.setText("Total a pagar: $ " + 100*(total / 100));
        cantidades[optica - 1][tipo -1] = cantidades[optica - 1][tipo -1] + cantidad;
        
        
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
       this.lblCosto.setText("Costo: $");
       this.lblTotal.setText("Total a pagar: $");
       this.txtOptica.setText("");
       this.txtCantidad.setText("");
       this.txtOptica.requestFocus();
       this.cmbTipoLente.setSelectedItem(null);
       
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
       buscaCeros();
       crearReporte();
       System.exit(0);
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        frmEstadisticas est;
        est = new frmEstadisticas();
        this.setVisible(false);
        est.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed
    private void crearReporte()
    {
        FileOutputStream datos;
        PrintWriter esc; 
        int i,k;
        
        try
        {
            datos = new FileOutputStream("reporte1.txt", false);
            esc = new PrintWriter(datos);
            esc.println("\t\tÓPTICA \t TIPO DE LENTE");
            for(k = 0; k < SUCURSALES; k++)
            { 
              for(i= 0; i < DIM; i++)
                      if(sucursal[k][i] == 1)
                      {
                        esc.println("\t\t" + (k+1)+ "\t\t" + (i+1) + "\n");
                      }
             }
            
            esc.close();
        }
        catch(Exception e)
        {
            System.out.println("NO SE CREÓ REPORTE"); 
        }
    }
    public void buscaCeros()
    {
        int i, j;
        sucursal = new int[SUCURSALES][DIM];
        for(i= 0; i < DIM; i++)
            for(j= 0; j < SUCURSALES; j++)
                if(cantidades[j][i] == 0)
                    sucursal[j][i] = 1;
                else
                    sucursal[j][i] = 0;
    }
        
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
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox cmbTipoLente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtOptica;
    // End of variables declaration//GEN-END:variables
}
