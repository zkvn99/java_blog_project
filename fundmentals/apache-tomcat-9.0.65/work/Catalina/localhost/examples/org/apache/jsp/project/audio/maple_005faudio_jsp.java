/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-11 19:22:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.project.audio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class maple_005faudio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/project/audio/../include/jQueryMobile.inc", Long.valueOf(1670604375000L));
    _jspx_dependants.put("/project/audio/../include/businessInfo.inc", Long.valueOf(1670786518890L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>추천 게임</title>\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"include/icon/apple-icon-57x57.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"include/icon/apple-icon-60x60.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"include/icon/apple-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"include/icon/apple-icon-76x76.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"include/icon/apple-icon-114x114.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"include/icon/apple-icon-120x120.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"include/icon/apple-icon-144x144.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"include/icon/apple-icon-152x152.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"include/icon/apple-icon-180x180.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"192x192\"  href=\"include/icon/android-icon-192x192.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"include/icon/favicon-32x32.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"include/icon/favicon-96x96.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"include/icon/favicon-16x16.png\">\r\n");
      out.write("<link rel=\"manifest\" href=\"include/icon/manifest.json\">\r\n");
      out.write("<meta name=\"msapplication-TileColor\" content=\"#ffffff\">\r\n");
      out.write("<meta name=\"msapplication-TileImage\" content=\"include/icon/ms-icon-144x144.png\">\r\n");
      out.write("<meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<!-- jQuery, jQuery Mobile ë¼ì´ë¸ë¬ë¦¬ ì¬ì©: CDN ë°©ì --> \n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.css\" />\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.6.4.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/mobile/1.0.1/jquery.mobile-1.0.1.min.js\"></script>\n");
      out.write("<!--\n");
      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.css\" />\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/mobile/1.3.1/jquery.mobile-1.3.1.min.js\"></script>\n");
      out.write("-->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("document.cookie = \"safeCookie1=foo; SameSite=Lax\"; \r\n");
      out.write("document.cookie = \"safeCookie2=foo\";  \r\n");
      out.write("document.cookie = \"crossCookie=bar; SameSite=None; Secure\";\r\n");
      out.write("\r\n");
      out.write("$(function() {\r\n");
      out.write("	$('ul li a').click(function() {\r\n");
      out.write("\r\n");
      out.write("		var videoTitle2 = $(this).find('div').text();	\r\n");
      out.write("		var myAudio2 = $(\"#audio2\"); \r\n");
      out.write("		myAudio2.get(0).pause();\r\n");
      out.write("		myAudio2.attr('src', \"maple/\" + videoTitle2);\r\n");
      out.write("		myAudio2.get(0).play();\r\n");
      out.write("		$(\"#audio_title2\").html(videoTitle2);\r\n");
      out.write("	});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<section data-role=\"page\">\r\n");
      out.write("\r\n");
      out.write("	<!-- 1. ��� -->\r\n");
      out.write("	<header data-role=\"header\" data-theme=\"b\">\r\n");
      out.write("		<!-- ��� Ÿ��Ʋ -->\r\n");
      out.write("		<h1>추억의 BGM 목록</h1>\r\n");
      out.write("	</header> \r\n");
      out.write("\r\n");
      out.write("	<!-- 2. ���� -->\r\n");
      out.write("	<section data-role=\"content\"> \r\n");
      out.write("	\r\n");
      out.write("		");

		String[] title     = {"리스항구", "메이플 아일랜드", "배경음악", "커닝시티", "헤네시스"};
		String[] artist    = {"메이플스토리", "메이플스토리", "메이플스토리","메이플스토리", "메이플스토리"};
		String[] file_name = {"리스항구.mp3", "메이플아일랜드.mp3", "배경음악.mp3", "커닝시티.mp3", "헤네시스.mp3"};
		String[] time      = {"04:31", "02:45", "06:16", "03:38", "02:17"};
		
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	    <!-- ��� -->\r\n");
      out.write("		<ul data-role=\"listview\" data-inset=\"true\" data-theme=\"e\"> \r\n");
      out.write("	\r\n");
      out.write("		    ");

			for (int i=0; i<title.length; i++) { 
			
      out.write("\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"#\">			\r\n");
      out.write("						<h3>");
      out.print( title[i] );
      out.write("</h3>\r\n");
      out.write("						<p>\r\n");
      out.write("							");
      out.print( artist[i] );
      out.write("<br>\r\n");
      out.write("							<div style=\"display: none\">");
      out.print( file_name[i] );
      out.write("</div>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p class=\"ui-li-aside\"><strong>");
      out.print( time[i] );
      out.write("</strong>분</p>	\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>				\r\n");
      out.write("		    ");

			}  
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>		\r\n");
      out.write("	\r\n");
      out.write("		<center>\r\n");
      out.write("		<audio id=\"audio2\" controls></audio>\r\n");
      out.write("		<p id=\"audio_title2\"></p>\r\n");
      out.write("		</center>\r\n");
      out.write("		\r\n");
      out.write("	</section> \r\n");
      out.write("\r\n");
      out.write("	<!-- 3. Ǫ�� -->\r\n");
      out.write("	<footer data-role=\"footer\" data-theme=\"a\" data-position=\"fixed\">\r\n");
      out.write("        ");
      out.write("\n");
      out.write("<h3> BGM World 서울 중랑구 묵동 1234</h3>");
      out.write("\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("	<center><a target=\"_blank\" href=\"../index.jsp\"> 돌아가기 </a></center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</section> \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
