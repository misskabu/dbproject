/**
 *
 */
package com.misskabu.common.action;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tabuchikenta
 * 全てのアクションクラスの規定クラス
 */
public class BaseAction extends ActionSupport implements SessionAware{

	protected Logger log = LogManager.getLogger();
	protected Map<String, Object> userSession;
	@Override
	public void setSession(Map<String, Object> session) {
		userSession = session;
	}

}
