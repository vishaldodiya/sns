package SNS;

// Begin.
import java.util.ArrayList;
import java.util.List;
// End.

/**
 * Member class is directly related to Social Networking System. Member can be Publisher or Subscriber.
 */
public class Member implements ISubscriber {

	/**
	 * Keep track of published announcement which has Keywords which memeber has subscribed.
	 */
	private List<String> log_entries = new ArrayList<String>();

	/**
	 * Name of Member.
	 */
	protected String name;

	/**
	 * Member Constructor.
	 */
	/* public void */ Member(String name) {
		// Begin.
		this.name = name;
		// End.
	}

	/**
	 * Insert announcement into log_intries.
	 */
	public void log_announcement(Announcement announcement) {
		// Begin.
		log_entries.add(
			this.name + " received an announcement from " + announcement.get_author().get_name() + ".\n" +
			"Text: " + announcement.get_text() + "\n" +
			"Keywords: " + announcement.get_keywords_csv() + ".\n"
		);
		// End.
	}

	/**
	 * To get the name of a Member.
	 */
	public String get_name() {
		// return null;
		// Begin.
		return this.name;
		// End.
	}


	/**
	 * @see SNS.ISubscriber#subscribe(String)
	 */
	public void subscribe(String keyword) {
		// Begin.
		SocialNetworkingSystem sns = new SocialNetworkingSystem();
		sns.subscribe(keyword, this);
		// End.
	}


	/**
	 * @see SNS.ISubscriber#unsubscribe(String)
	 */
	public void unsubscribe(String keyword) {
		// Begin.
		SocialNetworkingSystem sns = new SocialNetworkingSystem();
		sns.unsubscribe(keyword, this);
		// End.
	}


	/**
	 * @see SNS.ISubscriber#get_log_entries()
	 */
	public List<String> get_log_entries() {
		// return null;
		// Begin.
		return this.log_entries;
		// End.
	}

}
