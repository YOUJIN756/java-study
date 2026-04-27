
package staticex;

class Counter2 { 
   static int cnt = 0;  
   
   static void increase() { //static 메서드 -> 객체없이 클래스 이름으로 호출 가능
      cnt++;
   }
}

public class StaticTest2 {
   public static void main(String[] args) {
	   
	   //Counter2 클래스의 static 메서드 호출(객체 생성 없이 사용)
      
      Counter2.increase(); //cnt = 1
      Counter2.increase(); //cnt = 2
      
      //static 변수도 클래스 이름으로 바로 접근 가능
      System.out.println("count: " + Counter2.cnt); 
   }//결과//count: 2

}
