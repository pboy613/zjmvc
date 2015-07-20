package zjmvc.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface BasicDao {
	<T> T selectOne(String statement);

	<T> T selectOne(String statement, Object parameter);

	<E> List<E> selectList(String statement);

	<E> List<E> selectList(String statement, Object parameter);

	<E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds);

	int insert(String statement);

	int insert(String statement, Object parameter);

	int update(String statement);

	int update(String statement, Object parameter);

	int delete(String statement);

	int delete(String statement, Object parameter);

}
