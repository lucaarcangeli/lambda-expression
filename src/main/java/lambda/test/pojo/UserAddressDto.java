package lambda.test.pojo;

/**
 * @author Cinello s.r.l.
 */
public class UserAddressDto {

	private AddressDto billing;
	private AddressDto shipping;


	/**
	 * @return the billing
	 */
	public AddressDto getBilling() {
		return billing;
	}


	/**
	 * @param billing
	 *            the billing to set
	 */
	public void setBilling(AddressDto billing) {
		this.billing = billing;
	}


	/**
	 * @return the shipping
	 */
	public AddressDto getShipping() {
		return shipping;
	}


	/**
	 * @param shipping
	 *            the shipping to set
	 */
	public void setShipping(AddressDto shipping) {
		this.shipping = shipping;
	}

}