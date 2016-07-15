package com.mr.site.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mr.site.service.ISiteService;
import com.mr.site.service.impl.SiteService;

import net.sf.json.JSONArray;

/**
 * 网址的servlet
 * 
 * @author gaohailong
 *
 */
@WebServlet("/SiteServlet")
public class SiteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ISiteService iSiteService = new SiteService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> siteName = iSiteService.getSiteNameData(1);
		JSONArray jsonArray = JSONArray.fromObject(siteName);
		response.getWriter().print(jsonArray);
	}

}
