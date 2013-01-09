<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="shortcut icon" href="$!{env.imgUrl}/image/favicon.ico" type="image/vnd.microsoft.icon">
		<link rel="icon" href="$!{env.imgUrl}/image/favicon.ico" type="image/vnd.microsoft.icon">
	</head>
	<body>
	<form action="testAppCluster" method="post" >
		<input type="text" value="<s:property value='t.id'/>"/>
		<input type="text" value="<s:property value='t.name'/>"/>
		<input type="text" value="" name="appCluster.name" id="name"/>
		<input type="submit" value="Ìá½»"/>
	</form>
	</body>
</html>