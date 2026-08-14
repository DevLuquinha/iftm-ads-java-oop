package web.springwithweb.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String name;

    private String cpf;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String priorityGroup;

    private Boolean hasAllergy;

    private Boolean hasComorbidities;

    private String bloodType;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPriorityGroup() {
        return priorityGroup;
    }

    public void setPriorityGroup(String priorityGroup) {
        this.priorityGroup = priorityGroup;
    }

    public Boolean getHasAllergy() {
        return hasAllergy;
    }

    public void setHasAllergy(Boolean hasAllergy) {
        this.hasAllergy = hasAllergy;
    }

    public Boolean getHasComorbidities() {
        return hasComorbidities;
    }

    public void setHasComorbidities(Boolean hasComorbidities) {
        this.hasComorbidities = hasComorbidities;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Person [code=" + code + ", name=" + name + ", cpf=" + cpf + ", birthDate=" + birthDate
                + ", priorityGroup=" + priorityGroup + ", hasAllergy=" + hasAllergy + ", hasComorbidities="
                + hasComorbidities + ", bloodType=" + bloodType + "]";
    }
}
