/**
 *
 */
package com.misskabu.dbproject.form;

import java.io.Serializable;

/**
 * @author tabuchikenta
 * jspのフォーム入力値とアクションのデータをバインドするためのjavabeanクラス。
 */
public class InputDataForm implements Serializable{

	private int id;
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

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
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
