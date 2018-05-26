package com.demohot.transcript.mapper;

import com.demohot.transcript.model.User;

public interface UserMapper {
	User get(int id);

	User get(String english);
	
	
}
