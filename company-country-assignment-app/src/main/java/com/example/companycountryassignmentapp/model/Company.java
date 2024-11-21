package com.example.companycountryassignmentapp.model;
import com.example.backendcoreservice.model.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "company")
public class Company extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_id_sequence")
    @SequenceGenerator(name = "company_id_sequence", sequenceName = "company_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @JoinColumn(name = "country_id")
    @ManyToOne
    private Country country;

    @Column(name = "country_id", insertable = false, updatable = false)
    private Long countryId;

}
