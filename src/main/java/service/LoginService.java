package service;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.Usuario;
import dao.Persona;

public class LoginService implements ILoginService{

	@Override
	public boolean authUsuario(model.Usuario usuario) {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		Transaction tx = null;
		boolean auth = false;
		
		try {
			tx = session.beginTransaction();
			Query q = session.createQuery("from Usuario where correo = :correo and contrasena = :contrasena");
			q.setString("correo", usuario.getCorreo());
			q.setString("contrasena", usuario.getContrasena());
			
			if(q.list().size() > 0) {
				Usuario user = (Usuario) q.list().get(0);
				System.out.println(user.getCorreo()+", "+user.getPersona().getNombre());
				usuario.setNombre(user.getPersona().getNombre());
				auth = true;
			}

			tx.commit();
			tx = null;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return auth;
	}

}
