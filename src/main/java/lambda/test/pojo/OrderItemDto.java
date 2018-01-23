package lambda.test.pojo;

import java.util.Date;

/**
 * @author Cinello s.r.l.
 */
public class OrderItemDto {

	private Long id;
	private Long itemRefId;
	private String seriesId;
	private Double amount;
	private Date expirationTs;
	private String saleItemCode;
	private Date statusTs;
	private String status;
	private LocalizedEntryDto saleItemDescr;
	private PurchaseOptionDto purchaseOption;


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
	 * @return the itemRefId
	 */
	public Long getItemRefId() {
		return itemRefId;
	}


	/**
	 * @param itemRefId
	 *            the itemRefId to set
	 */
	public void setItemRefId(Long itemRefId) {
		this.itemRefId = itemRefId;
	}


	/**
	 * @return the seriesId
	 */
	public String getSeriesId() {
		return seriesId;
	}


	/**
	 * @param seriesId
	 *            the seriesId to set
	 */
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}


	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}


	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	/**
	 * @return the expirationTs
	 */
	public Date getExpirationTs() {
		return expirationTs;
	}


	/**
	 * @param expirationTs
	 *            the expirationTs to set
	 */
	public void setExpirationTs(Date expirationTs) {
		this.expirationTs = expirationTs;
	}


	/**
	 * @return the saleItemCode
	 */
	public String getSaleItemCode() {
		return saleItemCode;
	}


	/**
	 * @param saleItemCode
	 *            the saleItemCode to set
	 */
	public void setSaleItemCode(String saleItemCode) {
		this.saleItemCode = saleItemCode;
	}


	/**
	 * @return the saleItemDescr
	 */
	public LocalizedEntryDto getSaleItemDescr() {
		return saleItemDescr;
	}


	/**
	 * @param saleItemDescr
	 *            the saleItemDescr to set
	 */
	public void setSaleItemDescr(LocalizedEntryDto saleItemDescr) {
		this.saleItemDescr = saleItemDescr;
	}


	/**
	 * @return the purchaseOption
	 */
	public PurchaseOptionDto getPurchaseOption() {
		return purchaseOption;
	}


	/**
	 * @param purchaseOption
	 *            the purchaseOption to set
	 */
	public void setPurchaseOption(PurchaseOptionDto purchaseOption) {
		this.purchaseOption = purchaseOption;
	}


	/**
	 * @return the statusTs
	 */
	public Date getStatusTs() {
		return statusTs;
	}


	/**
	 * @param statusTs
	 *            the statusTs to set
	 */
	public void setStatusTs(Date statusTs) {
		this.statusTs = statusTs;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}