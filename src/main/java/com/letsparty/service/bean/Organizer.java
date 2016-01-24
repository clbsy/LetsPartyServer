package com.letsparty.service.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by xulin on 2016/1/24.
 */

@Entity
@Table(name = "organizer")
public class Organizer {
    private int id = -1;
    private String contact;
    private String contactPhone;

}
