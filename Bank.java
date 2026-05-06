class Bank
{
    String accname;
    int accno;
    float accbalance;

    void getdata(String n, int a, float b)
    {
        accname = n;
        accno = a;
        accbalance = b;
    }

    void displaydata()
    {
        System.out.println("Account Holder Name = " + accname);
        System.out.println("Account Number = " + accno);
        System.out.println("Account Balance = " + accbalance);
    }

    public static void main(String[] args)
    {
        Bank B1 = new Bank();

        B1.getdata("Ravi", 12345, 25000.50f);
        B1.displaydata();
    }
}