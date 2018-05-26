package com.demohot.transcript.mapper;

import java.util.List;

import com.demohot.transcript.model.Card;

public interface CardMapper {

	void insert(Card card);

	List<Card> list();

	void update(Card card);

	void delete(Card card);

	Card get(int id);
	
}
