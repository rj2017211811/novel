package per.czt.novel.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("provinceDao")
public class ProvinceDaoImpl extends SqlSessionDaoSupport  implements ProvinceDao {

}
