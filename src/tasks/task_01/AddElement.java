package tasks.task_01;

import java.util.HashSet;

public class AddElement {

    public static void main(String[] args) {

        System.out.println("\n\u2714\uFE0F Initial data:");
        getOutput(getInitialSet());

        System.out.println("\n\u267B\uFE0F Updated data:");
        getOutput(getUpdatedSet(new HashSet<>(getInitialSet())));
    }

    private static HashSet<String> getInitialSet() {
        HashSet<String> set = new HashSet<>();
        set.add("orange     \uD83C\uDF4A");
        set.add("apple      \uD83C\uDF4F");
        set.add("kiwi       \uD83E\uDD5D");
        set.add("strawberry \uD83C\uDF53");
        set.add("mango      \uD83E\uDD6D");
        return set;
    }

    private static HashSet<String> getUpdatedSet(HashSet<String> set) {
        set.add("grape      \uD83C\uDF47");
        return set;
    }

    private static void getOutput(HashSet<String> set) {
        int i = 1;
        for (String element : set) {
            System.out.println(i + ") " + element);
            i++;
        }
    }
}
