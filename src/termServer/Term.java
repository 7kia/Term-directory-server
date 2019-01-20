package termServer;

public class Term {
	public Integer id;
	public String term;
	public String definition;
	
	public Term(
		Integer id, 
		String term, 
		String definition
	) {
		this.id = id;
		this.term = term;
		this.definition = definition;
	}
}
