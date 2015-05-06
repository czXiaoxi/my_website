 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <title>迷你小网店</title>
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<br><br>
<div class="container">
	<div class="row">
<!-- 	 	<div class="col-md-2 bs-docs-sidenav">
			<ul class="nav nav-list bs-docs-sidenav affix" >
				<li><a href="/website/user/success">首页<i class="glyphicon glyphicon-chevron-right" style="float: right;color: #e5e5e5;"></i></a></li>
		        <li><a href="/website/user/shoppingcart">购物车<i class="glyphicon glyphicon-chevron-right" style="float: right;color: #e5e5e5;"></i></a></li>
		        <li><a href="/website/user/order">订单<i class="glyphicon glyphicon-chevron-right" style="float: right;color: #e5e5e5;"></i></a></li>
		        <li><a href="/website/user/success">退出<i class="glyphicon glyphicon-chevron-right" style="float: right;color: #e5e5e5;"></i></a></li>
	        </ul>
	    </div>  -->
	    <table>
	    	<tr >
	    		<td valign=middle><strong>购物清单</strong></td>
	    	</tr>
	    </table>
	    <br><br>
	    <div class="col-md-4 ">
<table class="table table-hover table-bordered ">
   		<tr>
			<td valign=middle align=center  width=""><b>商品编码</b></td>
			<td valign=middle align=center  width=""><b>商品名称</b></td>
			<td valign=middle align=center  width=""><b>价格</b></td>
			<td valign=middle align=center  width=""><b>数量</b></td>
			<td valign=middle align=center  width=""><b>合计</b></td>
			<td valign=middle align=center  width=""><b>操作</b></td>
		</tr>
        <c:forEach items="${sessionScope.cart.OrderLine }" var="orderline">
		<tr>
			<form method="post" action="UpdateProductServlet" name="f1">
			<input type="hidden" name="productid" value="${orderline.product.productid }">
			<input type="hidden" name="number">
			<%
				int i=1;
			%>
			<td  valign=middle align=center width=""><%=i++ %></td>
			<td  valign=middle width="">&nbsp;&nbsp;<a href="ProductDetailServlet?productid=${orderline.shoppingcart.goodsid }">${orderline.shoppingcart.goodsname }</a></td>
			<td  valign=middle align=center width="">${orderline.shoppingcart.price }</td>
			<td  valign=middle align=center width=""><input type="text" name="num" value="${orderline.count }" size="4" onblur="javascript:if(this.value<1){alert('对不起，产品数量不能小于 1 ');this.focus();}else{number.value=this.value;}"/></td>
			<td  valign=middle align=left width="">&nbsp;&nbsp;${(orderline.shoppingcart.price)*(orderline.count) }</td>
			<td  valign=middle align=center width="">
			<input type="button" value="删除" onclick="javascript:window.location='RemoveProductServlet?productid=${orderline.estore.goodsId }';"> <input type="submit" value="保存修改"></td>
			</form>
		</tr>
        </c:forEach>        
                
		<tr>
			<td valign=middle align=center colspan="4">　</td>
			<td valign=middle align=left width="">&nbsp;&nbsp;<b>${sessionScope.cart.totalPrice }</b></td>
			<td valign=middle align=center width="">　</td>
		</tr>
		<tr>
			<td  valign=middle align=center colspan="6"><input type="button" value="提交订单" onclick="<c:url value="/user/checkorder"/>"/> 
			<input type="button" value="清空购物车" onclick="<c:url value="/cart/deleteCart"/>" /></td>
		</tr>
   
</table>
</div>
</div>
</div>
</body>
</html>			