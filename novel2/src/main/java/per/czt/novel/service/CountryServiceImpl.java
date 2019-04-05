package per.czt.novel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.CountryDao;
import per.czt.novel.domain.Country;

@Service("countryService")
public class CountryServiceImpl implements CountryService {
	@Resource
	private CountryDao countryDao;

	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	@Override
	public List<Country> searchCountry(Map map) {
		// TODO Auto-generated method stub
		return countryDao.searchCountry(map);
	}
	
	

}
