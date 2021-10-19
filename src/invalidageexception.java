class InvalidAge extends Exception{
    InvalidAge(String s){
        super(s);
    }
}
class invalidageexception{
    static void validate(int age)throws InvalidAge{
        if(age<18)
            throw new InvalidAge("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try{
            validate(20);
        }catch(Exception m){System.out.println("Exception occured: "+m);}
        System.out.println("rest of the code...");
    }
}

