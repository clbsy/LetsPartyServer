package com.letsparty.weixin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.letsparty.weixin.utils.Constants;
import com.letsparty.weixin.utils.SignUtil;

/**
 * 
 * @author mengce
 * response the request from weixin server
 */

public class WeixinServlet extends HttpServlet {
	private static final long serialVersionUID = -1870299368520775989L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String signature = request.getParameter(Constants.SIGNATURE);
		String timestamp = request.getParameter(Constants.TIMESTAMP);
		String nonce = request.getParameter(Constants.NONCE);
		String echostr = request.getParameter(Constants.ECHOSTR);
		
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature("Token", signature,
				timestamp, nonce)) {
			out.print(echostr);
		}
		out.close();
		
	}
	/**
	 * 处理微信服务器发来的消息
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		// 将请求、响应的编码均设置为UTF-8（防止中文乱码）
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		WechatService wechatService = new WechatService();
		// 调用核心业务类接收消息、处理消息
		String respMessage = wechatService.coreService(request);
		// 响应消息
		PrintWriter out = response.getWriter();
		out.print(respMessage);
		out.close();
	}
}
