public class LatihanCounter {
public static void main(String[] args) {

    int nilai = 10;

    System.out.println("=== COUNTER ===");
    System.out.println("Nilai awal: " + nilai);

    nilai++;
    nilai++;
    System.out.println("Setelah ++ (2x): " + nilai);

    nilai--;
    System.out.println("Setelah --: " + nilai);

    nilai += 5;
    System.out.println("Setelah += 5: " + nilai);

    nilai -= 3;
    System.out.println("Setelah -= 3: " + nilai);

    nilai *= 2;
    System.out.println("Setelah *= 2: " + nilai);
}


}
