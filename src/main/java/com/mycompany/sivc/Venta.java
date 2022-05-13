package com.mycompany.sivc;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author BAML
 */


public class Venta extends javax.swing.JFrame {
  String cat;
float sumatoria=0;  
Timestamp dt;
String idP;
    /**
     * Creates new form Venta
     */DefaultTableModel modelo=new DefaultTableModel();
    public Venta() {
        initComponents();
                 this.setLocationRelativeTo(null);
                 
                 
        modelo.addColumn("Código del producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Categoría");
        modelo.addColumn("Precio por KG");
        modelo.addColumn("Cantidad");
        jTable2.setModel(modelo);
    
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        añade = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dinero = new javax.swing.JLabel();
        fotop = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setText("Venta");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setText("Código");

        jLabel4.setText("Cantidad");

        codigo.setText("jTextField3");

        añade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        añade.setText("Añadir");
        añade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadeActionPerformed(evt);
            }
        });

        nombre.setText("jTextField3");

        jLabel5.setText("Nombre");

        jLabel6.setText("Categoría");

        categoria.setText("jTextField3");

        jLabel2.setText("Total a pagar:");

        dinero.setText("$$$$");

        fotop.setText("FOTO");
        fotop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fotop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotopMouseClicked(evt);
            }
        });

        jLabel8.setText("Precio");

        precio.setText("jTextField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dinero))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo)
                    .addComponent(jSpinner1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(añade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(fotop, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(385, 385, 385))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(añade)
                            .addComponent(fotop, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(296, 296, 296)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dinero))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(34, 34, 34))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
            conexion con = new conexion();
        Connection c =con.conectar();
        
         try{
        
          PreparedStatement  guardar=c.prepareStatement("INSERT INTO pedidos(fecha,costo) VALUES(?,?)");
          dt=new java.sql.Timestamp(new java.util.Date().getTime());
          guardar.setTimestamp(1,dt);
          guardar.setString(2,dinero.getText());
         
        
           guardar.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no se logro guardar Error "+e.getMessage());
        }
        
         String d=dt.toString();
         try{
                Statement st=c.createStatement();
                ResultSet rs=st.executeQuery("SELECT id_pedido FROM pedidos WHERE fecha='"+dt+"'");
                while(rs.next()){
                   idP=rs.getString(1);
                    
                }
            }catch(SQLException ex){
                Logger.getLogger(proveedores.class.getName()).log(Level.SEVERE,null,ex);
            }
         
         
                  try{
        
          
          for(int i=0;i<modelo.getRowCount();i++){
              PreparedStatement  guardar=c.prepareStatement("INSERT INTO productos_pedidos(id_producto,id_pedido) VALUES(?,?)");
              System.out.println(guardar);
              guardar.setString(1,modelo.getValueAt(i,0).toString());
            guardar.setString(2,idP);
            
            int vA=Integer.parseInt(modelo.getValueAt(i,4).toString());
            int vB=Integer.parseInt(modelo.getValueAt(i,0).toString());
                PreparedStatement  guardar2=c.prepareStatement("UPDATE productos SET cantidad=cantidad-"+vA+" WHERE id_producto="+vB);
                System.out.println(guardar2);
            guardar.executeUpdate();
            guardar2.executeUpdate();
          }

         
        
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no se logro guardar Error "+e.getMessage());
        }
        
        
        ticket_compra abrir = new ticket_compra();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        conexion con = new conexion();
        Connection c =con.conectar();
        
        
            try{
                Statement st=c.createStatement();
                ResultSet rs=st.executeQuery("SELECT nombre,id_categoria,cantidad,precio FROM productos WHERE id_producto='"+codigo.getText()+"'");
                
                while(rs.next()){
                    nombre.setText(rs.getString(1));
                    
                    
                    categoria.setText(rs.getString(2));
                    
                    
                    SpinnerNumberModel nm=new SpinnerNumberModel();
                    nm.setMaximum(rs.getInt(3));
                    System.out.println(rs.getInt(3));
                    nm.setMinimum(1);
                    jSpinner1.setModel(nm);
                    nm.setValue(1);
                    
                    precio.setText(rs.getString(4));
                    
                }
                
            }catch(SQLException ex){
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE,null,ex);
            }
                        try{
                Statement st=c.createStatement();
                ResultSet rs=st.executeQuery("SELECT nombre FROM categoria WHERE id_categoria='"+categoria.getText()+"'");
                
                while(rs.next()){
                    cat=categoria.getText();
                    categoria.setText(rs.getString("nombre"));
                }
                
            }catch(SQLException ex){
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE,null,ex);
            }
                        
                                     try{
                Statement st=c.createStatement();
                ResultSet rs=st.executeQuery("SELECT foto FROM fotos WHERE id_producto='"+codigo.getText()+"'");
                
                while(rs.next()){
                    Blob blb = rs.getBlob(1);
                        InputStream imgBytes = blb.getBinaryStream(1, (int) blb.length());
                        BufferedImage image = ImageIO.read(imgBytes);
                        Image image2=image;
                        Image image3 = image2.getScaledInstance(170,170,java.awt.Image.SCALE_SMOOTH);
                        ImageIcon finalimg=new ImageIcon(image3);
                        fotop.setIcon(finalimg);
                        fotop.setText("");
                }
                
            }catch(Exception ex){
                Logger.getLogger(Venta.class.getName()).log(Level.SEVERE,null,ex);
            }           
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MenuGeneral abrir = new MenuGeneral();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void añadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadeActionPerformed
       Object datos[]=new Object[5];
        
            datos[0]=codigo.getText();
                        datos[1]=nombre.getText();
                        datos[2]=cat;
                        datos[3]=precio.getText();
                        datos[4]=jSpinner1.getValue();
                        
                        
        modelo.addRow(datos);
       jTable2.setModel(modelo);
       
       
                        int cant=(int)jSpinner1.getValue();
                        float bc=Float.parseFloat(precio.getText());
                        bc*=cant;
                        sumatoria+=bc;
        System.out.println(sumatoria);
       dinero.setText(Float.toString(sumatoria));
       
       nombre.setText("");
       categoria.setText("");
       precio.setText("");
       
       
// TODO add your handling code here:
    }//GEN-LAST:event_añadeActionPerformed

    private void fotopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotopMouseClicked
   
       
    }//GEN-LAST:event_fotopMouseClicked

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añade;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel dinero;
    private javax.swing.JLabel fotop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
