package Session08.TestBTTH;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    // Xep loai hoc luc
    public String getRank() {
        if (score >= 8) return "Gioi";
        if (score >= 6.5) return "Kha";
        if (score >= 5) return "Trung Binh";
        return "Yeu";
    }

    @Override
    public String toString() {
        return "Student [ID=" + id +
                ", Name=" + name +
                ", Score=" + score +
                ", Hoc luc=" + getRank() + "]";
    }
}
