/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-12-30 11:14:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PersonalArticle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link href=\"css/bootstrap-combined.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        var Type = null\r\n");
      out.write("\r\n");
      out.write("        function del(username, articleName, type) {\r\n");
      out.write("            var r = confirm(\"您确定要删除《\" + articleName + \"》这篇文章吗？\")\r\n");
      out.write("            if (r == true) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    type: \"get\",\r\n");
      out.write("                    url: \"DeleteArticleServlet\",\r\n");
      out.write("                    data: {\r\n");
      out.write("                        \"username\": username,\r\n");
      out.write("                        \"articleName\": articleName,\r\n");
      out.write("                        \"type\": type\r\n");
      out.write("                    },\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        if (data.flag) {\r\n");
      out.write("                            alert(\"删除成功！\")\r\n");
      out.write("                            location.reload()\r\n");
      out.write("                        } else {\r\n");
      out.write("                            alert(data.errorMessage)\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function up(pageType, currentPage, pageSize) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"get\",\r\n");
      out.write("                url: \"PersonalPaginationServlet\",\r\n");
      out.write("                data: {\r\n");
      out.write("                    \"currentPage\": currentPage,\r\n");
      out.write("                    \"pageSize\": pageSize,\r\n");
      out.write("                    \"pageType\": pageType,\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    Type = pageType\r\n");
      out.write("                    $(\"#\" + pageType).focus()\r\n");
      out.write("                    $(\"#totalPage\").html(data.totalPage)\r\n");
      out.write("                    $(\"#totalCount\").html(data.totalCount)\r\n");
      out.write("                    var list = \"\";\r\n");
      out.write("                    var firstPage = '<li> <a href=\"javascript:up(' + pageType + ',1,5)\">首页</a> </li>'\r\n");
      out.write("                    if (data.currentPage == 1) {\r\n");
      out.write("                        var pre = 1\r\n");
      out.write("                    } else pre = currentPage - 1\r\n");
      out.write("                    var prePage = '<li> <a href=\"javascript:up(' + pageType + ',' + pre + ',5)\">上一页</a> </li>'\r\n");
      out.write("                    list += firstPage\r\n");
      out.write("                    list += prePage\r\n");
      out.write("                    for (var i = 1; i <= data.totalPage; i++) {\r\n");
      out.write("                        // alert(Type)\r\n");
      out.write("                        if (data.currentPage == i) {\r\n");
      out.write("                            var li = '<li  ><a  style=\"background-color: #459d3e\" href = \"javascript:up(' + pageType + ',' + i + ',5)\">' + i + '</a></li>'\r\n");
      out.write("\r\n");
      out.write("                        } else {\r\n");
      out.write("                            var li = '<li><a href = \"javascript:up(' + pageType + ',' + i + ',5)\">' + i + '</a></li>'\r\n");
      out.write("                        }\r\n");
      out.write("                        list += li;\r\n");
      out.write("                    }\r\n");
      out.write("                    if (data.currentPage == data.totalPage) {\r\n");
      out.write("                        var last = data.totalPage\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    } else var last = data.currentPage + 1\r\n");
      out.write("                    var lastPage = '<li> <a href=\"javascript:up(' + pageType + ',' + last + ',5)\">下一页</a> </li>'\r\n");
      out.write("\r\n");
      out.write("                    var nextPage = '<li> <a href=\"javascript:up(' + pageType + ',' + data.totalPage + ',5)\">尾页</a> </li>'\r\n");
      out.write("                    list += lastPage\r\n");
      out.write("                    list += nextPage\r\n");
      out.write("                    $(\"#list\").html(list)\r\n");
      out.write("                    var list2 = \"\";\r\n");
      out.write("                    for (var j = 0; j < data.list.length; j++) {\r\n");
      out.write("                        var article = data.list[j]\r\n");
      out.write("                        var username = data.list[j].username\r\n");
      out.write("                        var articleName = data.list[j].articleName\r\n");
      out.write("                        var type = data.list[j].type\r\n");
      out.write("                        var li2 = ' <tr>\\n' +\r\n");
      out.write("                            ' <td> ' + ((currentPage - 1) * 5 + j + 1) + ' </td>\\n ' +\r\n");
      out.write("                            '<td>' + article.articleName + '</td>\\n' +\r\n");
      out.write("                            '<td>' + article.username + '</td>\\n' +\r\n");
      out.write("                            '<td>' + article.type + '</td>' +\r\n");
      out.write("                            ' <td>' +\r\n");
      out.write("                            ' <a href=\"ShowArticleServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">查看</a>' +\r\n");
      out.write("                            '  <a href=\"GetArticleServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">修改</a>' +\r\n");
      out.write("                            '  <a href=\"javascript:del(&quot;' + username + '&quot;,&quot;' + articleName + '&quot;,&quot;' + type + '&quot;)\" style=\"text-decoration: none;color: red\">删除</a>' +\r\n");
      out.write("                            '  <a href=\"DownLoadServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">下载</a>' +\r\n");
      out.write("                            '</td>' +\r\n");
      out.write("                            '</tr>';\r\n");
      out.write("                        list2 += li2\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                    $(\"#tb\").html(list2)\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("        function select(pageType, currentPage, pageSize) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"get\",\r\n");
      out.write("                url: \"PersonalSelectServlet\",\r\n");
      out.write("                data: {\r\n");
      out.write("                    \"currentPage\": currentPage,\r\n");
      out.write("                    \"pageSize\": pageSize,\r\n");
      out.write("                    \"pageType\": pageType,\r\n");
      out.write("                },\r\n");
      out.write("                success: function (data) {\r\n");
      out.write("                    $(\"#totalPage\").html(data.totalPage)\r\n");
      out.write("                    $(\"#totalCount\").html(data.totalCount)\r\n");
      out.write("                    var list = \"\";\r\n");
      out.write("                    var firstPage = '<li> <a href=\"javascript:select('+pageType+',1,5)\">首页</a> </li>'\r\n");
      out.write("                    if( data.currentPage==1){\r\n");
      out.write("                        var pre=1\r\n");
      out.write("                    }\r\n");
      out.write("                    else  pre=currentPage-1\r\n");
      out.write("                    var prePage = '<li> <a href=\"javascript:select('+pageType+','+pre+',5)\">上一页</a> </li>'\r\n");
      out.write("                    list += firstPage\r\n");
      out.write("                    list += prePage\r\n");
      out.write("                    for (var i = 1; i <= data.totalPage; i++) {\r\n");
      out.write("                        // alert(Type)\r\n");
      out.write("                        if(data.currentPage==i){\r\n");
      out.write("                            var li = '<li  ><a  style=\"background-color: #459d3e\" href = \"javascript:select('+pageType+','+i+',5)\">' + i + '</a></li>'\r\n");
      out.write("\r\n");
      out.write("                        }else {var li = '<li><a href = \"javascript:select('+pageType+','+i+',5)\">' + i + '</a></li>'\r\n");
      out.write("                        }\r\n");
      out.write("                        list += li;\r\n");
      out.write("                    }\r\n");
      out.write("                    if( data.currentPage==data.totalPage){\r\n");
      out.write("                        var last=data.totalPage\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                    else  last=data.currentPage+1\r\n");
      out.write("                    var lastPage = '<li> <a href=\"javascript:select('+pageType+','+last+',5)\">下一页</a> </li>'\r\n");
      out.write("\r\n");
      out.write("                    var nextPage = '<li> <a href=\"javascript:select('+pageType+','+data.totalPage+',5)\">尾页</a> </li>'\r\n");
      out.write("                    list += lastPage\r\n");
      out.write("                    list += nextPage\r\n");
      out.write("                    $(\"#list\").html(list)\r\n");
      out.write("                    var list2 = \"\";\r\n");
      out.write("                    for (var j = 0; j < data.list.length; j++) {\r\n");
      out.write("                        var article=data.list[j]\r\n");
      out.write("                        var li2 = ' <tr>\\n'+\r\n");
      out.write("                            ' <td> '+ ((currentPage-1)*5+j+1)+' </td>\\n '+\r\n");
      out.write("                            '<td>'+ article.articleName+'</td>\\n'+\r\n");
      out.write("                            '<td>'+ article.username+ '</td>\\n'+\r\n");
      out.write("                            '<td>'+ article.type+ '</td>'+\r\n");
      out.write("                            ' <td>'+\r\n");
      out.write("                            ' <a href=\"ShowArticleServlet?username='+data.list[j].username+'&articleName='+data.list[j].articleName+'&type='+data.list[j].type+'\" style=\"text-decoration: none\">查看</a>'+\r\n");
      out.write("                            '  <a href=\"GetArticleServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">修改</a>' +\r\n");
      out.write("                            '  <a href=\"javascript:del(&quot;' + data.list[j].username + '&quot;,&quot;' + data.list[j].articleName + '&quot;,&quot;' + data.list[j].type + '&quot;)\" style=\"text-decoration: none;color: red\">删除</a>' +\r\n");
      out.write("                            '  <a href=\"DownLoadServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">下载</a>' +\r\n");
      out.write("                            '</td>'+\r\n");
      out.write("                            '</tr>';\r\n");
      out.write("                        list2+=li2\r\n");
      out.write("\r\n");
      out.write("                    }\r\n");
      out.write("                    $(\"#tb\").html(list2)\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        $(function () {\r\n");
      out.write("            {if (\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.PersonalArticleSelect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==0){\r\n");
      out.write("                up(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.personalType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.personalCurrent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\", 5)\r\n");
      out.write("            }else {\r\n");
      out.write("                select(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.personalType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write(',');
      out.write('"');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.personalCurrent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\", 5)\r\n");
      out.write("            }\r\n");
      out.write("                $(\"#se\").click(\r\n");
      out.write("                    function ()\r\n");
      out.write("                    {\r\n");
      out.write("                        {var pageType=$(\"#in\").val();\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                                type: \"get\",\r\n");
      out.write("                                    url: \"PersonalSelectServlet\",\r\n");
      out.write("                                data: {\r\n");
      out.write("                                    \"currentPage\": 1,\r\n");
      out.write("                                    \"pageSize\": 5,\r\n");
      out.write("                                    \"pageType\": $(\"#in\").val(),\r\n");
      out.write("                                },\r\n");
      out.write("                                success: function (data) {\r\n");
      out.write("                                    $(\"#totalPage\").html(data.totalPage)\r\n");
      out.write("                                    $(\"#totalCount\").html(data.totalCount)\r\n");
      out.write("                                    var list = \"\";\r\n");
      out.write("                                    var firstPage = '<li> <a href=\"javascript:select('+pageType+',1,5)\">首页</a> </li>'\r\n");
      out.write("                                    if( data.currentPage==1){\r\n");
      out.write("                                        var pre=1\r\n");
      out.write("                                    }\r\n");
      out.write("                                    else  pre=currentPage-1\r\n");
      out.write("                                    var prePage = '<li> <a href=\"javascript:select('+pageType+','+pre+',5)\">上一页</a> </li>'\r\n");
      out.write("                                    list += firstPage\r\n");
      out.write("                                    list += prePage\r\n");
      out.write("                                    for (var i = 1; i <= data.totalPage; i++) {\r\n");
      out.write("                                        // alert(Type)\r\n");
      out.write("                                        if(data.currentPage==i){\r\n");
      out.write("                                            var li = '<li  ><a  style=\"background-color: #459d3e\" href = \"javascript:select('+pageType+','+i+',5)\">' + i + '</a></li>'\r\n");
      out.write("\r\n");
      out.write("                                        }else {var li = '<li><a href = \"javascript:select('+pageType+','+i+',5)\">' + i + '</a></li>'\r\n");
      out.write("                                        }\r\n");
      out.write("                                        list += li;\r\n");
      out.write("                                    }\r\n");
      out.write("                                    if( data.currentPage==data.totalPage){\r\n");
      out.write("                                        var last=data.totalPage\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    }\r\n");
      out.write("                                    else  last=data.currentPage+1\r\n");
      out.write("                                    var lastPage = '<li> <a href=\"javascript:select('+pageType+','+last+',5)\">下一页</a> </li>'\r\n");
      out.write("\r\n");
      out.write("                                    var nextPage = '<li> <a href=\"javascript:select('+pageType+','+data.totalPage+',5)\">尾页</a> </li>'\r\n");
      out.write("                                    list += lastPage\r\n");
      out.write("                                    list += nextPage\r\n");
      out.write("                                    $(\"#list\").html(list)\r\n");
      out.write("                                    var list2 = \"\";\r\n");
      out.write("                                    for (var j = 0; j < data.list.length; j++) {\r\n");
      out.write("                                        var article=data.list[j]\r\n");
      out.write("                                        var li2 = ' <tr>\\n'+\r\n");
      out.write("                                            ' <td> '+ ((data.currentPage-1)*5+j+1)+' </td>\\n '+\r\n");
      out.write("                                            '<td>'+ article.articleName+'</td>\\n'+\r\n");
      out.write("                                            '<td>'+ article.username+ '</td>\\n'+\r\n");
      out.write("                                            '<td>'+ article.type+ '</td>'+\r\n");
      out.write("                                            ' <td>'+\r\n");
      out.write("                                            ' <a href=\"ShowArticleServlet?username='+data.list[j].username+'&articleName='+data.list[j].articleName+'&type='+data.list[j].type+'\" style=\"text-decoration: none\">查看</a>'+\r\n");
      out.write("                                            '  <a href=\"GetArticleServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">修改</a>' +\r\n");
      out.write("                                            '  <a href=\"javascript:del(&quot;' + data.list[j].username + '&quot;,&quot;' + data.list[j].articleName + '&quot;,&quot;' + data.list[j].type + '&quot;)\" style=\"text-decoration: none;color: red\">删除</a>' +\r\n");
      out.write("                                            '  <a href=\"DownLoadServlet?username=' + data.list[j].username + '&articleName=' + data.list[j].articleName + '&type=' + data.list[j].type + '\" style=\"text-decoration: none\">下载</a>' +\r\n");
      out.write("                                            '</td>'+\r\n");
      out.write("                                            '</tr>';\r\n");
      out.write("                                        list2+=li2\r\n");
      out.write("\r\n");
      out.write("                                    }\r\n");
      out.write("                                    $(\"#tb\").html(list2)\r\n");
      out.write("                                }\r\n");
      out.write("\r\n");
      out.write("                            })}\r\n");
      out.write("                        // else  return false\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                )\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("        )\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row-fluid\">\r\n");
      out.write("        <div class=\"span12\">\r\n");
      out.write("            <div class=\"row-fluid\">\r\n");
      out.write("                <div class=\"span10\" style=\"width: 100%\">\r\n");
      out.write("                    <div class=\"navbar navbar-inverse\">\r\n");
      out.write("                        <div class=\"navbar-inner\">\r\n");
      out.write("                            <div class=\"container-fluid\">\r\n");
      out.write("                                <a class=\"btn btn-navbar\" data-target=\".navbar-responsive-collapse\"\r\n");
      out.write("                                   data-toggle=\"collapse\"></a> <a class=\"brand\" href=\"#\" style=\"pointer-events: none\"\r\n");
      out.write("                            >个人文章</a>\r\n");
      out.write("                                <div class=\"nav-collapse collapse navbar-responsive-collapse\">\r\n");
      out.write("                                    <ul class=\"nav\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(1,1,5)\" id=\"1\">议论文</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(2,1,5)\" id=\"2\">散文</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(3,1,5)\" id=\"3\">说明文</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(4,1,5)\" id=\"4\">记叙文</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(5,1,5)\" id=\"5\">小说</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(6,1,5)\" id=\"6\">诗歌</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"javascript:up(7,1,5)\" id=\"7\">应用文</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        </li>--%>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <ul class=\"nav pull-right\">\r\n");
      out.write("                                        </li>--%>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <div class=\"span2\" style=\"width: 300px\">\r\n");
      out.write("                                                <form class=\"form-search\"\r\n");
      out.write("                                                      style=\"margin: 0 0 20px; margin-left: 0;margin-top: 8px;width: 300px;margin-left: 24px;\">\r\n");
      out.write("                                                    <input class=\"input-medium search-query\" type=\"text\"\r\n");
      out.write("                                                           style=\"width: 180px\" id=\"in\"/>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn\" style=\"margin-left: 220px ;margin-top: -50px\"  id=\"se\">查找\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <table class=\"table table-hover table-striped\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        编号\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        文章名\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        作者\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        类型\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        操作\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody id=\"tb\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div class=\"row-fluid\" style=\"position: absolute;top: 500px;left: -5px;\">\r\n");
      out.write("                <div class=\"span12\">\r\n");
      out.write("                    <div class=\"pagination pagination-centered\">\r\n");
      out.write("                        <span><h3>共<span id=\"totalPage\"></span>页<span id=\"totalCount\"></span>篇</h3> </span>\r\n");
      out.write("                        <ul id=\"list\">\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
