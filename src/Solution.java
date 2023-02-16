import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;



class Result {

    /*
     * Complete the 'toolchanger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY tools
     *  2. INTEGER startIndex
     *  3. STRING target
     */

    public static int toolchanger(List<String> tools, int startIndex, String target) {
    // Write your code here
    if(tools.get(startIndex).equals(target)){
        return 0;
    }
    
    int left=startIndex-1,right=startIndex+1,steps=1;
    
    if(left<0){
        left=tools.size()-1;
    }
    
    if(right>tools.size()-1){
        right=0;
    }
    
    while(left>=0 && left< tools.size() && right>=0 && right< tools.size()){
        if(tools.get(left).equals(target) || tools.get(right).equals(target)){
            break;
        }
        left--;
        if(left<0){
            left=tools.size()-1;
        }
        right++;
        if(right>tools.size()-1){
            right=0;
        }
        steps++;
    }
    return steps;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int toolsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> tools = IntStream.range(0, toolsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int startIndex = Integer.parseInt(bufferedReader.readLine().trim());

        String target = bufferedReader.readLine();

        int result = Result.toolchanger(tools, startIndex, target);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
