package homeWork;

public enum Month {
    ЯНВАРЬ("Зима"),
    ФЕВРАЛЬ("Зима"),
    МАРТ("Весна"),
    АПРЕЛЬ("Весна"),
    МАЙ("Весна"),
    ИЮНЬ("Лето"),
    ИЮЛЬ("Лето"),
    АВГУСТ("Лето"),
    СЕНТЯБРЬ("Осень"),
    ОКТЯБРЬ("Осень"),
    НОЯБРЬ("Осень"),
    ДЕКАБРЬ("Зима");
    String season;
    Month(String season){
        this.season = season;

    }

    @Override
    public String toString() {
        return name();
    }
}
