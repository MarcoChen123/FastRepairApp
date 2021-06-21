package com.chengquan.framework.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 去除HTML标记,主要用于请求返会数据的处�?
 * 
 * @author NapoleonBai
 *
 */
public class HTMLSpirit {

	private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式
	private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式
	private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式

	public static String delHTMLTag(String htmlStr) {
		Pattern p_script = Pattern.compile(regEx_script,
				Pattern.CASE_INSENSITIVE);
		Matcher m_script = p_script.matcher(htmlStr);
		htmlStr = m_script.replaceAll(""); // 过滤SCRIPT标签
		
		Pattern p_style = Pattern
				.compile(regEx_style, Pattern.CASE_INSENSITIVE);
		Matcher m_style = p_style.matcher(htmlStr);
		htmlStr = m_style.replaceAll(""); // 过滤STYLE标签

		Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
		Matcher m_html = p_html.matcher(htmlStr);
		htmlStr = m_html.replaceAll(""); // 过滤HTML标签

		htmlStr = htmlStr.replace("&lt;", "<");
		htmlStr = htmlStr.replace("&gt;", ">");
		htmlStr = htmlStr.replaceAll("&amp;nbsp;", "");  
		htmlStr = htmlStr.replaceAll("\\<br[^>]*>(?i)", "\n");  
		htmlStr = htmlStr.replaceAll("<p>", "\t");  
		htmlStr = htmlStr.replaceAll("</p>", "\n");  
//		htmlStr = htmlStr.replaceAll("<p>", "");  
//		htmlStr = htmlStr.replaceAll("</p>", "");  
		htmlStr = htmlStr.replaceAll("<br>", "\n");  
		htmlStr = htmlStr.replaceAll("</br>", "\n");  
		htmlStr = htmlStr.replaceAll("<br/>", "\n");   
		htmlStr = htmlStr.replaceAll("<br />", "\n");   
		
		return htmlStr.trim(); // 返回文本字符�?
	}
	
	public static String RemoveHtml(String html) {
		if (html == null) {
			return "";
		}
		
		while (html.contains("<") && html.contains(">")) {
			
			html = html.substring(0, html.indexOf("<")) + html.substring(html.indexOf(">") +1);
			
		}
		
		return html;
		
	}

}