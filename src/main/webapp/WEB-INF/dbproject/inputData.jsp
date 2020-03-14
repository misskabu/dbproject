<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
	<h1>入力画面</h1>
	<s:form action="data_comfirmData">
		<table>
			<tr>
				<th>コード番号</th>
				<td><s:textfield name="inputDataForm.code" /></td>
			</tr>
			<tr>
				<th>タイトル</th>
				<td><s:textfield name="inputDataForm.title" /></td>
			</tr>
			<tr>
				<th>内容</th>
				<td><s:textfield name="inputDataForm.contents" /></td>
			</tr>
		</table>
		<s:submit value="確認へ進む" />
	</s:form>
</body>
</html>