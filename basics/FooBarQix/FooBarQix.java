package basics.FooBarQix;

public class FooBarQix {
    public static void main(String[] args)
    {
        for(int i=1; i<=50; i++)
        {
            System.out.print(i + " => ");
            int semn = 0;
            if(i%3 == 0) {
                System.out.print("Foo");
                semn = 1;
            }
            else
                if(i%5 == 0) {
                    System.out.print("Bar");
                    semn = 1;
                }
                else
                    if(i%7 == 0) {
                        System.out.print("Qix");
                        semn =1;
                     }
            int aux = i;
            while(aux != 0)
            {
                if(aux%10 == 3)
                {
                    System.out.print("Foo");
                    semn = 1;
                }
                else
                    if(aux%10 == 5)
                    {
                        System.out.print("Bar");
                        semn = 1;
                    }
                    else
                        if(aux%10 == 0)
                        {
                            System.out.print("Qix");
                            semn = 1;
                        }
                aux = aux/10;;
            }
            if(semn == 0)
                System.out.print(i);
            System.out.println();
        }
    }
}
