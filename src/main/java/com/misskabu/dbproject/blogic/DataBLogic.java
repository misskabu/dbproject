package com.misskabu.dbproject.blogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.misskabu.dbproject.dao.DataDao;
import com.misskabu.dbproject.form.InputDataForm;
import com.misskabu.dbproject.service.DataService;

/**
 * @author misskabu
 * ビジネスロジッククラス。
 * アクションコントローラからルーティング以外のメソッドを切り離す。
 */
@Component
public class DataBLogic {
	@Autowired
	private DataService dataService;
	/**
	 *  DBにデータを挿入する。
	 * @param inputDataForm
	 */
	public void insertData(InputDataForm inputDataForm) {
		DataDao dao = new DataDao();
		dao.setCode(inputDataForm.getCode());
		dao.setTitle(inputDataForm.getTitle());
		dao.setContents(inputDataForm.getContents());
		this.dataService.getDataDaoMapper().addData(dao);
	}

	/**
	 * DBのデータを削除する。
	 * @param id
	 */
	public void deleteData(int id) {
		this.dataService.getDataDaoMapper().deleteDataById(id);
	}
	public DataService getDataService() {
		return dataService;
	}
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
}
