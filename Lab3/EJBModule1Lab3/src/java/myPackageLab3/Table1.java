/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myPackageLab3;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ekaterina
 */
@Entity
@Table(name = "Table1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Table1.findAll", query = "SELECT t FROM Table1 t"),
    @NamedQuery(name = "Table1.findByIdTable1", query = "SELECT t FROM Table1 t WHERE t.idTable1 = :idTable1"),
    @NamedQuery(name = "Table1.findByName", query = "SELECT t FROM Table1 t WHERE t.name = :name")})
public class Table1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTable1")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTable1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;

    public Table1() {
    }

    public Table1(Integer idTable1) {
        this.idTable1 = idTable1;
    }

    public Table1(Integer idTable1, String name) {
        this.idTable1 = idTable1;
        this.name = name;
    }

    public Integer getIdTable1() {
        return idTable1;
    }

    public void setIdTable1(Integer idTable1) {
        this.idTable1 = idTable1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTable1 != null ? idTable1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Table1)) {
            return false;
        }
        Table1 other = (Table1) object;
        if ((this.idTable1 == null && other.idTable1 != null) || (this.idTable1 != null && !this.idTable1.equals(other.idTable1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackageLab3.Table1[ idTable1=" + idTable1 + " ]";
    }
    
}
