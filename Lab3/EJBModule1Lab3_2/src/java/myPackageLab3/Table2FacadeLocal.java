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
public interface Table2FacadeLocal {

    void create(Table2 table2);

    void edit(Table2 table2);

    void remove(Table2 table2);

    Table2 find(Object id);

    List<Table2> findAll();

    List<Table2> findRange(int[] range);

    int count();
    
    void editForTest1_3(Table2 table2);
    
    void editForTest4(Table2 table2);
    
}
