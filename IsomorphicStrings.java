

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        if (isIsomorphic(s, t))
            System.out.println("Isomorphic");
        else
            System.out.println("Not Isomorphic");
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] != map2[c2]) return false;

            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        return true;
    }
}
