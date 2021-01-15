/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import controller.TugasAkhir;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Aryo Muzakki
 */
public class App extends javax.swing.JFrame implements WindowListener {

    private String[] data;
    private String[] colHeader;

    private TugasAkhir tugasAkhir;
    private DefaultTableModel model;
    
    private Object[] options = {"Ya", "Tidak"};

    private static App app = new App();
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        
        tugasAkhir = new TugasAkhir();
        
        colHeader = new String[] {"NIM", "Nama Mahasiswa", "Jurusan", "Judul TA", "Dosen Pembimbing", "Dosen Penguji 1", "Dosen Penguji 2"};
        
        model = new DefaultTableModel(colHeader, 0); // mengatur judul kolom untuk tabel, dan inisialisasi objek model untuk tabel
        
        jTable.setModel(model); // atur model ke tabel
        
        jTable.getColumnModel().getColumn(0).setMaxWidth(45); // mengatur lebar maksimal kolom pertama
        jTable.setDefaultEditor(Object.class, null); // membuat tabel tidak dapat diedit langsung
//        jTable.setUpdateSelectionOnSort(true);
        
        updateTable(); // isi tabel
        
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); // tidak exit saat di klik
        this.addWindowListener(this);

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
        jPanel2 = new javax.swing.JPanel();
        hapus = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        nim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaMahasiswa = new javax.swing.JTextField();
        jurusan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        judulTa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dosenPembimbing = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dosenPenguji2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dosenPenguji1 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        smallInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 450));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 79, 142));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 405));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 405));

        jPanel2.setBackground(new java.awt.Color(29, 95, 166));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setMaximumSize(new java.awt.Dimension(215, 453));

        hapus.setBackground(new java.awt.Color(255, 84, 66));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("HAPUS");
        hapus.setBorder(null);
        hapus.setBorderPainted(false);
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.setEnabled(false);
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        ubah.setBackground(new java.awt.Color(216, 234, 255));
        ubah.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ubah.setText("UBAH");
        ubah.setBorder(null);
        ubah.setBorderPainted(false);
        ubah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubah.setEnabled(false);
        ubah.setMaximumSize(new java.awt.Dimension(45, 15));
        ubah.setMinimumSize(new java.awt.Dimension(45, 15));
        ubah.setPreferredSize(new java.awt.Dimension(45, 15));
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(216, 234, 255));
        tambah.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        tambah.setText("TAMBAH");
        tambah.setBorder(null);
        tambah.setBorderPainted(false);
        tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        nim.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        nim.setForeground(new java.awt.Color(193, 193, 193));
        nim.setText("Masukkan NIM");
        nim.setToolTipText("Masukkan NIM ");
        nim.setMargin(new java.awt.Insets(3, 3, 3, 3));
        nim.setMinimumSize(new java.awt.Dimension(20, 30));
        nim.setName(""); // NOI18N
        nim.setPreferredSize(new java.awt.Dimension(20, 30));
        nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nimKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 234, 234));
        jLabel1.setText("NIM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 234, 234));
        jLabel2.setText("Nama Mahasiswa");

        namaMahasiswa.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        namaMahasiswa.setMargin(new java.awt.Insets(3, 3, 3, 3));
        namaMahasiswa.setMinimumSize(new java.awt.Dimension(20, 30));
        namaMahasiswa.setName(""); // NOI18N
        namaMahasiswa.setPreferredSize(new java.awt.Dimension(20, 30));

        jurusan.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jurusan.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jurusan.setMinimumSize(new java.awt.Dimension(20, 30));
        jurusan.setName(""); // NOI18N
        jurusan.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(234, 234, 234));
        jLabel3.setText("Jurusan");

        judulTa.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        judulTa.setMargin(new java.awt.Insets(3, 3, 3, 3));
        judulTa.setMinimumSize(new java.awt.Dimension(20, 30));
        judulTa.setName(""); // NOI18N
        judulTa.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(234, 234, 234));
        jLabel4.setText("Judul TA");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(234, 234, 234));
        jLabel5.setText("Dosen Pembimbing");

        dosenPembimbing.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dosenPembimbing.setMargin(new java.awt.Insets(3, 3, 3, 3));
        dosenPembimbing.setMinimumSize(new java.awt.Dimension(20, 30));
        dosenPembimbing.setName(""); // NOI18N
        dosenPembimbing.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 234, 234));
        jLabel6.setText("Dosen Penguji 1");

        dosenPenguji2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dosenPenguji2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dosenPenguji2.setMargin(new java.awt.Insets(3, 5, 3, 3));
        dosenPenguji2.setMinimumSize(new java.awt.Dimension(20, 30));
        dosenPenguji2.setPreferredSize(new java.awt.Dimension(20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(234, 234, 234));
        jLabel7.setText("Dosen Penguji 2");

        dosenPenguji1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dosenPenguji1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        dosenPenguji1.setMinimumSize(new java.awt.Dimension(20, 30));
        dosenPenguji1.setName(""); // NOI18N
        dosenPenguji1.setPreferredSize(new java.awt.Dimension(20, 30));

        reset.setBackground(new java.awt.Color(216, 234, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        reset.setText("R E S E T");
        reset.setBorder(null);
        reset.setBorderPainted(false);
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setMaximumSize(new java.awt.Dimension(42, 18));
        reset.setMinimumSize(new java.awt.Dimension(42, 18));
        reset.setPreferredSize(new java.awt.Dimension(42, 18));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jurusan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(judulTa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dosenPembimbing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dosenPenguji2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dosenPenguji1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(namaMahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(judulTa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(dosenPembimbing, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(dosenPenguji1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(dosenPenguji2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(29, 95, 166));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable.setAutoCreateRowSorter(true);
        jTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "NIM", "Nama Mahasiswa", "Jurusan", "Judul TA", "Pembimbing", "Penguji 1", "Penguji 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setMinWidth(40);
            jTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable.getColumnModel().getColumn(0).setMaxWidth(45);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(216, 216, 216));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("P O L I T E K N I K   N E G E R I   M E D A N");
        jLabel8.setToolTipText("");
        jLabel8.setPreferredSize(new java.awt.Dimension(75, 75));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Logo POLMED(1).png"))); // NOI18N
        jLabel9.setText(" DATA TUGAS AKHIR ");
        jLabel9.setPreferredSize(new java.awt.Dimension(75, 75));

        jLabel10.setBackground(new java.awt.Color(216, 216, 216));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 8)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" 2 0 2 0");
        jLabel10.setToolTipText("");
        jLabel10.setPreferredSize(new java.awt.Dimension(75, 75));

        smallInfo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        smallInfo.setForeground(new java.awt.Color(247, 162, 162));
        smallInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(smallInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smallInfo))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // klik tombol tambah
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // simpan data dari fields
        data = new String[] {nim.getText().trim(), namaMahasiswa.getText().trim(), jurusan.getText().trim(), judulTa.getText().trim(), dosenPembimbing.getText().trim(), dosenPenguji1.getText().trim(), dosenPenguji2.getText().trim()};
        
        if ( tugasAkhir.insertData(data) == 0 ) {
            smallInfo.setText("Berhasil menambah data!");
            smallInfo.setVisible(true); // menampilkan teks pemberitahuan kecil
            
            updateTable();
        
            resetField(); // kosongkan fields
        } else {
            smallInfo.setText("Gagal menambah data");
            smallInfo.setVisible(true);
            
            // tampilkan jendela pemberitahuan
            JOptionPane.showMessageDialog(this, "Gagal menambah data", "GAGAL!!!", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    // klik tombol ubah
    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        data = new String[] {nim.getText().trim(), namaMahasiswa.getText().trim(), jurusan.getText().trim(), judulTa.getText().trim(), dosenPembimbing.getText().trim(), dosenPenguji1.getText().trim(), dosenPenguji2.getText().trim()};
        
        if ( tugasAkhir.updateData(data) == 0 ) {
            smallInfo.setText("Berhasil mengubah data!");
            smallInfo.setVisible(true);
            
            updateTable();
        
            resetField();
        } else {
            smallInfo.setText("Gagal mengubah data");
            smallInfo.setVisible(true);
            
            JOptionPane.showMessageDialog(this, "Gagal mengubah data", "GAGAL!!!", JOptionPane.PLAIN_MESSAGE);
        }        
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        data[0] = nim.getText().trim();
        
        if ( tugasAkhir.deleteData(data[0]) == 0 ) {
            smallInfo.setText("Berhasil menghapus data!");
            smallInfo.setVisible(true);
            
            updateTable();
        
            resetField();
        } else {
            smallInfo.setText("Gagal menghapus data");
            smallInfo.setVisible(true);
            
            JOptionPane.showMessageDialog(this, "Gagal menghapus data", "GAGAL!!!", JOptionPane.PLAIN_MESSAGE);
        }        
    }//GEN-LAST:event_hapusActionPerformed

    // klik tombol reset
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        resetField();
        ubah.setEnabled(false); // disable tombol ubah
        hapus.setEnabled(false); // disable tombol hapus
        smallInfo.setVisible(false); // sembunyikan teks pemberitahuan kecil
    }//GEN-LAST:event_resetActionPerformed

    // klik tabel/data di tabel
    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int row = jTable.getSelectedRow(); // data yang di klik
        row = jTable.convertRowIndexToModel(row); // samakan data jika tabel di urutkan
        
        int columns = jTable.getModel().getColumnCount(); // jumlah kolom
        
        data = new String[columns]; // persiapkan array sebanyak jumlah kolom
        
        // simpan data terpilih ke variabel
        for (int column = 0; column < columns; column++) {
            data[column] = jTable.getModel().getValueAt(row, column).toString().trim();
        }
        
        addToField(data); // masukkan data terpilih ke fields
        
        // aktifkan tombol ubah dan hapus
        ubah.setEnabled(true);
        hapus.setEnabled(true);
        
        smallInfo.setVisible(false);
    }//GEN-LAST:event_jTableMouseClicked

    // ketik di field nim
    private void nimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyReleased
        String typed = nim.getText();

        for (int i = 0; i < model.getRowCount(); i++) {
            String val = model.getValueAt(i, 0).toString().trim();
            if ( typed.equals(val) ) {
                ubah.setEnabled(true);
                hapus.setEnabled(true);
                break;
            } else {
                ubah.setEnabled(false);
                hapus.setEnabled(false);
            }
        }
    }//GEN-LAST:event_nimKeyReleased

    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                app.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dosenPembimbing;
    private javax.swing.JTextField dosenPenguji1;
    private javax.swing.JTextField dosenPenguji2;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField judulTa;
    private javax.swing.JTextField jurusan;
    private javax.swing.JTextField namaMahasiswa;
    private javax.swing.JTextField nim;
    private javax.swing.JButton reset;
    private javax.swing.JLabel smallInfo;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables


    // perbarui data tabel
    private void updateTable() {
        tugasAkhir.mulaiKoneksi(); // mulai koneksi database
        
        int row = jTable.getRowCount(); // jumlah baris yang ada saat ini
        
        for (int i = 0; i<row; i++) {
            model.removeRow(0); // hapus dahulu baris yang sudah ada di tabel
        }
        
        for(Object[] str : tugasAkhir.selectData() ) {
            model.addRow(str); // isi tabel dengan data yang baru
        }
    }

    // hapus data di form pengisian
    private void resetField() {
        nim.setText("");
        namaMahasiswa.setText("");
        jurusan.setText("");
        judulTa.setText("");
        dosenPembimbing.setText("");
        dosenPenguji1.setText("");
        dosenPenguji2.setText("");
    }

    // tambahkan data ke form pengisian
    private void addToField(String[] data) {
        nim.setText(data[0]);
        namaMahasiswa.setText(data[1]);
        jurusan.setText(data[2]);
        judulTa.setText(data[3]);
        dosenPembimbing.setText(data[4]);
        dosenPenguji1.setText(data[5]);
        dosenPenguji2.setText(data[6]);
    }

    // saat klik tombol exit
    @Override
    public void windowClosing(WindowEvent e) {
        if (e.getWindow().equals(app)) {
            tugasAkhir.tutupKoneksi(); // matikan koneksi database
            
            // tampilkan jendela konfirmasi
            int confirm = JOptionPane.showOptionDialog(this, "Anda akan keluar dari program. Yakin?", "PERHATIAN!!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options);
            
            switch (confirm) {
                // hentikan program
                case JOptionPane.YES_OPTION:
                    app.dispose();
                    System.exit(0);
                // mulai koneksi lagi jika tidak keluar
                case JOptionPane.NO_OPTION:
                    tugasAkhir.mulaiKoneksi();
                    break;
                case JOptionPane.CLOSED_OPTION:
                    tugasAkhir.mulaiKoneksi();
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public void windowOpened(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}