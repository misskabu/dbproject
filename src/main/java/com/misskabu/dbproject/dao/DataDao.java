/**
 *
 */
package com.misskabu.dbproject.dao;

import java.io.Serializable;

/**
 * @author tabuchikenta
 * jspのフォーム入力値とアクションのデータをバインドするためのjavabeanクラス。
 */
public class DataDao implements Serializable{

	private int code;
	private String title;
	private String contents;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		final String result =
				" code:" + code +
				" title:" + title +
				" contents:" + contents;
		return result;
	}
}
