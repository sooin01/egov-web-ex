package com.my.app.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.my.app.common.dao.model.Board;

@Repository
public class MainDao {
	
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public List<Board> getMain() {
		return sqlMapClientTemplate.queryForList("main.getMainList");
	}
	
}
