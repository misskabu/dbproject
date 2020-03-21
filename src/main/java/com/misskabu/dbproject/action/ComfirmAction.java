/**
 *
 */
package com.misskabu.dbproject.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.misskabu.common.action.BaseAction;
import com.misskabu.dbproject.blogic.DataBLogic;
import com.misskabu.dbproject.form.InputDataForm;

/**
 * @author tabuchikenta
 * データの入力確認画面の制御を行うアクション
 */

public class ComfirmAction extends BaseAction{

	//InputActionからtype=chainを経由してリクエストを引き継いでいる。
	private InputDataForm inputDataForm;
	@Autowired
	private DataBLogic blogic;
	/**
	 * 登録ボタン押下時にDBへ登録し、成功したら完了画面に遷移させる
	 * @return
	 */
	public String insertData() {

		log.info("insertData()_start");
		blogic.insertData(this.inputDataForm);
		log.info("insertData()_end");
		return SUCCESS;
	}

	public InputDataForm getInputDataForm() {
		return inputDataForm;
	}
	public void setInputDataForm(InputDataForm inputDataForm) {
		this.inputDataForm = inputDataForm;
	}

}
