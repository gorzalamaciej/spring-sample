package pl.gorzala.spring.data.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.gorzala.spring.data.dao.UserDao;
import pl.gorzala.spring.data.dto.User;
import pl.gorzala.spring.exception.SpringSampleException;

@Service
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

  private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

  public UserDaoImpl() {
    super(User.class);
  }

  @Override
  @Transactional
  public User findByUserName(String userName) {
    Criteria criteria = createCriteria().add(Restrictions.eq("username", userName));

    User user = (User) criteria.uniqueResult();

    if (user == null) {
      logger.error("Could not find user by name = {}", userName);
      throw new SpringSampleException("User by name not found");
    }

    return user;
  }
}
