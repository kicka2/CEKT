package at.jku.ce;

public class DomainObject {
	private String id;
	private String name;

	/**
	*Default const
	*/

	public DomainObject() {
		super();
	}
	public DomainObject(String id) {
		super();
		this.id = id;
	}

	public String getId(){
		return id;
	}

}
