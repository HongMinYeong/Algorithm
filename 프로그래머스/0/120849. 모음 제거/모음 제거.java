// class Solution {
//     public String solution(String my_string) {
//          StringBuilder answer = new StringBuilder();

//         for (char c : my_string.toCharArray()) {
//             if (c != 'a'&& c!='e'&&c!='i'&&c!='o'&&c!='u') {
//                 answer.append(c);
//                 // c != 'a'|| c!='e'||c!='i'||c!='o'||c!='u'
//             }
//         }
//         return answer.toString();
//     }
// }
class Solution {
    public String solution(String my_string) {
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        for(String vowel : vowels){
            if(my_string.contains(vowel)){
                my_string = my_string.replace(vowel, "");
            }
        }
        return my_string;
    }
}

