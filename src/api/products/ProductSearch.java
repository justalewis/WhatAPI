


package api.products;

import java.util.List;

import api.son.MySon;

/**
 * The Class ProductSearch.
 * 
 * @author Gwindow
 */
public class ProductSearch {
	private Number currentItemCount;
	private String etag;
	private String id;
	private List<Items> items;
	private Number itemsPerPage;
	private String kind;
	private String nextLink;
	private String requestId;
	private String selfLink;
	private Number startIndex;
	private Number totalItems;
	private static final String KEY = "AIzaSyDOPEJep1GSxaWylXm7Tvdytozve8odmuo";

	/**
	 * Product search from upc.
	 * 
	 * @param upc
	 *            the upc
	 * @return the product search
	 */
	public static ProductSearch ProductSearchFromUPC(String upc) {
		String url =
				"https://www.googleapis.com/shopping/search/v1/public/products?key=" + KEY + "&country=US&restrictBy=gtin=" + upc
						+ "&alt=json";
		ProductSearch ps = (ProductSearch) MySon.toObjectOther(url, ProductSearch.class);
		return ps;
	}

	/**
	 * Checks for items.
	 * 
	 * @return true, if successful
	 */
	public boolean hasItems() {
		if (totalItems.intValue() > 0)
			return true;
		return false;
	}

	/**
	 * Gets the current item count.
	 * 
	 * @return the current item count
	 */
	public Number getCurrentItemCount() {
		return this.currentItemCount;
	}

	/**
	 * Sets the current item count.
	 * 
	 * @param currentItemCount
	 *            the new current item count
	 */
	public void setCurrentItemCount(Number currentItemCount) {
		this.currentItemCount = currentItemCount;
	}

	/**
	 * Gets the etag.
	 * 
	 * @return the etag
	 */
	public String getEtag() {
		return this.etag;
	}

	/**
	 * Sets the etag.
	 * 
	 * @param etag
	 *            the new etag
	 */
	public void setEtag(String etag) {
		this.etag = etag;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the items.
	 * 
	 * @return the items
	 */
	public List<Items> getItems() {
		return this.items;
	}

	/**
	 * Sets the items.
	 * 
	 * @param items
	 *            the new items
	 */
	public void setItems(List<Items> items) {
		this.items = items;
	}

	/**
	 * Gets the items per page.
	 * 
	 * @return the items per page
	 */
	public Number getItemsPerPage() {
		return this.itemsPerPage;
	}

	/**
	 * Sets the items per page.
	 * 
	 * @param itemsPerPage
	 *            the new items per page
	 */
	public void setItemsPerPage(Number itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	/**
	 * Gets the kind.
	 * 
	 * @return the kind
	 */
	public String getKind() {
		return this.kind;
	}

	/**
	 * Sets the kind.
	 * 
	 * @param kind
	 *            the new kind
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * Gets the next link.
	 * 
	 * @return the next link
	 */
	public String getNextLink() {
		return this.nextLink;
	}

	/**
	 * Sets the next link.
	 * 
	 * @param nextLink
	 *            the new next link
	 */
	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}

	/**
	 * Gets the request id.
	 * 
	 * @return the request id
	 */
	public String getRequestId() {
		return this.requestId;
	}

	/**
	 * Sets the request id.
	 * 
	 * @param requestId
	 *            the new request id
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * Gets the self link.
	 * 
	 * @return the self link
	 */
	public String getSelfLink() {
		return this.selfLink;
	}

	/**
	 * Sets the self link.
	 * 
	 * @param selfLink
	 *            the new self link
	 */
	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
	}

	/**
	 * Gets the start index.
	 * 
	 * @return the start index
	 */
	public Number getStartIndex() {
		return this.startIndex;
	}

	/**
	 * Sets the start index.
	 * 
	 * @param startIndex
	 *            the new start index
	 */
	public void setStartIndex(Number startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * Gets the total items.
	 * 
	 * @return the total items
	 */
	public Number getTotalItems() {
		return this.totalItems;
	}

	/**
	 * Sets the total items.
	 * 
	 * @param totalItems
	 *            the new total items
	 */
	public void setTotalItems(Number totalItems) {
		this.totalItems = totalItems;
	}

}