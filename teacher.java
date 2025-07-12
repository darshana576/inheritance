
    
    public class teacher extends person{
    String subject;
    double salary;
    teacher(String a,int b,String subject,double salary)
    { 
        super(a,b);
        this.subject=subject;
        this.salary=salary;

    }
    void printdetails()
    {
        System.out.println("subject"+subject);
        System.out.println("salary"+salary);
    
    }
    public static void main(String[] args) {
        teacher s=new teacher("rashmi",53,"maths",89064);
        s.print();
        s.printdetails();
    }
}

