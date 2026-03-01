package Session14.bai5;

public enum Severity {
    CRITICAL(1),
    SERIOUS(2),
    MILD(3);

    private int level;

    Severity(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
