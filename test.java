import java.util.*;
Class Cart
{
   Scanner sc=new Scanner(System.in);
   int wallet={1100,18,1};
   int umbrella={900,12,4};
   int cigarette={200,28,3};
   int honey={100,0,2};
   int amount=0;
   int max=0;
   String maxprd;
   if(((wallet[1]/100*wallet[0])*wallet[2])>max)
   maxprd="wallet";
   if(((umbrella[1]/100*umbrella[0])*umbrella[2])>max)
   maxprd="umbrella";
   if(((cigarette[1]/100*cigarette[0])*cigarette[2])>max)
   maxprd="cigarette";
   if(((honey[1]/100*honey[0])*honey[2])>max)
   maxprd="honey";
   System.out.println("The maximum GST amount paid product is:"+maxprd);



   int amt1;
   if(wallet[0]>=500)
   {
    amt1=((wallet[0]*wallet[2])+((wallet[1]/100*wallet[0])*wallet[2]));
    amount+=amt1-(5/100*amt1);
   }
    else
    {
     amount+=((wallet[0]*wallet[2])+((wallet[1]/100*wallet[0])*wallet[2]));
    }
    if(umbrella[0]>=500)
   {
    amt1=((umbrella[0]*umbrella[2])+((umbrella[1]/100*umbrella[0])*umbrella[2]));
    amount+=amt1-(5/100*amt1);
   }
    else
    {
     amount+=((umbrella[0]*umbrella[2])+((umbrella[1]/100*umbrella[0])*umbrella[2]));
    }
    if(cigarette[0]>=500)
   {
    amt1=((cigarette[0]*cigarette[2])+((cigarette[1]/100*cigarette[0])* cigarette[2]));
    amount+=amt1-(5/100*amt1);
   }
    else
    {
     amount+=((cigarette[0]*cigarette[2])+((cigarette[1]/100*cigarette[0])* cigarette[2]));
    }
    if(honey[0]>=500)
   {
    amt1=((honey[0]*honey[2])+((honey[1]/100*honey[0])* honey[2]));
    amount+=amt1-(5/100*amt1);
   }
    else
    {
     amount+=((honey[0]*honey[2])+((honey[1]/100*honey[0])* honey[2]));
    }
    System.out.println("The total amount to be paid to the shopkeeper is:"+amount);
}