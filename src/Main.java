public class Main {
    public static void main(String[] args) {
        String[] imiona = new String[100];

        imiona[34] = "Janusz";
        imiona[99] = "Karol";
        imiona[0] = "Waldek";

        imiona[1] = "6";

        System.out.println(imiona[34]);

        int[][] twoDementional = new int[10][10];

        twoDementional[0][7] = 5;

        System.out.println(twoDementional[0][7]);

        int[][][] td = new int[5][5][5];

        int[] tab = {2,3,4,5,6,7};

        System.out.println(tab[3]);

        System.out.println(tab[tab.length - 1]);

        int index = 5;

        System.out.println(tab[index]);
    }
}
