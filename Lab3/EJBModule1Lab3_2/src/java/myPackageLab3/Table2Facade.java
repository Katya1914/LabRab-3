/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPackageLab3;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import static javax.ejb.TransactionAttributeType.REQUIRES_NEW;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ekaterina
 */
@Stateless
public class Table2Facade extends AbstractFacade<Table2> implements Table2FacadeLocal {
    @PersistenceContext(unitName = "EJBModule1Lab3_2PU")
    private EntityManager em;

    @Resource
    SessionContext sc;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Table2Facade() {
        super(Table2.class);
    }

    @Override
    public void editForTest1_3(Table2 table2) {
        sc.setRollbackOnly();
        edit(table2);
    }

    @Override
    @TransactionAttribute(value=REQUIRES_NEW)
    public void editForTest4(Table2 table2) {
        edit(table2);
    }
    
}
