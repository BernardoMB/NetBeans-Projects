import java.io.*;

public class frmFinal extends javax.swing.JFrame {

    // Comisiones.
    public final double comisionMO = .075;
    public final double comisionCP = .0097;
    public final double comisionT = 0;
    public final double comisionE = 0;
    
    double totalMOD;
    double totalCPD;
    double totalTD;
    double totalED;
    
    double totalMOP;
    double totalCPP;
    double totalTP;
    double totalEP;
    
    public frmFinal() {
        initComponents();
        this.setLocationRelativeTo(null);
        calculaTotales();
        
        System.out.println("MOD: " + totalMOD);
        System.out.println("CPD: " + totalCPD);
        System.out.println("TD: " + totalTD);
        System.out.println("ED: " + totalED);
        
        System.out.println("MOP: " + totalMOP);
        System.out.println("CPP: " + totalCPP);
        System.out.println("TP: " + totalTP);
        System.out.println("EP: " + totalEP);
        
        this.lblMO.setText(lblMO.getText() + "Total dolares: " + totalMOD + ", Total pesos: " + totalMOP + ", Total comision: " + comisionMO*totalMOD);
        this.lblCP.setText(lblCP.getText() + "Total dolares: " + totalCPD + ", Total pesos: " + totalCPP + ", Total comision: " + comisionCP*totalCPD);
        this.lblT.setText(lblT.getText() + "Total dolares: " + totalTD + ", Total pesos: " + totalTP + ", Total comision: " + comisionT*totalTD);
        this.lblE.setText(lblE.getText() + "Total dolares: " + totalED + ", Total pesos: " + totalEP + ", Total comision: " + comisionE*totalED);      
    }

    public void actualizaArchivo() {
        try {
            if (frmInicio.nrA != 0) {
                FileOutputStream datos = new FileOutputStream("remesas.txt", true);
                PrintWriter esc = new PrintWriter(datos);
                if (frmInicio.nrA != frmInicio.nr) {
                    esc.println();
                }
                for (int i = frmInicio.nr; i < frmInicio.nrA; i++) {
                    esc.print(frmInicio.remesas[i].getMes() + "\t" + frmInicio.remesas[i].getAnio() + "\t" + frmInicio.remesas[i].getOperacion() + "\t");
                    if (i == frmInicio.nrA - 1) {
                        esc.print(frmInicio.remesas[i].getMonto());
                    } else {
                        esc.println(frmInicio.remesas[i].getMonto());
                    }
                }
                esc.close();
            }
        } catch (Exception e) {
            
        }
    }
    public void calculaTotales() {
        double tipoDeCambio;
        int n = frmInicio.nrA;
        if (n == 0) {
            n = frmInicio.nr;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(frmInicio.remesas[i].getMonto());
            switch (frmInicio.remesas[i].getOperacion()) {
                case 1: 
                    totalMOD = totalMOD + frmInicio.remesas[i].getMonto();
                    int j = 0;
                    while (j < frmInicio.n - 1 && (frmInicio.mesAnio[j][0] != frmInicio.remesas[i].getMes() || frmInicio.mesAnio[j][1] != frmInicio.remesas[i].getAnio())) {
                        j++;
                    }
                    tipoDeCambio = frmInicio.tipos[j][frmInicio.remesas[i].getOperacion() -1];
                    totalMOP = totalMOP + frmInicio.remesas[i].getMonto() * tipoDeCambio;
                break;
                case 2:
                    totalCPD = totalCPD + frmInicio.remesas[i].getMonto();
                    int k = 0;
                    while (k < frmInicio.n - 1 && (frmInicio.mesAnio[k][0] != frmInicio.remesas[i].getMes() || frmInicio.mesAnio[k][1] != frmInicio.remesas[i].getAnio())) {
                        k++;
                    }
                    tipoDeCambio = frmInicio.tipos[k][frmInicio.remesas[i].getOperacion() -1];
                    totalCPP = totalCPP + frmInicio.remesas[i].getMonto() * tipoDeCambio;
                break;
                case 3:
                    totalTD = totalTD + frmInicio.remesas[i].getMonto();
                    int l = 0;
                    while (l < frmInicio.n - 1 && (frmInicio.mesAnio[l][0] != frmInicio.remesas[i].getMes() || frmInicio.mesAnio[l][1] != frmInicio.remesas[i].getAnio())) {
                        l++;
                    }
                    tipoDeCambio = frmInicio.tipos[l][frmInicio.remesas[i].getOperacion() -1];
                    totalTP = totalTP + frmInicio.remesas[i].getMonto() * tipoDeCambio;
                break;
                case 4:
                    totalED = totalED + frmInicio.remesas[i].getMonto();
                    int m = 0;
                    while (m < frmInicio.n - 1 && (frmInicio.mesAnio[m][0] != frmInicio.remesas[i].getMes() || frmInicio.mesAnio[m][1] != frmInicio.remesas[i].getAnio())) {
                        m++;
                    }
                    tipoDeCambio = frmInicio.tipos[m][frmInicio.remesas[i].getOperacion() -1];
                    totalEP = totalEP + frmInicio.remesas[i].getMonto() * tipoDeCambio;
                break;       
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sin = new javax.swing.JLabel();
        lblMO = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sin.setText("Total de dolares de remesas:");

        lblMO.setText("Mony Orders:");

        lblCP.setText("Cheques personales:");

        lblT.setText("Tranferencias:");

        lblE.setText("Efectivo:");

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
                    .addComponent(sin)
                    .addComponent(lblMO)
                    .addComponent(lblCP)
                    .addComponent(lblT)
                    .addComponent(lblE))
                .addContainerGap(470, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sin)
                .addGap(18, 18, 18)
                .addComponent(lblMO)
                .addGap(18, 18, 18)
                .addComponent(lblCP)
                .addGap(18, 18, 18)
                .addComponent(lblT)
                .addGap(18, 18, 18)
                .addComponent(lblE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        this.actualizaArchivo();
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
            java.util.logging.Logger.getLogger(frmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblMO;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel sin;
    // End of variables declaration//GEN-END:variables
}
