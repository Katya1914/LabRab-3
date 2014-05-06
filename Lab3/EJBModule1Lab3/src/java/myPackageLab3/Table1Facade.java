/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPackageLab3;

import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ekaterina
 */
@Stateless
public class Table1Facade extends AbstractFacade<Table1> implements Table1FacadeLocal {
    @PersistenceContext(unitName = "EJBModule1Lab3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Table1Facade() {
        super(Table1.class);
    }

    @Override
    public void editForTest2_4(Table1 table1) {
        create(table1);
        throw new EJBException("testException");
    }

    @Override
    public void editForTest3(Table1 table1) {
        create(table1);
    }
    
}
