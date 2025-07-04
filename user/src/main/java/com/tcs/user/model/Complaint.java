package com.tcs.user.model;


public class Complaint {
		private int id;
	private int complaintId;
	private String type;
	private String landMark;
	private String category;
	private long consumerNumber;
	private String userId;
	private String contactPerson ;
	private String description;
	private long mobileNumber;
	private String address;
	public Complaint(int id, int complaintId, String type, String landMark, String category, long consumerNumber,
			String userId, String contactPerson, String description, long mobileNumber, String address) {
		super();
		this.id = id;
		this.complaintId = complaintId;
		this.type = type;
		this.landMark = landMark;
		this.category = category;
		this.consumerNumber = consumerNumber;
		this.userId = userId;
		this.contactPerson = contactPerson;
		this.description = description;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public Complaint(int complaintId, String type, String landMark, String category, long consumerNumber, String userId,
			String contactPerson, String description, long mobileNumber, String address) {
		super();
		this.complaintId = complaintId;
		this.type = type;
		this.landMark = landMark;
		this.category = category;
		this.consumerNumber = consumerNumber;
		this.userId = userId;
		this.contactPerson = contactPerson;
		this.description = description;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public Complaint() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getConsumerNumber() {
		return consumerNumber;
	}
	public void setConsumerNumber(long consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", complaintId=" + complaintId + ", type=" + type + ", landMark=" + landMark
				+ ", category=" + category + ", consumerNumber=" + consumerNumber + ", userId=" + userId
				+ ", contactPerson=" + contactPerson + ", description=" + description + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + "]";
	}
	
	
}
