package com.mr.site.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mr.site.bean.CollectionType;
import com.mr.site.bean.Site;
import com.mr.site.service.ICollectionTypeService;
import com.mr.site.service.ISiteService;
import com.mr.site.service.impl.CollectionTypeService;
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
	private ICollectionTypeService iCollectionTypeService = new CollectionTypeService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		switch (method) {
		case "all":
			getAll(request, response);
			break;
		case "counter":
			counter(request, response);
			break;
		case "addSite":
			addSite(request, response);
			break;
		case "getCollectType":
			getCollectType(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * 获取所有的数据
	 */
	public void getAll(HttpServletRequest request, HttpServletResponse response) {
		List<Site> siteName = iSiteService.getSiteData();
		JSONArray jsonArray = JSONArray.fromObject(siteName);
		try {
			response.getWriter().print(jsonArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加网址
	 * 
	 * @param request
	 * @param response
	 */
	private void addSite(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String link = request.getParameter("link");
		String categeory = request.getParameter("categeory");
		iSiteService.addSite(name, link, categeory);
	}

	/**
	 * 设置点击总数
	 * 
	 * @param request
	 * @param response
	 */
	private void counter(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("id");
			iSiteService.setCounter(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获得收藏分类
	 * 
	 * @param request
	 * @param response
	 */
	private void getCollectType(HttpServletRequest request, HttpServletResponse response) {
		List<CollectionType> list = iCollectionTypeService.getAllType();
		JSONArray jsonArray = JSONArray.fromObject(list);
		try {
			response.getWriter().print(jsonArray);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
