package com.demohot.transcript.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.demohot.transcript.model.Card;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "classpath:app-context.xml" })
public class CardMapperTest {
	@Autowired
	private CardMapper cardMapper;

	@Test
	public void testInsert() {
		Card card = new Card();
		card.setChinese("233");
		card.setEnglish("432");
		card.setMath("233");
		cardMapper.insert(card);
	}

	@Test
	public void listTest() {
		List<Card> list = cardMapper.list();
		for (Card car : list) {
			System.out.println(car.getId() + "," + car.getChinese() + "," + car.getMath() + "," + car.getEnglish());
		}
	}

	@Test
	public void updateTest() {
		Card card = new Card();
		card.setId(1);
		card.setChinese("xxx");
		card.setEnglish("2341");
		card.setMath("32");
		cardMapper.update(card);
	}

	@Test
	public void deleteTest() {
		Card card = new Card();
		card.setId(3);
		cardMapper.delete(card);
	}

	@Test
	public void testGet() {
		Card card = cardMapper.get(1);
		String json = JSON.toJSONString(card);
		System.out.println(json);
		System.out.println(card);
	}
}