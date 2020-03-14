/**
 *
 */
package misskabu.dbproject.action;

import misskabu.common.action.BaseAction;
import misskabu.dbproject.form.InputDataForm;

/**
 * @author tabuchikenta
 *　データの入力画面の制御を行うアクション
 */
public class DataAction extends BaseAction {

	/**
	 * フォームの入力値を保持するビーン
	 */
	private InputDataForm inputDataForm;

	/**
	 * 確認へ進むボタン押下時に入力確認画面に遷移させる
	 * @return
	 */
	public String comfirmData() {
		log.info("comfirmData()_start");
		log.info(inputDataForm);
		log.info("comfirmData()_end");
		return SUCCESS;
	}

	public InputDataForm getInputDataForm() {
		return inputDataForm;
	}
	public void setInputDataForm(InputDataForm inputDataForm) {
		this.inputDataForm = inputDataForm;
	}

}
