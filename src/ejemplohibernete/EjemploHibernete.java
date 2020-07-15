package ejemplohibernete;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gustavo
 */

public class EjemploHibernete {

    public static void main(String[] args) {
        Session session =  HibernateUtil.getSessionFactory().openSession();
        System.out.println("se conecto");
        Transaction transaction = session.beginTransaction();
        System.out.println("inicio de transaccion");
        
        Persona p = new Persona();
        p.setClave("01");
        p.setNombre("Gustavo 1");
        p.setDireccion("av 1");
        p.setTelefono("123456");
        session.save(p);
        
        transaction.commit();
        System.out.println("fin de transaccion");
        session.close();
    }
    
}
