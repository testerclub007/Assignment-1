import java.util.HashMap;
import java.util.Map;

        public class LongestSubstringWithoutRepeating {

                public static int longestUniqueSubstr(String str) {
                    int n = str.length();


                    int result = 0;

                    for (int i = 0; i < n; i++) {

                        // Note : Default values in visited are false
                        boolean[] visited = new boolean[256];

                        for (int j = i; j < n; j++) {

                            // If current character is visited
                            // Break the loop
                            if (visited[str.charAt(j)] == true)
                                break;

                                // Else update the result if
                                // this window is larger, and mark
                                // current character as visited.
                            else {
                                result = Math.max(result, j - i + 1);
                                visited[str.charAt(j)] = true;
                            }
                        }

                        // Remove the first character of previous
                        // window
                        visited[str.charAt(i)] = false;
                    }
                    return result;
                }

                // Driver code
                public static void main(String[] args)
                {
                    String str = "abcabcbb";
                    System.out.println("The input string is " + str);

                    int len = longestUniqueSubstr(str);
                    System.out.println("The length of the longest "
                            + "non-repeating character "
                            + "substring is " + len);
                }
        }



