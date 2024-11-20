package pe.edu.i202211998.dominio;

import jakarta.persistence.*;

public class countrylanguage {
    @Entity
    @Table(name = "countrylanguage")
    public class CountryLanguage {
        @EmbeddedId
        private country countryCode;

        @Column(nullable = false)
        private boolean isOfficial;

        @Column(nullable = false)
        private Double percentage;

        @ManyToOne
        @JoinColumn(name = "countryCode", insertable = false, updatable = false)
        private country country;

        public pe.edu.i202211998.dominio.country getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(pe.edu.i202211998.dominio.country countryCode) {
            this.countryCode = countryCode;
        }

        public boolean isOfficial() {
            return isOfficial;
        }

        public void setOfficial(boolean official) {
            isOfficial = official;
        }

        public Double getPercentage() {
            return percentage;
        }

        public void setPercentage(Double percentage) {
            this.percentage = percentage;
        }

        public pe.edu.i202211998.dominio.country getCountry() {
            return country;
        }

        public void setCountry(pe.edu.i202211998.dominio.country country) {
            this.country = country;
        }

        public CountryLanguage(pe.edu.i202211998.dominio.country countryCode, boolean isOfficial, Double percentage, pe.edu.i202211998.dominio.country country) {
            this.countryCode = countryCode;
            this.isOfficial = isOfficial;
            this.percentage = percentage;
            this.country = country;
        }
    }
}
