<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力確認画面</title>
</head>
<body>
	<h1>入力確認画面</h1>
	<s:form>
		<table>
			<tr>
				<th>コード番号</th>
				<td><s:property value="inputDataForm.code"/></td>
			</tr>
			<tr>
				<th>タイトル</th>
				<td><s:property value="inputDataForm.title"/></td>
			</tr>
			<tr>
				<th>内容</th>
				<td><s:property value="inputDataForm.contents"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>