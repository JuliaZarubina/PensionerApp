package dao;

import model.Pensioner;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public interface PensionerDAO {

    Pensioner get(long id) throws HibernateException;

    long addPensioner(Pensioner pensioner) throws HibernateException;

}
