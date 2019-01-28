package termServer;

import java.util.ArrayList;

public class SqlTableParams {
	public ArrayList<String> columnNames;
	public ArrayList<String> columnTypes;
	public ArrayList<String> columnParams;
	
	public SqlTableParams(
			final ArrayList<String> columnNames, 
			final ArrayList<String> columnTypes, 
			final ArrayList<String> columnParams
	) {
		this.columnNames = columnNames;
		this.columnTypes = columnTypes;
		this.columnParams = columnParams;
	}
}
