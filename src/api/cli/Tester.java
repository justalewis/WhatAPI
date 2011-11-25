package api.cli;

import api.soup.MySoup;
import api.torrents.artist.Artist;
import api.util.CouldNotLoadException;

/**
 * The Class Tester.
 * 
 * @author Gwindow
 */
public class Tester {

	/**
	 * Instantiates a new tester.
	 * 
	 * @throws CouldNotLoadException
	 *             the could not load exception
	 */
	public Tester() throws CouldNotLoadException {
		MySoup.setSite("http://127.0.0.1:8080/");
		MySoup.login("login.php", "gazelle", "123456");
		Artist a = Artist.artistFromId(1);
		System.out.println(a.getResponse().getRequests());
		// api.forum.thread.Thread t = api.forum.thread.Thread.threadFromIdAndPostId(3, 50);
		// t.postReply("more giebersish");
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws CouldNotLoadException
	 *             the could not load exception
	 */
	public static void main(String[] args) throws CouldNotLoadException {
		new Tester();
	}
}
