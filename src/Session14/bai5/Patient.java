package Session14.bai5;

public class Patient {
    public String name ;
    public Severity severity;
    public int arrivalTime;

    public Patient() {
    }

    public Patient(String name, Severity severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }


    @Override
    public String toString() {
        int hour = arrivalTime / 100;
        int minute = arrivalTime % 100;

        String severityText = "";

        switch (severity) {
            case CRITICAL:
                severityText = "Nguy kịch";
                break;
            case SERIOUS:
                severityText = "Nặng";
                break;
            case MILD:
                severityText = "Nhẹ";
                break;
        }

        return name +
                " (Mức " + severity.getLevel() +
                " - " + severityText +
                ", đến lúc " + String.format("%d:%02d", hour, minute) + ")";
    }
}
