package at.jku.ce;

public class DomainObject {
	private String uuid = UUID.randomUUID().toString();
	private String name;

	/**
	*Default const
	*/

	public DomainObject() {
		super();
	}
	public DomainObject(String name, String comment) {
		super();
		this.id = id;
	}

	public String getUuId(){
		return id;
	}

}
