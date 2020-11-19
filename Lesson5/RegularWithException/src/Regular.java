interface Regular {
    String REGEX_FIRST_NAME = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{3,15}";
    String REGEX_PHONE_NUMBER = "^(\\+(\\(\\d{3}\\))\\s\\d{2}\\s\\d{3}\\s\\d{2}\\s\\d{2})$";
    String REGEX_EMAIL = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
    String REGEX_LOGIN = "^[dA-Za-z0-9__-]{5,15}$";
}
