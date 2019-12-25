package com.bway.springproject;

import java.io.IOException;

import org.jsoup.Jsoup;

public class Test {
	
	public static void main(String[] args) throws IOException {

     String webPage = "https://www.google.com";
	// String webPage=	"https://nepalihotels.com";
        
        String html = Jsoup.connect(webPage).get().html();
        
        System.out.println(html);
    }

}
