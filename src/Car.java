public class Car {
    private int price;
    private int maxSpeed;
    private String mark;

    public Car() {
    }

    public Car(int price, int maxSpeed, String mark) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void compareSpeed(User a, Car b) {
        try {
            if (a.getRequiredSpeed() <= b.getMaxSpeed()) {
                System.out.println("Скорость автомобиля соответствует желаемой");
            } else {
                throw new SpeedException();
            }
        } catch (SpeedException e) {
            System.out.println("Скорость автомобиля не соотвествует желаемой");
        }
    }

    public void comparePrice(User a, Car b) {
        try {
            if (a.getRequiredPrice() <= b.getPrice()) {
                System.out.println("Цена автомобиля соответствует желаемой");
            } else {
                throw new PriceException();
            }
        } catch (PriceException e) {
            System.out.println("Цена автомобиля не соотвествует желаемой");
        }
    }

    public void compareMark(User a, Car b) {
        try {
            if (a.getRequiredMark().equals( b.getMark())) {
                System.out.println("Марка автомобиля соответствует желаемой");
            } else {
                throw new MarkException();
            }
        } catch (MarkException e) {
            System.out.println("Марка автомобиля не соотвествует желаемой");
        }
    }
}
