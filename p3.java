public class p3 {

    public static void main (String[] args) {
        int[] m1 = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        for (int i = 0; i<(m1.length)-1; i++)
        {
            if ( m1[i] % 2 == 0)
            {
                System.out.print(m1[i]);
                System.out.print(" ");
            }
        }


    }
}



//3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10] необходимо написать программу, которая выведет в консоль все чётные числа.
