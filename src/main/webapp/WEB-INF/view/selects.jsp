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
	function fenye(pageNum) {
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
	}
	function add() {
		location="/toAdd";
	}
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
<title>商品列表页面</title>
</head>
<body>

<form action="/selects" method="post">
	<input type="hidden" name="pageNum">
	<input type="button" value="添加" onclick="add()">&nbsp;
	
	种类<select id="tn" name="tid">
			<option value="">请选择</option>
		</select>&nbsp;
		
	品牌<select id="bn" name="bid">
			<option value="">请选择</option>
		</select>&nbsp;
		
	单价范围<input type="text" name="m1" value="${m1}">到<input type="text" name="m2" value="${m2}">
	&nbsp;
		
	商品名称:<input type="text" name="name" value="${name}">
	英文名称:<input type="text" name="english" value="${english}">
	商品标签:<input type="text" name="other" value="${other}">
	
	<input type="submit" value="查询">
</form>

<table class="table" style="border-style: 0px;">
	<c:forEach items="${info.list}" var="li" varStatus="count">
		<tr>
			<td>${count.count}</td>
			<td>${li.english}</td>
			<td>
				<img alt="失败" src="file${li.img}" height="60px" width="60px">
			</td>
			<td>￥${li.money}</td>
			<td>${li.name}</td>
			<td>${li.count}</td>
			<td>
				${li.brand.bname}
			</td>
			<td>
				${li.type.tname}
			</td>
			<td>${li.other}</td>
			<td>${li.num}</td>
			<td><button>□对比</button><button>❤关注</button><button>加入购物车</button></td>
		</tr>
	</c:forEach>
</table>
			<button onclick="fenye(1)">首页</button>
			<button onclick="fenye(${info.prePage==0?1:info.prePage})">上一页</button>
			<button onclick="fenye(${info.nextPage==0?info.pages:info.nextPage})">下一页</button>
			<button onclick="fenye(${info.pages})">尾页</button>
			&nbsp;&nbsp;&nbsp;
			当前${info.pageNum}页,共${info.pages}页,共${info.total}条
		
</body>
</html>