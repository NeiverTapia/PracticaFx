
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neiver Tapia
 */
public class facturaView extends javax.swing.JFrame {
      private ArrayList<Factura> factura;
        
    /**
     * Creates new form facturaView
     */
    public facturaView() {
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

        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtnomEmp = new javax.swing.JTextField();
        txtnomP = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableElement = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGenerarPDF = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGenerarPDF1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 51));

        jLabel2.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        tableElement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre Producto", "Cantidad", "Precio", "Nombre Empleado", "Total"
            }
        ));
        jScrollPane1.setViewportView(tableElement);

        btnAgregar.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        jLabel7.setText("Nombre producto");

        jLabel8.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        jLabel9.setText("Nombre comprador");

        jLabel10.setFont(new java.awt.Font("DokChampa", 1, 14)); // NOI18N
        jLabel10.setText("Precio");

        btnGenerarPDF.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        btnGenerarPDF.setText("Generar PDF");
        btnGenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarPDFMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGenerarPDF1.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        btnGenerarPDF1.setText("Salir");
        btnGenerarPDF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarPDF1MouseClicked(evt);
            }
        });
        btnGenerarPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPDF1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtnomP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(153, 153, 153)
                        .addComponent(jLabel10)
                        .addGap(29, 29, 29)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(11, 11, 11)
                                .addComponent(btnGenerarPDF))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerarPDF1))))
                .addGap(0, 92, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnomP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnGenerarPDF)
                    .addComponent(btnEliminar)
                    .addComponent(btnGenerarPDF1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void mostrarDato(){
      
        
        String[][] Mat = new String[factura.size()][6];
        Factura aux;

        for (int i = 0; i < factura.size(); i++) {
            aux= factura.get(i);
            Mat[i][0]=Integer.toString(aux.getCodigo());
            Mat[i][1]= aux.getNombPro();
            Mat[i][2]=Integer.toString(aux.getCantidad());
            Mat[i][3]=Float.toString(aux.getPrecio());
            Mat[i][4]=aux.getNombEmple();
            Mat[i][5]=Float.toString(aux.calculo());
        }
        
            tableElement.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "Codigo", "Nombre Producto", "Cantidad", "Precio", "Nombre Empleado", "Total"
            }
        ));
    }
    
    
    private void Limpiar(){
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtPrecio.setText("");
        txtnomEmp.setText("");
        txtnomP.setText("");
    }
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if(factura==null){
            factura = new ArrayList<Factura>();
        }
      
      int cantidad;
      int codigo;
      float precio;
      String nomEmp;
      String nomP;
        
        try{
            
            cantidad= Integer.parseInt(txtCantidad.getText());
            codigo= Integer.parseInt(txtCodigo.getText());
            precio = Float.parseFloat(txtPrecio.getText());
            nomEmp = txtnomEmp.getText();
            nomP = txtnomP.getText();
            factura.add(new Factura(codigo, nomEmp, nomP, precio, cantidad));
            
            

            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor digite los campos completamente");
        }
        
        this.Limpiar();
        this.mostrarDato();
        
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int c;
        try{
            c= tableElement.getSelectedRow();
             factura.remove(c);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor seleccione la fila a eliminar");
            return;
        }
        this.mostrarDato();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGenerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarPDFMouseClicked
       String ruta="C:\\Users\\Neiver Tapia\\Documents\\NetBeansProjects\\practicaMia\\FacturaPDF.pdf";
       String pick="C:\\Users\\Neiver Tapia\\Pictures\\Imagen.jpg";
       
        try{   
            this.crearTxt();
            this.generarPDF(ruta,pick);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "El error es: "+e);
        }
        JOptionPane.showMessageDialog(null, "PDF creado");
    }//GEN-LAST:event_btnGenerarPDFMouseClicked

    private void btnGenerarPDF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarPDF1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPDF1MouseClicked

    private void btnGenerarPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPDF1ActionPerformed
    System.exit(0);        
    }//GEN-LAST:event_btnGenerarPDF1ActionPerformed
    //Para crear el PDF
    private void generarPDF(String Dest, String fot) throws FileNotFoundException, IOException{
        
        
        
        
        JFileChooser browser;
        browser= new JFileChooser();
        int resultBrowser;
        resultBrowser= browser.showOpenDialog(null);
        if(resultBrowser!=JFileChooser.APPROVE_OPTION){
            JOptionPane.showMessageDialog(null, "El archivo no fue cargado");
            return;
        }
        
        PdfWriter archivo = new PdfWriter(Dest);
        PdfDocument pdf  = new PdfDocument(archivo);
        Document document = new Document(pdf,PageSize.A4.rotate());
        document.setMargins(30, 15, 10, 10);
        
        PdfFont font= PdfFontFactory.createFont(FontConstants.HELVETICA);
        PdfFont bold = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
        
        
        Table table = new Table(new float[]{4,4,4,4,4,4});
        table.setWidthPercent(100);
        
        Image img = new Image(ImageDataFactory.create(fot));
        img.setFixedPosition(70, 50);
        img.scaleAbsolute(200, 200);
        img.setBorderLeft(Border.NO_BORDER);
        img.setBorderRight(Border.NO_BORDER);
        
        FileReader writer = new FileReader(browser.getSelectedFile());
        BufferedReader leerTexto = new BufferedReader(writer);
        
        String lector=leerTexto.readLine();
        
        this.process(table, font, bold, true, lector);
        while((lector=leerTexto.readLine())!=null){
            this.process(table, font, bold, false, lector);
        }
        Paragraph p = new Paragraph("Sistema de facturas a continuacion");
        Paragraph n = new Paragraph("\n");
        p.setTextAlignment(TextAlignment.CENTER);
        
        document.add(img);
        document.add(p);
        document.add(n);
        document.add(table);
        document.close();
        leerTexto.close();
    }
    //procesar la informacion en la table
    private void process(Table table, PdfFont font, PdfFont bold, boolean isHead,String lector){
        StringTokenizer tokenizer = new StringTokenizer(lector,";");
                while(tokenizer.hasMoreElements()){
                    if(isHead==true){
                        table.addCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(bold)));
                    }else{
                       table.addCell(new Cell().add(new Paragraph(tokenizer.nextToken()).setFont(font)));
                    }
                }
    }
    
    // Método para crear el Txt
    private void crearTxt(){
        File file;
        file = new File("Factura.txt");
        PrintWriter escribir;
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "El eror es: "+e);
        }
              
        try{
            Factura aux;
            escribir = new PrintWriter(file,"utf-8");
            int casilla=0;
            
                for (int i = 0; i < factura.size(); i++) {
                    aux= factura.get(i);
                    if(casilla<=0){
                        aux.indice(escribir);
                        casilla++;
                    }
                    
                    aux.guardar(escribir);
                }
            escribir.close();
        }catch(FileNotFoundException | UnsupportedEncodingException e){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos"+e);
        }
        
        
            JOptionPane.showMessageDialog(null, "Txt creado con éxito");
    
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
            java.util.logging.Logger.getLogger(facturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarPDF;
    private javax.swing.JButton btnGenerarPDF1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableElement;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtnomEmp;
    private javax.swing.JTextField txtnomP;
    // End of variables declaration//GEN-END:variables
}