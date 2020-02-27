<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resource/bootstrap.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		$.post("/type",function(msg){
			for (var i = 0; i < msg.length; i++) {
				$("#tn").append("<option value='"+msg[i].tid+"'>"+msg[i].tname+"</option>");
			}
		})
		$.post("/brand",function(msg){
			for (var i = 0; i < msg.length; i++) {
				$("#bn").append("<option value='"+msg[i].bid+"'>"+msg[i].bname+"</option>");
			}
		})
	})
</script>
<title>Insert title here</title>
</head>
<body>									
	<form action="/add" method="post" enctype="multipart/form-data">
		<table class="table">
			<tr>
				<td>商品编号：</td>
				<td>
					<input type="text" name="id">
				</td>
			</tr>
			<tr>
				<td>商品名称：</td>
				<td>
					<input type="text" name="name">
				</td>
			</tr>
			<tr>
				<td>英文名称：</td>
				<td>
					<input type="text" name="english">
				</td>
			</tr>
			<tr>
				<td>商品品牌：</td>
				<td>
					<select id="bn" name="bid">
						<option value="">请选择</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>商品种类：</td>
				<td>
					<select id="tn" name="tid">
						<option value="">请选择</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>尺寸：</td>
				<td>
					<input type="text" name="count">
				</td>
			</tr>
			<tr>
				<td>单价（元）：</td>
				<td>
					<input type="text" name="money">
				</td>
			</tr>
			<tr>
				<td>数量：</td>
				<td>
					<input type="text" name="num">
				</td>
			</tr>
			<tr>
				<td>标签：</td>
				<td>
					<input type="text" name="other">
				</td>
			</tr>
			<tr>
				<td>商品图片上传：</td>
				<td>
					<input type="file" name="file">
				</td>
			</tr>
			<tr>
				<td colspan="10">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>