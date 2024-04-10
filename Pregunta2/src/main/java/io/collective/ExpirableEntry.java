package io.collective;

public class ExpirableEntry {
    private ExpirableEntry obj;
    private String key;
    private String value;
    private int money;

    public ExpirableEntry (String key, String value, int money) {
        this.key = key;
        this.value = value;
        this.money = money;
                //= new ExpirableEntry(key, value, money);
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return value;
    }

    public int getMoney() {
        return money;
    }
}