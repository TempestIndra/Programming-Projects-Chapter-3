public class PP3_3 {
    public static void main(String arg[]){
        String x = String.valueOf((int)(Math.random() * 742));
        if(x.length() < 3){
            x += 0;
        }
        if(x.length() < 3){
            x += 0;
        }
        System.out.println(
            String.valueOf((int) (Math.random() * 8))+
            String.valueOf((int) (Math.random() * 8))+
            String.valueOf((int) (Math.random() * 8))+
            "-"+x+"-"+
            String.valueOf((int) (Math.random() * 9))+
            String.valueOf((int) (Math.random() * 9))+
            String.valueOf((int) (Math.random() * 9))+
            String.valueOf((int) (Math.random() * 9))
        );
    }

}

/*
* Write an application that creates and prints a random phone
* number of the form XXX-XXX-XXXX. Include the dashes in
* the output. Do not let the first three digits contain an 8 or 9
* (But don't be more restrictive than that), and make sure that the
* second set of three digits is not greater than 742. Hint: think
* through the easiest way to construct the phone number, Each
* digit does not have to be determined separately.
* */