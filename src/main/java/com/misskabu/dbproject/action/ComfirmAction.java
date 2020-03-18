/**
 *
 */
package com.misskabu.dbproject.action;

import org.springframework.stereotype.Controller;

import com.misskabu.common.action.BaseAction;
import com.misskabu.dbproject.form.InputDataForm;
import com.misskabu.dbproject.service.DataService;

/**
 * @author tabuchikenta
 * データの入力確認画面の制御を行うアクション
 */
@Controller
public class ComfirmAction extends BaseAction{
//    @Autowired
//    private DataDaoMapper daoMapper;


	//この画面に遷移した時点ではNULL.
	private InputDataForm inputDataForm;
	private DataService dataService;
	/**
	 * 登録ボタン押下時にDBへ登録し、成功したら完了画面に遷移させる
	 * @return
	 */
	public String insertData() {

		log.info("insertData()_start");
		//InputActionでセッションに保管したリクエストパラメータを取り出して引き継ぐ。
		log.info(this.getDataService().getDataDaoMapper().getData(2));
		this.inputDataForm = new InputDataForm();
		this.inputDataForm.setCode(this.dataService.getDataDaoMapper().getData(2).getCode());
		this.inputDataForm.setTitle(this.dataService.getDataDaoMapper().getData(2).getTitle());
		this.inputDataForm.setContents(this.dataService.getDataDaoMapper().getData(2).getContents());

		log.info("insertData()_end");
		return SUCCESS;
	}

	public InputDataForm getInputDataForm() {
		return inputDataForm;
	}
	public void setInputDataForm(InputDataForm inputDataForm) {
		this.inputDataForm = inputDataForm;
	}
	public DataService getDataService() {
		return dataService;
	}
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
}
