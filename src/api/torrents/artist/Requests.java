


package api.torrents.artist;

/**
 * The Class Requests.
 * 
 * @author Gwindow
 */
public class Requests {
	private Number bounty;
	private Number categoryId;
	private Number requestId;
	private String timeAdded;
	private String title;
	private Number votes;
	private String year;

	/**
	 * Gets the bounty.
	 * 
	 * @return the bounty
	 */
	public Number getBounty() {
		return this.bounty;
	}

	/**
	 * Gets the category id.
	 * 
	 * @return the category id
	 */
	public Number getCategoryId() {
		return this.categoryId;
	}

	/**
	 * Gets the request id.
	 * 
	 * @return the request id
	 */
	public Number getRequestId() {
		return this.requestId;
	}

	/**
	 * Gets the time added.
	 * 
	 * @return the time added
	 */
	public String getTimeAdded() {
		return this.timeAdded;
	}

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Gets the votes.
	 * 
	 * @return the votes
	 */
	public Number getVotes() {
		return this.votes;
	}

	/**
	 * Gets the year.
	 * 
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/* (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return "Requests [getBounty=" + getBounty() + ", getCategoryId=" + getCategoryId() + ", getRequestId=" + getRequestId()
				+ ", getTimeAdded=" + getTimeAdded() + ", getTitle=" + getTitle() + ", getVotes=" + getVotes() + ", getYear="
				+ getYear() + "]";
	}
}