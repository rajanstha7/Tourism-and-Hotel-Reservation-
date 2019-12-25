package com.bway.springproject.controllers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class bookingcom {
	@RequestMapping(value = "/everestmore", method = RequestMethod.GET)
	public static void main(String[] args) {
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI("https://www.booking.com/hotel/np/everest-nepal.en-gb.html?aid=356938;label=metagha-link-localuniversalNP-hotel-1517876_dev-desktop_los-1_bw-5_dow-Tuesday_defdate-1_room-0_lang-en_curr-NPR_gstadt-2_rateid-0_cid-84;sid=c63142ef9b7503313e9a080aacdabcd0;all_sr_blocks=151787601_94291995_2_2_0;checkin=2018-08-07;checkout=2018-08-08;dest_id=-1022136;dest_type=city;dist=0;group_adults=2;hapos=1;highlighted_blocks=151787601_94291995_2_2_0;hpos=1;is_swapped_image=1;room1=A%2CA;sb_price_type=total;srepoch=1533227672;srfid=ad220b975e584ac12aa3fd5a94afa7f21060b637X1;srpvid=c771748b07410192;type=total;ucfs=1&#hotelTmpl"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
