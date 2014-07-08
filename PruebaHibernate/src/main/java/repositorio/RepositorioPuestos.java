/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositorio;


import java.util.List;
import modelo.Puesto;
import org.hibernate.Query;
import org.hibernate.Session;
import utilidades.HibernateUtil;

/**
 *
 * @author luis
 */
public class RepositorioPuestos {
    
    public  List<Puesto> get(){
        
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        
        Query consulta=sesion.createQuery("from Puesto");
        List<Puesto> lista=consulta.list();
        
        sesion.close();
        return lista;
        
    }
    public Puesto get(Integer id){
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        
        Puesto pues=(Puesto) sesion.get(Puesto.class, id);
        
        sesion.close();
        return pues;
    
    }
    
    public Puesto add(Puesto p){
         
        Session sesion=HibernateUtil.getSessionFactory().openSession();
      sesion.beginTransaction();
         sesion.save(p);
       sesion.getTransaction().commit();
       sesion.close();
       return p;
        
    }
    
    public void delete(Puesto p){
     Session sesion=HibernateUtil.getSessionFactory().openSession();
     sesion.beginTransaction();
    sesion.delete(p);
     sesion.getTransaction().commit();
     sesion.close();
    }
    public void update(Puesto p){
     Session sesion=HibernateUtil.getSessionFactory().openSession();
     sesion.beginTransaction();
        try {
            sesion.update(p);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
        }
    sesion.getTransaction().commit();
    sesion.close();
    }
    
}
