        class Solution {
            public String[] solution(String[] strings, int n) {
                String[] answer = {};
                answer = new String[strings.length];
                for (int i = 0; i < strings.length; i++) {
                    for (int j = i+1; j < strings.length; j++) {
                        int s = strings[i].charAt(n) - '0'; // c
                        int w = strings[j].charAt(n) - '0'; // x
                        if (s==w){
                            int i1 = strings[i].compareTo(strings[j]);
                            if (i1 > 0) {
                                String temp = strings[i];
                                strings[i] = strings[j];
                                strings[j] = temp;
                            }
                        }
                        if (s > w) {
                            String temp = strings[i];
                            strings[i] = strings[j];
                            strings[j] = temp;
                        }
                    }
                }
                
                
                return strings;
            }
        }