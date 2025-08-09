// //stack
// //implementation using array list, jcf,linked list
// import java.util.*;
// class Main{
//     public static class Stack{//you have to give static to call from main
//         static ArrayList<Integer>stack=new ArrayList<>();
//         public static boolean isEmpty(){
//             return stack.size()==0;
//         }
//         public static void push(int n){
//             stack.add(n);
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int ele=stack.get(stack.size()-1);
//             stack.remove(stack.size()-1);
//             return ele;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return stack.get(stack.size()-1);
//         }
//     } 

//     public static void main(String args[]){
//           Stack st=new Stack();
//           st.push(1);
//           st.push(3);
//           st.push(5);
//           st.push(7);
//           st.push(9);
//           st.push(2);
//           System.out.println(st.pop());
//           System.out.println(st.peek());
//           while(!st.isEmpty()){
//             System.out.println(st.pop());
//           }
//          System.out.println(st.peek()); 
//     }
// }
// //implementation using jcf
// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         Stack<Integer>st=new Stack<>();
//           st.push(1);
//           st.push(3);
//           st.push(5);
//           st.push(7);
//           st.push(9);
//           st.push(2);
//           st.size();//prebuilt in jcf
//           System.out.println(st.pop());
//           System.out.println(st.peek());
//           while(!st.isEmpty()){
//             System.out.println(st.pop());
//           }
//         //  System.out.println(st.peek()); //cannot access for jcf
//     }
// }
//implementation using linked list
class Main{
    static class Node{
          int d;
          Node n;
          Node(int d){
            this.d=d;
            this.n=null;
          }
        }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
        return head==null;
        }
        public static void push(int el){
            Node newNode=new Node(el);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.n=head;
            head=newNode;
        }
         public static int pop(){
            if(isEmpty()){
               return -1;
            }
            int top=head.d;
            head=head.n;
            return top;
        }
         public static int peek(){
            if(isEmpty()){
               return -1;
            }
            int top=head.d;
            return top;
        }
    }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(1);
          st.push(3);
          st.push(5);
          st.push(7);
          st.push(9);
          st.push(2);
          System.out.println(st.pop());
          System.out.println(st.peek());
          while(!st.isEmpty()){
            System.out.println(st.pop());
          }
          System.out.print(st.peek());
    }
}
