public class RamTemp {
    public static void main(String[] args) {      
        int temperature = 50;
                if (temperature > 45) {
            System.out.println("Ram should stay home.");
        } else if (temperature >= 30 && temperature <= 45) {
            System.out.println("Ram should carry water.");
        } else {
            System.out.println("Ram can go out normally.");
        }
    }
}
