package misskabu.dbproject.action;
import misskabu.common.action.BaseAction;

/**
 * @author tabuchikenta
 * 表紙ページ画面の制御を行うアクション
 */
public class IndexAction extends BaseAction {
	/**
	 * 初期ページ
	 */
	public String execute() {
		log.info("execute() start");
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
}
