class Operators
{
    public static void main(String args[])
    {
        int num1 =7;
        int num2 =5;

        int result1 = num1/num2;    //quotient = 1
        int result2 = num1%num2;    //remainder = 2

        System.out.println(result1);
        System.out.println(result2);

        int num =7;
        /*
        num = num + 1;
        num += 1;
        num++;  //post-increment
        ++num;  //pre-increment
        num--;
        --num;
        */

       //int result3 = num++;    //fetch the value and then increment = 7
        int result4 = ++num;    // increment and then fetch the value = 8

        //System.out.println(result3);
        System.out.println(result4);
    }
}