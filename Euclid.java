public class Euclid {
      // recursive implementation
public static int gcd(int p, int q){
if (q==0) return p;
else return gcd(q,p%q);
}

        //non-recursive implementation
public static int gcd2(int p, int q){
while(q!=0){
int temp=q;
q=p%q;
p=tem;
}
return p;
}

         //main method
public static void main(String[] args){
int p=Integer.parseInt(args[0]);
int q = Integer.parseInt(args[1]);
int d = gcd(p,q); //recursion
int d2 = gcd2(p,q); //while loop
System.out.printIn("gcd("+p+", "+q+")=" +d);
System.out.printIn("gcd("+p+, "+q+")=" +d2);