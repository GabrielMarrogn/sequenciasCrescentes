import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(;;){
            int a = Integer.parseInt(br.readLine());
            if(a ==0){
                break;
            }

            for(int i = 1; i <= a; i++){
                if(i == a){
                    System.out.println(i);
                }else{
                    System.out.print(i +" ");
                }
                
                
            }

        }
    }
}
