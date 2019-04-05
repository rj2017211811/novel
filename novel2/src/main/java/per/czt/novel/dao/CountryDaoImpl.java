package per.czt.novel.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.novel.domain.Country;

@Repository("countryDao")
public class CountryDaoImpl extends SqlSessionDaoSupport implements CountryDao {

	@Override
	public List<Country> searchCountry(Map map) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("per.czt.novel.domain.searchCountry", map);
	}

}
