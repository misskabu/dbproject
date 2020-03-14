/**
 *
 */
package misskabu.common.action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tabuchikenta
 * 全てのアクションクラスの規定クラス
 */
public class BaseAction extends ActionSupport{

	protected Logger log = LogManager.getLogger();

}
