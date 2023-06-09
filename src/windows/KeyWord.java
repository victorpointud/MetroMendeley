
package windows;

import javax.swing.JOptionPane;
import metromendeley.Functions;
import metromendeley.GlobalVariables;
import metromendeley.ListObject;
import metromendeley.NodeObject;
import metromendeley.InfoObject;

/**
 *
 * @author victorpointud
 */

public final class KeyWord extends javax.swing.JFrame {

    public KeyWord() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        AllAuthors();
    }
    
        public void AllAuthors() {
        ListObject list = GlobalVariables.getObjects();
        NodeObject pointer = list.getHead();
        int index = 0;
        while (pointer != null) {
            InfoObject summary = pointer.getElement();
            String[] keywords = summary.getKeywords();
            for (int i = 0; i < keywords.length; i++) {        
                KeyWords.insertItemAt(keywords[i], index);
                index++;
            }
            pointer = pointer.getNext();
        }
    }
        
        public void AllSummaries(){
            ListObject list = GlobalVariables.getObjects();
            NodeObject pointer = list.getHead();
            int index = 0;
            while (pointer != null) {
                InfoObject summary = pointer.getElement();
                String[] keywords = summary.getKeywords();
                for (int i = 0; i < keywords.length; i++) {        
                    if (keywords[i].equals(String.valueOf(KeyWords.getSelectedItem()))) {
                        Searchs.insertItemAt(summary.getTitle(), index);
                        index++;
                    }      
                }
                pointer = pointer.getNext();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JButton();
        Searchs = new javax.swing.JComboBox<>();
        KeyWords = new javax.swing.JComboBox<>();
        Titles = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Info = new javax.swing.JTextArea();
        jlabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchSearchs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda por Palabra Clave");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        Menu.setBackground(new java.awt.Color(153, 255, 153));
        Menu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, 40));

        Searchs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchsActionPerformed(evt);
            }
        });
        jPanel1.add(Searchs, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 270, 30));

        jPanel1.add(KeyWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 280, 30));

        Titles.setBackground(new java.awt.Color(204, 204, 255));
        Titles.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Titles.setText("Información de Investigación");
        Titles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitlesActionPerformed(evt);
            }
        });
        jPanel1.add(Titles, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 270, 30));

        Info.setColumns(20);
        Info.setRows(5);
        jScrollPane1.setViewportView(Info);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 470, 220));

        jlabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlabel5.setText("Investigaciones");
        jPanel1.add(jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Palabras Claves");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, -1));

        SearchSearchs.setBackground(new java.awt.Color(204, 255, 204));
        SearchSearchs.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchSearchs.setText("Buscar Investigaciones por Palabra Clave");
        SearchSearchs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSearchsActionPerformed(evt);
            }
        });
        jPanel1.add(SearchSearchs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/KeyWord.jpg")));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Menu m = new Menu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void SearchsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchsActionPerformed

    private void TitlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitlesActionPerformed
        Functions v = new Functions();
        if (Searchs.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "No se ha agregado ningún título.");
        }
        else{
            String p = GlobalVariables.getTable().searchObject(String.valueOf(Searchs.getSelectedItem())).createInfo();
            Info.setText(p);
        }
    }//GEN-LAST:event_TitlesActionPerformed

    private void SearchSearchsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSearchsActionPerformed
        int itemCount = Searchs.getItemCount();
            for(int i = 0; i < itemCount; i++){
            Searchs.removeItemAt(0);
            }
        if (KeyWords.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "No se ha agregado ninguna palabra clave.");
        }
        else{
            AllSummaries();
        }  
    }//GEN-LAST:event_SearchSearchsActionPerformed

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
            java.util.logging.Logger.getLogger(KeyWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeyWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeyWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeyWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Info;
    private javax.swing.JComboBox<String> KeyWords;
    private javax.swing.JButton Menu;
    private javax.swing.JButton SearchSearchs;
    private javax.swing.JComboBox<String> Searchs;
    private javax.swing.JButton Titles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel5;
    // End of variables declaration//GEN-END:variables
}
