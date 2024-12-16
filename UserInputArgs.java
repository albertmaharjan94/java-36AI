public class UserInputArgs{
    public static void main(String[] args){
        // String[] args is an array of argument
        // can be used when java is ran from cli/terminal/cmd with arguments
        // Eg: java MyFile.java 10 20 30 40
        // The value after a file name can be accessed in args
        // since args is an array use index to use the values
        // 10 -> args[0]
        // 20 -> args[1]
        // 30 -> args[2]
        System.out.println("First Argument "  + args[0]);
        System.out.println("Second Argument "  + args[1]);

        // can also be use after compiling
        // to compile a java source code
        // Eg: javac MyFile.java
        // will create a .class file, MyFile.class, which is a bytecode/machine code
        // then can be used without .java, Eg: java MyFile 10 20 30
    }
}