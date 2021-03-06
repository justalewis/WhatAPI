package api.inbox.inbox;

import api.soup.MySoup;

import java.util.Comparator;
import java.util.Date;

/**
 * The Class Message.
 * Describes a message in the inbox
 *
 * @author Gwindow
 */
public class Message {
	/**
	 * Sort messages based on their stickyness, sticky messages are interpreted as
	 * less than non-sticky messages so they come before them in an ascending sorted order
	 */
	public static class StickyMessageComparator implements Comparator<Message> {
		@Override
		public int compare(Message a, Message b){
			if (a.sticky && !b.sticky){
				return -1;
			}
			if (!a.sticky && b.sticky){
				return 1;
			}
			return 0;
		}
	}

	/**
	 * The conversation id, use to load the conversation for this message
	 */
	private Number convId;

	/** The sent data of the message */
	private String date;

	/** The user if of the person who forwarded the message(?) */
	private Number forwardedId;

	/** The name of the user who forwarded the message(?) */
	private String forwardedName;

	/** The sender's user id */
	private Number senderId;

    /** The sender's user name */
    private String username;

	/** The subject */
	private String subject;

    /** If the message is unread. */
    private boolean unread;

    /** If the message is stickied */
    private boolean sticky;

    /** If the sender is a donor */
    private boolean donor;

    /** If the sender's account is enabled */
    private boolean enabled;

	/** If the sender has been warned */
	private boolean warned;

	/**
	 * Get the conversation id
	 * 
	 * @return the conversation id
	 */
	public Number getConvId() {
		return convId;
	}

	/**
	 * Get the sent date of the message
	 * 
	 * @return the sent date
	 */
	public String getDateString(){
		return date;
	}

	/**
	 * Get the sent date of the message as a date
	 */
	public Date getDate(){
		return MySoup.parseDate(date);
	}

	/**
	 * Gets the forwarded id.
	 * 
	 * @return the forwarded id
	 */
	public Number getForwardedId() {
		return forwardedId;
	}

	/**
	 * Gets the forwarded name.
	 * 
	 * @return the forwarded name
	 */
	public String getForwardedName() {
		return forwardedName;
	}

    /**
     * Get the sender's user id
     *
     * @return the sender's user id
     */
    public Number getSenderId() {
        return senderId;
    }

	/**
	 * Get the sender's user name
	 * 
	 * @return the sender's username
	 */
	public String getUsername(){
		if (username == null || username.length() == 0){
			username = "System";
		}
		return username;
	}

    /**
     * Check if the sender is the system
     *
     * @return True if the message was sent by the System
     */
	public boolean isSystem() {
		return getUsername().equals("System");
	}

    /**
     * Get the message subject
     *
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Check if the message is unread
     *
     * @return True if message is unread
     */
    public boolean isUnread() {
        return unread;
    }

	public void setUnread(boolean unread){
		this.unread = unread;
	}

	/**
	 * Check if the message is stickied
     *
     * @return True if message is stickied
     */
    public boolean isSticky() {
        return sticky;
    }

	public void setSticky(boolean sticky){
		this.sticky = sticky;
	}

	/**
	 * Check if the sender is a donor
     *
     * @return True if the sender is a donor
     */
    public boolean isDonor() {
        return donor;
    }

    /**
     * Check if the sender's account is enabled
     *
     * @return True if the account is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

	/**
	 * Check if the sender has been warned
	 * 
	 * @return True if the sender is warned
	 */
	public boolean isWarned() {
		return warned;
	}

	@Override
	public String toString() {
		return "Message [getConvId()=" + getConvId() + ", getDateString()=" + getDateString() + ", isDonor()=" + isDonor()
			+ ", getEnabled()=" + isEnabled() + ", getForwardedId()=" + getForwardedId() + ", getForwardedName()="
			+ getForwardedName() + ", getSenderId()=" + getSenderId() + ", isSticky()=" + isSticky() + ", getSubject()="
			+ getSubject() + ", isUnread()=" + isUnread() + ", getUsername()=" + getUsername() + ", isWarned()=" + isWarned()
			+ "]";
	}
}