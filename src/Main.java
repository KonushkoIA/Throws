public class Main {
    public static void main(String[] args) {
        Car car = new Car(50000,290,"BMW" );
        User user1 = new User("Андрей",285,40000,"AUDI");
        car.compareSpeed(user1,car);
        car.comparePrice(user1,car);
        car.compareMark(user1,car);
    }
}
