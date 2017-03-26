<!DOCTYPE html>
<html>

	<head>
		
	</head>

	<body>
		${i=0}
		<#list list as position>
			<table>
					<td>${position["name"]}</td>
					<td>${position["title"]}</td>
					<td>${position.salary}</td>
					<td>${position.education}</td>
					<td>${position.companyName}</td>
					<td>${position.exper}</td>
					<td>${position.workAddress}</td>
			</table>
		</#list>
	</body>
</html>