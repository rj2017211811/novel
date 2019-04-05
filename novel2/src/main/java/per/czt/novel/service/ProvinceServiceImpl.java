package per.czt.novel.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.novel.dao.ProvinceDao;

@Service("provinceDao")
public class ProvinceServiceImpl implements ProvinceService {
	@Resource
	private ProvinceDao provinceDao;

	public ProvinceDao getProvinceDao() {
		return provinceDao;
	}

	public void setProvinceDao(ProvinceDao provinceDao) {
		this.provinceDao = provinceDao;
	}
	
}
