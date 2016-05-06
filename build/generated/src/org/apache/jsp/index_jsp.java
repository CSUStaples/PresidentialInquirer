package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <title>The Presidential Enquirer</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("        <meta name=\"description\" content=\"The Presidential Enquirer\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"/> \n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"/>\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("               <img src=\"http://i1224.photobucket.com/albums/ee374/staples_josh/Presidential%20Inquirer_zpsr68cy6cq.png\" border=\"0\" alt=\" photo Presidential Inquirer_zpsr68cy6cq.png\"/>\n");
      out.write("\t\t\t</header>\n");
      out.write("        \t\t\t\n");
      out.write("\t\t\t<div id=\"tabs\" >\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"index.xhtml\">Candidates</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"issues.xhtml\">Issues</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<div class=\"demParty\">\n");
      out.write("\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t<h1>Democratic Party</h1>\n");
      out.write("\t\t\t\t</header>\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"demCandidates\">\n");
      out.write("                         <sql:setDataSource\n");
      out.write("                            var=\"myDS\"\n");
      out.write("                            driver=\"com.mysql.jdbc.Driver\"\n");
      out.write("                            url=\"jdbc:mysql://pinq.cdmazu6ezgrk.us-west-2.rds.amazonaws.com:3306/PresidentialInquirer\"\n");
      out.write("                            user=\"JStaples\" password=\"whatever\"\n");
      out.write("                            />\n");
      out.write("                         <sql:query var=\"listCandidates\"   dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myDS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                             SELECT * FROM Candidates;\n");
      out.write("                         </sql:query>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<div class=\"repParty\">\n");
      out.write("\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t<h1>Republican Party</h1>\n");
      out.write("\t\t\t\t</header>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"repCandidates\">\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<div id=\"repList\">\n");
      out.write("\t\t\t\t\t<!-- database calls being commented out here *different design having trouble having a row of 3\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<?php foreach ($repCandidate as $repCandidate) : ?>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td><?php echo $repCandidateImg['repCandidateImg']; ?></td>\n");
      out.write("\t\t\t\t\t\t\t<td><?php echo $repCandidate['repCandidate']; ?></td>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<?php endforeach; ?> commenting DB data\n");
      out.write("\t\t\t\t\t</table>\t-->\n");
      out.write("\t\t\t\t\t<!--- The following is for testing purposes only -->\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th><img src=\"images/tedcruz.jpg\"  alt=\"Cruz\"></th>\n");
      out.write("\t\t\t\t\t\t\t<th><img src=\"images/Kasich16.jpg\" alt=\"Kasich\"></th>\n");
      out.write("\t\t\t\t\t\t\t<th><img src=\"images/trump.jpg\" alt=\"Trump\"></th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>Ted Cruz</td>\n");
      out.write("\t\t\t\t\t\t\t<td>John Kasich</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Donald Trump</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<div class=\"otherParty\">\n");
      out.write("\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t<h1>Other Party</h1>\n");
      out.write("\t\t\t\t</header>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"otherCandidates\">\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<div id=\"otherList\">\n");
      out.write("\t\t\t\t\t<!-- database calls being commented out here *different design having trouble having a row of 3\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<?php foreach ($otherCandidate as $otherCandidate) : ?>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td><?php echo $otherCandidateImg['otherCandidateImg']; ?></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td><?php echo $otherCandidate['otherCandidate']; ?></td>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<?php endforeach; ?> commenting DB data\n");
      out.write("\t\t\t\t\t</table>\t-->\n");
      out.write("\t\t\t\t\t<!--- The following is for testing purposes only -->\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th><img src=\"images/JohnMcAfee.jpg\"  alt=\"McAfee\" style=\"width:85px;height:125px;\"></th>\n");
      out.write("\t\t\t\t\t\t\t<th><img src=\"images/garyjohnson.jpg\" alt=\"Johnson\" style=\"width:85px;height:125px;\"></th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>John McAfee</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Gary Johnson</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
