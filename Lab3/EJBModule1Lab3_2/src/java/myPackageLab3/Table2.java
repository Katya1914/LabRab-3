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
@Table(name = "Table2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Table2.findAll", query = "SELECT t FROM Table2 t"),
    @NamedQuery(name = "Table2.findByIdTable2", query = "SELECT t FROM Table2 t WHERE t.idTable2 = :idTable2"),
    @NamedQuery(name = "Table2.findByName", query = "SELECT t FROM Table2 t WHERE t.name = :name")})
public class Table2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTable2")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTable2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name")
    private String name;

    public Table2() {
    }

    public Table2(Integer idTable2) {
        this.idTable2 = idTable2;
    }

    public Table2(Integer idTable2, String name) {
        this.idTable2 = idTable2;
        this.name = name;
    }

    public Integer getIdTable2() {
        return idTable2;
    }

    public void setIdTable2(Integer idTable2) {
        this.idTable2 = idTable2;
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
        hash += (idTable2 != null ? idTable2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Table2)) {
            return false;
        }
        Table2 other = (Table2) object;
        if ((this.idTable2 == null && other.idTable2 != null) || (this.idTable2 != null && !this.idTable2.equals(other.idTable2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackageLab3.Table2[ idTable2=" + idTable2 + " ]";
    }
    
}
