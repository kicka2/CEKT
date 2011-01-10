package at.jku.ce;

public class DomainObject {
	public String uuid = UUID.randomUUID().toString();
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

	public String getUuId(){
		return id;
	}

}
