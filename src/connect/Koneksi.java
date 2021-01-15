/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Muhammad Aryo Muzakki
 */
public class Koneksi {
    
    private static final String HOST = "localhost";
    private static final String PORT = "1521";
    private static final String CONTAINER = "orclpdb";
    private static final String URL = "jdbc:oracle:thin:@" + HOST + ":" + PORT + "/" + CONTAINER;
    private static final String USERNAME = "seminar";
    private static final String PASSWORD = "seminar";
    
    private Connection c;
    private OracleDataSource od;
    
    // default connection
    public void runKoneksi() throws SQLException {        
        
            // load the driver class
            this.od = new OracleDataSource();
            
            // create the connection
            this.od.setURL(URL);
            this.od.setUser(USERNAME);
            this.od.setPassword(PASSWORD);

            this.c = this.od.getConnection();
    }
    
    // default url (host, port, and container)
    public void runKoneksi(String username, String password) throws SQLException {

            // load the driver class 
            this.od = new OracleDataSource();
            
            // create the connection
            this.od.setURL(URL);
            this.od.setUser(username);
            this.od.setPassword(password);

            this.c = this.od.getConnection();    
    }
    
    // set url, username, and password
    public void runKoneksi(String url, String username, String password) throws SQLException {

            // load the driver class 
            this.od = new OracleDataSource();
        
            // create the connection
            this.od.setURL(url );
            this.od.setUser(username);
            this.od.setPassword(password);

            this.c = this.od.getConnection();    
    }

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public OracleDataSource getOd() {
        return od;
    }

    public void setOd(OracleDataSource od) {
        this.od = od;
    }
    
    
}
