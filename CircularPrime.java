/ *
     Find if a number is circular prime or not.
*/

class CircularPrime
{   
    boolean isPrime(int m)
    {
        int c=0;
        for(int i=1; i<m; i++)
        {
            if(m%i==0)
                c++;
        }
        if(c==1)
            return true;
        else 
            return false;
    }

    int countDigits(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        return c;
    }

    void main(int num)
    {
        int n=num;
        int c=countDigits(num);
        int f=0; int t=0;
        int p=1;
        for(int i=1; i<c; i++)
        {
            p=p*10;
        }
        while(t!=num)
        {
             t=n%p;
            int j=n/p;
            t=t*10 +j;
            boolean r=isPrime(t);
            if(r==false)
                f++;
            n= t;
        }
        if (f==0)
            System.out.println(num + " is a circular prime number");
        else
            System.out.println(num + " is not a circular prime number ");
    }
}
