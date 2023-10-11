public class ArrayParameterEx {

    public static void main(String[] args) {
        char[] c = {'T','h','i','s',' ','i','s',' ','a',
                ' ','p','e','n','c','i','l','.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }

    private static void replaceSpace(char[] c) {
        for(int i = 0; i < c.length; i++){
            if(c[i] == ' ') c[i] = ',';
        }
    }

    private static void printCharArray(char[] c) {
        for(char ch : c){
            System.out.print(ch);
        }
        System.out.println();
    }
}
