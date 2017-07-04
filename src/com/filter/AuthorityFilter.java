package com.filter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.*;

import com.dao.UserDao;
import com.dao.VisitsNumDao;


@WebFilter(
	filterName = "authorityFilter", 
	urlPatterns = { "/*" }, 
	initParams = { 
			@WebInitParam(name = "encoding", value = "UTF-8"), 
			@WebInitParam(name = "loginPage", value = "index.jsp"),
			@WebInitParam(name = "ignores", value = "jpg,html,htm,js,css,png")
		})

public class AuthorityFilter implements Filter {
	
	private Set<String> ignores = new HashSet<String>();  //ֻ�г�ʼ��ʹ�ù�һ��
	private FilterConfig config;
	    // ʵ�ֳ�ʼ������
    public void init(FilterConfig fConfig) throws ServletException {
    	
    	config = fConfig;	
    	String ignoresParam = config.getInitParameter("ignores");  	    
    	String[] ignoreArray = ignoresParam.split(","); 
        for (String s : ignoreArray) {  
            ignores.add(s);
        }
    }

    // ʵ�ֹ��˷���
    public void doFilter(ServletRequest request, ServletResponse response, 
    		FilterChain chain) throws IOException, ServletException {
      
	   // ��ȡ�ù����������ò���
       //String encoding = config.getInitParameter("");
       // ��������request�ı����ַ���
       //request.setCharacterEncoding(encoding);
       HttpServletRequest hrequest = (HttpServletRequest)request;
       HttpSession session = hrequest.getSession(true);

       //������վ������
       SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//�������ڸ�ʽ
       String today=df.format(new Date());	
       VisitsNumDao.addVisitsNum(today);
       
       //��ȡϵͳ֪ͨ
       if(session.getAttribute("id")!=null){
    	    String id=(String) session.getAttribute("id");
    	    int unReadMsgNum=UserDao.getUnReadMsgNum(id);
    	    hrequest.setAttribute("unReadMsgNum", unReadMsgNum);
    	    chain.doFilter(request, response);
       }else{
    	   chain.doFilter(request, response);
       }
   	}
    // ʵ�����ٷ���
	public void destroy() {
	        config = null;
	     }
}
