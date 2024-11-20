package pe.edu.i202211998.dominio;

import jakarta.persistence.*;

import java.util.List;

public class country {
    @Entity
    @Table(name = "country")
    public class Country {
        @Id
        @Column(length = 3) // Código ISO de país (PK)
        private String code;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String continent;

        @Column(nullable = false)
        private String region;

        @Column(nullable = false)
        private Double surfaceArea;

        @Column
        private Integer indepYear;

        @Column
        private Long population;

        @Column
        private Double lifeExpectancy;

        @Column
        private Double gnp;

        @Column(name = "gnpOld")
        private Double gnpOld;

        @Column(nullable = false)
        private String localName;

        @Column(nullable = false)
        private String governmentForm;

        @Column
        private String headOfState;

        @Column
        private Integer capital;

        @Column(length = 2, nullable = false)
        private String code2;

        @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
        private List<city.City> cities;

        @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
        private List<countrylanguage> languages;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Double getSurfaceArea() {
            return surfaceArea;
        }

        public void setSurfaceArea(Double surfaceArea) {
            this.surfaceArea = surfaceArea;
        }

        public Integer getIndepYear() {
            return indepYear;
        }

        public void setIndepYear(Integer indepYear) {
            this.indepYear = indepYear;
        }

        public Long getPopulation() {
            return population;
        }

        public void setPopulation(Long population) {
            this.population = population;
        }

        public Double getLifeExpectancy() {
            return lifeExpectancy;
        }

        public void setLifeExpectancy(Double lifeExpectancy) {
            this.lifeExpectancy = lifeExpectancy;
        }

        public Double getGnp() {
            return gnp;
        }

        public void setGnp(Double gnp) {
            this.gnp = gnp;
        }

        public Double getGnpOld() {
            return gnpOld;
        }

        public void setGnpOld(Double gnpOld) {
            this.gnpOld = gnpOld;
        }

        public String getLocalName() {
            return localName;
        }

        public void setLocalName(String localName) {
            this.localName = localName;
        }

        public String getGovernmentForm() {
            return governmentForm;
        }

        public void setGovernmentForm(String governmentForm) {
            this.governmentForm = governmentForm;
        }

        public String getHeadOfState() {
            return headOfState;
        }

        public void setHeadOfState(String headOfState) {
            this.headOfState = headOfState;
        }

        public Integer getCapital() {
            return capital;
        }

        public void setCapital(Integer capital) {
            this.capital = capital;
        }

        public String getCode2() {
            return code2;
        }

        public void setCode2(String code2) {
            this.code2 = code2;
        }

        public List<city.City> getCities() {
            return cities;
        }

        public void setCities(List<city.City> cities) {
            this.cities = cities;
        }

        public List<countrylanguage> getLanguages() {
            return languages;
        }

        public void setLanguages(List<countrylanguage> languages) {
            this.languages = languages;
        }

        public Country(String code, String name, String continent, String region, Double surfaceArea, Integer indepYear, Long population, Double lifeExpectancy, Double gnp, Double gnpOld, String localName, String governmentForm, String headOfState, Integer capital, String code2, List<city.City> cities, List<countrylanguage> languages) {
            this.code = code;
            this.name = name;
            this.continent = continent;
            this.region = region;
            this.surfaceArea = surfaceArea;
            this.indepYear = indepYear;
            this.population = population;
            this.lifeExpectancy = lifeExpectancy;
            this.gnp = gnp;
            this.gnpOld = gnpOld;
            this.localName = localName;
            this.governmentForm = governmentForm;
            this.headOfState = headOfState;
            this.capital = capital;
            this.code2 = code2;
            this.cities = cities;
            this.languages = languages;
        }
    }



}
