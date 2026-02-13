mkdir -p src/main/java/com/example
cat > src/main/java/com/example/App.java << 'EOF'
package com.example;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Maven!");
    }
    public static int add(int a, int b) { return a + b; }
}
EOF
