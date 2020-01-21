package SNS;

// Begin.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
// End.

/**
 * Main class of the whole social networking system. This works as a broker in the system to handle multiple operation between classes, such as managing subscrption list, broadcasting messages etc.
 */
public class SocialNetworkingSystem {

	/**
	 * Keep list of members who has subscribed to specific keyword.
	 */
	private /* Begin */ static /* End */ Map<String,Set<Member>> subscriber_map = new HashMap<String, Set<Member>>();

	/**
	 * Keep track of announcement coming from publisher and gets removed as it gets broadcasted to subscriber.
	 */
	private /* Begin */ static /* End */ Queue<Announcement> announcement_queue = new LinkedList<Announcement>();

	/**
	 * To include subscriber to subscriber_map.
	 */
	public void subscribe(String keyword, Member subscriber) {
		// Begin.
		if(subscriber_map.containsKey(keyword)) {
			Set<Member> subscribers = subscriber_map.get( keyword );
			subscribers.add(subscriber);
			subscriber_map.put(keyword, subscribers);
		} else {
			Set<Member> subscribers = new HashSet<Member>();
			subscribers.add(subscriber);
			subscriber_map.put(keyword, subscribers);
		}
		// End.
	}

	/**
	 * To remove subscriber from subscriber_map.
	 */
	public void unsubscribe(String keyword, Member subscriber) {
		// Begin.
		if(subscriber_map.containsKey(keyword)) {
			Set<Member> subscribers = subscriber_map.get(keyword);
			subscribers.remove(subscriber);
			subscriber_map.put(keyword, subscribers);
		}
		// End.
	}

	/**
	 * To send announcement from publisher to subscriber.
	 */
	public void broadcast() {
		// Begin.
		while(!announcement_queue.isEmpty()) {
			Announcement announcement = announcement_queue.remove();

			Set<Member> keyword_subscribers = get_all_subscriber_under_keywords(announcement.get_keywords());

			for(Member subscriber: keyword_subscribers) {
				subscriber.log_announcement(announcement);
			}
		}
		// End.
	}

	/**
	 * To insert announcement in a queue.
	 */
	public void add_announcement_queue(Author author, String text, List<String> keywords) {
		// Begin.
		Announcement announcement = new Announcement(author, text, keywords);
		announcement_queue.add(announcement);
		// End.
	}

	/**
	 * To get list of all subscribers and under multiple keywords.
	 */
	public static Set<Member> get_all_subscriber_under_keywords(List<String> keywords) {
		// Begin.
		Set<Member> keyword_subscribers = new HashSet<Member>();

		for(String keyword: keywords) {
			if(subscriber_map.containsKey(keyword)) {
				keyword_subscribers.addAll(subscriber_map.get(keyword));
			}
		}
		// End.
		// return null;
		// Begin.
		return keyword_subscribers;
		// End.
	}
}
