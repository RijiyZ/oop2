public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car(null, "Granta", 1.7, "Желтый",
                2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный",
                2020, "Германия");
        Car bmvZ8 = new Car("BMW", "Z8", 3.0, "Черный",
                2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, null,
                2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", null, -1, "",
                -43, null);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}