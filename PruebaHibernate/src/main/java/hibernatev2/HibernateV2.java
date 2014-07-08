/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatev2;

import java.util.List;
import modelo.Puesto;
import repositorio.RepositorioPuestos;

/**
 *
 * @author luis
 */
public class HibernateV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RepositorioPuestos rp=new RepositorioPuestos();
        
        List<Puesto> l=rp.get();
        
        for (Puesto puesto : l) {
            System.out.println(puesto.getNombre());
        }
        
    }
    
}
