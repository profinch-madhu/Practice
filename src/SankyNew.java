import java.util.Scanner;

public class SankyNew {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            String ph = sc.nextLine();
            String result="";
            int length = ph.length();
            for(int i=0;i<length;i++){
                int c=ph.charAt(i);
                if(c<=90 && c>=65 || c<=122 && c>=97){
                    if(ph.contains("double")){
                        i=ph.indexOf("double");
                        while(!(c>=48 && c<=57)){
                            c=ph.charAt(++i);
                        }
                        result+=ph.charAt(i);result+=ph.charAt(i);
                    }

                    if(c=='t' || c=='T'){
                        while(!(c>=48 && c<=57)){
                            c=ph.charAt(++i);
                        }
                        result+=ph.charAt(i);result+=ph.charAt(i);result+=ph.charAt(i);
                    }

                    if(c=='q' || c=='Q'){
                        while(!(c>=48 && c<=57)){
                            c=ph.charAt(++i);
                        }
                        result+=ph.charAt(i);result+=ph.charAt(i);result+=ph.charAt(i);result+=ph.charAt(i);
                    }
                }
                else if(c>=48 && c<=57){
                    result+=ph.charAt(i);
                }
            }
            System.out.println("result= "+result);
        }
    }


