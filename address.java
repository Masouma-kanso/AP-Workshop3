public class address {
    private final String zipCode;
    private final String country;
    private final String city;
    private String email;

    public address(String zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
