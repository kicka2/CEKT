package at.jku.ce;

public class DomainObject {
	private String uuid = UUID.randomUUID.toString();

	private String name;

	public DomainObject(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}

	/**
	 * Default constructor
	 */	
	public DomainObject() {
		super();
		String uuid;
	}

	public String getUuid(){
		return uuid;
	}

}
