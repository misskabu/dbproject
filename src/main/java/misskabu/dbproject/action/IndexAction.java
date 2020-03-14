package misskabu.dbproject.action;
import misskabu.common.action.BaseAction;

public class IndexAction extends BaseAction {
	public String execute() {
		log.info("execute() start");
		log.info("execute() end");
		return SUCCESS;
	}
}
