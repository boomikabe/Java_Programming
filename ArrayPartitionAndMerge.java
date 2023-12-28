import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ArrayPartitionAndMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array: ");
        String[] arrayInput = scanner.nextLine().split(" ");
        int[] array = Arrays.stream(arrayInput).mapToInt(Integer::parseInt).toArray();
        System.out.print("Partition size: ");
        int partitionSize = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Partition order: ");
        String[] orderInput = scanner.nextLine().split(" ");
        int[] partitionOrder = Arrays.stream(orderInput).mapToInt(Integer::parseInt).toArray();
        List<int[]> partitions = partitionArray(array, partitionSize);
        int[] mergedArray = mergePartitions(partitions, partitionOrder);
        System.out.println("Output:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    private static List<int[]> partitionArray(int[] array, int partitionSize) {
        List<int[]> partitions = new ArrayList<>();
        for (int i = 0; i < array.length; i += partitionSize) {
            int[] partition = Arrays.copyOfRange(array, i, Math.min(i + partitionSize, array.length));
            partitions.add(partition);
        }
        return partitions;
    }
    private static int[] mergePartitions(List<int[]> partitions, int[] partitionOrder) {
        List<Integer> mergedList = new ArrayList<>();
        List<Integer> partitionIndices = new ArrayList<>();
        for (int i = 0; i < partitions.size(); i++) {
            partitionIndices.add(i);
        }
        if (partitionOrder.length != partitions.size()) {
            throw new IllegalArgumentException("Partition order length does not match the number of partitions");
        }
        Collections.sort(partitionIndices, (a, b) -> Integer.compare(partitionOrder[a], partitionOrder[b]));
        for (int index : partitionIndices) {
            int[] partition = partitions.get(index);
            for (int num : partition) {
                mergedList.add(num);
            }
        }
        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }
        return mergedArray;
    }
}