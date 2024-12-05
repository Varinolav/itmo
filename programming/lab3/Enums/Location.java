package Enums;

public enum Location {
    AFRICA("вдоль африканских берегов", 1000),
    ISLAND("остров", 2),
    BEACH(", немного повыше, на край песчаной отмели, и воды вокруг нее не было", 0),
    BRAZIL(" без особенных затруднений добрался бы до Бразилии", 1000);

    private final String title;
    private final int mileage;

    Location(String title, int mileage) {
        this.title = title;
        this.mileage = mileage;
    }

    public String getTitle() {
        return title;
    }

    public int getMileage() {
        return mileage;
    }
}