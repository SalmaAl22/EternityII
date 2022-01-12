import java.util.*;
import java.io.*;

class ETERNITY16x16 {

    static Map<Integer, String> hashMap = new HashMap<>();
    public static int row = 16;
    public static int col = 16;
    public static String[][] BOARD = new String[col][row];
    public static int r = 0;
    public static int t = 0;
    public static String filename = "16x16.txt";


    static void Rotate(int[] a) {
        int n = 1;
        for (int i = 0; i < n; i++) {
            int j, last;
            last = a[a.length - 1];

            for (j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
    }

    static void CheckBoard(String[][] bch) {

        for (r = 0; r < BOARD.length; r++) {
            for (t = 0; t < BOARD[r].length; t++) {
                if (bch[r][t] == null) {
                    System.out.println("Board is empty at row: " + r + " Col: " + t);
                    return;
                }

            }

            System.out.println();
        }
    }

    static void convertString(String s, int[] a) {
        String str = s;
        str = str.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\ ", "");
        String[] string = str.split(",");

        for (int i = 0; i < string.length; i++) {
            a[i] = Integer.valueOf(string[i]);
        }
    }

    static void findInHash(int T, int B, int R, int L) {

        int[] comp = new int[4];
        comp[0] = T;
        comp[1] = B;
        comp[2] = R;
        comp[3] = L;
        // so what im trying to do here: this is the fixed array that we are trying to

        int counter = 0;

        for (int i = 0; i < 3; i++) {
            if (comp[i] == 99) {

                counter++;
            }

        }

        if (counter == 2) {
            int[] content = new int[2];
            int[] ind = new int[2];

            int f = 0;
            // creat a new array that holdes the condition and the index of the condition
            for (int i = 0; i < 4; i++) {
                if (comp[i] != 99) {
                    content[f] = comp[i];
                    ind[f] = i;
                    f++;
                }
            }
            
            for (int i = 0; i < hashMap.size() - 1; i++) {

                String str = hashMap.get(i);
                String[] string = str.split(",");
                int[] arr = new int[string.length];

                for (int z = 0; z < string.length; z++) {
                    arr[z] = Integer.valueOf(string[z]);
                }

                if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1]) {

                    BOARD[r][t] = Arrays.toString(arr);
                    hashMap.put(i, "42,42,42,42");
                    if (t == 15) {
                        r++;
                        t = 0;
                    } else {
                        t++;
                    }

                    break;
                } else {
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");
                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }
                        break;
                    }
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");
                        // hashMap.remove(i);

                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }

                        break;

                        // i added this break

                    }
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");
                        // hashMap.remove(i);

                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }

                        break;

                        // i added this break

                    }

                }

                // make function here so we can use the array and indexes

            }

        }
        if (counter == 1) {
            int newt= 0;
            int[] content = new int[3];
            int[] ind = new int[3];

            int f = 0;
            for (int i = 0; i < comp.length; i++) {
                if (comp[i] != 99) {
                    content[f] = comp[i];
                    ind[f] = i;
                    f++;
                }
            }
            for (int i = 0; i < hashMap.size() - 1; i++) {
                String str = hashMap.get(i);
                String[] string = str.split(",");
                int[] arr = new int[string.length];

                for (int y = 0; y < string.length; y++) {
                    arr[y] = Integer.valueOf(string[y]);
                }
                if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1] && arr[ind[2]] == content[2]) {

                    BOARD[r][t] = Arrays.toString(arr);
                    hashMap.put(i, "42,42,42,42");

                    if (t == 15) {
                        r++;
                        t = 0;
                    } else {
                        t++;
                    }

                    break;
                } else {
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1] && arr[ind[2]] == content[2]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");

                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }

                        break;
                    }
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1] && arr[ind[2]] == content[2]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");

                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }

                        break;
                    }
                    Rotate(arr);
                    if (arr[ind[0]] == content[0] && arr[ind[1]] == content[1] && arr[ind[2]] == content[2]) {

                        BOARD[r][t] = Arrays.toString(arr);
                        hashMap.put(i, "42,42,42,42");

                        if (t == 15) {
                            r++;
                            t = 0;
                        } else {
                            t++;
                        }

                        break;
                    }else{
                        
                        newt = t;
                        
                       
                    }

                }

            }
            //THIS IS THE BACTRACKING ALGORITHM THAT IS NOT WORKING CORRECTLY
            // x = 1;
            //    while(BOARD[r][newt - x] != null){
            //     System.out.println("this is t " + t);         
            //         String bb = BOARD[r][newt - x];
            //         System.out.println(bb);
            //         String[] stringb2 = bb.split("  ");
            //         b = Integer.parseInt(stringb2[1]) + 1;
            //         System.out.println(b - 1);
            //         System.out.println(hashMap.get(b - 1));
            //         hashMap.put(b - 1, stringb2[0].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\ ", ""));
            //         System.out.println(hashMap.get(b - 1));
            //         BOARD[r][newt - x] = null;
            //         //t=t-1;
            //         System.out.println(newt);
            //         //System.out.println( BOARD[r][newt - 2]);
            //         findCase(r, newt-x);
            //         x = x + 1;
                
            // }
        

        }

        if (counter == 0) {
            int[] content2 = new int[4];
            int[] ind2 = new int[4];

            int l = 0;
            for (int i = 0; i < comp.length; i++) {
                if (comp[i] != 99) {
                    content2[l] = comp[i];
                    ind2[l] = i;
                    l++;
                }
            }
            for (int i = 0; i < hashMap.size() - 1; i++) {
                String str = hashMap.get(i);
                String[] string = str.split(",");
                int[] arr = new int[string.length];

                for (int m = 0; m < string.length; m++) {
                    arr[m] = Integer.valueOf(string[m]);
                }
                if (arr[ind2[0]] == content2[0] && arr[ind2[1]] == content2[1] && arr[ind2[2]] == content2[2]
                        && arr[ind2[3]] == content2[3]) {

                    BOARD[r][t] = Arrays.toString(arr);
                    hashMap.put(i, "42,42,42,42");

                    if (t == 15) {
                        r++;
                        t = 0;
                    } else {
                        t++;
                    }

                    break;
                }
            }
        }

    }

    static void findCase(int r, int t) {
 
        if (r == 0) {
            if (t == 0) {
                findInHash(0, 99, 99, 0);

            }
            if (t != 0 && t < 15) {
                int[] a = new int[4];
                convertString(BOARD[r][t - 1], a);
                int pastRight = a[1];

                findInHash(0, 99, 99, pastRight);
            }
            if (t == 15) {
                int[] a = new int[4];
                convertString(BOARD[r][t - 1], a);
                int pastRight = a[1];
                findInHash(0, 0, 99, pastRight);

            }
        }

        else if (r > 0 && r < 15) {
            if (t == 0) {

                int[] a = new int[4];
                convertString(BOARD[r - 1][t], a);
                int pastbottom = a[2];
                findInHash(pastbottom, 99, 99, 0);

            }
            if (t > 0 && t < 15) {
                int[] a1 = new int[4];
                int[] a2 = new int[4];
                convertString(BOARD[r - 1][t], a1);
                convertString(BOARD[r][t - 1], a2);

                int pastBottom = a1[2];

                int pastRight = a2[1];
                findInHash(pastBottom, 99, 99, pastRight);
            }
            if (t == 15) {
                int[] a1 = new int[4];
                int[] a2 = new int[4];
                convertString(BOARD[r - 1][t], a1);
                convertString(BOARD[r][t - 1], a2);

                int pastBottom = a1[2];

                int pastRight = a2[1];

                findInHash(pastBottom, 0, 99, pastRight);

            }
        } else if (r == 15) {
            if (t == 0) {
                int[] a = new int[4];
                convertString(BOARD[r - 1][t], a);

                int pastTop = a[0];

                findInHash(pastTop, 0, 99, 0);

            }
            if (t > 0 && t < 15) {
                int[] a1 = new int[4];
                int[] a2 = new int[4];
                convertString(BOARD[r - 1][t], a1);
                convertString(BOARD[r][t - 1], a2);

                int pastTop = a1[0];

                int pastRight = a2[1];

                findInHash(pastTop, 0, 99, pastRight);

            }
            if (t == 15) {
                int[] a1 = new int[4];
                int[] a2 = new int[4];
                convertString(BOARD[r - 1][t], a1);
                convertString(BOARD[r][t - 1], a2);

                int pastTop = a1[0];

                int pastRight = a2[1];

                findInHash(pastTop, 0, 0, pastRight);


            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        final long startTime = System.nanoTime();
        Scanner s = new Scanner(new File(filename));
        int z = 0;
        while (s.hasNext()) {
            String line = s.nextLine();

            hashMap.put(z, line);
            z++;

        }

        for (int h = 0; h < 16; h++) {

            findCase(0, h);
        }
        for (int h = 0; h < 16; h++) {

            findCase(1, h);
            
            
        }
        
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                if(BOARD[i][j] != null){
                System.out.print(BOARD[i][j]);
                }
                if (j < BOARD[i].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
        // visually print board
        // row 1
        for (int i = 0; i < 16; i++) {
        int[] disp = new int[4];
        convertString(BOARD[0][i], disp);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[0]);
        System.out.printf("%2s", "");
        System.out.print("|");

        }
        System.out.println();
        for (int i = 0; i < 16; i++) {
        int[] disp = new int[4];
        convertString(BOARD[0][i], disp);

        System.out.printf("%02d", disp[3]);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[1]);
        System.out.print("|");

        }
        System.out.println();
        for (int i = 0; i < 16; i++) {
        int[] disp = new int[4];
        convertString(BOARD[0][i], disp);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[2]);
        System.out.printf("%2s", "");
        System.out.print("|");

        }

        System.out.println();
        System.out.println();
        // row 2

        // visually print board
        for (int i = 0; i < 15; i++) {
        int[] disp = new int[4];
        convertString(BOARD[1][i], disp);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[0]);
        System.out.printf("%2s", "");
        System.out.print("|");

        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
        int[] disp = new int[4];
        convertString(BOARD[1][i], disp);
        System.out.printf("%02d", disp[3]);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[1]);
        System.out.print("|");

        }
        System.out.println();

        for (int i = 0; i < 15; i++) {
        int[] disp = new int[4];
        convertString(BOARD[1][i], disp);
        System.out.printf("%2s", "");
        System.out.printf("%02d", disp[2]);
        System.out.printf("%2s", "");
        System.out.print("|");

        }
        System.out.println();

        //iterating in the board to check for the last occupied entry

        CheckBoard(BOARD);
        final long duration = System.nanoTime() - startTime;
        System.out.println("Running Time: "+duration + " nanoseconds");

    }
}