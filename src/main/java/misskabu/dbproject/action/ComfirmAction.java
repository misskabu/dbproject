/**
 *
 */
package misskabu.dbproject.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import misskabu.common.action.BaseAction;
import misskabu.dbproject.dao.DataDao;
import misskabu.dbproject.dao.DataDaoMapper;
import misskabu.dbproject.form.InputDataForm;

/**
 * @author tabuchikenta
 * データの入力確認画面の制御を行うアクション
 */
public class ComfirmAction extends BaseAction{
    @Autowired
    private DataDaoMapper daoMapper;
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
		List<DataDao> resultList = daoMapper.getAllData();
		for(DataDao record : resultList) {
			log.info(record.getTitle());
			log.info(record.getContents());
		}
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
