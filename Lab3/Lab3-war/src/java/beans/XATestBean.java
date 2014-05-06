/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import myPackageLab3.Table1;
import myPackageLab3.Table1FacadeLocal;
import myPackageLab3.Table2;
import myPackageLab3.Table2FacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;

/**
 *
 * @author USER
 */
@Named(value = "xATestBean")
@SessionScoped
@Stateful
public class XATestBean implements Serializable {

    /**
     * Creates a new instance of XATestBean
     */
    @EJB
    private Table2FacadeLocal t2;
    
    @EJB
    private Table1FacadeLocal t1;
    
    private List<Table1> tables1;
    private List<Table2> tables2;
    private String name;
    private Integer id;
    
    public XATestBean() {
    }
    
    @PostConstruct
    public void refresh()
    {
        setTables1(getT1().findAll());
        setTables2(getT2().findAll());
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String normal()
    {
        Table1 tt1 = new Table1();
        Table2 tt2 = new Table2();
        tt1.setName(name);
        tt2.setName(name);
        getT1().create(tt1);
        getT2().create(tt2);
        refresh();
        return "index.xhtml";
    }
    public String test1()
    {
        Table1 tt1 = new Table1();
        Table2 tt2 = new Table2();
        tt1.setName(name);
        tt2.setName(name);
        getT2().editForTest1_3(tt2);
        getT1().edit(tt1);
        refresh();
        return "index.xhtml";
    }
    public String test2()
    {
        Table1 tt1 = new Table1();
        Table2 tt2 = new Table2();
        tt1.setName(name);
        tt2.setName(name);
        getT2().edit(tt2);
        getT1().editForTest2_4(tt1);
        refresh();
        return "index.xhtml";
    }
    public String test3()
    {
        Table1 tt1 = new Table1();
        Table2 tt2 = new Table2();
        tt1.setName(name);
        tt2.setName(name);
        getT2().editForTest1_3(tt2);
        getT1().editForTest3(tt1);
        refresh();
        return "index.xhtml";
    }
    public String test4()
    {
        Table1 tt1 = new Table1();
        Table2 tt2 = new Table2();
        tt1.setName(name);
        tt2.setName(name);
        getT2().editForTest4(tt2);
        getT1().editForTest2_4(tt1);
        refresh();
        return "index.xhtml";
    }

    /**
     * @return the t2
     */
    public Table2FacadeLocal getT2() {
        return t2;
    }

    /**
     * @param t2 the t2 to set
     */
    public void setT2(Table2FacadeLocal t2) {
        this.t2 = t2;
    }

    /**
     * @return the t1
     */
    public Table1FacadeLocal getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(Table1FacadeLocal t1) {
        this.t1 = t1;
    }

    /**
     * @return the tables1
     */
    public List<Table1> getTables1() {
        return tables1;
    }

    /**
     * @param tables1 the tables1 to set
     */
    public void setTables1(List<Table1> tables1) {
        this.tables1 = tables1;
    }

    /**
     * @return the tables2
     */
    public List<Table2> getTables2() {
        return tables2;
    }

    /**
     * @param tables2 the tables2 to set
     */
    public void setTables2(List<Table2> tables2) {
        this.tables2 = tables2;
    }
    
}
