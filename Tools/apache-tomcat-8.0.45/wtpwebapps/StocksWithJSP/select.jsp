<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Stocks</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50464",secure:"50465"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc4-3" data-genuitec-path="/StocksWithJSP/WebContent/select.jsp">
	<form action="Stocks" method="POST" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc4-3" data-genuitec-path="/StocksWithJSP/WebContent/select.jsp">
		<c:forEach var="stock" items="${stocks}">
			<input type="radio" 
			       name="symbol" 
			       value="${stock.symbol}"/>${stock.name}<br/>
		</c:forEach>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>