package com.assembling;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

   public static void main(String[]args){
      List<Integer> list = Arrays.asList(12,100, 23,34,40);

      List<Integer> res = list.stream().filter(val->val%2==0).toList();

      Integer ans = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println(res+" "+ ans);
      String s1 = "aabbbbd";
      String res1 = "";
      for(int i=s1.length()-1;i>=0;i--){
         char ch = s1.charAt(i);
         res1+=ch;
      }
      System.out.println(res1);

      int arr[] = {23, 45, 23, 56, 67, 67};
      List<Integer>list1 = new ArrayList<>();
      LinkedHashMap<Integer, Integer>mp = new LinkedHashMap<>();
      for(int a:arr){
         mp.put(a, mp.getOrDefault(a,0)+1);
      }
      for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
         if(entry.getValue()>1){
            list1.add(entry.getKey());
         }
      }
      System.out.println(list1);

      LinkedHashMap<Character, Integer>mp1 = new LinkedHashMap<>();
      char [] chars = s1.toCharArray();
      for(char ch:chars){
         mp1.put(ch, mp1.getOrDefault(ch,0)+1);
      }
      char result='#';
      for(Map.Entry<Character,Integer>e : mp1.entrySet()){
         if(e.getValue()==1){
            result=e.getKey();
            break;
         }
      }
      System.out.println(result);

      List<Integer> list2 = list.stream().filter(val->String.valueOf(val).startsWith("1")).toList();
      System.out.println(list2);

      List<String> ls = Arrays.asList("string", "abhi", "sonu");
      List<String> ansls = ls.stream().map(s->s.toUpperCase()).sorted().toList();
      System.out.println(ansls);

      Integer first = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println(first);

      String s = "silent", s2= "listen";
      char []chars1 = s.toCharArray();
      char []chars2 = s2.toCharArray();
      Arrays.sort(chars1);
      Arrays.sort(chars2);
      if(Arrays.equals(chars1,chars2)){
         System.out.println(true);
      }else {
         System.out.println(false);
      }


      User user = new User();
      user.setSalary(null);
      user.setUserName("abhiraj");

      int sal = Optional.ofNullable(user)
              .map(u->u.salary)
              .filter(sal1 -> sal1!=null)
              .orElse(0);
      System.out.println("salaray user: "+sal);

      List<User> users = Arrays.asList(new User("A", 4535),
              new User("b", 3245),
              new User("z", 57),
              new User("c", 4968));

      User user1 = users.stream().sorted((a,b)->a.salary-b.salary)
                      .skip(1)
                              .findFirst()
              .orElse(new User());
      System.out.println(user1.getUserName() +" "+ user1.getSalary());


   }

   static class User{
      String userName;
      Integer salary;

      public User(String userName, Integer salary){
         this.userName=userName;
         this.salary=salary;
      }
      public User(){}

      public void setUserName(String userName) {
         this.userName = userName;
      }
      public void setSalary(Integer salary){
         this.salary = salary;
      }
      public String getUserName(){
         return userName;
      }
      public Integer getSalary(){
         return salary;
      }
   }
}
