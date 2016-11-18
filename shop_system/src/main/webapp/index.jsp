<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2 style="text-align: center">用户登录</h2>
<s:form action="sum" method="POST">
    <s:textfield name="UserName"  label="用户名" />
    <s:textfield name="UserPassword" type="password" label="密码" />
    <s:submit value="提交" />
</s:form>
</body>
</html>
