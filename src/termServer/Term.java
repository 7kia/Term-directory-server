package termServer;

public class Term {
	public Integer id;
	public String term;
	public String definition;
	
	public Term(
		final Integer id, 
		final String term, 
		final String definition
	) {
		this.id = id;
		this.term = term;
		this.definition = definition;
	}
}
