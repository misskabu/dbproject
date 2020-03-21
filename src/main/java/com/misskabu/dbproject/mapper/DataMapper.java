package com.misskabu.dbproject.mapper;

import java.util.List;

import com.misskabu.dbproject.dao.DataDao;

public interface DataMapper {
	/**
	 * データを一件取得する
	 * @param id
	 * @return
	 */
	DataDao getData(int id);
	/**
	 * データを全件取得する
	 * @return
	 */
	List<DataDao> findAll();
	/**
	 * データを1件追加する
	 * @param dataDao
	 */
	void addData(DataDao dataDao);
	/**
	 * 指定したデータを削除する
	 * @param id
	 */
	void deleteDataById(int id);
}
