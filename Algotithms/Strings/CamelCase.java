static int camelcase(String s) {
    int count = 0;
for (char c : s.toCharArray()) {
 if (Character.isUpperCase(c)) {
     count++;
 }
}
return count+1;
}