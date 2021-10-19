class DisplayOverloading3
{
    public void disp(char c, int num)
    {
        System.out.println("first definition of method disp");
    }
    public void disp(int num, char c)
    {
        System.out.println("second definition of method disp" );
    }
}
class dspovrldng3 {
    public static void main(String args[]) {
        DisplayOverloading3 obj = new DisplayOverloading3();
        obj.disp('x', 51);
        obj.disp(52, 'y');
    }
}