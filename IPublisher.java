package SNS;

// Begin.
import java.util.List;
// End.

/**
 * IPublisher interface provides a publish method for a publisher which is a object of a Author class.
 */
public interface IPublisher {

	/**
	 * To publish an announcement.
	 */
	public abstract void publish(String text, List<String> keywords);

}
