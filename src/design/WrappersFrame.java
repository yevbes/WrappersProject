/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappersproject.WrappersProject;

/**
 *
 * @author yevbes
 */
public class WrappersFrame extends javax.swing.JFrame {

    private WrappersProject wp;
    private boolean isAmazonChecked = false, isFnacChecked = false;
    private static final int MAXIMUM = 6;

    /**
     * Creates new form WrappersFrame
     */
    public WrappersFrame() {
        initComponents();
        //wp = new WrappersProject("/home/yevbes/NetBeansProjects/WrappersProject/geckodriver/geckodriver");
        wp = new WrappersProject("C:/Users/alex_/Documents/NetBeansProjects/WrappersProject/geckodriver/geckodriver.exe");

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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jCheckBoxAmazon = new javax.swing.JCheckBox();
        jCheckBoxFnac = new javax.swing.JCheckBox();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Búsqueda de libros");
        setResizable(false);

        jLabel1.setText("Título del texto");

        jLabel2.setText("Autor");

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });

        jTextFieldAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAutorActionPerformed(evt);
            }
        });

        jCheckBoxAmazon.setText("Amazon");
        jCheckBoxAmazon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAmazonActionPerformed(evt);
            }
        });

        jCheckBoxFnac.setText("Fnac");
        jCheckBoxFnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFnacActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sitio de búsqueda", "Título", "Autor", "Precio", "Descuento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBoxAmazon)
                    .addComponent(jButtonBuscar)
                    .addComponent(jCheckBoxFnac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(jCheckBoxFnac)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxAmazon)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAutorActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        clearTable();
        String autor = jTextFieldAutor.getText();
        String titulo = jTextFieldTitulo.getText();
        WebDriver driver = wp.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        if (isAmazonChecked && isFnacChecked) {
            amazonSearch(driver, autor, titulo, wait);
            fnacSearch(driver, autor, titulo, wait);
        } else if (isAmazonChecked) {
            amazonSearch(driver, autor, titulo, wait);
        } else if (isFnacChecked) {
            fnacSearch(driver, autor, titulo, wait);
        }


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jCheckBoxAmazonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAmazonActionPerformed
        isAmazonChecked = !isAmazonChecked;
    }//GEN-LAST:event_jCheckBoxAmazonActionPerformed

    private void jCheckBoxFnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFnacActionPerformed
        isFnacChecked = !isFnacChecked;
    }//GEN-LAST:event_jCheckBoxFnacActionPerformed

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
            java.util.logging.Logger.getLogger(WrappersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WrappersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WrappersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WrappersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WrappersFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JCheckBox jCheckBoxAmazon;
    private javax.swing.JCheckBox jCheckBoxFnac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables

    private void clearTable() {
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        dm.setRowCount(0);
    }

    private void amazonSearch(WebDriver driver, String autor, String titulo, WebDriverWait wait) {
        // Sitio de búsqueda, el titulo, nombre autor, precio, descuento si existe
        // Si no existe el libro, 1a fila todo x
        driver.get("http://www.amazon.es");
        driver.manage().window().maximize();

        // searchDropdownBox
        Select searchDropdownBox = new Select(driver.findElement(By.id("searchDropdownBox")));;
        if (searchDropdownBox != null) {
            searchDropdownBox.selectByValue("search-alias=stripbooks");

            //searchDropdownBox.click();
            WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
            if (searchInput != null) {
                searchInput.sendKeys(titulo + " " + autor);
                WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
                if (searchBtn != null) {
                    searchBtn.click();
                    /* Numero de paginaciónes, hay que conseguir listarlas */
                    try {
                        WebElement numOfNav = driver.findElement(By.className("pagnDisabled"));
                        if (numOfNav != null) {
                            int numOfNavs = Integer.parseInt(numOfNav.getText()); // Total de paginaciónes
                            // Para cada página de paginación
                            int aux;
                                if (numOfNavs >= MAXIMUM) {
                                    aux = MAXIMUM;
                                } else {
                                    aux = numOfNavs;
                                }
                            for (int i = 0; i < aux; i++) {
                                fetchAmazonBooks(driver); //El método coge la info de los articulos y rellena la tabla                           
                                JavascriptExecutor js = ((JavascriptExecutor) driver);
                                //presence in DOM
                                WebElement nextBtn = null;
                                try {
                                    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pagnNextString")));
                                    //scrolling

                                    WebElement element = driver.findElement(By.id("pagnNextString"));
                                    js.executeScript("arguments[0].scrollIntoView(true);", element);
                                    //clickable

                                    nextBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("pagnNextString")));
                                } catch (Exception e) {

                                }
//driver.findElement(By.id("//*[@id='pagnNextLink']"));
                                //WebElement nextBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[5]/div/div/span["+6+"]/a"));
                                if (nextBtn != null && i != aux-1) {
                                    try {
                                        nextBtn.click();
                                        waitForPageLoaded(driver);
                                    } catch (Exception e) {

                                    }
                                }

                            }
                        }
                    } catch (Exception e) {
                        Object[] row = new Object[5];
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                        row[0] = "x";
                        row[1] = "x";
                        row[2] = "x";
                        row[3] = "x";
                        row[4] = "x";
                        model.addRow(row);
                    }
                }
            }
        }

    }

    public String method(String str) {
        if (str.charAt(str.length() - 1) == '€') {
            str = str.replace(str.substring(str.length() - 1), "");
            return str;
        } else {
            return str;
        }
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    private void fnacSearch(WebDriver driver, String autor, String titulo, WebDriverWait wait) {
        driver.get("http://www.fnac.es/");
        driver.manage().window().maximize();

        WebElement searchDropdownBox = driver.findElement(By.className("Header__aisle-list"));
        if (searchDropdownBox != null) {
            searchDropdownBox.click();

            WebElement searchDropdownItem
                    = //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[8]/div/div/ul/li[2]")));
                    driver.findElement(By.xpath("/html/body/div[8]/div/div/ul/li[2]"));
            if (searchDropdownItem != null) {
                searchDropdownItem.click();
                WebElement searchInput
                        = //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"Fnac_Search\\\"]")));
                        driver.findElement(By.xpath("//*[@id=\"Fnac_Search\"]"));
                if (searchInput != null) {
                    searchInput.sendKeys(titulo + " " + autor);
                    WebElement searchBtn
                            = //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/form/div[2]/div/button")));
                            driver.findElement(By.className("Header__search-submit"));
                    if (searchBtn != null) {
                        searchBtn.click();
                        try {

                            WebElement numOfNav = driver.findElement(By.className("pageView"));

                            if (numOfNav != null) {

                                int numOfNavs = Integer.parseInt(numOfNav.getText().replace("Página 1 / ", "").trim()); // Total de paginaciónes
                                // Para cada página de paginación
                                int aux;
                                if (numOfNavs >= MAXIMUM) {
                                    aux = MAXIMUM;
                                } else {
                                    aux = numOfNavs;
                                }
                                for (int i = 0; i < aux; i++) {
                                    fetchFnackBooks(driver);  //El método coge la info de los articulos y rellena la tabla                           
                                    //presence in DOM
                                    WebElement nextBtn = null;
                                    try {
                                        String li
                                                = //"/html/body/div[4]/div/div[11]/div/div[2]/ul/li[5]";
                                                "nextLevel1";
                                        nextBtn = driver.findElement(By.className(li));
                                    } catch (Exception e) {

                                    }
//driver.findElement(By.id("//*[@id='pagnNextLink']"));
                                    //WebElement nextBtn = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[5]/div/div/span["+6+"]/a"));
                                    if (nextBtn != null && i != aux-1) {
                                        try {
                                            nextBtn.click();
                                            waitForPageLoaded(driver);
                                        } catch (Exception e) {

                                        }
                                    }

                                }
                            }
                        } catch (Exception e) {
                            Object[] row = new Object[5];
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                            row[0] = "x";
                            row[1] = "x";
                            row[2] = "x";
                            row[3] = "x";
                            row[4] = "x";
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }

    private void fetchAmazonBooks(WebDriver driver) {
        WebDriverWait wait_aux = new WebDriverWait(driver, 10);
        wait_aux.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html")));
        List<WebElement> listaLibros = driver.findElements(By.className("s-item-container"));

        if (listaLibros != null) {
            WebElement tituloElem, autorElem, precioElem;
            Object[] row = new Object[5];
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            if (!listaLibros.isEmpty()) {
                int count = 1;
                for (int i = 0; i < listaLibros.size() - 1; i++) {
                    try {
                        tituloElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[" + count + "]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
                    } catch (Exception e) {
                        tituloElem = null;
                    }
                    try {

                        autorElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[" + count + "]/div/div/div/div[2]/div[1]/div[2]/span[2]"));
                    } catch (Exception e) {
                        autorElem = null;
                    }
                    try {
                        precioElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[" + count + "]/div/div/div/div[2]/div[2]/div[1]/div[2]/a/span[2]"));
                    } catch (Exception e) {
                        precioElem = null;
                    }
                    row[0] = "Amazon";

                    if (tituloElem != null) {
                        row[1] = tituloElem.getText();
                    } else {
                        row[1] = "x";
                    }

                    if (autorElem != null) {
                        row[2] = autorElem.getText();
                    } else {
                        row[2] = "x";
                    }

                    if (precioElem != null) {
                        row[3] = precioElem.getText();
                    } else {
                        row[3] = "x";
                    }

                    row[4] = "x";
                    model.addRow(row);
                    count++;
                }

            } else {
                row[0] = "x";
                row[1] = "x";
                row[2] = "x";
                row[3] = "x";
                row[4] = "x";
                model.addRow(row);
            }
        }
    }

    private void fetchFnackBooks(WebDriver driver) {
        WebDriverWait wait_aux = new WebDriverWait(driver, 10);
        wait_aux.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html")));
        List<WebElement> listaLibros
                = //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("Article-item")));
                driver.findElements(By.xpath("/html/body/div[4]/div/div[6]/ul/li"));
        if (listaLibros != null) {
            WebElement tituloElem, autorElem, precioElem, discountElem;
            Object[] row = new Object[5];
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            if (!listaLibros.isEmpty()) {
                int count = 1;
                for (int i = 0; i < listaLibros.size(); i++) {

                    try {
                        tituloElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[2]/div/p[1]"));
                        //findElement(By.className("js-minifa-title"));
                    } catch (Exception e) {
                        try {
                            tituloElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[2]/div/p[1]/a"));
                        } catch (Exception e2) {
                            tituloElem = null;
                        }

                    }
                    try {
                        autorElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[2]/div/p[2]"));
                        //.findElement(By.className("Article-descSub")).findElement(By.tagName("a"));
                    } catch (Exception e) {
                        try {
                            autorElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[2]/div/p[2]/a"));
                        } catch (Exception e2) {
                            autorElem = null;
                        }
                    }

                    try {
                        precioElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[3]/div/div[2]/div/div[1]/a"));
                        //.findElement(By.className("userPrice"));
                    } catch (Exception e) {

                        precioElem = null;
                    }
                    try {
                        discountElem = listaLibros.get(i).findElement(By.xpath("/html/body/div[4]/div/div[6]/ul/li[" + count + "]/div/div[3]/div/div[2]/div/div[1]/span"));
                        //.findElement(By.className("oldPrice"));
                    } catch (Exception e) {
                        discountElem = null;
                    }

                    row[0] = "Fnac";

                    if (tituloElem != null) {
                        row[1] = tituloElem.getText();
                    } else {
                        row[1] = "x";
                    }

                    if (autorElem != null) {
                        row[2] = autorElem.getText();
                    } else {
                        row[2] = "x";
                    }

                    if (precioElem != null) {
                        row[3] = precioElem.getText();
                    } else {
                        row[3] = "x";
                    }

                    if (discountElem != null && precioElem != null) {
                        double precioReal = Double.parseDouble(method(discountElem.getText().trim()).replaceAll(",", "."));
                        double precioDescuento = Double.parseDouble(method(precioElem.getText().trim()).replaceAll(",", "."));
                        double descuento = precioReal - precioDescuento;
                        row[4] = "" + round(descuento, 2) + "€";
                    } else {
                        row[4] = "x";
                    }

                    model.addRow(row);
                    count++;
                }
            } else {
                row[0] = "x";
                row[1] = "x";
                row[2] = "x";
                row[3] = "x";
                row[4] = "x";
                model.addRow(row);
            }
        }
    }

    public void waitForPageLoaded(WebDriver driver) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Timeout waiting for Page Load Request to complete.");
        }
    }
}
