package pl.kodolamacz.podstawy;

/**
 * Created by acacko on 28.10.17
 */
public class Immutable {


    public void increaseNumber(Box<Integer> box) {
        System.out.println("Przed: " + box.getNumber());
        box.setNumber(30);
        System.out.println("Po: " + box.getNumber());
    }

    public static class Box<T> {
        private T number;

        public T getNumber() {
            return number;
        }

        public void setNumber(T number) {
            this.number = number;
        }
    }


    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setNumber(20);

        new Immutable().increaseNumber(box);

        System.out.println("Poza: " + box.getNumber());
    }
}
