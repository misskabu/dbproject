/**
 *
 */
package misskabu.dbproject.action;

import misskabu.common.action.BaseAction;
import misskabu.dbproject.form.InputDataForm;

/**
 * @author tabuchikenta
 * データの入力確認画面の制御を行うアクション
 */
public class ComfirmAction extends BaseAction{

	//この画面に遷移した時点ではNULL.
	private InputDataForm inputDataForm;
	/**
	 * 登録ボタン押下時にDBへ登録し、成功したら完了画面に遷移させる
	 * @return
	 */
	public String insertData() {
		log.info("insertData()_start");
		//InputActionでセッションに保管したリクエストパラメータを取り出して引き継ぐ。
		inputDataForm = (InputDataForm) this.userSession.get("inputDataForm");
		log.info(inputDataForm);
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
