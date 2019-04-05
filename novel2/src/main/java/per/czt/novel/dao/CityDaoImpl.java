package per.czt.novel.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("cityDao")
public class CityDaoImpl extends SqlSessionDaoSupport implements CityDao{

}
