<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yo Shit</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50464",secure:"50465"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/ShoppingCart/WebContent/WEB-INF/cart.jsp">
	<form action="addItem.do" method="POST" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc3-1" data-genuitec-path="/ShoppingCart/WebContent/WEB-INF/cart.jsp">
		<select name="productId">
			<c:forEach var="product" items="${inventory}">
				<option value="${product.id}">(${product.name})</option>
				</c:forEach>
		</select><input type="submit" value="Add Item to Cart">

	</form>
	
	<c:if test="${product !=null}">
	You chose product ${product.name}
</c:if>
	<hr>
	Your Cart:
	<ul>
		<c:forEach var="item" items="${cart}">
			<li>${item.name} (<fmt:formatNumber value ="${item.price}" type = "currency"/>)</li>

		</c:forEach>

	</ul>


</body>
</html>