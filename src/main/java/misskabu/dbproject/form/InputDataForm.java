/**
 *
 */
package misskabu.dbproject.form;

/**
 * @author tabuchikenta
 * jspのフォーム入力値とアクションのデータをバインドするためのjavabeanクラス。
 */
public class InputDataForm {
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
	private int code;
	private String title;
	private String contents;
}
