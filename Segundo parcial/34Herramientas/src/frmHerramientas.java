import java.util.Scanner;
import java.io.File;

public class frmHerramientas extends javax.swing.JFrame {
    
    // Vector que albergará objetos de la clase Articulos (vector de articulos).
    public Articulo vec[];
    // Maximo numero de elementos que albergará el vector.
    public final int DIM = 150;
    // Numero de elementos que tendrá el vector.
    public int n;
    
    public double monto;
    public int cantidad;
    
    public frmHerramientas() {
        initComponents();
        // Que la ventana aparezca centrada en la pantalla.
        this.setLocationRelativeTo(null);
        // Metodo para leer la informacion del txt.
        leeInfo();
        
        monto = 0;
        cantidad = 0;
    }
    public void leeInfo() {
        // Variable auxiliar.
        int i = 0;
        // Varibles de los articulos.
        String nombre;
        double precio;
        int tipo;
        // Instanciar el vector donde se guardarán los artículos.
        vec = new Articulo[DIM];
        //Comenzar la lectura de datos.
        File datos = new File("ArticulosFerreteria.txt");
        Scanner lee;
        try {
            lee = new Scanner(datos);
        } catch (Exception e) {
            lee = null;
        }
        if (lee != null) {
            while (lee.hasNextInt() && i < DIM) {
                tipo = lee.nextInt();
                lee.nextLine();
                nombre = lee.nextLine();
                precio = lee.nextDouble();
                /* Crear el objeto articulo con la ifnromacion recien leida 
                y guardarlo en la posicion i del vector. */
                vec[i] = new Articulo(nombre, precio, tipo);
                i++;
            }
            n = i;
            lee.close();
        }
        // Imprime la informacion leida.
        for(i = 0; i < n; i++) {
            System.out.println(vec[i]);
        }
    }
    public void limpia() {
        this.btnGrpTipo.clearSelection();
        this.cmbArticulos.setSelectedItem(null);
        javax.swing.DefaultListModel lista = new javax.swing.DefaultListModel<>();
        this.txtArticulos.setModel(lista);
        this.txtPrecios.setModel(lista);
        this.lblCantidad.setText("");
        this.lblMonto.setText("");
        this.lblIVA.setText("");
        this.lblTotal.setText("");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdbtnConstruccion = new javax.swing.JRadioButton();
        rdbtnHerramientas = new javax.swing.JRadioButton();
        rdbtnPintura = new javax.swing.JRadioButton();
        cmbArticulos = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArticulos = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrecios = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnCalculaTotales = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de artículo"));

        btnGrpTipo.add(rdbtnConstruccion);
        rdbtnConstruccion.setText("Construcción");
        rdbtnConstruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnConstruccionActionPerformed(evt);
            }
        });

        btnGrpTipo.add(rdbtnHerramientas);
        rdbtnHerramientas.setText("Herramientas");
        rdbtnHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnHerramientasActionPerformed(evt);
            }
        });

        btnGrpTipo.add(rdbtnPintura);
        rdbtnPintura.setText("Pinturas");
        rdbtnPintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnPinturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnConstruccion)
                .addGap(18, 18, 18)
                .addComponent(rdbtnHerramientas)
                .addGap(18, 18, 18)
                .addComponent(rdbtnPintura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnConstruccion)
                    .addComponent(rdbtnHerramientas)
                    .addComponent(rdbtnPintura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Artículos:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel2.setText("Artículos seleccionados: ");

        jScrollPane1.setViewportView(txtArticulos);

        jLabel3.setText("Precio:");

        jScrollPane2.setViewportView(txtPrecios);

        jLabel4.setText("Cantidad de Artículos:");

        lblCantidad.setText(" ");

        jLabel5.setText("Monto:");

        lblMonto.setText(" ");

        jLabel6.setText("IVA");

        lblIVA.setText(" ");

        jLabel8.setText("Total a pagar");

        lblTotal.setText(" ");

        btnCalculaTotales.setText("Calcular Totales");
        btnCalculaTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaTotalesActionPerformed(evt);
            }
        });

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnLimpia.setText("Limpia");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblIVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(lblMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(47, 47, 47))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnLimpia)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculaTotales)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCantidad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblIVA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTerminar)
                    .addComponent(btnLimpia)
                    .addComponent(btnCalculaTotales))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void rdbtnConstruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnConstruccionActionPerformed
        javax.swing.DefaultComboBoxModel datos = new javax.swing.DefaultComboBoxModel<>();
        for (int i = 0; i < n; i++) {
            if(vec[i].tipo == 1) {
                datos.addElement(vec[i].nombre);
            }
        }
        this.cmbArticulos.setModel(datos);
    }//GEN-LAST:event_rdbtnConstruccionActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        javax.swing.DefaultListModel listaArt = new javax.swing.DefaultListModel();
        javax.swing.DefaultListModel listaPre = new javax.swing.DefaultListModel();
        
        String cad = (String) this.cmbArticulos.getSelectedItem();
        
        int i;
        String texto;
        double precio = 0;
        try {
            // Para la lista de articulos.
            for (i = 0; i < this.txtArticulos.getModel().getSize(); i++) {
                texto = (String)this.txtArticulos.getModel().getElementAt(i);
                listaArt.add(i, texto);
            }
            listaArt.add(i,cad);
            this.txtArticulos.setModel(listaArt);
            
            // Para Obtener el precio correcto.
            i = 0;
            while (i < n && precio == 0) {
                if (vec[i].compareTo(cad) == 0) {
                    precio = vec[i].precio;
                }
                i++;
            }
            
            // Para la lista de precios. 
            for (i = 0; i < this.txtPrecios.getModel().getSize(); i++) {
                texto = (String)this.txtPrecios.getModel().getElementAt(i);
                listaPre.add(i, texto);
            }
            listaPre.add(i, precio + "");
            this.txtPrecios.setModel(listaPre);
            
            monto = monto + precio;
            cantidad++;   
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rdbtnHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnHerramientasActionPerformed
        javax.swing.DefaultComboBoxModel datos;
        int i;
        datos = new javax.swing.DefaultComboBoxModel<>();
        for (i = 0; i < n; i++)
         if(vec[i].tipo == 2)
             datos.addElement(vec[i].nombre);
        this.cmbArticulos.setModel(datos);
    }//GEN-LAST:event_rdbtnHerramientasActionPerformed

    private void rdbtnPinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnPinturaActionPerformed
        javax.swing.DefaultComboBoxModel datos;
        int i;
        datos = new javax.swing.DefaultComboBoxModel<>();
        for (i = 0; i < n; i++)
         if(vec[i].tipo == 3)
             datos.addElement(vec[i].nombre);
        this.cmbArticulos.setModel(datos);
    }//GEN-LAST:event_rdbtnPinturaActionPerformed

    private void btnCalculaTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaTotalesActionPerformed
        this.lblCantidad.setText(cantidad + "");
        this.lblMonto.setText("$" + monto);
        this.lblIVA.setText("$" + (monto * .16));
        this.lblTotal.setText("$" + (int)(monto * 1.16 * 100) / 100.0);
    }//GEN-LAST:event_btnCalculaTotalesActionPerformed

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        limpia();
    }//GEN-LAST:event_btnLimpiaActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnTerminarActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmHerramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHerramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHerramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHerramientas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new frmHerramientas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCalculaTotales;
    private javax.swing.ButtonGroup btnGrpTipo;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JComboBox cmbArticulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbtnConstruccion;
    private javax.swing.JRadioButton rdbtnHerramientas;
    private javax.swing.JRadioButton rdbtnPintura;
    private javax.swing.JList txtArticulos;
    private javax.swing.JList txtPrecios;
    // End of variables declaration//GEN-END:variables
}
