package SNS;

// Begin.
import java.util.List;
// End.

/**
 * Author class is a Member of a system who can publish messages in the system. 
 */
public class Author extends Member implements IPublisher {

	/**
	 * Author Constructor.
	 */
	/* public void */ Author(String name) {
		// Begin.
		super(name);
		// End.
	}


	/**
	 * @see SNS.IPublisher#publish(String, )
	 */
	public void publish(String text, List<String> keywords) {
		// Begin.
		SocialNetworkingSystem sns = new SocialNetworkingSystem();
		sns.add_announcement_queue(this, text, keywords);
		sns.broadcast();
		// End.
	}

}
