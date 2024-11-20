package pe.edu.i202211998.dominio;

import jakarta.persistence.*;

public class city {

    @Entity
    @Table(name = "city")
    public class City {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Estrategia para auto-generar PK
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false, length = 3)
        private String countryCode;

        @Column
        private String district;

        @Column
        private Integer population;

        @ManyToOne
        @JoinColumn(name = "countryCode", referencedColumnName = "code", insertable = false, updatable = false)
        private country country;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public pe.edu.i202211998.dominio.country getCountry() {
            return country;
        }

        public void setCountry(pe.edu.i202211998.dominio.country country) {
            this.country = country;
        }

        public City(Long id, String name, String countryCode, String district, Integer population, pe.edu.i202211998.dominio.country country) {
            this.id = id;
            this.name = name;
            this.countryCode = countryCode;
            this.district = district;
            this.population = population;
            this.country = country;
        }
    }



}
