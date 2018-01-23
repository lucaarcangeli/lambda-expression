package lambda.test.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author Luca Arcangeli (luca.arcangeli@gmail.com)
 */
public class OrderDto {

	private Long id;
	private Date orderTs;
	private Double totalAmount;
	private Double shippingCosts;
	private Long paymentMethodId;
	private Date paymentTs;
	private String transactionId;
	private String trackingCode;
	private Long invoiceId;
	private String note;
	private Date statusTs;
	private Long statusId;
	private UserDto user;
	private List<OrderItemDto> items;
	private Long status;


	/**
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}


	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}


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
	 * @return the user
	 */
	public UserDto getUser() {
		return user;
	}


	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(UserDto user) {
		this.user = user;
	}


	/**
	 * @return the orderTs
	 */
	public Date getOrderTs() {
		return orderTs;
	}


	/**
	 * @param orderTs
	 *            the orderTs to set
	 */
	public void setOrderTs(Date orderTs) {
		this.orderTs = orderTs;
	}


	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}


	/**
	 * @param totalAmount
	 *            the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}


	/**
	 * @return the shippingCosts
	 */
	public Double getShippingCosts() {
		return shippingCosts;
	}


	/**
	 * @param shippingCosts
	 *            the shippingCosts to set
	 */
	public void setShippingCosts(Double shippingCosts) {
		this.shippingCosts = shippingCosts;
	}


	/**
	 * @return the paymentMethodId
	 */
	public Long getPaymentMethodId() {
		return paymentMethodId;
	}


	/**
	 * @param paymentMethodId
	 *            the paymentMethodId to set
	 */
	public void setPaymentMethodId(Long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}


	/**
	 * @return the paymentTs
	 */
	public Date getPaymentTs() {
		return paymentTs;
	}


	/**
	 * @param paymentTs
	 *            the paymentTs to set
	 */
	public void setPaymentTs(Date paymentTs) {
		this.paymentTs = paymentTs;
	}


	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}


	/**
	 * @param transactionId
	 *            the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	/**
	 * @return the trackingCode
	 */
	public String getTrackingCode() {
		return trackingCode;
	}


	/**
	 * @param trackingCode
	 *            the trackingCode to set
	 */
	public void setTrackingCode(String trackingCode) {
		this.trackingCode = trackingCode;
	}


	/**
	 * @return the invoiceId
	 */
	public Long getInvoiceId() {
		return invoiceId;
	}


	/**
	 * @param invoiceId
	 *            the invoiceId to set
	 */
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}


	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}


	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
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
	 * @return the statusId
	 */
	public Long getStatusId() {
		return statusId;
	}


	/**
	 * @param statusId
	 *            the statusId to set
	 */
	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}


	/**
	 * @return the items
	 */
	public List<OrderItemDto> getItems() {
		return items;
	}


	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<OrderItemDto> items) {
		this.items = items;
	}
}