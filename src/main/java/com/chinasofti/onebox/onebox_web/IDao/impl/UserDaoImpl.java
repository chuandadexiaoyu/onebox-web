package com.chinasofti.onebox.onebox_web.IDao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.chinasofti.onebox.onebox_web.IDao.UserDao;
import com.chinasofti.onebox.onebox_web.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private SqlSession sqlSession;

	public int deleteByPrimaryKey(Integer id) {
		return sqlSession.delete("deleteByPrimaryKey", id);
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer id) {
		return (User) sqlSession.selectOne("selectByPrimaryKey", id);
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
