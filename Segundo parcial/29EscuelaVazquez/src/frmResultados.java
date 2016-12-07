import java.io.*;
import java.time.*;

public class frmResultados extends javax.swing.JFrame {

    public frmResultados() {
        this.setLocationRelativeTo(null);
        initComponents();        
        calculaPromedios();
        
        this.lblCantidad.setText(this.lblCantidad.getText() + frmAltas.n);
        
        this.lblPromMaximo.setText( this.lblPromMaximo.getText() + (int)((frmAltas.califs[promedioMaximo()][4])*100)/100.0);
        this.lblPromMinimo.setText( this.lblPromMinimo.getText() + (int)((frmAltas.califs[promedioMinimo()][4])*100)/100.0);
        
        this.lblPorcentajeMaximo.setText(this.lblPorcentajeMaximo.getText() + (frmAltas.califs[promedioMaximo()][4])* 100.0/ frmAltas.n);
        this.lblPorcentajeReprobados.setText(this.lblPorcentajeReprobados.getText() + (frmAltas.califs[promedioMinimo()][4])* 100.0/ frmAltas.n);
        
        this.lblCalifMaxima.setText(this.lblCalifMaxima.getText() + (int)(califMax()*100/100.0));
    }
    public void calculaPromedios() {
        // Agregar cada promedio la quinta columna de la matriz de calificaciones.
        for(int i = 0; i < frmAltas.n; i++) {
            frmAltas.califs[i][4] = (frmAltas.califs[i][0]+frmAltas.califs[i][1] + frmAltas.califs[i][3]) / 3 * 0.9 + frmAltas.califs[i][2] * 0.1;
        }
    }
    public int promedioMaximo() {
        int max = 0; 
        for(int i = 1; i < frmAltas.n; i++) {
            if (frmAltas.califs[max][4] < frmAltas.califs[i][4]) {
                max = i;
            }
        }
        return max;
    }
    public int promedioMinimo() {
        int min = 0;
        for(int i = 1; i < frmAltas.n; i++) {
            if (frmAltas.califs[min][4]> frmAltas.califs[i][4]) {
                min = i;
            }
        }
        return min;
    }
    public double porcentajeMaximo() {
        int porMax = 0;
        for(int i = 1; i < frmAltas.n; i++) {
          if(frmAltas.califs[i][4] >  6) {
              porMax = porMax + 1;   
          }
        }
        return (porMax *100)/ frmAltas.n;
    }
    public double califMax() {
        double max = frmAltas.califs[0][0];
        for(int i=0; i < frmAltas.n; i++) {
            for(int j = 0; j<4;j++) {
                if(frmAltas.califs[i][j] > max) {
                    max = frmAltas.califs[i][j];
                }
            }
        }
        return max;
    }
    public void actualizaArchivo() {
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("alumnos.txt", true);
            esc = new PrintWriter(datos);
            if (frmAltas.n != frmAltas.nA) {
                // Se agregaron alumnos, entonces
                esc.println();
            }
            for (int i = frmAltas.nA; i < frmAltas.n; i++) {
                esc.print(frmAltas.claves[i]+ "\t");
                for(int j = 0; j < 3; j++) {
                    esc.print(frmAltas.califs[i][j] + "\t");
                }
                if (i == frmAltas.n - 1) {
                    // Ya es el último entonces ya no te saltes linea.
                    esc.print(frmAltas.califs[i][3]);
                } else {
                    // Recordar que el println se salta una linea despues de imprimir.
                    esc.println(frmAltas.califs[i][3]);
                }
            }
            esc.close();
        } catch(Exception e) {
            System.out.println("No se actualizó el archivo.");
        }
    }
    public void creaReporte() {
        FileOutputStream datos;
        PrintWriter esc;
        try {
            datos = new FileOutputStream("reporte.txt", false);
            esc = new PrintWriter(datos);
            esc.println("\n\t\t\t" + LocalDate.now());
            esc.println("\n\n\t\t\t\tALUMNOS DEL GRUPO MIO\n");
            // Escribe promedios.
            for(int i = 0; i < frmAltas.n; i++) {
                esc.println(frmAltas.claves[i]+ "\t"+ (int)(frmAltas.califs[i][4])*100/100.0);
            }
            esc.close();
        } catch(Exception e) {
            System.out.println("no se creo Reporte");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblPromMaximo = new javax.swing.JLabel();
        lblPromMinimo = new javax.swing.JLabel();
        lblPorcentajeMaximo = new javax.swing.JLabel();
        lblPorcentajeReprobados = new javax.swing.JLabel();
        lblCalifMaxima = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resultados");

        lblCantidad.setText("Cantidad de alumnos: ");

        lblPromMaximo.setText("Promedio Maximo:");

        lblPromMinimo.setText("Promedio Minimo: ");

        lblPorcentajeMaximo.setText("Porcentaje de alumnos con promedio maximo: ");

        lblPorcentajeReprobados.setText("Porcentaje de Reprobados: ");

        lblCalifMaxima.setText("Calificación Maxima:");

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(lblPromMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblPromMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPorcentajeMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(lblPorcentajeReprobados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCalifMaxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPromMaximo)
                .addGap(18, 18, 18)
                .addComponent(lblPromMinimo)
                .addGap(18, 18, 18)
                .addComponent(lblPorcentajeMaximo)
                .addGap(18, 18, 18)
                .addComponent(lblPorcentajeReprobados)
                .addGap(18, 18, 18)
                .addComponent(lblCalifMaxima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        actualizaArchivo();
        creaReporte();
        System.exit(0);
    }//GEN-LAST:event_btnTerminarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCalifMaxima;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblPorcentajeMaximo;
    private javax.swing.JLabel lblPorcentajeReprobados;
    private javax.swing.JLabel lblPromMaximo;
    private javax.swing.JLabel lblPromMinimo;
    // End of variables declaration//GEN-END:variables
}
