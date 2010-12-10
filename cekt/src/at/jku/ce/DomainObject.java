package at.jku.ce;

public class DomainObject implements Comparable<DomainObject> {
	private String uuid = UUID.randomUUID.toString();

	private String name;
	private Sting comment;

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
	public String getComment(){
		return comment;
	}

	public String toString(){
		return "DomainObject [name=" + name +  ", comment=" + comment
			+ ", uuid=" + uuid + "]";
	}
	public void setComment(final String comment){
		this.comment = comment;
	}
	public void setName(final String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	

}
