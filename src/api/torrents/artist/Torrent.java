


package api.torrents.artist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import api.soup.MySoup;

/**
 * The Class Torrent.
 * 
 * @author Gwindow
 */
public class Torrent {
	private String encoding;
	private Number fileCount;
	private String format;
	private boolean freeTorrent;
	private Number groupId;
	private boolean hasCue;
	private Number hasFile;
	private boolean hasLog;
	private Number id;
	private Number leechers;
	private Number logScore;
	private String media;
	private String remasterRecordLabel;
	private String remasterTitle;
	private String remasterYear;
	private boolean remastered;
	private boolean scene;
	private Number seeders;
	private Number size;
	private Number snatched;
	private String time;

	/**
	 * Gets the encoding.
	 * 
	 * @return the encoding
	 */
	public String getEncoding() {
		return this.encoding;
	}

	/**
	 * Gets the file count.
	 * 
	 * @return the file count
	 */
	public Number getFileCount() {
		return this.fileCount;
	}

	/**
	 * Gets the format.
	 * 
	 * @return the format
	 */
	public String getFormat() {
		return this.format;
	}

	/**
	 * Checks if is free torrent.
	 * 
	 * @return true, if is free torrent
	 */
	public boolean isFreeTorrent() {
		return this.freeTorrent;
	}

	/**
	 * Gets the group id.
	 * 
	 * @return the group id
	 */
	public Number getGroupId() {
		return this.groupId;
	}

	/**
	 * Checks for cue.
	 * 
	 * @return true, if successful
	 */
	public boolean hasCue() {
		return this.hasCue;
	}

	/**
	 * Gets the checks for file.
	 * 
	 * @return the checks for file
	 */
	public Number getHasFile() {
		return this.hasFile;
	}

	/**
	 * Checks for log.
	 * 
	 * @return true, if successful
	 */
	public boolean hasLog() {
		return this.hasLog;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public Number getId() {
		return this.id;
	}

	/**
	 * Gets the leechers.
	 * 
	 * @return the leechers
	 */
	public Number getLeechers() {
		return this.leechers;
	}

	/**
	 * Gets the log score.
	 * 
	 * @return the log score
	 */
	public Number getLogScore() {
		return this.logScore;
	}

	/**
	 * Gets the media.
	 * 
	 * @return the media
	 */
	public String getMedia() {
		return this.media;
	}

	/**
	 * Gets the remaster record label.
	 * 
	 * @return the remaster record label
	 */
	public String getRemasterRecordLabel() {
		return this.remasterRecordLabel;
	}

	/**
	 * Gets the remaster title.
	 * 
	 * @return the remaster title
	 */
	public String getRemasterTitle() {
		return this.remasterTitle;
	}

	/**
	 * Gets the remaster year.
	 * 
	 * @return the remaster year
	 */
	public String getRemasterYear() {
		return this.remasterYear;
	}

	/**
	 * Gets the remastered.
	 * 
	 * @return the remastered
	 */
	public boolean getRemastered() {
		return this.remastered;
	}

	/**
	 * Checks if is scene.
	 * 
	 * @return true, if is scene
	 */
	public boolean isScene() {
		return this.scene;
	}

	/**
	 * Gets the seeders.
	 * 
	 * @return the seeders
	 */
	public Number getSeeders() {
		return this.seeders;
	}

	/**
	 * Gets the size.
	 * 
	 * @return the size
	 */
	public Number getSize() {
		return this.size;
	}

	/**
	 * Gets the snatched.
	 * 
	 * @return the snatched
	 */
	public Number getSnatched() {
		return this.snatched;
	}

	/**
	 * Gets the time.
	 * 
	 * @return the time
	 */
	public String getTime() {
		return this.time;
	}

	/**
	 * Get a concise representation of the torrent media, format and encoding. For example "CD - AAC - 320"
	 * 
	 * @return the media, format, and encoding
	 */
	public String getMediaFormatEncoding() {
		return this.getMedia() + " - " + this.getFormat() + " - " + this.getEncoding();

	}

	/**
	 * Gets the download link.
	 * 
	 * @return the download link
	 */
	public String getDownloadLink() {
		String site = MySoup.getSite();
		String authKey = MySoup.getAuthKey();
		String passKey = MySoup.getPassKey();
		String downloadLink =
				site + "torrents.php?action=download&id=" + this.getId() + "&authkey=" + authKey + "&torrent_pass=" + passKey;
		return downloadLink;
	}

	/**
	 * Download file.
	 * 
	 * @param url
	 *            the url
	 * @param path
	 *            the path
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void downloadFile(String url, String path) throws IOException {
		String name = "Unknown " + "(" + getMediaFormatEncoding() + ")";
		URL u;
		u = new URL(getDownloadLink());
		ReadableByteChannel rbc = Channels.newChannel(u.openStream());
		FileOutputStream fos = new FileOutputStream(path + name + ".torrent");
		fos.getChannel().transferFrom(rbc, 0, 1 << 24);
		System.out.println("Downloaded " + name + " to " + path);

	}

	/* (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return "Torrent [getEncoding=" + getEncoding() + ", getFileCount=" + getFileCount() + ", getFormat=" + getFormat()
				+ ", getFreeTorrent=" + isFreeTorrent() + ", getGroupId=" + getGroupId() + ", getHasCue=" + getHasFile()
				+ ", getHasFile=" + getHasFile() + ", getHasLog=" + getHasFile() + ", getId=" + getId() + ", getLeechers="
				+ getLeechers() + ", getLogScore=" + getLogScore() + ", getMedia=" + getMedia() + ", getRemasterRecordLabel="
				+ getRemasterRecordLabel() + ", getRemasterTitle=" + getRemasterTitle() + ", getRemasterYear="
				+ getRemasterYear() + ", getRemastered=" + getRemastered() + ", getScene=" + getSize() + ", getSeeders="
				+ getSeeders() + ", getSize=" + getSize() + ", getSnatched=" + getSnatched() + ", getTime=" + getTime()
				+ ", getMediaFormatEncoding=" + getMediaFormatEncoding() + ", getDownloadLink=" + getDownloadLink() + "]";
	}

}