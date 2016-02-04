package com.letsparty.service.bean;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "subject")
public class PartyItem {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "topic")
    public String getTopical() {
        return topical;
    }

    public void setTopical(String topical) {
        this.topical = topical;
    }

    @Column(name = "country")
    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "address_detail")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Transient
    public String getOrganiger() {
        return organiger;
    }

    public void setOrganiger(String organiger) {
        this.organiger = organiger;
    }

    @Transient
    public String getOrg_tel() {
        return org_tel;
    }

    public void setOrg_tel(String org_tel) {
        this.org_tel = org_tel;
    }

    @Column(name = "time")
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Column(name = "description")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Column(name = "images")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Column(name = "partner_id")
    public long getHolderID() {
        return holderID;
    }

    public void setHolderID(long holderID) {
        this.holderID = holderID;
    }

    @Column(name = "fav")
    public long getFav() {
        return fav;
    }

    public void setFav(long fav) {
        this.fav = fav;
    }

    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    long id = -1;
    private String topical = null;
    private String county = null;
    private String province = null;
    private String city = null;
    private String location = null;
    private String organiger = null;
    private String org_tel = null;
    private long time = 0;
    private String detail = null;
    private String image = null;
    private String thumbnail = null;
    private long fav;
    private String comments;
    private long holderID = -1;
}
