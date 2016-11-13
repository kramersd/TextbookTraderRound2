package TextBookTrade;



import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Kramer <sbk5234@psu.edu>
 */
public class TextBookTradeUI3 extends javax.swing.JApplet {
   
    private ResultSetTableModel rstm;
    /**
     * Initializes the applet TextBookTradeUI3
     */
    @Override
    public void init() {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            rstm = new ResultSetTableModel("jdbc:derby://localhost:1527/TextBookTrader", "java", "java", "SELECT * FROM LISTINGS");
            //System.out.println(rstm.getColumnName(0));
        } catch (SQLException ex) {
            Logger.getLogger(TextBookTradeUI3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextBookTradeUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextBookTradeUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextBookTradeUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextBookTradeUI3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    setSize(650, 450);
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginLoginButton = new javax.swing.JButton();
        loginPasswordLabel = new javax.swing.JLabel();
        loginUsernameTextField = new javax.swing.JTextField();
        loginTitleLabel = new javax.swing.JLabel();
        loginPasswordTextField = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        searchResultsPane = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        searchComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new JTable(rstm);
        viewBookListingButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bookPanel = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        textBookImageFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        bookTitle = new javax.swing.JLabel();
        bookAuthor = new javax.swing.JLabel();
        bookISBN = new javax.swing.JLabel();
        bookCourse = new javax.swing.JLabel();

        boxPanel.setLayout(new java.awt.CardLayout());

        loginUsernameLabel.setText("Username:");

        loginLoginButton.setText("Login");
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });

        loginPasswordLabel.setText("Password:");

        loginUsernameTextField.setText("user1");
        loginUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameTextFieldActionPerformed(evt);
            }
        });

        loginTitleLabel.setText("Textbook Trader Login");

        loginPasswordTextField.setText("user1");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginTitleLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginUsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(loginUsernameTextField))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(loginLoginButton))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginPasswordTextField)))))
                .addGap(239, 239, 239))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(loginTitleLabel)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginUsernameLabel))
                .addGap(15, 15, 15)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPasswordLabel)
                    .addComponent(loginPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginLoginButton)
                .addGap(163, 163, 163))
        );

        boxPanel.add(loginPanel, "card2");

        searchTextField.setText("Enter Search Criteria");

        searchLabel.setText("Search:");

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Last", "ISBN", "Title" }));
        searchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchComboBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(rstm);
        jScrollPane1.setViewportView(jTable1);

        viewBookListingButton.setText("View Selected Book Details");
        viewBookListingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookListingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchResultsPaneLayout = new javax.swing.GroupLayout(searchResultsPane);
        searchResultsPane.setLayout(searchResultsPaneLayout);
        searchResultsPaneLayout.setHorizontalGroup(
            searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchResultsPaneLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBookListingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        searchResultsPaneLayout.setVerticalGroup(
            searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchResultsPaneLayout.createSequentialGroup()
                .addGroup(searchResultsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBookListingButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        logoutButton.setText("Logout");

        jButton4.setText("Settings");

        jButton5.setText("My Books");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(searchResultsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchResultsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        boxPanel.add(mainPanel, "card3");

        textBookImageFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Textbook Image");

        javax.swing.GroupLayout textBookImageFrameLayout = new javax.swing.GroupLayout(textBookImageFrame);
        textBookImageFrame.setLayout(textBookImageFrameLayout);
        textBookImageFrameLayout.setHorizontalGroup(
            textBookImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textBookImageFrameLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        textBookImageFrameLayout.setVerticalGroup(
            textBookImageFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textBookImageFrameLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        bookTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookTitleLabel.setText("Title:");

        AuthorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AuthorLabel.setText("Author:");

        isbnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isbnLabel.setText("ISBN:");

        courseLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        courseLabel.setText("Course:");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        bookTitle.setText("jLabel2");
        bookTitle.setName(""); // NOI18N

        bookAuthor.setText("jLabel2");

        bookISBN.setText("jLabel2");

        bookCourse.setText("jLabel2");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(textBookImageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addComponent(courseLabel)
                        .addGap(18, 18, 18)
                        .addComponent(bookCourse))
                    .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informationPanelLayout.createSequentialGroup()
                            .addComponent(bookTitleLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookTitle))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, informationPanelLayout.createSequentialGroup()
                            .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AuthorLabel)
                                .addComponent(isbnLabel))
                            .addGap(18, 18, 18)
                            .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookISBN)
                                .addComponent(bookAuthor)))))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(textBookImageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookTitleLabel)
                            .addComponent(bookTitle))
                        .addGap(18, 18, 18)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AuthorLabel)
                            .addComponent(bookAuthor))
                        .addGap(18, 18, 18)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isbnLabel)
                            .addComponent(bookISBN))
                        .addGap(18, 18, 18)
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseLabel)
                            .addComponent(bookCourse))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        boxPanel.add(bookPanel, "card4");

        getContentPane().add(boxPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed
        // TODO add your handling code here:
        
        if(LoginController.authenticateUser(loginUsernameTextField.getText(), loginPasswordTextField.getText())) {
            CardLayout cl = (CardLayout)(boxPanel.getLayout());
            cl.next(boxPanel);
        } else {
            System.out.println("Not a user!");
        }
        //CardLayout cl = (CardLayout)(boxPanel.getLayout());
        //cl.next(boxPanel);
        
        
    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void viewBookListingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookListingButtonActionPerformed
        CardLayout cl = (CardLayout)(boxPanel.getLayout());
        cl.next(boxPanel);
        bookTitle.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 3));
        bookAuthor.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 0) + ", " + jTable1.getValueAt(jTable1.getSelectedRow(), 1));
        bookISBN.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 2));
        bookCourse.setText((String)jTable1.getValueAt(jTable1.getSelectedRow(), 7));


    }//GEN-LAST:event_viewBookListingButtonActionPerformed

    private void searchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchComboBoxActionPerformed
        String criteria;
        if(searchComboBox.getSelectedItem().equals("Last"))
            criteria = "ALASTNAME";
        else if(searchComboBox.getSelectedItem().equals("First"))
            criteria = "AFIRSTNAME";
        else if(searchComboBox.getSelectedItem().equals("ISBN"))
            criteria = "ISBN";
        else
            criteria = "TITLE";
        //System.out.println(searchTextField.getText());
        try {
            rstm.setQuery("SELECT * FROM LISTINGS WHERE " + criteria + " = '" + searchTextField.getText() + "'");
        } catch (SQLException ex) {
            Logger.getLogger(TextBookTradeUI3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(TextBookTradeUI3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchComboBoxActionPerformed

    private void loginUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameTextFieldActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        CardLayout cl = (CardLayout)(boxPanel.getLayout());
        cl.next(boxPanel);
        cl.next(boxPanel);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText("Books For Sale");
        try {
            rstm.setQuery("SELECT * FROM OWNED");
        } catch (SQLException ex) {
            Logger.getLogger(TextBookTradeUI3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalStateException ex) {
            Logger.getLogger(TextBookTradeUI3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JLabel bookAuthor;
    private javax.swing.JLabel bookCourse;
    private javax.swing.JLabel bookISBN;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JLabel bookTitle;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JPanel boxPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JTextField loginPasswordTextField;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JLabel loginUsernameLabel;
    private javax.swing.JTextField loginUsernameTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchResultsPane;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel textBookImageFrame;
    private javax.swing.JButton viewBookListingButton;
    // End of variables declaration//GEN-END:variables
}
