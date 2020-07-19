``` java  
package com.bit.conv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CardinalConversion {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.print("수를 입력하세요  > ");
        int quotient = Integer.parseInt(br.readLine()); // 주어지는 수이자 나중에는 몫
        System.out.print("진법을 입력하세요 > ");
        int cardinalNum = Integer.parseInt(br.readLine()); // 변환하고자 하는 진법
        String character = "0123456789ABCDEF";
        ArrayList<Character> output = new ArrayList<>();

        while(quotient != 0) {
            output.add(character.charAt(quotient%cardinalNum)); // 나머지를 저장하고 String character에서 나머지 숫자에 맞응 위치에 값을 하나씩 꺼내서 ArrayList에 저장
            quotient /= cardinalNum;
        }
        
        Collections.reverse(output); // 가장 마지에 저장한 것이 먼저 나와야하기 때문에 거꾸로 출력
        
        bw.write("[");
        for(Character convertedNum : output) {
            bw.write(convertedNum);
        }
        bw.write("]");
        
        bw.flush();
        
    }
 
}
```  
