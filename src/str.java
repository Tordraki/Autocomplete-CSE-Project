public class str{
    private String[] s2;
    public str(String[] s1){
        s2 = s1;
        System.out.println("hi1");
    }
    public String toString(){
        String result = "";
        System.out.println("hi3");
        for(int i = 0; i < s2.length; i++){
            result+=s2[i];
        }
        return result;
    }
}