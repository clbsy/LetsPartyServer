package com.letsparty.service.dao;

import java.util.List;

public interface IBeanDao<Bean> {
	public void saveBean(Bean bean);
	public Bean getBean(long id);
	public void updateBean(Bean bean);
	public List<Bean> getAllBean();
}
