package at.jku.ce;

public class DomainObject {
	private String id;
	private String name;

	public DomainObject(String id) {
		super();
		this.id = id;
	}

	/**
	 * Default constructor
	 */	
	public DomainObject() {
		super();
		String id;
	}

	public String getId(){
		return id;
	}

}
