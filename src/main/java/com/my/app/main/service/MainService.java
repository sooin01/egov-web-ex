package com.my.app.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.app.common.dao.model.Board;
import com.my.app.main.dao.MainDao;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;

	public List<Board> getMain() {
		return mainDao.getMain();
	}

}
