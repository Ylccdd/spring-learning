<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<%--pageEncoding解决jsp前端乱码--%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/common.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<h2>使用超链接提交数据</h2>
<%--url加上/则代表绝对路径 不加则代表相对路径(相对于当前资源的路径)--%>
<a href="student/add01?name=姚剑锋&englishName=jeff&address=河南财经政法大学&phoneNumber=18039670878">showParam</a>

<h2>使用表单提交</h2>
<form action="/student/add" method="post">
    <label>中文名字:
        <input name="name" type="text">
    </label>
    <br>
    <label>英文名字:
        <input name="englishName" type="text">
    </label>
    <br>
    <label>手机号码:
        <input name="phoneNumber" type="text">
    </label>
    <label>家庭住址:
        <input name="address" type="text">
    </label>
    <br>

    <label>出生日期:
        <input name="birthday" type="date">
    </label>
    <input type="submit"  value="提交">
</form>
<h2>使用ajax提交</h2>
<button onclick="requestHeader()">ajax请求头提交数据</button>
<button onclick="requestBody()">ajax请求体提交数据使用注解</button>
<button onclick="requestBody01()">ajax请求体提交数据不带注解</button>
<button onclick="useResponse()">使用HttpServletResponse对象响应</button>
<button onclick="useOurType()">使用SpringMVC能力进行响应</button>
<hr/>
<div>
    <a href="/thymeleaf/hello">thymeleaf入门案例测试</a>
</div>
<%--请求体可以用json封装或者自定义类型接收,--%>
<script>
    function requestHeader() {

        $.ajax(
            {
                url: "student/requestHead",
                type: "post",
                headers: {
                    eye: 'black eyes'
                },
                success: function (res) {
                    console.log(res)
                }

            }
        )
    }

    function requestBody() {
        let data = {};//data封装对象
        data.name = "姚剑锋";
        data.address = "河南郑州";
        data.phoneNumber = "18039670878";
        $.ajax(
            {
                url: "student/requestBody",
                type: "post",
                contentType: "application/json",
                //data代表请求体对应的数据 把data转换为json字符串
                data: JSON.stringify(data),
                success: function (res) {
                    console.log(res)
                }

            }
        )
    }

    //使用ajax不带注解
    function requestBody01() {
        let data = {};
        data.name = "姚剑锋";
        data.address = "河南郑州";
        data.phoneNumber = "18039670878";
        $.ajax(
            {
                url: "student/requestBody01",
                type: "post",
                //前端传递对象,后端属性名和前端name属性名称一样即可
                data: data,
                success: function (res) {
                    console.log(res)
                }

            }
        )
    }
    function useResponse() {
        let data = {};
        data.name = "姚剑锋useResponse";
        data.address = "河南郑州";
        data.phoneNumber = "18039670878";
        $.ajax(
            {
                url: "student/useResponse",
                type: "post",
                data: JSON.stringify(data),
                contentType: "application/json",
                dataType:"json",
                success: function (res) {
                    console.log(res)
                }

            }
        )
    }
    function useOurType() {
        let data = {};
        data.name = "姚剑锋";
        data.address = "河南郑州";
        data.phoneNumber = "18039670878";
        $.ajax(
            {
                url: "student/useOurType",
                type: "post",
                data: data,
                success: function (res) {
                    console.log(res)
                }

            }
        )
    }
</script>
</body>
</html>