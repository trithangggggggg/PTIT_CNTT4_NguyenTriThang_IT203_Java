package Session13.bai5;

public class BenhNhan {
    private String id;
    private String hoTen;
    private int tuoi;
    private String chanDoan;

    public BenhNhan(String id, String hoTen, int tuoi, String chanDoan) {
        this.id = id;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.chanDoan = chanDoan;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Họ tên: " + hoTen +
                " | Tuổi: " + tuoi +
                " | Chẩn đoán: " + chanDoan;
    }

}
