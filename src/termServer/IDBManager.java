package termServer;

public interface IDBManager {
	public Term[] find(final String[] params);
	public boolean add(final Term term);
	public boolean delete(final String[] params);
}
