/**
 *
 */
package com.misskabu.common.action;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author tabuchikenta
 * 全てのアクションクラスの規定クラス
 */
public class BaseAction extends ActionSupport implements SessionAware,RequestAware{

	protected Logger log = LogManager.getLogger();
	protected Map<String, Object> session;
	protected Map<String,Object> request;
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}
