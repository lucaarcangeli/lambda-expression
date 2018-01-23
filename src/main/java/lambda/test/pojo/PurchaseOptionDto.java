package lambda.test.pojo;

/**
 * @author Luca Arcangeli (luca.arcangeli@gmail.com)
 */
public class PurchaseOptionDto {

	private Long id;
	private String text;
	private Boolean hasExpiration;
	private Boolean hasPrice;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}


	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}


	/**
	 * @return the hasExpiration
	 */
	public Boolean getHasExpiration() {
		return hasExpiration;
	}


	/**
	 * @param hasExpiration
	 *            the hasExpiration to set
	 */
	public void setHasExpiration(Boolean hasExpiration) {
		this.hasExpiration = hasExpiration;
	}


	/**
	 * @return the hasPrice
	 */
	public Boolean getHasPrice() {
		return hasPrice;
	}


	/**
	 * @param hasPrice
	 *            the hasPrice to set
	 */
	public void setHasPrice(Boolean hasPrice) {
		this.hasPrice = hasPrice;
	}
}