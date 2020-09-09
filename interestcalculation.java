/*

    Develop a interest calculation application in which user will provide all information in HTML form and that will be processed by servlet and response will be generated back to the user.

*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class interestcalculation extends HttpServlet
    {
        public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException
            {   
                response.setContentType("text/html");   
                PrintWriter out=response.getWriter();
                String principalamount=request.getParameter("principalamount");
                String rateofinterest=request.getParameter("rateofinterest");
                String numberofyear=request.getParameter("numberofyear");
            int result=((Integer.parseInt(principalamount)*Integer.parseInt(rateofinterest)*Integer.parseInt(numberofyear))/100);       
                    out.println("Simple Calculation:-" +result);
            }   
    }

web.xml

<!--Start-->
<web-app>
    <!--Write a Servlet to display parameters available on request.-->
    <servlet>
        <servlet-name>interestcalculation</servlet-name>
        <servlet-class>interestcalculation</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>interestcalculation</servlet-name>
        <url-pattern>/interestcalculation</url-pattern>
    </servlet-mapping>
</web-app>
<!--End-->