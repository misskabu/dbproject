package com.misskabu.dbproject.action;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.misskabu.common.action.BaseAction;
import com.misskabu.dbproject.dao.DataDao;
import com.misskabu.dbproject.service.DataService;

/**
 * @author tabuchikenta
 * 表紙ページ画面の制御を行うアクション
 */
@Component
public class IndexAction extends BaseAction {
	/**
	 * 初期ページ
	 */
	@Autowired
	private DataService dataService;
	/**
	 *  dataDao型のリスト
	 */
	private List<DataDao> dataDaoList;
	public String execute() {
		log.info("execute() start");
		setDataDaoList(dataService.getDataDaoMapper().findAll());


		log.info("execute() end");
		return SUCCESS;
	}
	/**
	 * 新規登録ボタン押下時に入力画面に遷移させる
	 * @return
	 */
	public String inputData() {
		log.info("inputData()_start");
		log.info("inputData()_end");
		return SUCCESS;
	}
	/**
	 * @return dataDaoList
	 */
	public List<DataDao> getDataDaoList() {
		return dataDaoList;
	}
	/**
	 * @param dataDaoList セットする dataDaoList
	 */
	public void setDataDaoList(List<DataDao> dataDaoList) {
		this.dataDaoList = dataDaoList;
	}
}
