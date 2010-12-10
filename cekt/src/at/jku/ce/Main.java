package at.jku.ce;

private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
	Set <DomainObject> objectSet = new HashSet<DomainObject>();

	objectSet.add(DomainFactory.createDomainObject("Helga", "Kommentar1"));
	objectSet.add(DomainFactory.createDomainObject("Walter", "Kommentar2"));
	objectSet.add(DomainFactory.createDomainObject("Hannah", "Kommentar3"));
	objectSet.add(DomainFactory.createDomainObject("Paul", "Kommentar4"));
	objectSet.add(DomainFactory.createDomainObject("Claudia", "Kommentar5"));

	for (DomainObject domainObject : objectSet) {
		LOGGER.debug(domainObject.Uuid);
	}

	}

}
