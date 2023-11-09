import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
    int[] tablica1 = {3, 5, 12, 16, 18, 22, 38};
    int[] tablica2 = {16, 18, 18, 33, 51, 68, 92};

    int suma1 = Arrays.stream(tablica1).sum();
    int suma2 = Arrays.stream(tablica2).sum();
    System.out.println("Suma wartości w tablicach wynosi odpowiednio " + suma1 + " i " + suma2);

    int max1 = Arrays.stream(tablica1).max().getAsInt();
    int min1 = Arrays.stream(tablica1).min().getAsInt();
    int max2 = Arrays.stream(tablica2).max().getAsInt();
    int min2 = Arrays.stream(tablica2).min().getAsInt();
    System.out.println("Maksymalne wartości w tablicach wynoszą odpowiednio " + max1 + " i " + max2);
    System.out.println("Minimalne wartości w tablicach wynoszą odpowiednio " + min1 + " i " + min2);

    double avg1 = Arrays.stream(tablica1).average().getAsDouble();
    double avg2 = Arrays.stream(tablica2).average().getAsDouble();
    System.out.println("Średnie wartości w tablicach wynoszą odpowiednio " + avg1 + " i " + avg2);

    int[] copy1 = Arrays.copyOf(tablica1, tablica1.length);
    int[] copy2 = Arrays.copyOf(tablica2, tablica2.length);

    int value = 20;
    int[] filteredArray1 = Arrays.stream(tablica1).filter(element -> element > value).toArray();
    int[] filteredArray2 = Arrays.stream(tablica2).filter(element -> element > value).toArray();
    System.out.println("Jeżeli usuniemy elementy mniejsze niż " + value + ", to otrzymamy takie tablice: "
            + Arrays.toString(filteredArray1) + " oraz " + Arrays.toString(filteredArray2));

    int elementToRemove = 16;
    int[] newArray1 = Arrays.stream(tablica1).filter(element -> element != elementToRemove).toArray();
    int[] newArray2 = Arrays.stream(tablica2).filter(element -> element != elementToRemove).toArray();
    System.out.println("Jeżeli usuniemy elementy równe " + value + ", to otrzymamy takie tablice: "
            + Arrays.toString(newArray1) + " oraz " + Arrays.toString(newArray2));

    int[] mergedArray = new int[tablica1.length + tablica2.length];
    System.arraycopy(tablica1, 0, mergedArray, 0, tablica1.length);
    System.arraycopy(tablica2, 0, mergedArray, tablica1.length, tablica2.length);
    System.out.println("Gdy połączymy obie tablice, otrzymamy " + Arrays.toString(mergedArray));

    int valueToFind = 18;
    long amount1 = Arrays.stream(tablica1).filter(element -> element == valueToFind).count();
    long amount2 = Arrays.stream(tablica2).filter(element -> element == valueToFind).count();
    System.out.println("Liczba wystąpień wartości " + valueToFind + " w obu tablicach to odpowiednio: " + amount1 + " i " + amount2);
    }

}
