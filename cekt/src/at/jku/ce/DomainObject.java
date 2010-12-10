package at.jku.ce;

public class DomainObject {
	public String uuid;
	private String name;

	public DomainObject(String id) {
		super();
		this.uuid = id;
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
