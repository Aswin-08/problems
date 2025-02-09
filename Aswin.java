import java.util.*;
class Aswin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);



        ArrayList<Integer> al=new ArrayList<>();
/*         //while(sc.hasNextInt()){
        //    al.add(sc.nextInt());

        //}
*/

        for(int i=0;i<5;i++){
            al.add(sc.nextInt());
        }

        Set<Integer> set=new Hashset<>(al);



        for(int aa:set){
            System.out.print(aa+" ");
        }
    }
}