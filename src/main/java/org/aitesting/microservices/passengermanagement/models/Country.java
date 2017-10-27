package org.aitesting.microservices.passengermanagement.models;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer idcountry;
	private String name;

    private Set<State> states;
	
	public Country() {
		
	}

	public Integer getIdcountry() {
		return idcountry;
	}

	public void setIdcountry(Integer idcountry) {
		this.idcountry = idcountry;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
    public Set<State> getStates() {
		return states;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idcountry != null ? idcountry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.idcountry == null && other.idcountry != null) || (this.idcountry != null && !this.idcountry.equals(other.idcountry))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return name;
	}

}
