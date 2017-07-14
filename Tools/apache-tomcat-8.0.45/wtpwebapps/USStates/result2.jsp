<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>States</title>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"50464",secure:"50465"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/USStates/WebContent/result2.jsp">
  <c:choose>
    <c:when test="${! empty state}">
      <ul>
        <li>${state.abbreviation}</li>
        <li>${state.name}</li>
        <li>
        <a href="http://maps.google.com/?q=${state.latitude},${state.longitude}">${state.capital}</a></li>
      </ul>

    </c:when>
    <c:otherwise>
    No state found
  </c:otherwise>
  </c:choose>

  <br  data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/USStates/WebContent/result2.jsp"/>
</body>
</html>