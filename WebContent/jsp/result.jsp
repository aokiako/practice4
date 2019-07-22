<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="ContentType" content="text/html; charset=UTF-8">
<title>おみくじ結果</title>
</head>
<body>
	<article class="main">
		<h2>おみくじ結果</h2>
		<p>今日の運勢は${omikuji.unseiNm}です！</p>

		<table>
			<tr>
				<th>願い事</th>
				<th>商い</th>
				<th>学問</th>
			</tr>
			<tr>
				<td>${omikuji.negaigoto}</td>
				<td>${omikuji.akinai}</td>
				<td>${omikuji.gakumon}</td>
			</tr>
		</table>
	</article>

	<a href="/omikuji2.0/BirthdayInput">トップに戻る</a>

</body>
</html>