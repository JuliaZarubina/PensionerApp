package service;

import dao.VolunteerDAO;
import dao.VolunteerDAOImpl;
import model.Volunteer;
import org.hibernate.HibernateException;

public class VolunteerServiceImpl implements VolunteerService {

    private static final VolunteerDAO VOLUNTEER_DAO = new VolunteerDAOImpl();

    @Override
    public Volunteer getVolonter(long id) throws HibernateException {
        return null;
    }

    @Override
    public long addVolonter(Volunteer volunteer) throws HibernateException {
        return 0;
    }
}
