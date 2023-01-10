package com.example.tast1;



public class Reverse extends MainActivity{




    public static String makeAnagram(String text, String filter){


            String[] words = text.split("\\s");
            StringBuilder makeAnagram = new StringBuilder();
            for (String word : words) {
                makeAnagram.append(filter(word, filter)).append(" ");
            }

            return makeAnagram.toString().trim();

    }





    public static String filter(String text, String filter) {

        int r = text.length() - 1;
        char[] charsText = text.toCharArray();
        int l = 0;

        if (filter.isEmpty()) {


            while (l < r) {
                char firstCh = text.charAt(l);
                char lastCh = text.charAt(r);

                if (isAlpha(firstCh)) {
                    l++;
                } else if (isAlpha(lastCh)) {
                    r--;
                } else {
                    char temp = charsText[l];
                    charsText[l] = charsText[r];
                    charsText[r] = temp;
                    l++;
                    r--;
                }
            }


        } else {
                while (l<r) {
                        if (filter.contains(String.valueOf(text.charAt(l)))) {
                            l++;
                        } else if (filter.contains(String.valueOf(text.charAt(r)))) {
                            r--;
                        } else {
                            char temp = charsText[l];
                            charsText[l] = charsText[r];
                            charsText[r] = temp;
                            l++;
                            r--;

                        }
                }
        }
        return String.copyValueOf(charsText);
    }



    private static boolean isAlpha(char ch) {
        return (ch < 'a' || ch > 'z')
                && (ch < 'A' || ch > 'Z');
    }
}




//    public static String reverseWord(String str) {
//        String[] words = str.split(" ");
//        String reverseWord = "";
//        int r = words.length - 1, l = 0;
//        while (l < r) {
//            if (!Character.isAlphabetic(l))
//                l++;
//            else if (!Character.isAlphabetic(r))
//                r--;
//            else {
//                for (String w : words) {
//                    StringBuilder sb = new StringBuilder(w);
//                    sb.reverse();
//                    reverseWord += sb.toString()+" ";
//
//                }
//
//            }
//
//        }
//        return reverseWord.trim();
//    }
//}






//    public static void reverse(char[] str) {
//        int r = str.length - 1, l = 0;
//
//        while (l < r) {
//            if (!Character.isAlphabetic(str[l]))
//                l++;
//            else if (!Character.isAlphabetic(str[r]))
//                r--;
//            else {
//                char tmp = str[l];
//                str[l] = str[r];
//                str[r] = tmp;
//                l++;
//                r--;
//            }
//        }
//    }




//public class Reverse {
//    public static String reverseWord(String str){
//        String[] words =str.split("\\s");
//        String reverseWord="";
//        for(String w:words){
//            StringBuilder sb=new StringBuilder(w);
//            sb.reverse();
//            reverseWord+=sb.toString()+" ";
//        }
//        return reverseWord.trim();
//    }
//}