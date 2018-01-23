package lambda.test.pojo;

import java.util.Date;

/**
 * @author Luca Arcangeli (luca.arcangeli@gmail.com)
 */
public class UserDto {

	private Long id;
	private String email;
	private String firstName;
	private String lastName;
	private String corporateName;
	private String password;
	private UserAddressDto address;
	private String phoneNo;
	private String mobileNo;
	private String taxCode;
	private String vatCode;
	private String verificationCode;
	private Date signupTs;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the address
	 */
	public UserAddressDto getAddress() {
		return address;
	}


	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(UserAddressDto address) {
		this.address = address;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the corporateName
	 */
	public String getCorporateName() {
		return corporateName;
	}


	/**
	 * @param corporateName
	 *            the corporateName to set
	 */
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}


	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}


	/**
	 * @param mobileNo
	 *            the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	/**
	 * @return the taxCode
	 */
	public String getTaxCode() {
		return taxCode;
	}


	/**
	 * @param taxCode
	 *            the taxCode to set
	 */
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}


	/**
	 * @return the vatCode
	 */
	public String getVatCode() {
		return vatCode;
	}


	/**
	 * @param vatCode
	 *            the vatCode to set
	 */
	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}


	/**
	 * @return the verificationCode
	 */
	public String getVerificationCode() {
		return verificationCode;
	}


	/**
	 * @param verificationCode
	 *            the verificationCode to set
	 */
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}


	/**
	 * @return the signupTs
	 */
	public Date getSignupTs() {
		return signupTs;
	}


	/**
	 * @param signupTs
	 *            the signupTs to set
	 */
	public void setSignupTs(Date signupTs) {
		this.signupTs = signupTs;
	}
}