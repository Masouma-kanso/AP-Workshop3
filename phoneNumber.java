public class phoneNumber {
    private String countryCode;
    private String number;

    public phoneNumber() {

    }

    public phoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }


    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }


}
