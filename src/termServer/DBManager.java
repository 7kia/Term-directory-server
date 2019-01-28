package termServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBManager implements IDBManager {
	private Connection conn = null;
	public DBManager(final String dbAddress) {
        try {
            String address = "jdbc:sqlite:" + dbAddress;
            this.conn = DriverManager.getConnection(address);
            
            System.out.println("Connection to SQLite has been established. "
            		+ "Address = " + address);
            
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
	
	public void createNewTable(
		final String name,
		final SqlTableParams params
	) {
        String sql = "CREATE TABLE IF NOT EXISTS " + name + " (\n"
            + DBManager.getColumnList(params)
            + ");";
        
        try (Statement stmt = this.conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getColumnList(final SqlTableParams params) {
    	String result = "";
    	
    	for(int i = 0; i < params.columnNames.size(); i++)
    	{
    		result += params.columnNames.get(i) 
    			+ " " + params.columnTypes.get(i)
    			+ " " + params.columnParams.get(i);
    		
    		if((i + 1) < params.columnNames.size()) {
    			result += ", \n";
			}
    	}
    	
    	return result;
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
