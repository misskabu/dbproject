package com.misskabu.dbproject.mapper;

import java.util.List;

import com.misskabu.dbproject.dao.DataDao;

public interface DataMapper {
	DataDao getData(int id);
	List<DataDao> findAll();
	void addData(DataDao dataDao);
}
