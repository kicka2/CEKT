package at.jku.ce;

public class DomainObject {
	private String uuid = UUID.randomUUID().toString();
	private String name;
	private String comment;

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
	public String getComment(){
		return comment;
	}
	public void setComment(final String comment){
		this.comment = comment;
	}
	public String getName(){
		return name;
	}
	public void setName(final String name){
		this.name = name;
	}
	public String toString(){
		return irgendeinen Text;
	}

}
}
