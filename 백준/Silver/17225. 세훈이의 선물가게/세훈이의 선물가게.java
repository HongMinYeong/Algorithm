import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();

        String[] tokens = br.readLine().split(" ");
        int A = Integer.parseInt(tokens[0]); //성민이가 포장시 걸리는 시간
        int B = Integer.parseInt(tokens[1]); //지수가 포장시 걸리는 시간
        int N = Integer.parseInt(tokens[2]); //손님 수
        int tempAtime = 0;
        int tempBtime = 0;
        int allCustomerNumber = 0;
            for (int i = 0; i < N; i++) {
                tokens = br.readLine().split(" ");
                int timing = Integer.parseInt(tokens[0]);
                String color = tokens[1];
                int customer = Integer.parseInt(tokens[2]);
                allCustomerNumber+=customer;

                if (color.equals("B")){
                    //성민
                    if(timing>tempAtime){
                        tempAtime = timing;
                    }
                    for (int j =0;j<customer;j++){
                        arrA.add(tempAtime);
                        tempAtime +=A;
                    }

                }else{
                    //지수
                    if(timing>tempBtime){
                        tempBtime = timing;
                    }
                    for (int j =0;j<customer;j++){
                        arrB.add(tempBtime);
                        tempBtime +=B;
                    }
                }

            }
        ArrayList<Integer> resultA = new ArrayList<>();
        ArrayList<Integer> resultB = new ArrayList<>();
        int aPointer =0;
        int bPointer =0;

        for (int i = 1; i<=allCustomerNumber;i++){

            if(aPointer==arrA.size()){
                resultB.add(i);
                bPointer++;
                continue;
            }
            if(bPointer==arrB.size()){
                resultA.add(i);
                aPointer++;
                continue;
            }
            if(arrA.get(aPointer)<arrB.get(bPointer)){
                resultA.add(i);
                aPointer++;
            }else if (arrA.get(aPointer)>arrB.get(bPointer)){
                resultB.add(i);
                bPointer++;
            } else{
                //같을때
                resultA.add(i);
                i++;
                resultB.add(i);
                aPointer++;
                bPointer++;
            }
        }




            ////////////////////// 정답 ////////////////////////////////////////////
        System.out.println(resultA.size());
        for (int i=0;i<resultA.size();i++){
            System.out.print(resultA.get(i)+" ");
        }
        System.out.println("\n"+resultB.size());
        for (int i=0;i<resultB.size();i++){
            System.out.print(resultB.get(i)+" ");
        }


    }
}