package SNS;

// Begin.
import java.util.List;
// End.

/**
 * The ISubscriber interface provides a set of methods which can be used by a subscriber which is a object of a Member class.
 */
public interface ISubscriber {

	/**
	 * To make Member subscribe to a keyword.
	 */
	public abstract void subscribe(String keyword);

	/**
	 * To remove Member from subscribed keyword.
	 */
	public abstract void unsubscribe(String keyword);

	/**
	 * To fetch the log entries of announcements for which member has subscribed.
	 */
	public abstract List<String> get_log_entries();

}
