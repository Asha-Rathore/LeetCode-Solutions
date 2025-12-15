public class LongestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"aaa", "aa", "aaa"};
        if (strs == null || strs.length == 0) {
            System.out.println("");;
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    System.out.println(strs[0].substring(0, i));
                }
            }
        }
        System.out.println(strs[0]);
//        String commonPrefix = "";
//        if(strs.length == 1){
//            commonPrefix = strs[0];
//        }
//        else{
//            for(int i = 1; i < strs.length - 1; i++){
//                String str1 = strs[i];
//                String[] val1 = str1.split("");
//                String str2 = strs[i+1];
//                String[] val2 = str2.split("");
//                if(val1[0].equals(val2[0])){
//                    commonPrefix = val1[0];
//                    int minLength = Math.min(val1.length, val2.length);
//                    for(int j = 1; j < minLength; j++){
//                        if(val1[j].equals(val2[j])){
//                            commonPrefix += val1[j];
//                        }
//                        else{
//                            break;
//                        }
//                    }
//                }
//                else{
//                    commonPrefix = "";
//                }
//            }
//        }
//        System.out.println("Common Prefix " + commonPrefix);
    }
}
