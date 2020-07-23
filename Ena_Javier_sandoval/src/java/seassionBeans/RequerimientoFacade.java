/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seassionBeans;

import entities.Requerimiento;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javie
 */
@Stateless
public class RequerimientoFacade extends AbstractFacade<Requerimiento> {
    @PersistenceContext(unitName = "Ena_Javier_sandovalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RequerimientoFacade() {
        super(Requerimiento.class);
    }
    
}
