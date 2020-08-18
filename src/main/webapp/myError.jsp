<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/24
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ch" lang="ch">
  <head> 
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <meta name="author" content="Yigit Yigit Ce.[pulyavserdce.com]" />
  <meta name="description" content="Site description" />
  <meta name="keywords" content="keywords, keyword, seo, google" /> 
  <meta name="apple-mobile-web-app-status-bar-style" content="black" /> 
  <meta name="apple-mobile-web-app-capable" content="yes" /> 
  <title>Coffee Break : error</title>
   <link rel="stylesheet" media="screen" href="${pageContext.request.contextPath}/css/error.style.css" type="text/css" />
   </head> 
   <body> 
   <div class="controller">
    <div class="objects"> 
    <!-- text area -->
    <div class="text-area rotate">
    <p class="error">Error</p>
    <p class="details">出现了一个问题<br /><br />${myError.errorInfo}.</p>
    </div> 
    <!-- text area -->
    <!-- home page --> 
    <div class="homepage rotate">
    <a href="${pageContext.request.contextPath}/default.jsp">Back to homepage</a>
    </div> <!-- home page --> 
    </div> <!-- social-icons --> 
    <div class="social">
    <ul class="social-icons">
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/forrst.png" alt="Forrst" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/dribbble.png" alt="Dribbble" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/deviantart.png" alt="DeviantArt" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/flickr.png" alt="Flickr" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/twitter.png" alt="Twitter" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/facebook.png" alt="Facebook" /></a></li>
    <li><a href="#"><img src="${pageContext.request.contextPath}/images/skype.png" alt="Skype" /></a></li>
    </ul> 
    </div> 
    <!-- social-icons --> 
    </div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>