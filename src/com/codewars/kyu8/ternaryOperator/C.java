package com.codewars.kyu8.ternaryOperator;

// В условии задачи был этот код :
//public class C{
//  public static String describeAge(int age) {
//    if (age <= 12) {
//      return "You're a(n) kid";
//    } else if (age >= 13 && age <= 17) {
//      return "You're a(n) teenager";
//    } else if (age >= 18 && age <= 64) {
//      return "You're a(n) adult";
//    } else {
//      return "You're a(n) elderly";
//    }
//  }
//}

//(нужно не больше 137 символов) сократил до этого :
class C{static String describeAge(int a){;return"You're a(n) "+(a<=12?"kid":a<=17?"teenager":a<=64?"adult":"elderly");}}
