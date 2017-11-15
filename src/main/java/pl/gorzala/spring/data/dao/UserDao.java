package pl.gorzala.spring.data.dao;

import pl.gorzala.spring.data.dto.User;

public interface UserDao extends BaseDao<User>  {

  User findByUserName(String userName);

}
