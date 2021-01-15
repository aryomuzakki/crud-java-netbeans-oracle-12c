/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect.Koneksi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Aryo Muzakki
 */
public class TugasAkhir {
    
    private static final String TABLE_NAME = "tugas_akhir";
    
    private Object [][] dataTugasAkhir;
    
    private Koneksi koneksi;

    private Statement s;
    private ResultSet rs;
    
    public TugasAkhir() {
        koneksi = new Koneksi();
    }
  
    public int mulaiKoneksi() {
        int message;
        
        try {
            koneksi.runKoneksi();
            message = 0;
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
            message = 1;
        }
        
        return message;
    }
    
    public int tutupKoneksi() {
        int message;
        
        try {
            koneksi.getC().close();
            message = 0;
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
            message = 1;
        }
        
        return message;
    }
    
    public int insertData(String[] data) {
        int message;
        
        try {
            this.s = koneksi.getC().createStatement();
            this.rs = s.executeQuery(
                    "insert into " + TABLE_NAME + " values "
                            + "('" 
                            + data[0]
                            + "', '" 
                            + data[1] 
                            + "', '"
                            + data[2]
                            + "', '" 
                            + data[3]
                            + "', '"
                            + data[4]
                            + "', '"
                            + data[5]
                            + "', '"
                            + data[6]
                            + "')"
            );
            
//            System.out.println("Data Berhasil Ditambahkan!");
            message = 0;
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Ditambahkan!");
            message = 1;
        }
        return message;
    }
    
    public Object[][] selectData() {
        int i;
        
        try {
            
            this.s = koneksi.getC().createStatement();
            this.rs = s.executeQuery( "select count(*) from " + TABLE_NAME );
            rs.next();
            i = Integer.parseInt(rs.getString(1));
            dataTugasAkhir = new Object[i][];
                        
            this.s = koneksi.getC().createStatement();
            this.rs = s.executeQuery( "select * from " + TABLE_NAME );

            i = 0;
            while(this.rs.next()) {
                dataTugasAkhir[i] = new Object[] {this.rs.getString(1),  this.rs.getString(2), this.rs.getString(3), this.rs.getString(4), this.rs.getString(5), this.rs.getString(6), this.rs.getString(7)};
                i++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
            dataTugasAkhir[0][0] = 1;
        }

        return dataTugasAkhir;
    }
    
    public int updateData(String[] data) {
        int message;
        
        try {
            this.s = koneksi.getC().createStatement();
            this.rs = s.executeQuery(
                    "update " + TABLE_NAME + " set " 
                            + "nama_mahasiswa = '"      + data[1]
                            + "', jurusan = '"             + data[2]
                            + "', judul_ta = '"            + data[3]
                            + "', dosen_pembimbing = '"    + data[4]
                            + "', dosen_penguji1 = '"      + data[5]
                            + "', dosen_penguji2 = '"      + data[6]
                            + "' where nim = '" + data[0] + "'"
                );
            
//            System.out.println("Data Berhasil Diubah!");
            message = 0;
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Diubah!");
            message = 1;
        }
        return message;
    }
    
    public int deleteData(String data) {
        int message;
        try {
            this.s = koneksi.getC().createStatement();
            this.rs = s.executeQuery( "delete from " + TABLE_NAME + " where nim = '" + data + "'");

//            System.out.println("Data Berhasil Dihapus!");
            message = 0;
        } catch (SQLException ex) {
            Logger.getLogger(TugasAkhir.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dihapus!");
            message = 1;
        }
        return message;
    }
}
