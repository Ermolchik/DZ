public class Strings {

    public static void main(java.lang.String args[]) {
        java.lang.String str = "Сентябрь идёт, придёт октябрь";
        java.lang.String[] words = str.split("\\s");

        for (java.lang.String subStr : words) {
            System.out.println(subStr);
        }
    }
}

