<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>検索一覧</h1>
	<s:form action="indexAction_inputData">
		<s:submit value="新規登録"/>
	</s:form>

	<hr>

	<table>

			<thead>
				<tr>
					<th>コード番号</th>
					<th>タイトル</th>
					<th>内容</th>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="dataDaoList">
				<tr>
					<td><s:property value="code" /></td>
					<td><s:property value="title" /></td>
					<td><s:property value="contents" /></td>
				</tr>
			</s:iterator>
			</tbody>

	</table>
</body>
</html>