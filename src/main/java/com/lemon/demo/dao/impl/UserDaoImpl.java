package com.lemon.demo.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.lemon.demo.dao.IUserDao;
import com.lemon.demo.pojo.User;

@Service("userDao")
public class UserDaoImpl implements IUserDao {

	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		SqlSession session = sqlSessionFactory.openSession();
		int result = session.insert("com.lemon.demo.mapping.UserMapper.insert", record);
		session.close();
		return result;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		SqlSession session = sqlSessionFactory.openSession();
		User user = session.selectOne("com.lemon.demo.mapping.UserMapper.selectByPrimaryKey", id);
		session.close();
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
