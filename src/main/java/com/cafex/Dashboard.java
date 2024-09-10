package com.cafex;

import com.cafex.db.DBUtil;
import com.cafex.models.IItem;
import com.cafex.models.Order;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        //initImages();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ProductScrollPanel = new javax.swing.JScrollPane();
        jProductPanel = new javax.swing.JPanel();
        ProductRow = new javax.swing.JPanel();
        productImage = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        productDescription = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        productQuantity0 = new javax.swing.JSpinner();
        labelOrder = new javax.swing.JLabel();
        jCheckBox0 = new javax.swing.JCheckBox();
        ProductRow1 = new javax.swing.JPanel();
        productImage1 = new javax.swing.JLabel();
        productName1 = new javax.swing.JLabel();
        productDescription1 = new javax.swing.JLabel();
        productPrice1 = new javax.swing.JLabel();
        quantityLabel1 = new javax.swing.JLabel();
        productQuantity1 = new javax.swing.JSpinner();
        labelOrder1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        ProductRow2 = new javax.swing.JPanel();
        productImage2 = new javax.swing.JLabel();
        productName2 = new javax.swing.JLabel();
        productDescription2 = new javax.swing.JLabel();
        productPrice2 = new javax.swing.JLabel();
        quantityLabel2 = new javax.swing.JLabel();
        productQuantity2 = new javax.swing.JSpinner();
        labelOrder2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        ProductRow3 = new javax.swing.JPanel();
        productImage3 = new javax.swing.JLabel();
        productName3 = new javax.swing.JLabel();
        productDescription3 = new javax.swing.JLabel();
        productPrice3 = new javax.swing.JLabel();
        quantityLabel3 = new javax.swing.JLabel();
        productQuantity3 = new javax.swing.JSpinner();
        labelOrder3 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        ProductRow4 = new javax.swing.JPanel();
        productImage4 = new javax.swing.JLabel();
        productName4 = new javax.swing.JLabel();
        productDescription4 = new javax.swing.JLabel();
        productPrice4 = new javax.swing.JLabel();
        quantityLabel4 = new javax.swing.JLabel();
        productQuantity4 = new javax.swing.JSpinner();
        labelOrder4 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        OrderCartPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ActionPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jMainLabel = new javax.swing.JLabel();
        totalJPanel = new javax.swing.JPanel();
        txtFieldTotal = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        BtnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductRow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        productName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText("  Burger");

        productDescription.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription.setText("Crispy Chicken");

        productPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText("Rs.950.00");

        quantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        quantityLabel.setText("Quantity: ");

        productQuantity0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productQuantity0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productQuantity0StateChanged(evt);
            }
        });

        labelOrder.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        labelOrder.setText("Order: ");

        jCheckBox0.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox0StateChanged(evt);
            }
        });
        jCheckBox0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductRowLayout = new javax.swing.GroupLayout(ProductRow);
        ProductRow.setLayout(ProductRowLayout);
        ProductRowLayout.setHorizontalGroup(
            ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductRowLayout.createSequentialGroup()
                        .addGap(0, 123, Short.MAX_VALUE)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductRowLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(productDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductRowLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity0, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox0)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        ProductRowLayout.setVerticalGroup(
            ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRowLayout.createSequentialGroup()
                .addGroup(ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductRowLayout.createSequentialGroup()
                        .addComponent(productName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productPrice)
                        .addGap(18, 18, 18)
                        .addGroup(ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductRowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityLabel)
                                .addComponent(productQuantity0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelOrder))
                            .addComponent(jCheckBox0))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(ProductRowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        ProductRow1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        productName1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        productName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName1.setText("Submarine");

        productDescription1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productDescription1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription1.setText("Crispy Chicken");

        productPrice1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productPrice1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice1.setText("Rs.950.00");

        quantityLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        quantityLabel1.setText("Quantity: ");

        productQuantity1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productQuantity1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productQuantity1StateChanged(evt);
            }
        });

        labelOrder1.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        labelOrder1.setText("Order: ");

        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductRow1Layout = new javax.swing.GroupLayout(ProductRow1);
        ProductRow1.setLayout(ProductRow1Layout);
        ProductRow1Layout.setHorizontalGroup(
            ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductRow1Layout.createSequentialGroup()
                        .addGap(0, 145, Short.MAX_VALUE)
                        .addComponent(productPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductRow1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(productDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductRow1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(quantityLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        ProductRow1Layout.setVerticalGroup(
            ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow1Layout.createSequentialGroup()
                .addGroup(ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductRow1Layout.createSequentialGroup()
                        .addComponent(productName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productDescription1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productPrice1)
                        .addGap(18, 18, 18)
                        .addGroup(ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductRow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityLabel1)
                                .addComponent(productQuantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelOrder1))
                            .addComponent(jCheckBox1)))
                    .addGroup(ProductRow1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProductRow2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        productName2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        productName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName2.setText("Kottu");

        productDescription2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productDescription2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription2.setText("Spicy Fry");

        productPrice2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productPrice2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice2.setText("Rs.700.00");

        quantityLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        quantityLabel2.setText("Quantity: ");

        productQuantity2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productQuantity2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productQuantity2StateChanged(evt);
            }
        });

        labelOrder2.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        labelOrder2.setText("Order: ");

        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductRow2Layout = new javax.swing.GroupLayout(ProductRow2);
        ProductRow2.setLayout(ProductRow2Layout);
        ProductRow2Layout.setHorizontalGroup(
            ProductRow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductRow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductRow2Layout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addComponent(productPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductRow2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(productDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductRow2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(quantityLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        ProductRow2Layout.setVerticalGroup(
            ProductRow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow2Layout.createSequentialGroup()
                .addComponent(productName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productDescription2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productPrice2)
                .addGap(18, 18, 18)
                .addGroup(ProductRow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ProductRow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityLabel2)
                        .addComponent(productQuantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelOrder2))
                    .addComponent(jCheckBox2))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(ProductRow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProductRow3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        productName3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        productName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName3.setText("Pasta");

        productDescription3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productDescription3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription3.setText("Mac & cheese");

        productPrice3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productPrice3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice3.setText("Rs.800.00");

        quantityLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        quantityLabel3.setText("Quantity: ");

        productQuantity3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productQuantity3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productQuantity3StateChanged(evt);
            }
        });

        labelOrder3.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        labelOrder3.setText("Order: ");

        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductRow3Layout = new javax.swing.GroupLayout(ProductRow3);
        ProductRow3.setLayout(ProductRow3Layout);
        ProductRow3Layout.setHorizontalGroup(
            ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductRow3Layout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addComponent(productPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductRow3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(productDescription3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductRow3Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(quantityLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        ProductRow3Layout.setVerticalGroup(
            ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow3Layout.createSequentialGroup()
                .addGroup(ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductRow3Layout.createSequentialGroup()
                        .addComponent(productName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productDescription3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productPrice3)
                        .addGap(18, 18, 18)
                        .addGroup(ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductRow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityLabel3)
                                .addComponent(productQuantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelOrder3))
                            .addComponent(jCheckBox3)))
                    .addGroup(ProductRow3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ProductRow4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        productName4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        productName4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName4.setText("Biriyani");

        productDescription4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productDescription4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription4.setText("Chicken");

        productPrice4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        productPrice4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice4.setText("Rs.750.00");

        quantityLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        quantityLabel4.setText("Quantity: ");

        productQuantity4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        productQuantity4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productQuantity4StateChanged(evt);
            }
        });

        labelOrder4.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        labelOrder4.setText("Order: ");

        jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox4StateChanged(evt);
            }
        });
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductRow4Layout = new javax.swing.GroupLayout(ProductRow4);
        ProductRow4.setLayout(ProductRow4Layout);
        ProductRow4Layout.setHorizontalGroup(
            ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductRow4Layout.createSequentialGroup()
                        .addGap(0, 134, Short.MAX_VALUE)
                        .addComponent(productPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProductRow4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(productDescription4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ProductRow4Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(quantityLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        ProductRow4Layout.setVerticalGroup(
            ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductRow4Layout.createSequentialGroup()
                .addGroup(ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductRow4Layout.createSequentialGroup()
                        .addComponent(productName4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productDescription4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productPrice4)
                        .addGap(18, 18, 18)
                        .addGroup(ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ProductRow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityLabel4)
                                .addComponent(productQuantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelOrder4))
                            .addComponent(jCheckBox4)))
                    .addGroup(ProductRow4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productImage4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jProductPanelLayout = new javax.swing.GroupLayout(jProductPanel);
        jProductPanel.setLayout(jProductPanelLayout);
        jProductPanelLayout.setHorizontalGroup(
            jProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProductRow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductRow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductRow3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProductRow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jProductPanelLayout.setVerticalGroup(
            jProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProductPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProductRow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductRow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductRow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductRow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductRow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        ProductScrollPanel.setViewportView(jProductPanel);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Quantity"
            }
        ));
        OrderCartPanel.setViewportView(jTable1);

        javax.swing.GroupLayout ActionPanelLayout = new javax.swing.GroupLayout(ActionPanel);
        ActionPanel.setLayout(ActionPanelLayout);
        ActionPanelLayout.setHorizontalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ActionPanelLayout.setVerticalGroup(
            ActionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMainLabel.setBackground(new java.awt.Color(255, 255, 255));
        jMainLabel.setFont(new java.awt.Font("Khmer MN", 1, 35)); // NOI18N
        jMainLabel.setForeground(new java.awt.Color(0, 51, 51));
        jMainLabel.setText("    CAFE   PESTRO");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMainLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        totalJPanel.setBackground(new java.awt.Color(204, 204, 204));
        totalJPanel.setForeground(new java.awt.Color(204, 204, 204));

        txtFieldTotal.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        txtFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldTotal.setText("0.00");
        txtFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTotalActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        labelTotal.setText("Total");

        javax.swing.GroupLayout totalJPanelLayout = new javax.swing.GroupLayout(totalJPanel);
        totalJPanel.setLayout(totalJPanelLayout);
        totalJPanelLayout.setHorizontalGroup(
            totalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, totalJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTotal)
                .addGap(18, 18, 18)
                .addComponent(txtFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        totalJPanelLayout.setVerticalGroup(
            totalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalJPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(totalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btnOrder.setBackground(new java.awt.Color(255, 204, 204));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        BtnNew.setBackground(new java.awt.Color(204, 255, 255));
        BtnNew.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        BtnNew.setText("New");
        BtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProductScrollPanel)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnOrder)
                        .addGap(26, 26, 26)
                        .addComponent(BtnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrderCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(ActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addComponent(ActionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(OrderCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnOrder)
                                    .addComponent(BtnNew)))
                            .addComponent(ProductScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(200, 200, 200)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void txtFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTotalActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                List<IItem> items = getSelectedProductList();
                Order order = new Order();
                order.setItems(items);

                if (order.getGrossAmount() > 0) {
                    DBUtil dbUtil = new DBUtil();
                    dbUtil.insertOrder(order.getGrossAmount(), order.getTaxAmount(), order.getNetAmount());
                    dbUtil.close();

                    resetUI();

                    Reciept receipt = new Reciept();
                    receipt.setTitle("New Window");
                    receipt.setVisible(true);
                }

            }
        });
    }//GEN-LAST:event_btnOrderActionPerformed

    private void jCheckBox0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox0ActionPerformed

    private void jCheckBox0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox0StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_jCheckBox0StateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jCheckBox4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox4StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_jCheckBox4StateChanged

    private void BtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewActionPerformed
        // TODO add your handling code here:
        resetUI();
    }//GEN-LAST:event_BtnNewActionPerformed

    private void productQuantity0StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productQuantity0StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();

    }//GEN-LAST:event_productQuantity0StateChanged

    private void productQuantity1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productQuantity1StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_productQuantity1StateChanged

    private void productQuantity2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productQuantity2StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_productQuantity2StateChanged

    private void productQuantity3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productQuantity3StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_productQuantity3StateChanged

    private void productQuantity4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productQuantity4StateChanged
        // TODO add your handling code here:
        updateSelectedProductList();
    }//GEN-LAST:event_productQuantity4StateChanged

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActionPanel;
    private javax.swing.JButton BtnNew;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane OrderCartPanel;
    private javax.swing.JPanel ProductRow;
    private javax.swing.JPanel ProductRow1;
    private javax.swing.JPanel ProductRow2;
    private javax.swing.JPanel ProductRow3;
    private javax.swing.JPanel ProductRow4;
    private javax.swing.JScrollPane ProductScrollPanel;
    private javax.swing.JButton btnOrder;
    private javax.swing.JCheckBox jCheckBox0;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jMainLabel;
    private javax.swing.JPanel jProductPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelOrder;
    private javax.swing.JLabel labelOrder1;
    private javax.swing.JLabel labelOrder2;
    private javax.swing.JLabel labelOrder3;
    private javax.swing.JLabel labelOrder4;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel productDescription;
    private javax.swing.JLabel productDescription1;
    private javax.swing.JLabel productDescription2;
    private javax.swing.JLabel productDescription3;
    private javax.swing.JLabel productDescription4;
    private javax.swing.JLabel productImage;
    private javax.swing.JLabel productImage1;
    private javax.swing.JLabel productImage2;
    private javax.swing.JLabel productImage3;
    private javax.swing.JLabel productImage4;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productName1;
    private javax.swing.JLabel productName2;
    private javax.swing.JLabel productName3;
    private javax.swing.JLabel productName4;
    private javax.swing.JLabel productPrice;
    private javax.swing.JLabel productPrice1;
    private javax.swing.JLabel productPrice2;
    private javax.swing.JLabel productPrice3;
    private javax.swing.JLabel productPrice4;
    private javax.swing.JSpinner productQuantity0;
    private javax.swing.JSpinner productQuantity1;
    private javax.swing.JSpinner productQuantity2;
    private javax.swing.JSpinner productQuantity3;
    private javax.swing.JSpinner productQuantity4;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JLabel quantityLabel2;
    private javax.swing.JLabel quantityLabel3;
    private javax.swing.JLabel quantityLabel4;
    private javax.swing.JPanel totalJPanel;
    private javax.swing.JTextField txtFieldTotal;
    // End of variables declaration//GEN-END:variables

    private List<IItem> getSelectedProductList() {
        List<IItem> selectedItems = new ArrayList();
        if (jCheckBox0.isSelected()) {
            IItem item = Constants.itemList.get(0);
            item.setItemQuantity((int) productQuantity0.getValue());
            selectedItems.add(item);
        }
        if (jCheckBox1.isSelected()) {
            IItem item = Constants.itemList.get(1);
            item.setItemQuantity((int) productQuantity1.getValue());
            selectedItems.add(item);
        }
        if (jCheckBox2.isSelected()) {
            IItem item = Constants.itemList.get(2);
            item.setItemQuantity((int) productQuantity2.getValue());
            selectedItems.add(item);
        }
        if (jCheckBox3.isSelected()) {
            IItem item = Constants.itemList.get(3);
            item.setItemQuantity((int) productQuantity3.getValue());
            selectedItems.add(item);
        }
        if (jCheckBox4.isSelected()) {
            IItem item = Constants.itemList.get(4);
            item.setItemQuantity((int) productQuantity4.getValue());
            selectedItems.add(item);
        }
        return selectedItems;
    }

    private void updateTableView(List<IItem> items) {

        Object[][] dataArray = new Object[items.size()][2];

        // Populate the array with data from the list
        for (int i = 0; i < items.size(); i++) {
            IItem item = items.get(i);
            dataArray[i][0] = item.getItemName();
            dataArray[i][1] = item.getItemQuantity();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                dataArray,
                new String[]{
                    "Item Name", "Quantity"
                }
        ));

        Order order = new Order();
        order.setItems(items);
        String formatted = String.format("%.2f", order.getNetAmount());

        txtFieldTotal.setText(formatted);

    }

    public void resetUI() {
        productQuantity0.setValue(0);
        productQuantity1.setValue(0);
        productQuantity2.setValue(0);
        productQuantity3.setValue(0);
        productQuantity4.setValue(0);

        jCheckBox0.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);

        updateSelectedProductList();
    }

    public void updateSelectedProductList() {
        var items = getSelectedProductList();
        updateTableView(items);
    }
//
//    public void initImages() {
//        setImage(productImage, "/burger.jpeg");
//        setImage(productImage1, "/submarine.jpeg");
//        setImage(productImage2, "/fry kottu.jpeg");
//        setImage(productImage3, "/pasta.jpeg");
//        setImage(productImage4, "/biriyani.jpeg");
//
//    }

    public void setImage(JLabel image, String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL != null) {
            ImageIcon resizedIcon = resizeImageIcon(new ImageIcon(imageURL), 150, 150);
            image.setIcon(resizedIcon);
        }
    }

    public ImageIcon resizeImageIcon(ImageIcon originalIcon, int width, int height) {
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}
