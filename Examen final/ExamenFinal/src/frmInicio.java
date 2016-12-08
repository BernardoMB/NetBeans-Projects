
import java.io.File;
import java.util.Scanner;

/**
 * Clave: 143743
 * @author Bernardo Mondragon Brozon
 */
public class frmInicio extends javax.swing.JFrame {

    public Propiedad propiedades[];
    public final int DIM = 50;
    public int n;
    
    public int totalTerrenos;
    public int totalDepartamentos;
    public int totalCasas;
    
    public frmInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        leeInfo();
        this.txtaListado.setText(listado());
        this.lblTotalSug.setText(this.lblTotalSug.getText() + calculaPrecioSugeridoTotal());
        sumaPropiedades();
        this.lblTerrenos.setText(this.lblTerrenos.getText() + totalTerrenos);
        this.lblDepartamentos.setText(this.lblDepartamentos.getText() + totalDepartamentos);
        this.lblCasas.setText(this.lblCasas.getText() + totalCasas);
        this.lblmenosPBase.setText(this.lblmenosPBase.getText() + propiedades[menorPrecio()].getPrecioBase());
    }
    public void leeInfo() {
        double precioBase;
        String usoSuelo;
        String tipoPropiedad;
        int serviciosUrbanisticos;
        int numRecamaras;
        double metrosCuadrados;
        propiedades = new Propiedad[DIM];
        n = 0;
        File datos;
        datos = new File("propiedades.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextDouble() && n < DIM) {
                precioBase = lee.nextDouble();
                lee.nextLine();
                usoSuelo = lee.nextLine();
                tipoPropiedad = lee.nextLine();
                if (tipoPropiedad.compareTo("Terreno") == 0) {
                    // Se trata de un terreno.
                    serviciosUrbanisticos = lee.nextInt();
                    if (serviciosUrbanisticos == 1) 
                        propiedades[n] = new Terreno(precioBase, usoSuelo, true);
                    else 
                        propiedades[n] = new Terreno(precioBase, usoSuelo, false);
                } else {
                    if (tipoPropiedad.compareTo("Departamento") == 0) {
                        // Se trata de un departamento
                        numRecamaras = lee.nextInt();
                        propiedades[n] = new Departamento(precioBase, usoSuelo, numRecamaras);
                    } else {
                        // Se trata de una casa
                        metrosCuadrados = lee.nextDouble();
                        propiedades[n] = new Casa(precioBase, usoSuelo, metrosCuadrados);
                    }
                }
                n++;
            }
            lee.close();
        }
    }
    public double calculaPrecioSugeridoTotal() {
        double total;
        int i;
        total = 0;
        for (i = 0; i < n; i++) 
            if (propiedades[i] instanceof Terreno) 
                total = total + ((Terreno)propiedades[i]).calcularPrecioSugerido();
            else 
                if (propiedades[i] instanceof Departamento) 
                    total = total + ((Departamento)propiedades[i]).calcularPrecioSugerido();
                else 
                    total = total + ((Casa)propiedades[i]).calcularPrecioSugerido();
        return total;
    }
    public void sumaPropiedades() {
        totalTerrenos = 0;
        totalDepartamentos = 0;
        totalCasas = 0;
        int i;
        for (i = 0; i < n; i++)
            if (propiedades[i] instanceof Terreno) 
                totalTerrenos = totalTerrenos + 1;
            else 
                if (propiedades[i] instanceof Departamento) 
                    totalDepartamentos = totalDepartamentos + 1;
                else 
                    totalCasas = totalCasas + 1;
    }
    public int menorPrecio() {
        int min;
        min = 0;
        int i;
        for (i = 0; i < n; i++) 
            if (propiedades[i].getPrecioBase() < propiedades[min].getPrecioBase()) 
                min = i;
        return min;
    }
    public String listado() {
        String cad;
        int i;
        cad = "";
        for (i = 0; i < n; i++) 
            if (i == 0) 
                cad = cad + propiedades[i];
            else 
                cad = cad + "\n" + propiedades[i];
        return cad;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaListado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lblTerrenos = new javax.swing.JLabel();
        lblDepartamentos = new javax.swing.JLabel();
        lblCasas = new javax.swing.JLabel();
        lblTotalSug = new javax.swing.JLabel();
        lblmenosPBase = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listado de propiedades:");

        txtaListado.setColumns(20);
        txtaListado.setRows(5);
        jScrollPane1.setViewportView(txtaListado);

        jLabel2.setText("Cantidad de:");

        lblTerrenos.setText("Terrenos: ");

        lblDepartamentos.setText("Departamentos: ");

        lblCasas.setText("Casas: ");

        lblTotalSug.setText("Total precio sugerido: $");

        lblmenosPBase.setText("Menor precio base: $");

        jButton1.setText("Terminar");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDepartamentos)
                            .addComponent(lblCasas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblTerrenos))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmenosPBase)
                                    .addComponent(lblTotalSug))))
                        .addGap(0, 352, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotalSug))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTerrenos)
                    .addComponent(lblmenosPBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDepartamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCasas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCasas;
    private javax.swing.JLabel lblDepartamentos;
    private javax.swing.JLabel lblTerrenos;
    private javax.swing.JLabel lblTotalSug;
    private javax.swing.JLabel lblmenosPBase;
    private javax.swing.JTextArea txtaListado;
    // End of variables declaration//GEN-END:variables
}
