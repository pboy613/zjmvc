package zjmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import zjmvc.dao.BasicDao;
import zjmvc.service.BasicService;

@Service("basicService")
public class BasicServiceImpl implements BasicService {
	@Resource
	BasicDao basicDao;

	@Override
	public <T> T selectOne(String statement) {
		return basicDao.selectOne(statement);
	}

	@Override
	public <T> T selectOne(String statement, Object parameter) {
		return basicDao.selectOne(statement, parameter);
	}

	@Override
	public <E> List<E> selectList(String statement) {
		return basicDao.selectList(statement);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter) {

		return basicDao.selectList(statement, parameter);
	}

	@Override
	public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
		return basicDao.selectList(statement);
	}

	@Override
	public int insert(String statement) {
		return basicDao.insert(statement);
	}

	@Override
	public int insert(String statement, Object parameter) {
		return basicDao.insert(statement, parameter);
	}

	@Override
	public int update(String statement) {
		return basicDao.update(statement);
	}

	@Override
	public int update(String statement, Object parameter) {
		return basicDao.update(statement, parameter);
	}

	@Override
	public int delete(String statement) {
		return basicDao.delete(statement);
	}

	@Override
	public int delete(String statement, Object parameter) {
		return basicDao.delete(statement, parameter);
	}

}
