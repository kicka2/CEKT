package at.jku.ce;

private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
	Set <DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComperator());

	protected objectSet.add(new DomainObject ("Helga", "Kommentar1"));
	protected objectSet.add(new DomainObject ("Walter", "Kommentar2"));
	protected objectSet.add(new DomainObject ("Hannah", "Kommentar3"));
	protected objectSet.add(new DomainObject ("Paul", "Kommentar4"));
	protected objectSet.add(new DomainObject ("Claudia", "Kommentar5"));

	for (DomainObject domainObject : objectSet) {
		LOGGER.debug(domainObject.toString());
	}

	}

}
