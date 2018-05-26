package com.demohot.transcript.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demohot.transcript.mapper.CardMapper;
import com.demohot.transcript.model.Card;

@Controller
public class CardController {
	@Autowired
	private CardMapper cardMapper;

	@RequestMapping("/card/detail")
	public ModelAndView detail(Integer id) {
		// Map<String, Object> kv = new HashMap<>();
		// kv.put("name", "tom");
		// kv.put("age", 18);
		// List<Integer> ls = new ArrayList<>();
		// ls.add(1);
		// ls.add(2);
		// ls.add(3);
		// kv.put("list", ls);
		// return new ModelAndView("card/detail.jsp", kv);

		Map<String, Object> kv = new HashMap<>();
		Card card = cardMapper.get(id);
		kv.put("card", card);
		return new ModelAndView("card/detail.jsp", kv);
	}

	@RequestMapping("/card/delete")
	public ModelAndView delete(Integer id) {
		Map<String, Object> kv = new HashMap<>();
		Card card = cardMapper.get(id);
		kv.put("card", card);
		return new ModelAndView("card/delete.jsp", kv);
	}

	@RequestMapping("/card/go_delete")
	@ResponseBody
	public String goDelete(Integer id) {
		Card card = new Card();
		card.setId(id);
		cardMapper.delete(card);
		return "success";
	}

	@RequestMapping("/card/list")
	public ModelAndView select(Integer id, String math, String english, String chinese) {
		ModelAndView mav = new ModelAndView("card/list.jsp");
		List<Card> list = cardMapper.list();
		mav.addObject("cardList", list);
		return mav;
	}

	@RequestMapping("/card/insert")
	public ModelAndView insert(Integer id) {
		Map<String, Object> kv = new HashMap<>();
		Card card = cardMapper.get(id);
		kv.put("card", card);
		return new ModelAndView("card/insert.jsp", kv);
	}

	@RequestMapping("/card/do_insert")
	@ResponseBody
	public String insert(String english, String math, String chinese) {
		Card card = new Card();
		card.setChinese(chinese);
		card.setEnglish(english);
		card.setMath(math);
		cardMapper.insert(card);
		return "insert success";
	}

	@RequestMapping("/card/update")
	public ModelAndView update(Integer id) {
		Map<String, Object> kv = new HashMap<>();
		Card card = cardMapper.get(id);
		kv.put("card", card);
		return new ModelAndView("card/update.jsp", kv);
	}

	@RequestMapping("/card/go_update")
	@ResponseBody
	public String update(Integer id, String english, String math, String chinese) {
		Card card = new Card();
		card.setId(id);
		card.setEnglish(english);
		card.setMath(math);
		card.setChinese(chinese);
		cardMapper.update(card);
		return "success";
	}
}