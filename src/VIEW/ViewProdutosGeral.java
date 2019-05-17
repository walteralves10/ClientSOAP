package VIEW;

import CONTROLER.ProdutosServer;
import MODEL.ProdutosBEAN;
import MODEL.GerenciaXMLCliente;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ViewProdutosGeral extends javax.swing.JFrame {

    private static final String IMAGENS_MEUNOT = "/home/rezende/Documentos/faculdade/9 periodo/SISTEMA DISTRIBUIDO/Projeto SOAP/clienteProdutos/src/IMAGENS/pacote.png";
    private static final String IMAGENS_TRABALHO = "E:\\0 - walter\\faculdade\\SISTEMA DISTRIBUIDO\\clienteProdutos\\src\\IMAGENS\\";
    
    public ViewProdutosGeral() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaUnico = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        comboCategoria = new javax.swing.JComboBox<>();
        btnBuscaProdutos = new javax.swing.JToggleButton();
        btnDetalhaProduto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelIMG = new javax.swing.JLabel();
        textDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textPrecoDeVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textLucro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCusto = new javax.swing.JTextField();
        textEstoqueMaximo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textEstoqueMinimo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textEstoqueAtual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboCategoriaDet = new javax.swing.JComboBox<>();
        comboUnidadeMedida = new javax.swing.JComboBox<>();
        comboFornecedor = new javax.swing.JComboBox<>();
        textCodBarreira = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pesquisaUnico.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Barras", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tableProdutos);

        comboCategoria.setBackground(new java.awt.Color(0, 0, 204));
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERAL", "LIMPEZA", "SOBREMESAS", "BOLACHAS", "CERVEJAS", "FRUTAS E LEGUMES", "REFRIGERANTES", "CARNES", "SMARTHPHONES", "JOGOS", "ELETRÔNICOS" }));

        btnBuscaProdutos.setBackground(new java.awt.Color(255, 255, 0));
        btnBuscaProdutos.setText("Buscar");
        btnBuscaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutosActionPerformed(evt);
            }
        });

        btnDetalhaProduto.setText("Detalhar");
        btnDetalhaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDetalhaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProdutos))
                .addGap(18, 18, 18)
                .addComponent(btnDetalhaProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pesquisaUnico.addTab("Pesquisar produtos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        labelIMG.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço de Venda:");

        textPrecoDeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrecoDeVendaActionPerformed(evt);
            }
        });

        jLabel4.setText("(Lucro");

        jLabel5.setText("%)");

        jLabel6.setText("Custo:");

        textCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCustoActionPerformed(evt);
            }
        });

        jLabel10.setText("Max=");

        jLabel8.setText("Limites de Estoque:");

        textEstoqueAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEstoqueAtualActionPerformed(evt);
            }
        });

        jLabel7.setText("Estoque Atual:");

        jLabel11.setText("Categoria:");

        jLabel12.setText("Unidade de Medida:");

        jLabel13.setText("Fornecedor:");

        jLabel9.setText("Min=");

        comboCategoriaDet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "LIMPEZA", "SOBREMESA", "BOLACHA", "CERVEJA", "FRUTAS E LEGUMES", "REFRIGERANTES", "CARNES", "SMARTHPHONES", "JOGOS", "ELETRÔNICOS" }));
        comboCategoriaDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaDetActionPerformed(evt);
            }
        });

        comboUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "UN", "KG", "L", "M", "G" }));

        comboFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "WALTER ALVES REZENDE", "GABRIEL ALEXANDRE DE FULANO", "EDUARDO MATHEUS ROMERO", "AGOSTINHO CANA BRABA", "RONIMAR PEREIRA DO SANTOS" }));

        textCodBarreira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodBarreiraActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Barras:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(labelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addGap(9, 9, 9)
                                        .addComponent(textEstoqueMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(comboFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6)
                                .addComponent(textCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textDescricao)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCodBarreira, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCategoriaDet, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCodBarreira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(textCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(textEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(textEstoqueMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCategoriaDet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(comboUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pesquisaUnico.addTab("Dados do produto", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pesquisaUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pesquisaUnico)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutosActionPerformed
        DefaultTableModel dtmPrincipal = (DefaultTableModel) tableProdutos.getModel();
        
        try {

            ProdutosServer server = conectaWebService();

            String APIKey = "hdusdjdj475869dj";
            
            File prodXml = null;
            
            if(comboCategoria.getSelectedIndex() == 0){
                prodXml =  server.ListarProdutos(APIKey);
            }else{
                prodXml = server.ListarProdutosCat(comboCategoria.getSelectedIndex(), APIKey);
            }
            
            ArrayList<ProdutosBEAN> lista = GerenciaXMLCliente.arquivoXMLCliente(prodXml);
            
            dtmPrincipal.setNumRows(0);

        for (int i = 0; i < lista.size(); i++) {
            Object[] linha = {
                lista.get(i).getCodigoBarrasProdutos(),
                lista.get(i).getDescricaoProdutos()};
            dtmPrincipal.addRow(linha);
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnBuscaProdutosActionPerformed

    private void btnDetalhaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhaProdutoActionPerformed
        
        File prodXml = null;
        try {

            ProdutosServer server = conectaWebService();

            String APIKey = "hdusdjdj475869dj";
            
            if(tableProdutos.getRowCount() >= 1){
                String selected = (String) tableProdutos.getModel().getValueAt(tableProdutos.getSelectedRow(), 0);
                prodXml = server.DadosProduto(selected, APIKey); 
                ProdutosBEAN list = GerenciaXMLCliente.arquivoXMLUnico(prodXml);
                
                textCodBarreira.setText(list.getCodigoBarrasProdutos());
                textDescricao.setText(list.getDescricaoProdutos());
                textPrecoDeVenda.setText(String.valueOf(list.getPrecoVendaProdutos()));
                textCusto.setText(String.valueOf(list.getCustoProdutos()));
                double lucroAux = (list.getPrecoVendaProdutos() - list.getCustoProdutos()) * 10;
                DecimalFormat df = new DecimalFormat("0.##");
                String dx = df.format(lucroAux);
                textLucro.setText(/*String.valueOf(lucroAux)*/dx);
                textEstoqueAtual.setText(String.valueOf(list.getEstoqueAtualProdutos()));
                textEstoqueMaximo.setText(String.valueOf(list.getEstoqueMaximoProdutos()));
                textEstoqueMinimo.setText(String.valueOf(list.getEstoqueMinimoProdutos()));
                comboCategoriaDet.setSelectedIndex(list.getFkIdCategorias());
                comboFornecedor.setSelectedIndex(list.getFkIdFornecedores());
                comboUnidadeMedida.setSelectedIndex(list.getFkIdUnidadeMedida());
                
                String load = IMAGENS_TRABALHO+retornaCaminhoImagem(list.getFkIdCategorias());
                //InputStream bytes = Object.class.getResourceAsStream(load);
                Icon icon = new ImageIcon(load);
                
                labelIMG.setIcon(icon);
                labelIMG.setVerticalTextPosition(SwingConstants.CENTER);
                labelIMG.setHorizontalTextPosition(SwingConstants.CENTER);
                
                this.pesquisaUnico.setSelectedIndex(1);
                this.textCodBarreira.requestFocus();
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDetalhaProdutoActionPerformed

    private void textCodBarreiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodBarreiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodBarreiraActionPerformed

    private void comboCategoriaDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaDetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaDetActionPerformed

    private void textCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCustoActionPerformed

    private void textPrecoDeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrecoDeVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrecoDeVendaActionPerformed

    private void textEstoqueAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEstoqueAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEstoqueAtualActionPerformed

    private ProdutosServer conectaWebService() throws MalformedURLException{
        URL url = null;
        url = new URL("http://127.0.0.1:9876/CONTROLER?wsdl");
        QName qname = new QName("http://CONTROLER/","ProdutosServerImplService");
        Service ws = Service.create(url, qname);
        return ws.getPort(ProdutosServer.class);
    }
    
    private String retornaCaminhoImagem(int tipoCategoria){
               if(tipoCategoria==1){
                   return "LIMPEZA.png";
               }else if(tipoCategoria==2){
                   return "SOBREMESA.png";
               }else if(tipoCategoria==3){
                   return "BOLACHA.png";
               }else if(tipoCategoria==4){
                   return "CERVEJA.png";
               }else if(tipoCategoria==5){
                   return "FRUTA_LEGUME.png";
               }else if(tipoCategoria==6){
                   return "REFRIGERANTE.png";
               }else if(tipoCategoria==7){
                   return "CARNE.png";
               }else if(tipoCategoria==8){
                   return "SMARTHPHONE.png";
               }else if(tipoCategoria==9){
                   return "JOGOS.png";
               }else if(tipoCategoria==10){
                   return "ELETRONICOS.png";
               }
        return "";
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProdutosGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutosGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutosGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutosGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProdutosGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscaProdutos;
    private javax.swing.JButton btnDetalhaProduto;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboCategoriaDet;
    private javax.swing.JComboBox<String> comboFornecedor;
    private javax.swing.JComboBox<String> comboUnidadeMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIMG;
    private javax.swing.JTabbedPane pesquisaUnico;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField textCodBarreira;
    private javax.swing.JTextField textCusto;
    private javax.swing.JTextField textDescricao;
    private javax.swing.JTextField textEstoqueAtual;
    private javax.swing.JTextField textEstoqueMaximo;
    private javax.swing.JTextField textEstoqueMinimo;
    private javax.swing.JTextField textLucro;
    private javax.swing.JTextField textPrecoDeVenda;
    // End of variables declaration//GEN-END:variables
}
