/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import Other.SetImage;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirectoryManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Other.DialogHelper;
import Other.NhanVien;
import Other.ShareHelper;
import static Other.ShareHelper.USER;
import java.awt.Desktop;
import java.awt.Toolkit;
import javax.swing.JFrame;
import mp3player.playmp3;

/**
 *
 * @author Tuan Nguyen
 */
public class AdminForm extends javax.swing.JFrame implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Date now = new Date();
                SimpleDateFormat formater = new SimpleDateFormat();
                formater.applyPattern("hh:mm:ss aa");
                String time = formater.format(now);
                Thread.sleep(1000);//cập nhật giờ sau 1s
                txtdongho.setText(time);
            } catch (InterruptedException ex) {
                break;
            }
        }

    }

    /**
     * Creates new form Home
     */
    public AdminForm() {
        ImageIcon img = new ImageIcon("src//Image//iced-tea.png");
        this.setIconImage(img.getImage());
        ChaoJDialog s = new ChaoJDialog(this, true);
        s.setVisible(true);
        new Dangnhap(this, true).setVisible(true);
        initComponents();
        JFrame jf = new JFrame();
        jf.setSize(1650, 1080);
        setLocationRelativeTo(null);
        btnProduct.setSize(190, 190);
        new SetImage().setImageButton(btnProduct, "src//Image//Product.png");
        btnEmp.setSize(190, 190);
        new SetImage().setImageButton(btnEmp, "src//Image//teamwork.png");
        btnThongKe.setSize(190, 190);
        new SetImage().setImageButton(btnThongKe, "src//Image//chart.png");
        btnOrder.setSize(190, 190);
        new SetImage().setImageButton(btnOrder, "src//Image//choices.png");
        btnCustomer.setSize(190, 190);
        new SetImage().setImageButton(btnCustomer, "src//Image//Customer.png");
    }

    void exit() {
        if (DialogHelper.confirm(this, "bạn thực sự muốn kết thúc")) {
            System.exit(0);
        }
    }

    void openBanhang() {
        if (ShareHelper.authenticated()) {
            new HoaDonBanHang().setVisible(true);
        } else {
            DialogHelper.alert(this, "vui lòng đăng nhập");
        }
    }

    void openSanpham() {
        if (ShareHelper.authenticated()) {
            new QLSanPham().setVisible(true);
        } else {
            DialogHelper.alert(this, "vui lòng đăng nhập");
        }
    }

    void openNhanvien(int index) {
        if (USER.isVaiTro()) {
            QLNhanVien s = new QLNhanVien();
            s.setVisible(true);
        } else {
            DialogHelper.alert(this, "Bạn không đc phép truy cập !");
        }
    }

    void openKhachhang() {
        if (ShareHelper.authenticated()) {
            new QLKhachHang().setVisible(true);
        } else {
            DialogHelper.alert(this, "vui lòng đăng nhập");
        }
    }

    void openThongke(int index) {
        if (USER.isVaiTro()) {
            ThongKe s = new ThongKe();
            s.setVisible(true);
        } else {
            DialogHelper.alert(this, "Bạn không đc phép truy cập !");
        }
    }

    void openWebsite() {
        try {
            Desktop.getDesktop().browse(new File("D:\\web\\index.html").toURI());
        } catch (IOException ex) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }

    void openLogin() {
        Dangnhap dn = new Dangnhap(this, true);
        dn.setVisible(true);
    }

    void logoff() {
        ShareHelper.logoff();
        this.openLogin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src//Image//header.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnEmp = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        lblCustomer = new javax.swing.JLabel();
        lblPromotion = new javax.swing.JLabel();
        lblTongHopThongKe = new javax.swing.JLabel();
        lblQLNhanVien = new javax.swing.JLabel();
        lblQLSanPham = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtdongho = new javax.swing.JLabel();
        lblHeThong = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        milogout = new javax.swing.JMenuItem();
        miChangePass = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPlayMusic = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 182));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1650, -1));

        jPanel2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src//Image//MT-F.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        btnEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmp.setForeground(new java.awt.Color(204, 0, 0));
        btnEmp.setToolTipText("Quản lý nhân viên");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        btnProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProduct.setForeground(new java.awt.Color(204, 0, 0));
        btnProduct.setToolTipText("Quản lý sản phẩm");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(204, 0, 0));
        btnThongKe.setToolTipText("Tổng hợp và Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(204, 0, 0));
        btnCustomer.setToolTipText("Quản lý khách hàng");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(204, 0, 0));
        btnOrder.setToolTipText("Quản lý bán hàng");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblCustomer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCustomer.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomer.setText("QUẢN LÝ KHÁCH HÀNG");

        lblPromotion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPromotion.setForeground(new java.awt.Color(255, 255, 255));
        lblPromotion.setText("QUẢN LÝ BÁN HÀNG");

        lblTongHopThongKe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTongHopThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblTongHopThongKe.setText("TỔNG HỢP VÀ THỐNG KÊ");

        lblQLNhanVien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQLNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNhanVien.setText("QUẢN LÝ NHÂN VIÊN");

        lblQLSanPham.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQLSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblQLSanPham.setText("QUẢN LÝ SẢN PHẨM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblQLSanPham))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblTongHopThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblQLNhanVien))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPromotion))))
                    .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(894, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQLSanPham)
                    .addComponent(lblQLNhanVien)
                    .addComponent(lblPromotion))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongHopThongKe)
                    .addComponent(lblCustomer))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1650, 630));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtdongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clock.png"))); // NOI18N
        txtdongho.setText("Times");
        txtdongho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtdonghoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon.png"))); // NOI18N
        lblHeThong.setText("Hệ thống quản lí quán trà sữa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeThong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1327, Short.MAX_VALUE)
                .addComponent(txtdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(lblHeThong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 1650, 40));

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Hệ Thống");

        milogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        milogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log-out.png"))); // NOI18N
        milogout.setText("Đăng xuất");
        milogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milogoutActionPerformed(evt);
            }
        });
        jMenu1.add(milogout);

        miChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reset.png"))); // NOI18N
        miChangePass.setText("Đổi mật khẩu");
        miChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangePassActionPerformed(evt);
            }
        });
        jMenu1.add(miChangePass);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jMenuItem3.setText("Kết thúc");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jPlayMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mp3.png"))); // NOI18N
        jPlayMusic.setText("Nghe nhạc");
        jPlayMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayMusicActionPerformed(evt);
            }
        });
        jMenu1.add(jPlayMusic);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản Lý");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/order.png"))); // NOI18N
        jMenuItem6.setText("Bán hàng");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/product1.png"))); // NOI18N
        jMenuItem7.setText("Sản phẩm");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Employee1.png"))); // NOI18N
        jMenuItem8.setText("Nhân viên");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/customer1.png"))); // NOI18N
        jMenuItem9.setText("Khách hàng");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống Kê");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ordert.png"))); // NOI18N
        jMenuItem1.setText("Hóa Đơn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/money-bag.png"))); // NOI18N
        jMenuItem2.setText("Doanh Thu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        if (USER.isVaiTro()) {
            QLNhanVien s = new QLNhanVien();
            s.setVisible(true);
        } else {
            DialogHelper.alert(this, "Bạn không đc phép truy cập !");
        }
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if (USER.isVaiTro()) {
            ThongKe s = new ThongKe();
            s.setVisible(true);
        } else {
            DialogHelper.alert(this, "Bạn không đc phép truy cập !");
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        new QLSanPham().setVisible(true);
    }//GEN-LAST:event_btnProductActionPerformed

    private void txtdonghoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtdonghoAncestorAdded
        // TODO add your handling code here:
        Thread t = new Thread(this);
        t.start();
    }//GEN-LAST:event_txtdonghoAncestorAdded

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed

        new HoaDonBanHang().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        new QLKhachHang().setVisible(true);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void milogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milogoutActionPerformed
        // TODO add your handling code here:
        this.logoff();
    }//GEN-LAST:event_milogoutActionPerformed

    private void miChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangePassActionPerformed
        // TODO add your handling code here:
        new ChangePass().setVisible(true);
    }//GEN-LAST:event_miChangePassActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        this.openBanhang();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        this.openSanpham();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        this.openNhanvien(WIDTH);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.openKhachhang();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ThongKe.tabIndex = 0;
        this.openThongke(WIDTH);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ThongKe.tabIndex = 1;
        this.openThongke(WIDTH);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jPlayMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayMusicActionPerformed
        new playmp3().setVisible(true);
    }//GEN-LAST:event_jPlayMusicActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem jPlayMusic;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblHeThong;
    private javax.swing.JLabel lblPromotion;
    private javax.swing.JLabel lblQLNhanVien;
    private javax.swing.JLabel lblQLSanPham;
    private javax.swing.JLabel lblTongHopThongKe;
    private javax.swing.JMenuItem miChangePass;
    private javax.swing.JMenuItem milogout;
    private javax.swing.JLabel txtdongho;
    // End of variables declaration//GEN-END:variables
}
