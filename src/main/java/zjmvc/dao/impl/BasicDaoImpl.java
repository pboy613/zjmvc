/*
 * copyright
 */
package zjmvc.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import zjmvc.dao.BasicDao;

/**
 * 
 * 
 * @author jun
 *
 */
@Repository("baseDao")
public class BasicDaoImpl extends SqlSessionDaoSupport implements BasicDao {

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	protected <S> S getMapper(Class<S> clazz) {
        return getSqlSession().getMapper(clazz);
    }
	@Override
	public <T> T selectOne(String statement) {
		return getSqlSession().selectOne(statement);
	}

	@Override
	public <T> T selectOne(String statement, Object parameter) {
		return getSqlSession().selectOne(statement, parameter);
	}

	@Override
	public <E> List<E> selectList(String statement) {
		return getSqlSession().selectList(statement);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter) {
		return getSqlSession().selectList(statement, parameter);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
		return getSqlSession().selectList(statement, parameter, rowBounds);
	}

	@Override
	public int insert(String statement) {
		return getSqlSession().insert(statement);
	}

	@Override
	public int insert(String statement, Object parameter) {
		return getSqlSession().insert(statement, parameter);
	}

	@Override
	public int update(String statement) {
		return getSqlSession().update(statement);
	}

	@Override
	public int update(String statement, Object parameter) {
		return getSqlSession().update(statement);
	}

	@Override
	public int delete(String statement) {
		return getSqlSession().delete(statement);
	}

	@Override
	public int delete(String statement, Object parameter) {
		return getSqlSession().delete(statement, parameter);
	}

}
