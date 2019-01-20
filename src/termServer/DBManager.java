package termServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager implements IDBManager {
	private Connection conn = null;
	public DBManager(final String dbAddress) {
        try {
            String address = "jdbc:sqlite:" + dbAddress;
            this.conn = DriverManager.getConnection(address);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (this.conn != null) {
                	this.conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
	
	public Term[] find(final String[] params) {
		return null;
	}
	public boolean add(final Term term) {
		return false;
	}
	public boolean delete(final String[] params) {
		return false;
	}
}
