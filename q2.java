public class q2 {
    public static boolean  overlappingReactangles(int[] r1,int[] r2){
        return ( r1[2] > r2[0] &&  r2[2] > r1[0] &&  r1[3] > r2[1] && r2[3] > r1[1]);
    }
}
