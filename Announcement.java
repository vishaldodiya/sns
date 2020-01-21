package SNS;

// Begin.
import java.util.ArrayList;
import java.util.List;
// End.

/**
 * Announcement class is a structure of a announcement which is being transfered from publisher to subscriber. the announcement object contains author object, announcement text content and announcement keywords.
 */
public class Announcement {

	/**
	 * Text content of Announcement.
	 */
	private String text;

	/**
	 * List of keywords for attached to announcement.
	 */
	private List<String> keywords;

	/**
	 * Publisher who makes the announcement.
	 */
	private Author author;

	/**
	 * Announcement Constructor.
	 */
	/* public void */ Announcement(Author author, String text, List<String> keywords) {
		// Begin.
		this.text = text;
		this.keywords = keywords;
		this.author = author;
		// End.
	}

	/**
	 * To get Author of an announcement.
	 */
	public Author get_author() {
		// return null;
		// Begin.
		return this.author;
		// End.
	}

	/**
	 * To get text part of an announcement.
	 */
	public String get_text() {
		// return null;
		// Begin.
		return this.text;
		// End.
	}

	/**
	 * To get list of keywords attached to announcement.
	 */
	public List<String> get_keywords() {
		// return null;
		// Begin.
		return this.keywords;
		// End.
	}

	/**
	 * To get keywords of an announcement in the form of csv.
	 */
	public String get_keywords_csv() {
		// return null;
		// Begin.
		return String.join(", ", this.keywords);
		// End.
	}

}
