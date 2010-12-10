package at.jku.ce;

public class DomainObject {
<<<<<<< HEAD
	public String uuid = UUID.randomUUID.toString();
=======
	public String uuid;
>>>>>>> 9584a28189bc724c5df6d6a373586dd40b804a89
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
