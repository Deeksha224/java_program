public class Linear_Search_In_String {
    static boolean search(String str, char target){
        if (str.length ()== 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Deeksha";
        char target = 's';
        System.out.print(search(name, target));
    }
}
