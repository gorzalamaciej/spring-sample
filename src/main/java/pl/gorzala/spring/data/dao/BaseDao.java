package pl.gorzala.spring.data.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import pl.gorzala.spring.data.dto.BaseDto;

public interface BaseDao<T extends BaseDto> {

  Session getCurrentSession();

  Criteria createCriteria();

  void saveOrUpdate(T dto);

  void flush();
}
