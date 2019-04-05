package per.czt.novel.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.CityDao;

@Service("cityService")
public class CityServiceImpl implements CityService {
	@Resource
	private CityDao cityDao;

	public CityDao getCityDao() {
		return cityDao;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}
	

}
