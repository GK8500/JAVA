import java.util.Scanner;
public class universities {
    public static void main(String args[])
    {
        int a ;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1-> Germany \n 2-> Italy \n 3-> Hungary \n  4-> Austria \n 5-> Europe \n Enetr the country: ");
        a = sc.nextInt();
        
        if (a==1)
        {
            System.out.println("1. Technical University Of Munich \n 2.Ludwig-Maximilians university \n 3. Ruprecht-Karls-Universität Heidelberg \n 4. Freie Universitaet Berlin");
        }

        else if (a == 2)
        {
            System.out.println("1. Politecnico di Milano \n 2.Alma Mater Studiorum \n 3. Sapienza University of Rome \n 4. University of Milan");
        }

        else if (a == 3)
        {
            System.out.println("1. University of Szeged \n 2.University of Debrecen \n 3. Eötvös Loránd University \n 4. Budapest University of Technology and Economics");
        }

        else if(a == 4)
        {
            System.out.println("1. University of Vienna \n 2.Technische Universität Wien \n 3. Graz University of Technology \n 4. FJohannes Kepler University Linz");
        }

       else if(a == 5)
       {
        System.out.println("1. University of Cambridge \n 2.Imperial College London \n 3. ETH Zurich \n 4. EPFL \n 5. Université PSL \n 6.The University of Warwick \n ");
    }
    }

}