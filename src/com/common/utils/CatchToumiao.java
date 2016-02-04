package com.common.utils;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class CatchToumiao extends BaseCatch {

	public CatchToumiao(String startUrl) {
		super(startUrl);
		// TODO Auto-generated constructor stub
		this.setSrcFormat("%s");
		this.setDefaultSrcFile("C:\\Users\\lenovo\\Desktop\\000.txt");
		this.deleteFile(this.defaultSrcFile);
		this.setDownload(false);
		this._init();
	}

	@Override
	public Element getNextGroupNode(Document doc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Element getNextPageNode(Document doc) {
		// TODO Auto-generated method stub
		try {
			Element next =  doc.getElementsByClass("pageturn").get(0)
						.getElementsByClass("thisclass").get(0)
						.nextElementSibling();
			if( next.text() != null && "下一页".equals(next.text().trim())){
				return null;
			}
			return next;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Element getPageImgeNode(Document doc) {
		// TODO Auto-generated method stub
		try {
			return doc.getElementsByClass("content").get(0).getElementsByTag("img").get(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static void main(String[] args) throws Exception {
		CatchToumiao c = new CatchToumiao("http://www.toumiao.com/dongtaitu/17021.html");
		c.doLoop();
	}

}
