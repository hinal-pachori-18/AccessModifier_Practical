package Account_Package;

public class Account {
    public String name;
    private int acc_no;
    protected String email;
    public int amount;


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getAcc_no()
    {
        return acc_no;
    }
    public void setAcc_no(int acc_no)
    {
        this.acc_no = acc_no;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public int getAmount()
    {
        return amount;
    }
    public void setAmount(int amount)
    {
        this.amount=amount;
    }
}
