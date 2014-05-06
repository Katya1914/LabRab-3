/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPackageLab3;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ekaterina
 */
@Local
public interface Table1FacadeLocal {

    void create(Table1 table1);

    void edit(Table1 table1);

    void remove(Table1 table1);

    Table1 find(Object id);

    List<Table1> findAll();

    List<Table1> findRange(int[] range);

    int count();
    
    void editForTest2_4(Table1 table1);
    
    void editForTest3(Table1 table1);
    
}
