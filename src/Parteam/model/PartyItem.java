package com.Parteam.model;

public class PartyItem {
    public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public String getTopical() {
		return topical;
	}
	public void setTopical(String topical) {
		this.topical = topical;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrganiger() {
		return organiger;
	}
	public void setOrganiger(String organiger) {
		this.organiger = organiger;
	}
	public String getOrg_tel() {
		return org_tel;
	}
	public void setOrg_tel(String org_tel) {
		this.org_tel = org_tel;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getHolderID() {
		return holderID;
	}
	public void setHolderID(int holderID) {
		this.holderID = holderID;
	}
	int iD = -1;
    private String topical = null;
    private String county = null;
    private String province = null;
    private String city = null;
    private String location = null;
    private String organiger = null;
    private String org_tel = null;
    private String time = null;
    private String detail = null;
    private String image = null;
    private int holderID = -1;
}
