public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello    ", "    World    ");
        System.out.println(str);

        StringManipulator lmanipulator = new StringManipulator();
        char letter = 'o';
        Integer a = lmanipulator.getIndexOrNull("Coding", letter);
        Integer b = lmanipulator.getIndexOrNull("bleeeergh", letter);
        Integer c = lmanipulator.getIndexOrNull("Hello World", letter);        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        StringManipulator qmanipulator = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer q = qmanipulator.getIndexOrNull2(word, subString);
        Integer r = qmanipulator.getIndexOrNull2(word, notSubString);
        System.out.println(q); // 2
        System.out.println(r); // nullString word = "Hello";
    
        StringManipulator nmanipulator = new StringManipulator();
        String word2 = nmanipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); // eworld
    }
}