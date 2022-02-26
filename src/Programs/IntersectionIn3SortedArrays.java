package Programs;

public class IntersectionIn3SortedArrays {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7};
        int[] b ={2,3,8,10};
        int[] c ={1,2,3,4,5,6,10,15,20};

        int x=0,y=0,z=0;
        while ((x<a.length)&&(y<b.length)&&(z<c.length)){
            if ((a[x]==b[y]) &&(b[y]==c[z])&&(a[x]==c[z])){
                System.out.println(a[x]);
                x++;
                y++;
                z++;
            }
            else if (a[x]<b[y]){
                x++;
            }
            else if (b[y]<c[z]){
                y++;
            }
            else if (c[z]<a[x]){
                z++;
            }
        }


    }


}
