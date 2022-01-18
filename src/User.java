public class User {
    private String name;
    private int requiredSpeed;
    private int requiredPrice;
    private String requiredMark;

    public User(String name, int requiredSpeed, int requiredPrice, String requiredMark) {
        this.name = name;
        this.requiredSpeed = requiredSpeed;
        this.requiredPrice = requiredPrice;
        this.requiredMark = requiredMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredSpeed() {
        return requiredSpeed;
    }

    public void setRequiredSpeed(int requiredSpeed) {
        this.requiredSpeed = requiredSpeed;
    }

    public int getRequiredPrice() {
        return requiredPrice;
    }

    public void setRequiredPrice(int requiredPrice) {
        this.requiredPrice = requiredPrice;
    }

    public String getRequiredMark() {
        return requiredMark;
    }

    public void setRequiredMark(String requiredMark) {
        this.requiredMark = requiredMark;
    }
}
